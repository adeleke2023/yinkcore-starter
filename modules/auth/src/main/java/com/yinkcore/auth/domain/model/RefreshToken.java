package com.yinkcore.auth.domain.model;

import java.time.Instant;
import java.util.UUID;


/**
 * RefreshToken is a domain model class that represents a refresh token used for authentication and authorization purposes.
 * It contains fields such as id, userId, token, expiryDate, and revoked to store relevant information about the refresh token.
 * The class is designed to be used in the authentication process to generate new access tokens when the current access token expires.
 * The revoked field indicates whether the refresh token has been revoked or not, which can be used to invalidate the token if necessary.
 *
 * @since 2026-05-22
 * @version 1.0.0
 * @author Young Lecturer
 */
public class RefreshToken {

    @SuppressWarnings("unused")
    private UUID id;

    @SuppressWarnings("unused")
    private UUID userId;

    @SuppressWarnings("unused")
    private String token;

    @SuppressWarnings("unused")
    private Instant expiryDate;

    @SuppressWarnings("unused")
    private boolean revoked;

}