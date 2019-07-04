package pl.polskistevek.blazepvp.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import pl.polskistevek.blazepvp.utils.ChatUtil;

public class MiniYtCommand implements CommandExecutor {
    public boolean onCommand(CommandSender sender, Command command, String s, String[] strings) {
        sender.sendMessage(ChatUtil.fix("     &8&m-------------&8 ( >> &c&lMINIYOUTUBE &8<< ) &8&m-------------&8 "));
        sender.sendMessage(ChatUtil.fix(" &8>> &cWwymagania: &230 &7Subskrypcji +&5Odcinek z serwera."));
        sender.sendMessage(ChatUtil.fix(" &8>> &6Posiada Permisje rangi &ePutiN"));
        sender.sendMessage(ChatUtil.fix(" &8>> &6+Permisje do /live "));
        sender.sendMessage(ChatUtil.fix(" &8>> &6Specjalny prefix na chacie &7[&cMini&fYoutuber&7] " + sender.getName()));
        sender.sendMessage(ChatUtil.fix("     &8&m-------------&8 ( >> &c&lMINIYOUTUBE &8<< ) &8&m-------------&8 "));
        return false;
    }
}