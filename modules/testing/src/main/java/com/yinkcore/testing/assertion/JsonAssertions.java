package com.yinkcore.testing.assertion;

import static org.assertj.core.api.Assertions.assertThat;

public final class JsonAssertions {

  private JsonAssertions() {}

  public static void contains(String json, String value) {
    assertThat(json).contains(value);
  }
}
