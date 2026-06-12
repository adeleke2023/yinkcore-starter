package com.yinkcore.auth.infrastructure.persistence.entity;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "role_permissions")
@Getter
@Setter
@NoArgsConstructor
public class RolePermissionEntity {

  @EmbeddedId private RolePermissionEntityId id;
}
