package pl.polskistevek.blazepvp.commands;
import org.bukkit.command.Command;
        import org.bukkit.command.CommandExecutor;
        import org.bukkit.command.CommandSender;
        import org.bukkit.entity.Player;
        import pl.polskistevek.core.utils.Config;
        import pl.polskistevek.core.utils.Utils;
        import pl.polskistevek.core.utils.ChatUtil;

public class FlyCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String s, String[] args) {
        Player p = (Player) sender;
        String permission = Config.getString("permission") + "fly";
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