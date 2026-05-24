package com.yinkcore.audit.domain.model;

import java.time.Instant;
import java.util.UUID;


public class AuditLog {

    @SuppressWarnings("unused")
    private UUID id;

    @SuppressWarnings("unused")
    private UUID actorId;

    @SuppressWarnings("unused")
    private String action;

    @SuppressWarnings("unused")
    private String entityType;

    @SuppressWarnings("unused")
    private String entityId;

    @SuppressWarnings("unused")
    private Instant createdAt;

}