package dev.martintaylor.ehrimportservice.service;

import dev.martintaylor.ehrimportservice.enumeration.MessageSegment;
import dev.martintaylor.ehrimportservice.factory.PatternFactory;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.UUID;
import java.util.regex.Matcher;

@Service
public class ParsingService {
    public Optional<UUID> getConversationId(String gp2gpMessage) {
        final Matcher matcher = PatternFactory.getPattern(MessageSegment.CONVERSATION_ID)
            .matcher(gp2gpMessage);

        return matcher.find() ? Optional.of(UUID.fromString(matcher.group(1))) : Optional.empty();
    }

    public Optional<UUID> getMessageId(String gp2gpMessage) {
        final Matcher matcher = PatternFactory.getPattern(MessageSegment.MESSAGE_ID)
            .matcher(gp2gpMessage);

        return matcher.find() ? Optional.of(UUID.fromString(matcher.group(1))) : Optional.empty();
    }

    public Optional<String> getInteractionId(String gp2gpMessage) {
        final Matcher matcher = PatternFactory.getPattern(MessageSegment.ACTION)
            .matcher(gp2gpMessage);

        return matcher.find() ? Optional.of(matcher.group(1)) : Optional.empty();
    }
}