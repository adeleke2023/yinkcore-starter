package com.yinkcore.audit.domain.event;

import java.util.UUID;

public class UserLoggedInAuditEvent extends AuditEvent {

  private final UUID userId;

  public UserLoggedInAuditEvent(UUID userId) {
    this.userId = userId;
  }

  public UUID getUserId() {
    return userId;
  }
}
