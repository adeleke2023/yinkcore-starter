package com.yinkcore.testing.container;

import org.testcontainers.kafka.KafkaContainer;
import org.testcontainers.utility.DockerImageName;

public final class KafkaContainerSupport {

  private static final KafkaContainer CONTAINER =
      new KafkaContainer(DockerImageName.parse("apache/kafka-native:3.8.0"));

  static {
    CONTAINER.start();
  }

  private KafkaContainerSupport() {}

  public static KafkaContainer getContainer() {
    return CONTAINER;
  }
}
