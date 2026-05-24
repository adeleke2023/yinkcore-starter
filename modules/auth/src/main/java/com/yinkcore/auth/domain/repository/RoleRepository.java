package com.yinkcore.auth.domain.repository;

import com.yinkcore.auth.domain.model.Role;

import java.util.Optional;

public interface RoleRepository {

    Role save(Role role);

    Optional<Role> findByName(String name);

}
