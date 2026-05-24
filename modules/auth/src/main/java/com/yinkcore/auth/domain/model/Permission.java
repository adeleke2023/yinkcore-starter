package com.yinkcore.auth.domain.model;

public enum Permission {

    USER_READ,
    USER_CREATE,
    USER_UPDATE,
    USER_DELETE,

    ROLE_READ,
    ROLE_CREATE,
    ROLE_UPDATE,
    ROLE_DELETE,

    PERMISSION_READ,
    PERMISSION_ASSIGN,

    AUDIT_READ,

    SYSTEM_ADMIN

}