package dev.martintaylor.ehrimportservice.exception.base;

import java.util.UUID;

import static dev.martintaylor.ehrimportservice.utility.DateUtility.getZonedIsoOffsetDateTime;


public abstract class UploadException extends RuntimeException {
    private final UUID conversationId;
    private final String thrownAt;

    public UUID getConversationId() {
        return conversationId;
    }

    public String getThrownAt() {
        return thrownAt;
    }

    public UploadException(UUID conversationId, String message) {
        super(message);
        this.conversationId = conversationId;
        this.thrownAt = getZonedIsoOffsetDateTime();
    }
}