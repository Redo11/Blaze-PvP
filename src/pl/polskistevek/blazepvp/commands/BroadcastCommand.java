package pl.polskistevek.blazepvp.commands;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import pl.polskistevek.blazepvp.utils.ChatUtil;
import pl.polskistevek.blazepvp.utils.Config;
import pl.polskistevek.blazepvp.utils.Utils;
import pl.polskistevek.blazepvp.utils.titleapi.TitleAPI;

public class BroadcastCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String s, String[] args) {
        String permission = Config.perm + ".bc";
        if (sender.hasPermission(permission)){
            if (args.length == 0){
                sender.sendMessage("Podaj wiadomosc!");
                return false;
            }
            else{
                final StringBuilder sb = new StringBuilder();
                for (int i = 0; i < args.length; ++i) {
                    sb.append(args[i]).append(" ");
                }
                final String message = sb.toString();
                Bukkit.broadcastMessage("");
                Bukkit.broadcastMessage(ChatUtil.fix("&2&lOGLOSZENIE &8>> &6" + message));
                Bukkit.broadcastMessage("");
                for (Player u : Bukkit.getOnlinePlayers()){
                    TitleAPI.sendTitle(u, 10, 150, 10, ChatUtil.fix("&8[&4OGLOSZENIE&8]"), ChatUtil.fix("&6" +message));
                }
            }
            return false;
        }else{
            Utils.noPermission((Player) sender, permission);
        }
        return false;
    }
}