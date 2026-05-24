package com.yinkcore.user.infrastructure.persistence;

import com.yinkcore.user.domain.model.UserStatus;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.Instant;
import java.util.UUID;


/**
 * UserJpaEntity is a JPA entity class that represents the "users" table in the database.
 * It contains fields that correspond to the columns in the "users" table, such as id, firstName, lastName, email, password, status, createdAt, and updatedAt.
 * The class is annotated with @Entity and @Table to specify that it is a JPA entity and to define the table name.
 * The id field is annotated with @Id to indicate that it is the primary key of the entity.
 * The email field is annotated with @Column(unique = true) to enforce uniqueness at the database level.
 * The status field is annotated with @Enumerated(EnumType.STRING) to specify that it should be stored as a string in the database.
 *
 * Note: The actual mapping logic between User and UserJpaEntity is not implemented in the provided code and should be added in the UserRepositoryAdapter class.
 *
 * @see UserRepositoryAdapter
 * @see UserJpaRepository
 * @see User
 * @see UserStatus
 *
 * @since 2026-05-22
 * @version 1.0.0
 * @author Young Lecturer
 */
@Entity
@Table(name = "users")
@Setter
@Getter
public class UserJpaEntity {

    @Id
    private UUID id;

    private String firstName;

    private String lastName;

    @Column(unique = true)
    private String email;

    private String password;

    @Enumerated(EnumType.STRING)
    private UserStatus status;

    private Instant createdAt;

    private Instant updatedAt;

}
