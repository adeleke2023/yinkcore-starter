package com.yinkcore.auth.application.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.retry.annotation.Retryable;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class AsyncEmailService {

  private static final Logger logger = LoggerFactory.getLogger(AsyncEmailService.class);

  @Async("applicationTaskExecutor")
  @Retryable(retryFor = Exception.class, maxAttempts = 3)
  public void sendVerificationEmail(String email) {

    logger.info("Sending verification email to {}", email);

    // implementation later
  }
}
