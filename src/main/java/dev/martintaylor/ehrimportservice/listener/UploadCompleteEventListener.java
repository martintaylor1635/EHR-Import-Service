package dev.martintaylor.ehrimportservice.listener;

import dev.martintaylor.ehrimportservice.event.UploadCompleteEvent;
import org.springframework.context.event.EventListener;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Component;

@Component
public final class UploadCompleteEventListener {
    @EventListener
    private void onUploadComplete(@NonNull UploadCompleteEvent event) {
        System.out.println(event);
    }
}
