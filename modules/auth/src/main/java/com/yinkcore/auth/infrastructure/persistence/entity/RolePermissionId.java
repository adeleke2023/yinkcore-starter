package com.yinkcore.auth.infrastructure.persistence.entity;

import java.io.Serializable;
import java.util.UUID;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode
public class RolePermissionId implements Serializable {

  private UUID roleId;

  private UUID permissionId;
}
