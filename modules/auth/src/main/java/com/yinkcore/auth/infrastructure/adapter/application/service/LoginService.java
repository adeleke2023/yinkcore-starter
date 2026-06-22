package com.yinkcore.auth.infrastructure.adapter.application.service;

import com.yinkcore.auth.infrastructure.adapter.application.dto.AuthResponse;
import com.yinkcore.auth.infrastructure.adapter.application.dto.LoginRequest;
import com.yinkcore.security.service.JwtService;
import com.yinkcore.shared.domain.exception.BusinessException;
import com.yinkcore.user.domain.repository.service.UserRepository;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;


/**
 * LoginService is a service class responsible for handling user login logic.
 * It interacts with the UserRepository to retrieve user information and uses a PasswordEncoder to verify the user's password.
 * The service also utilizes a JwtService to generate access and refresh tokens upon successful authentication.
 * The login method takes a LoginRequest DTO as input, validates the user's credentials, and returns an AuthResponse containing the generated tokens if authentication is successful.
 *
 * @see LoginRequest
 * @see AuthResponse
 * @see UserRepository
 * @see JwtService
 *
 * @since 2026-05-22
 * @version 1.0.0
 * @author Young Lecturer
 */
@Service
public class LoginService {

  private final UserRepository userRepository;

  private final PasswordEncoder passwordEncoder;

  private final JwtService jwtService;

  public LoginService(
      UserRepository userRepository, PasswordEncoder passwordEncoder, JwtService jwtService) {
    this.userRepository = userRepository;
    this.passwordEncoder = passwordEncoder;
    this.jwtService = jwtService;
  }

  public AuthResponse login(LoginRequest request) {

    var user =
        userRepository
            .findByEmail(request.email())
            .orElseThrow(() -> new BusinessException("Invalid credentials"));

    boolean matches = passwordEncoder.matches(request.password(), user.getPassword());

    if (!matches) {

      throw new BusinessException("Invalid credentials");
    }

    String accessToken = jwtService.generateAccessToken(user.getId(), user.getEmail());

    String refreshToken = jwtService.generateRefreshToken(user.getId());

    return new AuthResponse(accessToken, refreshToken);
  }
}
