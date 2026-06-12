package com.yinkcore.auth.infrastructure.persistence.repository;

import java.util.Optional;
import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;

import com.yinkcore.auth.infrastructure.persistence.entity.RoleJpaEntity;

public interface RoleJpaRepository extends JpaRepository<RoleJpaEntity, UUID> {

  Optional<RoleJpaEntity> findByName(String name);
}
