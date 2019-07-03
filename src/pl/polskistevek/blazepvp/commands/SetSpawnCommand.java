package pl.polskistevek.blazepvp.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import pl.polskistevek.blazepvp.utils.ChatUtil;
import pl.polskistevek.blazepvp.utils.Config;

public class SetSpawnCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String s, String[] strings) {
        Player p = (Player) sender;
        if (!p.hasPermission(Config.perm + ".setspawn")){
            p.sendMessage(ChatUtil.fix(Config.noperm));
            return false;
        }
        p.sendMessage(ChatUtil.fix("%tag%Ustawiono lobby / spawn serwera!"));
        Config.setSpawn(p.getLocation());
        Config.save();
        return false;
    }
}
