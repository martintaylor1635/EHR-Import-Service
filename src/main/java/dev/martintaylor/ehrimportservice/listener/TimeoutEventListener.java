package dev.martintaylor.ehrimportservice.listener;

import dev.martintaylor.ehrimportservice.event.TimeoutEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
final class TimeoutEventListener {
    @EventListener(TimeoutEvent.class)
    private void onTimeoutEvent(TimeoutEvent event) {
        System.out.println(event);
    }
}