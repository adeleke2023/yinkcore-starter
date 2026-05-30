package com.yinkcore.testing.wiremock;

import com.github.tomakehurst.wiremock.WireMockServer;

public class WireMockSupport {

  private final WireMockServer server = new WireMockServer(8089);

  public void start() {
    server.start();
  }

  public void stop() {
    server.stop();
  }
}
