package com.yinkcore.security.service;

import java.util.UUID;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

@Service
public class SecurityContextCurrentUserService implements CurrentUserService {

  @Override
  public UUID getCurrentUserId() {

    Authentication authentication = SecurityContextHolder.getContext().getAuthentication();

    if (authentication == null) {
      return null;
    }

    return (UUID) authentication.getPrincipal();
  }

  @Override
  public boolean isAuthenticated() {

    Authentication authentication = SecurityContextHolder.getContext().getAuthentication();

    return authentication != null && authentication.isAuthenticated();
  }
}
