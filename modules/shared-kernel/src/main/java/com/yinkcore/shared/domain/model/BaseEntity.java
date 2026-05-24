package com.yinkcore.shared.domain.model;

import java.time.Instant;
import java.util.UUID;

public abstract class BaseEntity {

    protected UUID id;

    protected Instant createdAt;

    protected Instant updatedAt;

    public UUID getId() {
        return id;
    }

    public Instant getCreatedAt() {
        return createdAt;
    }

    public Instant getUpdatedAt() {
        return updatedAt;
    }

}