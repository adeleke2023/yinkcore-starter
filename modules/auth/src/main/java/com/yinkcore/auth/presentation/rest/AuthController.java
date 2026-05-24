package com.yinkcore.auth.presentation.rest;

import com.yinkcore.auth.infrastructure.adapter.application.dto.AuthResponse;
import com.yinkcore.auth.infrastructure.adapter.application.dto.LoginRequest;
import com.yinkcore.auth.infrastructure.adapter.application.dto.RegisterRequest;
import com.yinkcore.auth.infrastructure.adapter.application.service.LoginService;
import com.yinkcore.auth.infrastructure.adapter.application.service.RegisterService;
import com.yinkcore.shared.application.response.ApiResponse;
import org.springframework.web.bind.annotation.*;


/**
 * AuthController is a REST controller that handles authentication-related HTTP requests.
 * It provides endpoints for user registration and login, delegating the business logic to the RegisterService and LoginService respectively.
 * The controller uses ApiResponse to standardize the response format for both successful and error responses.
 *
 * @see RegisterRequest
 * @see LoginRequest
 * @see AuthResponse
 * @see RegisterService
 * @see LoginService
 *
 * @since 2026-05-22
 * @version 1.0.0
 * @author Young Lecturer
 */
@RestController
@RequestMapping("/api/v1/auth")
public class AuthController {

  private final RegisterService registerService;

  private final LoginService loginService;

  public AuthController(RegisterService registerService, LoginService loginService) {
    this.registerService = registerService;
    this.loginService = loginService;
  }

  @PostMapping("/register")
  public ApiResponse<Void> register(@RequestBody RegisterRequest request) {

    registerService.register(request);

    return ApiResponse.success("Registration successful", null);
  }

  @PostMapping("/login")
  public ApiResponse<AuthResponse> login(@RequestBody LoginRequest request) {

    return ApiResponse.success("Login successful", loginService.login(request));
  }
}
