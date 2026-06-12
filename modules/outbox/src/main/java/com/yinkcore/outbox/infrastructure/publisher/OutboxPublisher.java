package com.yinkcore.outbox.infrastructure.publisher;

import com.yinkcore.outbox.domain.enums.OutboxStatus;
import com.yinkcore.outbox.domain.model.OutboxEvent;
import com.yinkcore.outbox.domain.repository.OutboxRepository;
import java.time.Instant;
import java.util.List;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@RequiredArgsConstructor
public class OutboxPublisher {

  private final OutboxRepository repository;

  @Scheduled(fixedDelay = 5000)
  public void publish() {

    List<OutboxEvent> events = repository.findByStatus(OutboxStatus.PENDING);

    for (OutboxEvent event : events) {

      try {

        log.info("Publishing event {}", event.getEventType());

        event.setStatus(OutboxStatus.PROCESSED);

        event.setProcessedAt(Instant.now());

        repository.save(event);

      } catch (Exception ex) {

        event.setStatus(OutboxStatus.FAILED);

        repository.save(event);
      }
    }
  }
}
