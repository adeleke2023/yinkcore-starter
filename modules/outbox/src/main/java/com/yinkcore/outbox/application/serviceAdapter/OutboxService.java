package com.yinkcore.outbox.application.serviceAdapter;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.yinkcore.outbox.domain.enums.OutboxStatus;
import com.yinkcore.outbox.domain.model.OutboxEvent;
import com.yinkcore.outbox.domain.repository.service.OutboxRepository;

import java.time.Instant;
import java.util.UUID;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class OutboxService {

  private final OutboxRepository repository;
  private final ObjectMapper objectMapper;

  public void saveEvent(String aggregateType, String aggregateId, Object event) {

    try {

      OutboxEvent outboxEvent =
          OutboxEvent.builder()
              .id(UUID.randomUUID())
              .aggregateType(aggregateType)
              .aggregateId(aggregateId)
              .eventType(event.getClass().getSimpleName())
              .payload(objectMapper.writeValueAsString(event))
              .status(OutboxStatus.PENDING)
              .createdAt(Instant.now())
              .build();

      repository.save(outboxEvent);

    } catch (Exception ex) {
      throw new RuntimeException(ex);
    }
  }
}
