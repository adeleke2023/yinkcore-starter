-- CREATE TYPE EVENTSTATUS AS ENUM ('PENDING','PROCESSING','PROCESSED','FAILED');

CREATE TABLE outbox_events (
    id UUID PRIMARY KEY,
    aggregate_type VARCHAR(255) NOT NULL,
    aggregate_id VARCHAR(255) NOT NULL,
    event_type VARCHAR(255) NOT NULL,
    payload TEXT NOT NULL,
    status VARCHAR(50) NOT NULL DEFAULT 'PENDING',
    created_at TIMESTAMP NOT NULL,
    processed_at TIMESTAMP
);

CREATE INDEX idx_outbox_processed_at ON outbox_events (processed_at);
CREATE INDEX idx_outbox_status ON outbox_events (status);
CREATE INDEX idx_outbox_created_at ON outbox_events (created_at);
