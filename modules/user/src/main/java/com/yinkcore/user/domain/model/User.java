package com.yinkcore.user.domain.model;

import com.yinkcore.shared.domain.model.AuditableEntity;

import lombok.Getter;
import lombok.Setter;



/**
 * Represents a user in the system.
 */
@Setter
@Getter
public class User extends AuditableEntity {

    private String firstName;

    private String lastName;

    private String email;

    private String password;

    private UserStatus status;

    protected User() {}

    public User(
            String firstName,
            String lastName,
            String email,
            String password
    ) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.status = UserStatus.PENDING_VERIFICATION;
    }

    public void activate() {
        this.status = UserStatus.ACTIVE;
    }

    public boolean isActive() {
        return status == UserStatus.ACTIVE;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

}
