package com.yinkcore.auth.infrastructure.persistence.adapter;

import com.yinkcore.auth.domain.model.Permission;
import com.yinkcore.auth.domain.repository.PermissionRepository;
import com.yinkcore.auth.infrastructure.persistence.repository.JpaPermissionRepository;
import java.util.Optional;
import java.util.UUID;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class PermissionRepositoryAdapter implements PermissionRepository {

  private final JpaPermissionRepository repository;

  @Override
  public Permission save(Permission permission) {
    return repository.save(permission);
  }

  @Override
  public Optional<Permission> findById(UUID id) {
    return repository.findById(id);
  }

  @Override
  public Optional<Permission> findByName(String name) {
    return repository.findByName(name);
  }
}
