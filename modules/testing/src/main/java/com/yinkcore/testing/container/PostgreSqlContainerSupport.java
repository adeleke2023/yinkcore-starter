package com.yinkcore.testing.container;

import org.testcontainers.containers.PostgreSQLContainer;

public final class PostgreSqlContainerSupport {

  private static final PostgreSQLContainer<?> CONTAINER =
      new PostgreSQLContainer<>("postgres:17")
          .withDatabaseName("testdb")
          .withUsername("postgres")
          .withPassword("postgres");

  static {
    CONTAINER.start();
  }

  private PostgreSqlContainerSupport() {}

  public static PostgreSQLContainer<?> getContainer() {
    return CONTAINER;
  }
}
