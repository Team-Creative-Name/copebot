package commands.list;

import com.jagrosh.jdautilities.command.Command;
import com.jagrosh.jdautilities.command.CommandEvent;
import methodsnstuff.Logger;
import java.sql.Timestamp;
import java.time.LocalDateTime;

public class TestCommand extends Command {

    public TestCommand(){

        this.name = "test";
        this.help = "This is a test";
        this.category = new Category("Test");
        this.arguments = "wowowowo";
        this.guildOnly = false;

    }

    @Override
    protected void execute(CommandEvent event){

        String time = Timestamp.valueOf(LocalDateTime.now()).toString();

        event.reply("It works!");
        event.reply(time);
        Logger.logger(event, name);
    }


}