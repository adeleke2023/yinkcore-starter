package com.yinkcore.api_server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication(scanBasePackages = "com.yinkcore")
@EntityScan(basePackages = {"com.yinkcore"})
@EnableJpaRepositories(basePackages = {"com.yinkcore"})
@ConfigurationPropertiesScan(basePackages = "com.yinkcore")
@EnableScheduling
public class ApiServerApplication {

  public static void main(String[] args) {

    SpringApplication.run(ApiServerApplication.class, args);
    
  }
}
