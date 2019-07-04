package pl.polskistevek.blazepvp.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import pl.polskistevek.blazepvp.utils.ChatUtil;
public class GangbladCommand implements CommandExecutor {
    public boolean onCommand(CommandSender sender, Command command, String s, String[] strings) {
        sender.sendMessage(ChatUtil.fix("     &8&m-------------&8 ( >> &c&lGANG &8<< ) &8&m-------------&8 "));
        sender.sendMessage(ChatUtil.fix(" &8  >&cBŁĄD &6Poprawne uzycie /gang info !("));
        sender.sendMessage(ChatUtil.fix("     &8&m-------------&8 ( >> &c&lGANG &8<< ) &8&m-------------&8"));
        return false;
    }
}