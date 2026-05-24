package com.yinkcore.auth.domain.event;

import com.yinkcore.shared.domain.event.DomainEvent;
import java.util.UUID;


/**
 * UserRegisteredEvent is a domain event that represents the occurrence of a user registration in
 * the authentication system. It contains fields for userId and email, which provide information
 * about the registered user. This event can be used to trigger actions or processes that need to
 * occur after a user has successfully registered, such as sending a welcome email or updating
 * related systems.
 *
 * @since 2026-05-22
 * @version 1.0.0
 * @author Young Lecturer
 */
public class UserRegisteredEvent extends DomainEvent {

  private final UUID userId;

  private final String email;

  public UserRegisteredEvent(UUID userId, String email) {
    this.userId = userId;
    this.email = email;
  }

  public UUID getUserId() {
    return userId;
  }

  public String getEmail() {
    return email;
  }
}
