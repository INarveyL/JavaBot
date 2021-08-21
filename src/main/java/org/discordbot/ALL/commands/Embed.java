package org.discordbot.ALL.commands;

import de.btobastian.sdcf4j.Command;
import de.btobastian.sdcf4j.CommandExecutor;

public class Embed implements CommandExecutor {

    @Command(aliases = "Ping", description = "I dont know")
    public String onPingCommand()
    {
        return "hello test 12345 does new bot work";
    }
}
