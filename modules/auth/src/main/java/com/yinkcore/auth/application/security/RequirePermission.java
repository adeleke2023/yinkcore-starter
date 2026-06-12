package com.yinkcore.auth.application.security;

// import com.yinkcore.auth.domain.model.Permission;

import java.lang.annotation.*;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface RequirePermission {

    // Permission value();

}
