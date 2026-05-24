package com.yinkcore.user.infrastructure.persistence;

import com.yinkcore.user.domain.model.User;
import com.yinkcore.user.domain.repository.UserRepository;
import java.util.Optional;
import java.util.UUID;
import org.springframework.stereotype.Repository;

/**
 * UserRepositoryAdapter is an implementation of the UserRepository interface that uses a UserJpaRepository to perform database operations.
 * It serves as an adapter between the domain model (User) and the persistence layer (UserJpaEntity).
 * The adapter is responsible for mapping between the domain model and the JPA entity when saving and retrieving data.
 * This design allows for a clean separation of concerns, where the domain logic is decoupled from the persistence logic, following the principles of hexagonal architecture.
 *
 * Note: The actual mapping logic between User and UserJpaEntity is not implemented in the provided code and should be added in the UserRepositoryAdapter class.
 *
 * @see UserRepository
 * @see UserJpaRepository
 * @see UserJpaEntity
 * @see User
 * @see UserStatus
 *
 * @since 2026-05-22
 * @version 1.0.0
 * @author Young Lecturer
 */
@Repository
public class UserRepositoryAdapter implements UserRepository {

  private final UserJpaRepository repository;

  public UserRepositoryAdapter(UserJpaRepository repository) {
    this.repository = repository;
  }

  @Override
  public User save(User user) {

    // mapping logic later

    return user;
  }

  @Override
  public Optional<User> findByEmail(String email) {

    return Optional.empty();
  }

  @Override
  public Optional<User> findById(UUID id) {

    return Optional.empty();
  }

  @Override
  public boolean existsByEmail(String email) {

    return repository.existsByEmail(email);
  }
}
