package com.yinkcore.auth.application.service;

public interface AuthorizationService {

  boolean hasPermission(String userId, String permission);
}
