package com.yinkcore.auth.infrastructure.adapter.application.service;

import com.yinkcore.auth.application.service.AsyncEmailService;
import com.yinkcore.auth.infrastructure.adapter.application.dto.RegisterRequest;
import com.yinkcore.shared.domain.exception.BusinessException;
import com.yinkcore.user.domain.model.User;
import com.yinkcore.user.domain.repository.UserRepository;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * RegisterService is a service class responsible for handling user registration logic. It interacts
 * with the UserRepository to check for existing users and save new users to the database. The
 * service also uses a PasswordEncoder to securely hash user passwords before saving them. The
 * register method takes a RegisterRequest DTO as input, validates the email, and creates a new User
 * entity if the email is not already in use.
 *
 * @see RegisterRequest
 * @see UserRepository
 * @see User
 * @since 2026-05-22
 * @version 1.0.0
 * @author Young Lecturer
 */
@Service
public class RegisterService {

  private final UserRepository userRepository;

  private final PasswordEncoder passwordEncoder;

  private final AsyncEmailService asyncEmailService;

  public RegisterService(
      UserRepository userRepository,
      PasswordEncoder passwordEncoder,
      AsyncEmailService asyncEmailService) {
    this.userRepository = userRepository;
    this.passwordEncoder = passwordEncoder;
    this.asyncEmailService = asyncEmailService;
  }

  @Transactional
  public void register(RegisterRequest request) {

    if (userRepository.existsByEmail(request.email())) {

      throw new BusinessException("Email already exists");
    }

    User user =
        new User(
            request.firstName(),
            request.lastName(),
            request.email(),
            passwordEncoder.encode(request.password()));

    asyncEmailService.sendVerificationEmail(user.getEmail());

    userRepository.save(user);
  }
}
