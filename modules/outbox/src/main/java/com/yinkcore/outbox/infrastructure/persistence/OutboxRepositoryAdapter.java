package com.yinkcore.outbox.infrastructure.persistence;

import com.yinkcore.outbox.domain.model.OutboxEvent;
import com.yinkcore.outbox.domain.model.OutboxStatus;
import com.yinkcore.outbox.domain.repository.OutboxRepository;
import java.util.List;
import org.springframework.stereotype.Repository;

@Repository
public class OutboxRepositoryAdapter implements OutboxRepository {

  private final OutboxJpaRepository repository;

  public OutboxRepositoryAdapter(OutboxJpaRepository repository) {
    this.repository = repository;
  }

  @Override
  public OutboxEvent save(OutboxEvent event) {
    return repository.save(event);
  }

  @Override
  public List<OutboxEvent> findByStatus(OutboxStatus status) {
    return repository.findByStatus(status);
  }
}
