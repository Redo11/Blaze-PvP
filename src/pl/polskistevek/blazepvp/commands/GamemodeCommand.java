package pl.polskistevek.blazepvp.commands;

import org.bukkit.GameMode;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import pl.polskistevek.blazepvp.utils.ChatUtil;
import pl.polskistevek.blazepvp.utils.Config;
import pl.polskistevek.blazepvp.utils.Utils;

public class GamemodeCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String s, String[] args) {
        Player p = (Player) sender;
        String permission = Config.perm + ".gm";
        if (p.hasPermission(permission)) {
            if (args.length < 1) {
                p.sendMessage(ChatUtil.fix("%tag%Poprawne uzycie &6/gm <0/1/3>"));
                return false;
            }
            switch (args[0]) {
                case "0":
                    p.sendMessage(ChatUtil.fix("%tag%Ustawiono tryb gry na: &6SURVIVAL"));
                    p.setGameMode(GameMode.SURVIVAL);
                    break;
                case "1":
                    p.sendMessage(ChatUtil.fix("%tag%Ustawiono tryb gry na: &6CREATIVE"));
                    p.setGameMode(GameMode.CREATIVE);
                    break;
                case "3":
                    p.sendMessage(ChatUtil.fix("%tag%Ustawiono tryb gry na: &6SPECTATOR"));
                    p.setGameMode(GameMode.SPECTATOR);
                    break;
                default:
                    p.sendMessage("%tag &cPoprawne uzycie: &6/gm [0/1/3]");
                    break;
            }
            return false;
        } else{
            Utils.noPermission(p, permission);
        }
        return false;
    }
}