package dev.martintaylor.ehrimportservice.listener;

import dev.martintaylor.ehrimportservice.event.TimeoutEvent;
import org.springframework.context.event.EventListener;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Component;

@Component
final class TimeoutEventListener {
    @EventListener
    private void onTimeoutEvent(@NonNull TimeoutEvent event) {
        System.out.println(event);
    }
}