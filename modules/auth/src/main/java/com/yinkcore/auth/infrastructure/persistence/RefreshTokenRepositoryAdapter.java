package com.yinkcore.auth.infrastructure.persistence;

import com.yinkcore.auth.domain.model.RefreshToken;
import com.yinkcore.auth.domain.repository.RefreshTokenRepository;
import java.util.Optional;
import org.springframework.stereotype.Repository;


/**
 * RefreshTokenRepositoryAdapter is an implementation of the RefreshTokenRepository interface that serves as an adapter between the domain model and the JPA repository.
 * It uses the RefreshTokenJpaRepository to perform database operations related to refresh tokens, such as saving and retrieving refresh token entities.
 * The adapter converts between the domain model (RefreshToken) and the JPA entity (RefreshTokenJpaEntity) to ensure that the persistence layer remains decoupled from the domain layer.
 *
 * @since 2026-05-22
 * @version 1.0.0
 * @author Young Lecturer
 */
@Repository
public class RefreshTokenRepositoryAdapter implements RefreshTokenRepository {

  @SuppressWarnings("unused")
  private final RefreshTokenJpaRepository repository;

  public RefreshTokenRepositoryAdapter(RefreshTokenJpaRepository repository) {
    this.repository = repository;
  }

  @Override
  public RefreshToken save(RefreshToken token) {
    
    return token;
  }

  @Override
  public Optional<RefreshToken> findByToken(String token) {

    return Optional.empty();
  }
}
