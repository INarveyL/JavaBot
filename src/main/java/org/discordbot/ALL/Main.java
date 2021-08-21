package org.discordbot.ALL;

import de.btobastian.sdcf4j.CommandHandler;
import de.btobastian.sdcf4j.handler.JavacordHandler;
import org.discordbot.ALL.commands.Embed;
import org.javacord.api.DiscordApi;
import org.javacord.api.DiscordApiBuilder;
import org.javacord.api.entity.message.embed.EmbedBuilder;
import org.javacord.api.event.message.MessageCreateEvent;

import java.awt.*;

public class Main {

    public static final String Prefix = "j!";
    public static void main(String[] args)
    {
        DiscordApi bot = new DiscordApiBuilder().setToken(secret.TOKEN).login().join();
        CommandHandler handler = new JavacordHandler(bot);
        handler.setDefaultPrefix(Prefix);
        handler.registerCommand(new Embed());
        System.out.println("Hello");
    }
}
