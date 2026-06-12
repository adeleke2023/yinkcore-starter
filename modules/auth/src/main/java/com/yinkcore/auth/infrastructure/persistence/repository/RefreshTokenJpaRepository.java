package com.yinkcore.auth.infrastructure.persistence.repository;

import java.util.Optional;
import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;

import com.yinkcore.auth.infrastructure.persistence.entity.RefreshTokenJpaEntity;


/**
 * RefreshTokenJpaRepository is a JPA repository interface for managing RefreshTokenJpaEntity instances in the database.
 * It extends the JpaRepository interface, providing basic CRUD operations and additional query methods for working with refresh tokens.
 * The findByToken method allows retrieving a refresh token entity based on its unique token value, which is useful for validating and managing refresh tokens during the authentication process.
 *
 * @since 2026-05-22
 * @version 1.0.0
 * @author Young Lecturer
 */
public interface RefreshTokenJpaRepository extends JpaRepository<RefreshTokenJpaEntity, UUID> {

  Optional<RefreshTokenJpaEntity> findByToken(String token);
}
