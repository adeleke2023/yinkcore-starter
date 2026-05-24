package com.yinkcore.shared.infrastructure.time;

import java.time.Instant;

public interface ClockProvider {

    Instant now();

}
