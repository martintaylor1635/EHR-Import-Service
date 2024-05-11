package dev.martintaylor.ehrimportservice.event;

import java.time.ZonedDateTime;
import java.util.UUID;

public record TimeoutEvent(
    UUID conversationId,
    ZonedDateTime timeoutAt
) { }