package com.yinkcore.shared.infrastructure.event;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Component;

@Component
public class JacksonEventSerializer implements EventSerializer {

  private final ObjectMapper objectMapper;

  public JacksonEventSerializer(ObjectMapper objectMapper) {
    this.objectMapper = objectMapper;
  }

  @Override
  public String serialize(Object event) {

    try {

      return objectMapper.writeValueAsString(event);

    } catch (JsonProcessingException ex) {

      throw new RuntimeException("Failed to serialize event", ex);
    }
  }
}
