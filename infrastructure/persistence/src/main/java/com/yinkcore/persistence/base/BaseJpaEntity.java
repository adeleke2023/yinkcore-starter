package com.yinkcore.persistence.base;

import jakarta.persistence.*;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import java.time.Instant;
import java.util.UUID;


/**
 * BaseJpaEntity is an abstract base class for JPA entities that provides common fields and functionality.
 * It includes an ID field of type UUID, createdAt and updatedAt timestamps, and a version field for optimistic locking.
 * The class is annotated with @MappedSuperclass to indicate
 * that it is a base class for JPA entities and should not be mapped to a database table directly.
 * The createdAt and updatedAt fields are automatically managed by Spring Data JPA's auditing features, which are enabled in the PersistenceConfiguration class.
 * The version field is used for optimistic locking to prevent concurrent updates from overwriting each other.
 * Subclasses of BaseJpaEntity will inherit these fields and can add their own specific fields and behavior as needed.
 * 
 * @see PersistenceConfiguration
 * @since 2026-05-22
 * @version 1.0.0
 * @author Young Lecturer
 */
@MappedSuperclass
public abstract class BaseJpaEntity {

    @Id
    protected UUID id;

    @CreatedDate
    @Column(nullable = false, updatable = false)
    protected Instant createdAt;

    @LastModifiedDate
    protected Instant updatedAt;

    @Version
    protected Long version;

    public UUID getId() {
        return id;
    }

}