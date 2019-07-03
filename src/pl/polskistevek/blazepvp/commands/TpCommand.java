package pl.polskistevek.blazepvp.commands;

public class TpCommand {
}
import org.bukkit.Bukkit;
        import org.bukkit.command.Command;
        import org.bukkit.command.CommandExecutor;
        import org.bukkit.command.CommandSender;
        import org.bukkit.entity.Player;
        import pl.polskistevek.core.utils.ChatUtil;
        import pl.polskistevek.core.utils.Config;
        import pl.polskistevek.core.utils.Utils;

public class TpCommand implements CommandExecutor {

    public boolean onCommand(final CommandSender sender, final Command cmd, final String label, final String[] args) {
        String permission = Config.getString("permission") + "tp";
        if (!sender.hasPermission(permission)) {
            Utils.noPermission((Player) sender, permission);
            return false;
        }
        final Player player = (Player)sender;
        if (args.length < 1) {
            sender.sendMessage(ChatUtil.fix("%tag &cPoprawne uzycie &6/tp <gracz>"));
            return false;
        }
        final Player other = Bukkit.getPlayer(args[0]);
        if (other == null) {
            sender.sendMessage(ChatUtil.fix("%tag &cTen gracz jest NieAktywny!"));
            return false;
        }
        player.teleport(other.getLocation());
        player.sendMessage(ChatUtil.fix("%tag &cPrzeteleportowano do: &c" + other.getName()));
        return false;
    }
}