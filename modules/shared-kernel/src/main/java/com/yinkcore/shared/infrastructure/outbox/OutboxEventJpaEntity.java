package com.yinkcore.shared.infrastructure.outbox;


import java.time.Instant;
import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.Table;

@Entity
@Table(name = "outbox_events")
public class OutboxEventJpaEntity {

    @Id
    private UUID id;

    @SuppressWarnings("unused")
    private String eventType;

    @SuppressWarnings("unused")
    private String aggregateType;

    @SuppressWarnings("unused")
    private String aggregateId;

    @Lob
    private String payload;

    @SuppressWarnings("unused")
    private Instant occurredOn;

    @SuppressWarnings("unused")
    private boolean processed;

}
