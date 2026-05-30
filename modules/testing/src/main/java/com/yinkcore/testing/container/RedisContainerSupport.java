package com.yinkcore.testing.container;

import org.testcontainers.containers.GenericContainer;

public final class RedisContainerSupport {

  private static final GenericContainer<?> CONTAINER =
      new GenericContainer<>("redis:7").withExposedPorts(6379);

  static {
    CONTAINER.start();
  }

  private RedisContainerSupport() {}

  public static GenericContainer<?> getContainer() {
    return CONTAINER;
  }
}
