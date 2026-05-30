package com.yinkcore.testing.wiremock;

import java.time.Clock;
import java.time.Instant;
import java.time.ZoneId;

public final class MockClock {

  private MockClock() {}

  public static Clock fixed() {
    return Clock.fixed(Instant.parse("2025-01-01T00:00:00Z"), ZoneId.of("UTC"));
  }
}
