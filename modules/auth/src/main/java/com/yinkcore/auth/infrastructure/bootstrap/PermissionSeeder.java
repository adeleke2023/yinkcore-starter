package com.yinkcore.auth.infrastructure.bootstrap;

import com.yinkcore.auth.domain.model.Permission;
import com.yinkcore.auth.domain.model.SystemPermissions;
import com.yinkcore.auth.domain.repository.PermissionRepository;
import jakarta.annotation.PostConstruct;
import java.util.List;
import java.util.UUID;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class PermissionSeeder {

  private final PermissionRepository repository;

  @PostConstruct
  public void seed() {

    List.of(
            SystemPermissions.USER_READ,
            SystemPermissions.USER_CREATE,
            SystemPermissions.USER_UPDATE,
            SystemPermissions.USER_DELETE,
            SystemPermissions.ROLE_MANAGE,
            SystemPermissions.PERMISSION_MANAGE)
        .forEach(this::createIfMissing);
  }

  private void createIfMissing(String permissionName) {

    repository
        .findByName(permissionName)
        .orElseGet(
            () ->
                repository.save(
                    Permission.builder()
                    .id(UUID.randomUUID())
                    .name(permissionName)
                    .build()
                ));
  }
}
