package com.yinkcore.shared.infrastructure.event;

public interface EventSerializer {

  String serialize(Object event);
}
