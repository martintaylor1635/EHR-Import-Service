package dev.martintaylor.ehrimportservice.factory;

import dev.martintaylor.ehrimportservice.enumeration.MessageSegment;

import java.util.regex.Pattern;

public final class PatternFactory {
    private static final String CONVERSATION_ID_REGEX = "<eb:ConversationId>([0-9a-fA-F]{8}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{12})</eb:ConversationId>";
    private static final String MESSAGE_ID_REGEX = "<eb:MessageId>([0-9a-fA-F]{8}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{12})</eb:MessageId>";
    private static final String ACTION_REGEX = "<eb:Action>(.*?)</eb:Action>";
    private PatternFactory() { }

    public static Pattern getPattern(MessageSegment segment) {
        return switch (segment) {
            case CONVERSATION_ID -> Pattern.compile(CONVERSATION_ID_REGEX);
            case MESSAGE_ID -> Pattern.compile(MESSAGE_ID_REGEX);
            case ACTION -> Pattern.compile(ACTION_REGEX);
        };
    }
}