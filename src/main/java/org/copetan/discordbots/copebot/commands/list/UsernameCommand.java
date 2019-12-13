package org.copetan.discordbots.copebot.commands.list;

import com.jagrosh.jdautilities.command.Command;
import com.jagrosh.jdautilities.command.CommandEvent;
import org.copetan.discordbots.copebot.commands.CategoriesList;
import org.copetan.discordbots.copebot.objectsnmethods.Logger;

public class UsernameCommand extends Command {

    public UsernameCommand() {
        this.name = "username";
        this.aliases = new String[]{"name"};
        this.category = CategoriesList.getMiscellaneousCategory();
        this.help = "This command just states your username";
        this.guildOnly = false;
    }

    @Override
    protected void execute(CommandEvent event) {
        Logger.logger(event, name);
        event.reply("Your username is " + event.getAuthor().getName());
    }
}
