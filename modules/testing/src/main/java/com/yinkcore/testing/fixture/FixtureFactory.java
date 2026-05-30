package com.yinkcore.testing.fixture;

import java.util.UUID;

public final class FixtureFactory {

  private FixtureFactory() {}

  public static String randomId() {
    return UUID.randomUUID().toString();
  }
}
