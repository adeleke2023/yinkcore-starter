package com.yinkcore.auth.infrastructure.persistence;

import com.yinkcore.auth.domain.model.Permission;
import jakarta.persistence.*;

@Embeddable
public class RolePermissionEmbeddable {

  @Enumerated(EnumType.STRING)
  private Permission permission;

  public Permission getPermission() {
    return permission;
  }

  public void setPermission(Permission permission) {
    this.permission = permission;
  }
}
