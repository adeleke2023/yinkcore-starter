package com.yinkcore.auth.infrastructure.persistence.repository;

import com.yinkcore.auth.domain.model.Permission;
import java.util.Optional;
import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JpaPermissionRepository extends JpaRepository<Permission, UUID> {

  Optional<Permission> findByName(String name);
}
