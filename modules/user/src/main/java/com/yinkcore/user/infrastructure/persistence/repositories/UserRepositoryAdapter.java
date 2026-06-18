package com.yinkcore.user.infrastructure.persistence.repositories;

import java.util.Optional;
import java.util.UUID;

import org.springframework.stereotype.Repository;

import com.yinkcore.user.domain.model.User;
import com.yinkcore.user.domain.repository.UserRepository;

import lombok.RequiredArgsConstructor;

@Repository
@RequiredArgsConstructor
public class UserRepositoryAdapter implements UserRepository {

    private final UserJpaRepository repository;

    @Override
    public User save(User user) {
        
        repository.save(null);
        return user;
    }

    @Override
    public Optional<User> findByEmail(String email) {
        
        repository.findByEmail(email);
        return Optional.empty();
    }

    @Override
    public Optional<User> findById(UUID id) {
        
        repository.findById(id);
        return Optional.empty();
    }

    @Override
    public boolean existsByEmail(String email) {
      
        return repository.existsByEmail(email);
    }


}