package org.discordbot.ALL.commands;

import org.javacord.api.event.message.MessageCreateEvent;

public class checkOwner {
    public static boolean owner_check(MessageCreateEvent event) {
        return (event.getMessageAuthor().isBotOwner());
    }
}
