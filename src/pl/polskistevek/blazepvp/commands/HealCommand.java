package pl.polskistevek.blazepvp.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import pl.polskistevek.blazepvp.utils.ChatUtil;
import pl.polskistevek.blazepvp.utils.Config;
import pl.polskistevek.blazepvp.utils.Utils;

public class HealCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String s, String[] strings) {
        Player p = (Player) sender;
        String permission = Config.perm + ".heal";
        if (p.hasPermission(permission)){
            p.setHealth(20);
            p.setExhaustion(0);
            p.setFoodLevel(20);
            p.sendMessage(ChatUtil.fix("%tag &aZostales uleczony!"));
        } else{
            Utils.noPermission(p, permission);
        }
        return false;
    }
}