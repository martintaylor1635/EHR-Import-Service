package dev.martintaylor.ehrimportservice.listener;

import dev.martintaylor.ehrimportservice.event.UploadFailureEvent;
import org.springframework.context.event.EventListener;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Component;

@Component
final class UploadFailureEventListener {
    @EventListener
    private void onUploadFailureEvent(@NonNull UploadFailureEvent event) {
        System.out.println(event);
    }
}