package com.yinkcore.user.infrastructure.persistence;

import java.util.Optional;
import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;


/**
 * UserJpaRepository is a Spring Data JPA repository interface for performing CRUD operations on UserJpaEntity.
 * It extends JpaRepository, which provides basic CRUD methods, and also defines custom query methods for
 * finding a user by email and checking if a user exists by email.
 * The UserRepositoryAdapter class implements the UserRepository interface and uses UserJpaRepository to interact with the database.
 * The adapter is responsible for mapping between the domain model (User) and the JPA entity (UserJpaEntity) when saving and retrieving data.
 * This design allows for a clean separation of concerns, where the domain logic is decoupled from the persistence logic, following the principles of hexagonal architecture.
 * 
 * Note: The actual mapping logic between User and UserJpaEntity is not implemented in the provided code and should be added in the UserRepositoryAdapter class.
 * 
 * @see UserRepositoryAdapter
 * @see UserJpaEntity
 * @see User
 * @see UserStatus
 * 
 * @since 2026-05-22
 * @version 1.0.0
 * @author Young Lecturer
 */
public interface UserJpaRepository extends JpaRepository<UserJpaEntity, UUID> {

  Optional<UserJpaEntity> findByEmail(String email);

  boolean existsByEmail(String email);
}
