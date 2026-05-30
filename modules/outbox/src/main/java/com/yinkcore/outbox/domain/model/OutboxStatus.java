package com.yinkcore.outbox.domain.model;

public enum OutboxStatus {
  PENDING,
  PROCESSING,
  PROCESSED,
  FAILED
}
