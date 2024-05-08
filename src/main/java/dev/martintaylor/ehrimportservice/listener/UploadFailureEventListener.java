package dev.martintaylor.ehrimportservice.listener;

import dev.martintaylor.ehrimportservice.event.UploadFailureEvent;
import org.springframework.context.event.EventListener;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
final class UploadFailureEventListener {
    @EventListener
    private void onUploadFailureEvent(@NonNull UploadFailureEvent event) {
        if(event.isRetryable()) {
            retry(event.getConversationId());
        }
    }

    private void retry(UUID conversationId) {
        System.out.println(conversationId);
    }
}