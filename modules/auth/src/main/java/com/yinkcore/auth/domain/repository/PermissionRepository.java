package com.yinkcore.auth.domain.repository;

import com.yinkcore.auth.domain.model.Permission;

import java.util.Optional;
import java.util.UUID;

public interface PermissionRepository {

    Permission save(Permission permission);

    Optional<Permission> findById(UUID id);

    Optional<Permission> findByName(String name);
}