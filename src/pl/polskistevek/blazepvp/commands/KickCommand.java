package pl.polskistevek.blazepvp.commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import pl.polskistevek.blazepvp.utils.ChatUtil;
import pl.polskistevek.blazepvp.utils.Config;

public class KickCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String s, String[] args) {
        Player p = (Player) sender;
        String permission = Config.perm + ".kick";
        if (!p.hasPermission(permission)) {
            p.sendMessage(ChatUtil.fix(Config.noperm));
            return false;
        }
        if (args.length < 2) {
            p.sendMessage(ChatUtil.fix("%tag%Poprawne uzycie: &6/kick <Nick> <Powod>"));
            return false;
        }
        Player arg = Bukkit.getPlayer(args[0]);
        if (arg == null) {
            p.sendMessage(ChatUtil.fix("%tag%Ten gracz jest Offline!"));
            return false;
        }
        final StringBuilder sb = new StringBuilder();
        for (int i = 1; i < args.length; ++i) {
            sb.append(args[i]).append(" ");
        }
        final String message = sb.toString();
        arg.kickPlayer(ChatUtil.fix(Config.getString("bans.kick-message").replace("{ADM}", p.getName()).replace("{POWOD}", message)));
        Bukkit.broadcastMessage(ChatUtil.fix(Config.getString("bans.kick-broadcast").replace("{ADM}", p.getName()).replace("{POWOD}", message).replace("{NICK}", arg.getName())));
        return false;
    }
}
