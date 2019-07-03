package pl.polskistevek.blazepvp.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import pl.polskistevek.blazepvp.utils.ChatUtil;

public class YTPlusCommand implements CommandExecutor {
    public boolean onCommand(CommandSender sender, Command command, String s, String[] strings) {
        sender.sendMessage(ChatUtil.fix("     &8&m-------------&8 ( >> &c&lYOUTUBER+ &8<< ) &8&m-------------&8 "));
        sender.sendMessage(ChatUtil.fix(" &8>> &cWwymagania: &2300 &7Subskrypcji +&5Odcinek z serwera lub trailer."));
        sender.sendMessage(ChatUtil.fix(" &8>> &6Posiada Permisje rangi &ePutiN&c+&b+"));
        sender.sendMessage(ChatUtil.fix(" &8>> &6+Permisje do /live + /odcinek! "));
        sender.sendMessage(ChatUtil.fix(" &8>> &6Specjalny prefix na chacie &7[&cYoutu&fber&b&l+&7] " + sender.getName()));
        return false;
    }
}