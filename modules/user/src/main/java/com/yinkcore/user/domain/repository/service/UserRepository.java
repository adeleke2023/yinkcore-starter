package com.yinkcore.user.domain.repository.service;

import com.yinkcore.user.domain.model.User;

import java.util.Optional;
import java.util.UUID;


/**
 * Repository interface for managing User entities.
 * 
 * @author Young Lecturer
 * @version 1.0.0
 * @since 2026-05-22
 */
public interface UserRepository {

    User save(User user);

    Optional<User> findByEmail(String email);

    Optional<User> findById(UUID id);

    boolean existsByEmail(String email);

}