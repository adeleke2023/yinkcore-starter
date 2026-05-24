package com.yinkcore.auth.domain.repository;

import com.yinkcore.auth.domain.model.RefreshToken;

import java.util.Optional;


/**
 * RefreshTokenRepository is an interface that defines the contract for managing refresh tokens in the authentication system.
 * It provides methods for saving a refresh token and finding a refresh token by its token string.
 * The implementation of this repository will handle the persistence of refresh tokens, allowing for operations such as creating, retrieving, and invalidating refresh tokens as needed.
 *
 * @since 2026-05-22
 * @version 1.0.0
 * @author Young Lecturer
 */
public interface RefreshTokenRepository {

    RefreshToken save(RefreshToken token);

    Optional<RefreshToken> findByToken(String token);

}