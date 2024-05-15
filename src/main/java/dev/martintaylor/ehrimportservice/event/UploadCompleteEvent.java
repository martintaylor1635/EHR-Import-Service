package dev.martintaylor.ehrimportservice.event;

import java.time.ZonedDateTime;
import java.util.UUID;

public record UploadCompleteEvent(
    UUID conversationId,
    ZonedDateTime startedAt,
    ZonedDateTime completedAt
) { }