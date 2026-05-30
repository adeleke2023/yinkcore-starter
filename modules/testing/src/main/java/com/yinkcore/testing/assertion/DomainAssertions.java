package com.yinkcore.testing.assertion;

import static org.assertj.core.api.Assertions.assertThat;

public final class DomainAssertions {

  private DomainAssertions() {}

  public static void assertNotNull(Object object) {
    assertThat(object).isNotNull();
  }
}
