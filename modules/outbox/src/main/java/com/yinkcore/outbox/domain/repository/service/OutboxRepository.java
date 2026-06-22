package com.yinkcore.outbox.domain.repository.service;

import com.yinkcore.outbox.domain.enums.OutboxStatus;
import com.yinkcore.outbox.domain.model.OutboxEvent;
import java.util.List;

public interface OutboxRepository {

  OutboxEvent save(OutboxEvent event);

  List<OutboxEvent> findByStatus(OutboxStatus status);
}
