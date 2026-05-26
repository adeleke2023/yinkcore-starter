package com.yinkcore.shared.infrastructure.event;

import com.yinkcore.shared.domain.event.DomainEvent;
import com.yinkcore.shared.domain.event.DomainEventPublisher;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

@Component
public class SpringDomainEventPublisher implements DomainEventPublisher {

  private final ApplicationEventPublisher publisher;

  public SpringDomainEventPublisher(ApplicationEventPublisher publisher) {
    this.publisher = publisher;
  }

  @Override
  public void publish(DomainEvent event) {

    publisher.publishEvent(event);
  }
}
