package com.yinkcore.auth.infrastructure.persistence.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.UUID;

@Embeddable
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class RolePermissionEntityId implements Serializable {

    @Column(name = "role_id")
    private UUID roleId;

    @Column(name = "permission_id")
    private UUID permissionId;
}