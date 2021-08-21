package org.discordbot.ALL.commands;

import de.btobastian.sdcf4j.Command;
import de.btobastian.sdcf4j.CommandExecutor;
import org.javacord.api.entity.message.Message;
import org.javacord.api.entity.message.embed.EmbedBuilder;
import org.javacord.api.event.message.MessageCreateEvent;

import java.awt.*;

public class Embed implements CommandExecutor {

    @Command(aliases = "embed", description = "I dont know")
    public void onPingCommand(MessageCreateEvent message)
    {
        if (message.getMessageAuthor().isBotOwner()) {
            message.getChannel().sendMessage(embed(message));
        } else {
            message.getChannel().sendMessage(embed1(message));
        }

    }

    private EmbedBuilder embed(MessageCreateEvent message)
    {
        return new EmbedBuilder()
                .setTitle("TEST")
                .setDescription("This is an embed")
                .setColor(new Color(99,123,121))
                .setFooter("Hello", message.getMessageAuthor().getAvatar());
    }

    private EmbedBuilder embed1(MessageCreateEvent message)
    {
        return new EmbedBuilder()
                .setTitle("You Can't Do That!")
                .setDescription("Only my owner can use that command!")
                .setColor(new Color(99,123,121))
                .setFooter("Become owner of bot xD", message.getMessageAuthor().getAvatar());
    }
}
