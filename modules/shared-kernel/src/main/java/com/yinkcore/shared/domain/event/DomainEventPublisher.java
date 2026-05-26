package com.yinkcore.shared.domain.event;

public interface DomainEventPublisher {

  void publish(DomainEvent event);
}
