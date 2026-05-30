package com.yinkcore.testing.database;

import org.springframework.jdbc.core.JdbcTemplate;

public class DatabaseCleaner {

  private final JdbcTemplate jdbcTemplate;

  public DatabaseCleaner(JdbcTemplate jdbcTemplate) {
    this.jdbcTemplate = jdbcTemplate;
  }

  public void truncate(String table) {
    jdbcTemplate.execute("TRUNCATE TABLE " + table + " RESTART IDENTITY CASCADE");
  }
}
