package com.yinkcore.security.service;

import com.yinkcore.security.jwt.JwtProperties;
import com.yinkcore.security.jwt.TokenType;
import io.jsonwebtoken.*;
import io.jsonwebtoken.security.Keys;
// import java.security.Key;
import java.time.Instant;
import java.util.Date;
import java.util.UUID;
import javax.crypto.SecretKey;
import org.springframework.stereotype.Service;

@Service
public class JwtServiceImpl implements JwtService {

  private final JwtProperties jwtProperties;

  public JwtServiceImpl(JwtProperties jwtProperties) {
    this.jwtProperties = jwtProperties;
  }

  @Override
  public String generateAccessToken(UUID userId, String email) {

    Instant now = Instant.now();

    return Jwts.builder()
        .subject(userId.toString())
        .claim("email", email)
        .claim("type", TokenType.ACCESS.name())
        .issuedAt(Date.from(now))
        .expiration(Date.from(now.plusMillis(jwtProperties.accessTokenExpiration())))
        .signWith(getSigningKey())
        .compact();
  }

  @Override
  public String generateRefreshToken(UUID userId) {

    Instant now = Instant.now();

    return Jwts.builder()
        .subject(userId.toString())
        .claim("type", TokenType.REFRESH.name())
        .issuedAt(Date.from(now))
        .expiration(Date.from(now.plusMillis(jwtProperties.refreshTokenExpiration())))
        .signWith(getSigningKey())
        .compact();
  }

  @Override
  public UUID extractUserId(String token) {

    Claims claims = extractClaims(token);

    return UUID.fromString(claims.getSubject());
  }

  @Override
  public boolean isValid(String token) {

    try {
      extractClaims(token);
      return true;
    } catch (JwtException ex) {
      return false;
    }
  }

  private Claims extractClaims(String token) {

    return Jwts.parser()
        .verifyWith((SecretKey) getSigningKey())
        .build()
        .parseSignedClaims(token)
        .getPayload();
  }

  private SecretKey getSigningKey() {

    return Keys.hmacShaKeyFor(jwtProperties.secretKey().getBytes());
  }
}
