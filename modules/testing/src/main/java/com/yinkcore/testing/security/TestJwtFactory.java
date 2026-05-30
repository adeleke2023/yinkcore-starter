package com.yinkcore.testing.security;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.security.Keys;
import java.time.Instant;
import java.util.Date;

public final class TestJwtFactory {

  private static final String SECRET = "test-secret-key-test-secret-key-test-secret-key";

  private TestJwtFactory() {}

  public static String token(String subject) {

    return Jwts.builder()
        .subject(subject)
        .issuedAt(Date.from(Instant.now()))
        .expiration(Date.from(Instant.now().plusSeconds(3600)))
        .signWith(Keys.hmacShaKeyFor(SECRET.getBytes()))
        .compact();
  }
}
