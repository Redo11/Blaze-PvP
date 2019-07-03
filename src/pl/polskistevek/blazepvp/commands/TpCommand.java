package pl.polskistevek.blazepvp.commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import pl.polskistevek.blazepvp.utils.ChatUtil;
import pl.polskistevek.blazepvp.utils.Config;

public class TpCommand implements CommandExecutor {

    public boolean onCommand(final CommandSender sender, final Command cmd, final String label, final String[] args) {
        String permission = Config.perm + ".tp";
        Player player = (Player)sender;
        if (!player.hasPermission(permission)) {
            player.sendMessage(ChatUtil.fix(Config.noperm));
            return false;
        }
        if (args.length < 1) {
            player.sendMessage(ChatUtil.fix("%tag%Poprawne uzycie &6/tp <gracz>"));
            return false;
        }
        Player arg = Bukkit.getPlayer(args[0]);
        if (arg == null) {
            player.sendMessage(ChatUtil.fix("%tag%Ten gracz jest Offline!"));
            return false;
        }
        player.teleport(arg.getLocation());
        player.sendMessage(ChatUtil.fix("%tag%Przeteleportowano do: &6" + arg.getName()));
        return false;
    }
}