package pl.polskistevek.blazepvp.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import pl.polskistevek.blazepvp.Blaze;
import pl.polskistevek.blazepvp.utils.ChatUtil;

public class BlazeCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String s, String[] args) {
        Player p = (Player) sender;
        p.sendMessage(ChatUtil.fix("%tag%Plugin stworzony przez PolskiStevek oraz Jambosmaha"));
        p.sendMessage(ChatUtil.fix("%tag%Wersja: &6" + Blaze.getPlugin().getDescription().getVersion()));
        if (p.hasPermission("blaze.reload")){
            p.sendMessage(ChatUtil.fix("%tag%Reloadowanie configu..."));
            Blaze.getPlugin().reloadConfig();
            p.sendMessage(ChatUtil.fix("%tag%&aZakonczono!"));
        }
        return false;
    }
}
