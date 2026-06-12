package com.yinkcore.auth.domain.model;

import java.util.UUID;
import lombok.*;

@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class RolePermission {

    private UUID roleId;

    private UUID permissionId;
}