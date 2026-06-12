package com.yinkcore.auth.infrastructure.persistence.repository;

import com.yinkcore.auth.infrastructure.persistence.entity.RolePermissionEntity;
import com.yinkcore.auth.infrastructure.persistence.entity.RolePermissionEntityId;
import java.util.List;
import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RolePermissionJpaRepository
    extends JpaRepository<RolePermissionEntity, RolePermissionEntityId> {

    List<RolePermissionEntity> findByIdRoleId(UUID roleId);
}