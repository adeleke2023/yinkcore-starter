package com.yinkcore.auth.infrastructure.security;

import com.yinkcore.auth.domain.model.Permission;
import com.yinkcore.auth.domain.service.PermissionEvaluatorService;
import java.util.UUID;
import org.springframework.stereotype.Service;

@Service
public class PermissionEvaluatorServiceImpl implements PermissionEvaluatorService {

  @Override
  public boolean hasPermission(UUID userId, Permission permission) {

    // full DB-backed implementation later

    return true;
  }
}
