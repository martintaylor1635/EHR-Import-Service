package dev.martintaylor.ehrimportservice.event;

import java.util.UUID;

public record UploadFailureEvent(
    UUID conversationId,
    Throwable throwable,
    boolean isRetryable
) { }