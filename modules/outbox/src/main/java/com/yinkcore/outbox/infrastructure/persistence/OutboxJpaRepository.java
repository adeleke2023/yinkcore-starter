package com.yinkcore.outbox.infrastructure.persistence;

import com.yinkcore.outbox.domain.enums.OutboxStatus;
import com.yinkcore.outbox.domain.model.OutboxEvent;
import java.util.List;
import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;


public interface OutboxJpaRepository extends JpaRepository<OutboxEvent, UUID> {

  List<OutboxEvent> findByStatus(OutboxStatus status);
}
