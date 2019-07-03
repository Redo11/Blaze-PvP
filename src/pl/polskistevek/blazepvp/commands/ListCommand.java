package pl.polskistevek.blazepvp.commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import pl.polskistevek.blazepvp.utils.ChatUtil;
import pl.polskistevek.blazepvp.utils.Config;

public class ListCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String s, String[] strings) {
        sender.sendMessage(ChatUtil.fix("%tag%Na serwerze znajduje sie &6" + Bukkit.getOnlinePlayers().size() + "&c/&6" + Config.getInt("slots") + " &cgraczy."));
        return false;
    }
}
