package com.yinkcore.auth.infrastructure.persistence.entity;

import jakarta.persistence.*;

import java.time.Instant;
import java.util.UUID;


/**
 * RefreshTokenJpaEntity is a JPA entity class that represents the refresh token used for authentication and authorization purposes.
 * It is mapped to the "refresh_tokens" table in the database and contains fields such as id, userId, token, expiryDate, revoked, and createdAt.
 * The class is designed to be used in the persistence layer of the application to store and retrieve refresh token information from the database.
 * The id field is a UUID that serves as the primary key for the entity, while the userId field is a UUID that references the user associated with the refresh token.
 * The token field is a unique string that represents the actual refresh token value, and the expiryDate field indicates when the refresh token will expire.
 * The revoked field is a boolean that indicates whether the refresh token has been revoked or not, which can be used to invalidate the token if necessary.
 * The createdAt field stores the timestamp of when the refresh token was created.
 *
 * @since 2026-05-22
 * @version 1.0.0
 * @author Young Lecturer
 */
@Entity
@Table(name = "refresh_tokens")
public class RefreshTokenJpaEntity {

    @Id
    private UUID id;

    @SuppressWarnings("unused")
    private UUID userId;

    @Column(unique = true)
    private String token;

    @SuppressWarnings("unused")
    private Instant expiryDate;

    @SuppressWarnings("unused")
    private boolean revoked;

    @SuppressWarnings("unused")
    private Instant createdAt;

}
