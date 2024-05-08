package dev.martintaylor.ehrimportservice.event;

import java.time.ZonedDateTime;
import java.util.UUID;

public class TimeoutEvent {
    private final UUID conversationId;
    private final ZonedDateTime timeoutAt;

    public final UUID getConversationId() {
        return conversationId;
    }

    public ZonedDateTime getTimeoutAt() {
        return timeoutAt;
    }

    public TimeoutEvent(UUID conversationId, ZonedDateTime timeoutAt) {
        this.conversationId = conversationId;
        this.timeoutAt = timeoutAt;
    }

    @Override
    public String toString() {
        return "TimeoutEvent{" +
            "conversationId=" + conversationId +
            ", timeoutAt=" + timeoutAt +
            '}';
    }
}