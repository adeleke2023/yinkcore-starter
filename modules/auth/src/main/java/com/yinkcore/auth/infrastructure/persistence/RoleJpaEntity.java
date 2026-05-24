package com.yinkcore.auth.infrastructure.persistence;

import jakarta.persistence.*;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

@Entity
@Table(name = "roles")
public class RoleJpaEntity {

  @Id private UUID id;

  @Column(unique = true)
  private String name;

  @ElementCollection(fetch = FetchType.EAGER)
  @CollectionTable(name = "role_permissions", joinColumns = @JoinColumn(name = "role_id"))
  @Enumerated(EnumType.STRING)
  @Column(name = "permission")
  private Set<RolePermissionEmbeddable> permissions = new HashSet<>();

}
