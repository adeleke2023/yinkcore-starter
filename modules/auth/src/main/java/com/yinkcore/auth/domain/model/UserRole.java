package com.yinkcore.auth.domain.model;

import java.util.UUID;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserRole {

    private UUID id;

    private UUID userId;

    private UUID roleId;

}