package pl.polskistevek.blazepvp.commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import pl.polskistevek.blazepvp.utils.ChatUtil;

public class HelpopCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String s, String[] args) {
        Player p = (Player) sender;
        if (args.length < 1) {
            p.sendMessage(ChatUtil.fix("%tag%Poprawne uzycie &6/helpop <wiadomosc>"));
            return false;
        }
        final StringBuilder sb = new StringBuilder();
        for (int i = 0; i < args.length; ++i) {
            sb.append(args[i]).append(" ");
        }
        final String message = sb.toString();
        Bukkit.broadcast(ChatUtil.fix("&8[&4&lHELPOP&8] &6Zgloszenie od &c" + p.getName() + "&8: &7" + message), "shc.chat");
        p.sendMessage(ChatUtil.fix("%tag%Wyslano zgloszenie!"));
        return false;
    }
}