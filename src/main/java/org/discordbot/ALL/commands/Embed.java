package org.discordbot.ALL.commands;

import de.btobastian.sdcf4j.Command;
import de.btobastian.sdcf4j.CommandExecutor;
import org.discordbot.ALL.Main;
import org.javacord.api.entity.message.Message;
import org.javacord.api.entity.message.embed.EmbedBuilder;
import org.javacord.api.event.message.MessageCreateEvent;

import java.awt.*;

public class Embed implements CommandExecutor {
    @Command(aliases = "embed", description = "I dont know")
    public void onPingCommand(MessageCreateEvent message)
    {
        checkOwner a = new checkOwner();
            if (a.owner_check(message)) {
                message.getChannel().sendMessage("ok");
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
}
