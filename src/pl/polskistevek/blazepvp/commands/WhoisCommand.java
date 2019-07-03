package pl.polskistevek.blazepvp.commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import pl.polskistevek.blazepvp.utils.Config;

public class WhoisCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String s, String[] args) {
        String permission = Config.getString("permission") + "whois";
        if (!sender.hasPermission(permission)) {
            Utils.noPermission((Player) sender, permission);
            return false;
        }
        if (args.length < 1) {
            sender.sendMessage(ChatUtil.fix(" &8>> &7Poprawne uzycie &6/whois <gracz>"));
            return false;
        }
        final Player other = Bukkit.getPlayerExact(args[0]);
        if (other == null) {
            sender.sendMessage(ChatUtil.fix(" &8>> &7Ten gracz jest &coffline&7!"));
            return false;
        }
        TitleAPI.sendTitle((Player) sender, 10, 70, 10, "&8[&cWhoIS&8]", "&7Pobrano Informacje!");
        Bukkit.broadcast(ChatUtil.fix(" &8[&cWhoIS&8] &7Gracz &6" + sender.getName() + " &7sprawdza informacje o: &c" + other.getName()), "stiv.chat");
        sender.sendMessage(ChatUtil.fix("    &8&m-------------&8 ( >> &c&lWHOIS &8<< ) &8&m-------------&8 "));
        sender.sendMessage(ChatUtil.fix(" &8>> &6Nick: &7") + other.getName());
        sender.sendMessage(ChatUtil.fix(" &8>> &6DisplayName: &7") + other.getDisplayName());
        sender.sendMessage(ChatUtil.fix(" &8>> &6Swiat: &7") + other.getWorld().getName());
        sender.sendMessage(ChatUtil.fix(" &8>> &6Kordy: &c" + other.getLocation().getX() + "&8, &c" + other.getLocation().getY() + "&8, &c" + other.getLocation().getZ()));
        sender.sendMessage(ChatUtil.fix(" &8>> &6Latanie: &7") + other.getAllowFlight());
        sender.sendMessage(ChatUtil.fix(" &8>> &6Tryb gry: &7") + other.getGameMode());
        sender.sendMessage(ChatUtil.fix(" &8>> &6IP (InetHost): &7") + other.getAddress());
        sender.sendMessage(ChatUtil.fix(" &8>> &6OP: &c") + other.isOp());
        sender.sendMessage(ChatUtil.fix(" &8>> &6UUID: &7") + other.getUniqueId());
        sender.sendMessage(ChatUtil.fix("    &8&m-------------&8 ( >> &c&lWHOIS &8<< ) &8&m-------------&8 "));
        return false;
    }
}