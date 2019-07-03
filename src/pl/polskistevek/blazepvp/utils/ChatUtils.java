package pl.polskistevek.blazepvp.utils;

import net.md_5.bungee.api.ChatColor;

public class ChatUtils {
    public static String fix(String text) {
        return ChatColor.translateAlternateColorCodes('&', text.replace(">>", "»").replace("%tag%", Config.getString("prefix")).replace("<<", "«"));
    }

    public static String getStringFromArg(String[] args){
        final StringBuilder sb = new StringBuilder();
        for (int i = 0; i < args.length; ++i) {
            sb.append(args[i]).append(" ");
        }
        return sb.toString();
    }
}
