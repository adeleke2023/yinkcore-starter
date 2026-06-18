package com.yinkcore.user.domain.mapper;

import com.yinkcore.user.domain.model.User;
import com.yinkcore.user.infrastructure.persistence.entity.UserJpaEntity;

/**
 * UserMapper is a utility class that provides methods for mapping between the User domain model and
 * the UserJpaEntity used for persistence. It contains static methods to convert a User object to a
 * UserJpaEntity and vice versa, allowing for seamless integration between the domain layer and the
 * persistence layer. The mapping logic can be implemented in the future as needed, ensuring that
 * the structure of the domain model and the persistence entity can evolve independently.
 *
 * @since 2026-05-22
 * @version 1.0.0
 * @author Young Lecturer
 */
public class UserMapper {

  public static UserJpaEntity toEntity(User user) {

    UserJpaEntity entity = new UserJpaEntity();
    // entity.setCreatedAt(user.getCreatedAt());
    // entity.setEmail(user.getEmail());
    // entity.setFirstName(user.getFirstName());
    // entity.setId(user.getId());
    // entity.setLastName(user.getLastName());
    // entity.setStatus(user.getStatus());
    // entity.setUpdatedAt(user.getUpdatedAt());

    return entity;
  }

  public static User toDomain(UserJpaEntity entity) {

    // User user = new User(entity.getFirstName(), entity.getLastName(), entity.getEmail(), entity.getPassword());

    return null;
  }
}
