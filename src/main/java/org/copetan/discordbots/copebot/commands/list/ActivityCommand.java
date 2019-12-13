package org.copetan.discordbots.copebot.commands.list;

import com.jagrosh.jdautilities.command.Command;
import com.jagrosh.jdautilities.command.CommandEvent;
import org.copetan.discordbots.copebot.commands.CategoriesList;
import org.copetan.discordbots.copebot.objectsnmethods.Logger;
import net.dv8tion.jda.api.entities.Activity;

public class ActivityCommand extends Command {

	public ActivityCommand() {
		this.name = "setactivity";
		this.aliases = new String[]{"setgame","activity","sa"};
		this.help = "This command changes the bot's activity. Only the owner of this bot can use this command!";
		this.category = CategoriesList.getBotCategory();
		this.arguments = "<playing|listening|watching> <name of the activity>";
		this.ownerCommand = true;
		this.guildOnly = false;
	}

	@Override
	protected void execute(CommandEvent event) {

		String[] args = event.getArgs().split(" ",2);

		if (args.length != 2) {
			event.reply("You did not input the activity name!");
		} else {
			try {
				if (args[0].equalsIgnoreCase("playing") || args[0].equalsIgnoreCase("game")) {

					event.reply("Applying activity!");
					event.getJDA().getPresence().setActivity(Activity.playing(args[1]));

				} else if (args[0].equalsIgnoreCase("listening")) {

					event.reply("Applying activity!");
					event.getJDA().getPresence().setActivity(Activity.listening(args[1]));

				} else if (args[0].equalsIgnoreCase("watching")) {

					event.reply("Applying activity!");
					event.getJDA().getPresence().setActivity(Activity.watching(args[1]));

				} else {
					event.reply("Not a valid activity type!");
				}
			} catch (Exception e) {
				event.reply("There was an error! Please check your private channel for more information");
				event.replyInDm(e.getMessage());
			}
		}
		Logger.logger(event,name);
	}
}