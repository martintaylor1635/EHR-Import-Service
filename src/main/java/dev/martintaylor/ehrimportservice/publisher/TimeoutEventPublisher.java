package dev.martintaylor.ehrimportservice.publisher;

import dev.martintaylor.ehrimportservice.event.TimeoutEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

@Component
public class TimeoutEventPublisher {
    private final ApplicationEventPublisher eventPublisher;

    @Autowired
    TimeoutEventPublisher(ApplicationEventPublisher eventPublisher) {
        this.eventPublisher = eventPublisher;
    }

    public void publishTimeout(TimeoutEvent event) {
        eventPublisher.publishEvent(event);
    }
}