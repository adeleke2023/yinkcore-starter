package com.yinkcore.testing.fixture;

import java.util.UUID;

public final class RandomDataGenerator {

  private RandomDataGenerator() {}

  public static String email() {
    return UUID.randomUUID() + "@test.com";
  }

  public static String username() {
    return "user-" + UUID.randomUUID();
  }
}
