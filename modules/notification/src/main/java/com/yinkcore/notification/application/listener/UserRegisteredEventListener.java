package com.yinkcore.notification.application.listener;

import com.yinkcore.auth.domain.event.UserRegisteredEvent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;
import org.springframework.transaction.event.TransactionalEventListener;

@Component
public class UserRegisteredEventListener {

  private static final Logger logger = LoggerFactory.getLogger(UserRegisteredEventListener.class);

  @Async("applicationTaskExecutor")
  @TransactionalEventListener
  public void handle(UserRegisteredEvent event) {

    logger.info("Processing user registration event for {}", event.getEmail());

    // notification workflows later

  }
}
