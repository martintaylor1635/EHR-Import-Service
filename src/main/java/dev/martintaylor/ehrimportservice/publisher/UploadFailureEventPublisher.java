package dev.martintaylor.ehrimportservice.publisher;

import dev.martintaylor.ehrimportservice.event.UploadFailureEvent;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

@Component
public class UploadFailureEventPublisher {
    private final ApplicationEventPublisher eventPublisher;

    UploadFailureEventPublisher(ApplicationEventPublisher eventPublisher) {
        this.eventPublisher = eventPublisher;
    }

    public void publishUploadFailureEvent(UploadFailureEvent event) {
        eventPublisher.publishEvent(event);
    }
}