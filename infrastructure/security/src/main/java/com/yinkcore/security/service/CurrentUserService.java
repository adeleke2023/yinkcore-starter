package com.yinkcore.security.service;

import java.util.UUID;

public interface CurrentUserService {

  UUID getCurrentUserId();

  boolean isAuthenticated();
}
