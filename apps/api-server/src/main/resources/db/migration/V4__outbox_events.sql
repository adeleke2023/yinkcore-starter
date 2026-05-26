CREATE TABLE outbox_events (
    id UUID PRIMARY KEY,
    event_type VARCHAR(255) NOT NULL,
    aggregate_type VARCHAR(255) NOT NULL,
    aggregate_id VARCHAR(255) NOT NULL,
    payload TEXT NOT NULL,
    occurred_on TIMESTAMP NOT NULL,
    processed BOOLEAN NOT NULL
);

CREATE INDEX idx_outbox_processed ON outbox_events (processed);