-- GENDER is the user's sex type
-- CREATE TYPE GENDER AS ENUM ('male','female');
-- USERSTATUS determine the user account current status
-- CREATE TYPE ACCOUNTSTATUS AS ENUM ('PENDING_VERIFICATION','ACTIVE','SUSPENDED','DEACTIVATED');
-- COMMUNITYSTATUS determine your status in YinkCity Community
-- CREATE TYPE COMMUNITYSTATUS AS ENUM ('GUEST','CITIZEN','ELITE','LEADER');
-- BUSINESSSTATUS determine your status level in business within YinkCity Community
-- CREATE TYPE BUSINESSSTATUS AS ENUM ('NONE','STAFF','CEO','FOUNDER');



CREATE TABLE users (
    id UUID PRIMARY KEY,
    first_name VARCHAR(100) NOT NULL,
    last_name VARCHAR(100) NOT NULL,
    gender VARCHAR(10) NOT NULL,
    profile_image VARCHAR(255),
    country_code VARCHAR(10) NOT NULL,
    phone_number VARCHAR(30) NOT NULL UNIQUE,
    email VARCHAR(255) NOT NULL UNIQUE,
    password VARCHAR(255) NOT NULL,
    status VARCHAR(40) DEFAULT 'PENDING',
    community_status VARCHAR(40) DEFAULT 'GUEST',
    business_status VARCHAR(40) DEFAULT 'NONE',
    created_at TIMESTAMP NOT NULL,
    updated_at TIMESTAMP,
    version BIGINT
);

CREATE INDEX idx_users_email ON users (email);