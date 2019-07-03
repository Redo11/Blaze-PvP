package pl.polskistevek.blazepvp.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import pl.polskistevek.blazepvp.utils.ChatUtil;
public class TeamSpeakCommand implements CommandExecutor {
    public boolean onCommand(CommandSender sender, Command command, String s, String[] strings) {
        sender.sendMessage(ChatUtil.fix("     &8&m-------------&8 ( >> &c&lTEAMSPEAK &8<< ) &8&m-------------&8 "));
        sender.sendMessage(ChatUtil.fix(" &8  >>>&6&lTS3&7: Aktualnie Brak:("));
        sender.sendMessage(ChatUtil.fix("     &8&m-------------&8 ( >> &c&lTEAMSPEAK &8<< ) &8&m-------------&8"));
        return false;
    }
}