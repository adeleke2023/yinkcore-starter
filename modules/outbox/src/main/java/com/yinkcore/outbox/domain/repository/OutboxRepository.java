package com.yinkcore.outbox.domain.repository;

import com.yinkcore.outbox.domain.model.OutboxEvent;
import com.yinkcore.outbox.domain.model.OutboxStatus;
import java.util.List;

public interface OutboxRepository {

  OutboxEvent save(OutboxEvent event);

  List<OutboxEvent> findByStatus(OutboxStatus status);
}
