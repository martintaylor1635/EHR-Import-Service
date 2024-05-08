package dev.martintaylor.ehrimportservice.event;

import java.util.UUID;

public class UploadFailureEvent {
    private final UUID conversationId;
    private final Throwable throwable;
    private final boolean isRetryable;

    public UUID getConversationId() {
        return conversationId;
    }

    public Throwable getThrowable() {
        return throwable;
    }

    public boolean isRetryable() {
        return isRetryable;
    }

    public UploadFailureEvent(UUID conversationId, Throwable throwable, boolean isRetryable) {
        this.conversationId = conversationId;
        this.throwable = throwable;
        this.isRetryable = isRetryable;
    }
}