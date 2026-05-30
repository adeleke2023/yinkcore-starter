package com.yinkcore.testing.security;

import org.springframework.http.HttpHeaders;

public final class SecurityTestUtils {

  private SecurityTestUtils() {}

  public static String bearer(String token) {
    return "Bearer " + token;
  }

  public static HttpHeaders headers(String token) {

    HttpHeaders headers = new HttpHeaders();

    headers.add(HttpHeaders.AUTHORIZATION, bearer(token));

    return headers;
  }
}
