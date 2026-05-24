package com.yinkcore.security.service;

import java.util.UUID;

/**
 * Jwt Service  
 * 
 */
public interface JwtService {

  String generateAccessToken(UUID userId, String email);

  String generateRefreshToken(UUID userId);

  UUID extractUserId(String token);

  boolean isValid(String token);

}
