package io.minimum.minecraft.superbvote.configuration.message;

import java.util.Locale;

public enum MessageType {
    PLAIN,
    JSON,
    MINIMESSAGE;

    public static MessageType get(String value) {
        if (value == null) return PLAIN;
        try {
            return valueOf(value.toUpperCase(Locale.ROOT));
        } catch (IllegalArgumentException e) {
            return PLAIN;
        }
    }
}
