package com.yinkcore.auth.domain.model;

import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

public class Role {

  private UUID id;

  private String name;

  private Set<Permission> permissions = new HashSet<>();

  protected Role() {}

  public Role(String name) {
    this.name = name;
  }

  public void addPermission(Permission permission) {
    permissions.add(permission);
  }

  public boolean hasPermission(Permission permission) {
    return permissions.contains(permission);
  }

  public UUID getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public Set<Permission> getPermissions() {
    return permissions;
  }
}
