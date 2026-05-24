package com.yinkcore.shared.domain.model;

import java.util.UUID;

public abstract class AuditableEntity extends BaseEntity {

    protected UUID createdBy;

    protected UUID updatedBy;

    public UUID getCreatedBy() {
        return createdBy;
    }

    public UUID getUpdatedBy() {
        return updatedBy;
    }

}
