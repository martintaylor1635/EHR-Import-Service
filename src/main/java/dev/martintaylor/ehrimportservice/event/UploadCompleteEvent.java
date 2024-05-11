package dev.martintaylor.ehrimportservice.event;

import java.util.UUID;

public record UploadCompleteEvent(
    UUID conversationId
) { }