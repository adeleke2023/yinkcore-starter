package com.yinkcore.audit.application.listener;

import com.yinkcore.audit.domain.event.AuditEvent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;
import org.springframework.transaction.event.TransactionalEventListener;

@Component
public class AuditEventListener {

  private static final Logger logger = LoggerFactory.getLogger(AuditEventListener.class);

  @Async("applicationTaskExecutor")
  @TransactionalEventListener
  public void handle(AuditEvent event) {

    logger.info("Audit event received: {}", event.getClass().getSimpleName());

    // persistence later

  }
}
