package pl.polskistevek.blazepvp.utils;

import org.bukkit.entity.Player;

public class Utils {
    public static void noPermission(Player p, String perm){
        p.sendMessage(ChatUtil.fix(Config.noperm));
    }
}
