package com.yinkcore.api_server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = "com.yinkcore")
@EntityScan(
    basePackages = {
      "com.yinkcore.user.infrastructure.persistence",
      "com.yinkcore.auth.infrastructure.persistence"
    })
@EnableJpaRepositories(
    basePackages = {
      "com.yinkcore.user.infrastructure.persistence",
      "com.yinkcore.auth.infrastructure.persistence"
    })
@ConfigurationPropertiesScan(basePackages = "com.yinkcore")
public class ApiServerApplication {

  public static void main(String[] args) {

    SpringApplication.run(ApiServerApplication.class, args);
  }
}
