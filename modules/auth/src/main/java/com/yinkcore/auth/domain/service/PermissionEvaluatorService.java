package com.yinkcore.auth.domain.service;

import com.yinkcore.auth.domain.model.Permission;
import java.util.UUID;

public interface PermissionEvaluatorService {

  boolean hasPermission(UUID userId, Permission permission);
}
