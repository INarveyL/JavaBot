package org.discordbot.ALL.commands;

import org.javacord.api.entity.message.embed.EmbedBuilder;
import org.javacord.api.event.message.MessageCreateEvent;

import java.awt.*;


public class checkOwner {

    public static boolean owner_check(MessageCreateEvent event) {
        if (event.getMessageAuthor().isBotOwner()) {
            return true;
        } else {
            event.getChannel().sendMessage(new EmbedBuilder().setColor(new Color(245, 20, 20))
                    .setFooter("Nope!").setDescription("You must be the owner of the bot to do that").setAuthor("Failed!"));
            return false;
        }
    }
}

