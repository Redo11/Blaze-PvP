package pl.polskistevek.blazepvp.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import pl.polskistevek.blazepvp.utils.ChatUtil;
import pl.polskistevek.blazepvp.utils.Config;
import pl.polskistevek.blazepvp.utils.Utils;

public class FlyCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String s, String[] args) {
        Player p = (Player) sender;
        String permission = Config.perm + ".fly";
        if (p.hasPermission(permission)) {
            if (!p.getAllowFlight()) {
                p.setAllowFlight(true);
                p.sendMessage(ChatUtil.fix("%tag &cLatanie zostalo: &6WLACZONE"));
            } else {
                p.setAllowFlight(false);
                p.sendMessage(ChatUtil.fix("%tag &cLatanie zostalo: &6WYLACZONE"));
            }
            return false;
        } else{
            Utils.noPermission(p, "shc.fly");
        }
        return false;
    }
}