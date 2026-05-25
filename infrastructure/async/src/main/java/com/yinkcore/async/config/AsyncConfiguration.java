package com.yinkcore.async.config;

import java.util.concurrent.Executor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

@Configuration
@EnableAsync
public class AsyncConfiguration {

  @Bean(name = "applicationTaskExecutor")
  public Executor taskExecutor() {

    ThreadPoolTaskExecutor executor = new ThreadPoolTaskExecutor();

    executor.setCorePoolSize(10);

    executor.setMaxPoolSize(50);

    executor.setQueueCapacity(500);

    executor.setThreadNamePrefix("yinkcore-async-");

    executor.initialize();

    return executor;
  }
}
