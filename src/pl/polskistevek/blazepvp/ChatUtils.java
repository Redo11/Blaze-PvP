package pl.polskistevek.blazepvp;

public class ChatUtils {

    public static String fix(String text) {
        return ChatColor.translateAlternateColorCodes('&', text.replace(">>", "»").replace("%tag", Utils.getString("prefix")).replace("<<", "«"));
    }

    public static String getStringFromArg(String[] args){
        final StringBuilder sb = new StringBuilder();
        for (int i = 0; i < args.length; ++i) {
            sb.append(args[i]).append(" ");
        }
        return sb.toString();
    }

    public static void sendMessage(final Player p, final String t) {
        p.sendMessage(fixColor(t));
    }

    public static String locToString(final Location loc) {
        return loc.getX() + ":" + loc.getY() + ":" + loc.getZ() + ":" + loc.getYaw() + ":" + loc.getPitch();
    }

    public static Location locFromString(final String str) {
        final String[] str2loc = str.split(":");
        final Location loc = new Location((World) Bukkit.getWorlds().get(0), 0.0, 0.0, 0.0, 0.0f, 0.0f);
        loc.setX(Double.parseDouble(str2loc[0]));
        loc.setY(Double.parseDouble(str2loc[1]));
        loc.setZ(Double.parseDouble(str2loc[2]));
        loc.setYaw(Float.parseFloat(str2loc[3]));
        loc.setPitch(Float.parseFloat(str2loc[4]));
        return loc;
    }
}
