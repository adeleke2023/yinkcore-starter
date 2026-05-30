package com.yinkcore.testing.fixture;

import java.util.UUID;

public final class TestDataFactory {

  private TestDataFactory() {}

  public static String id() {
    return UUID.randomUUID().toString();
  }
}
