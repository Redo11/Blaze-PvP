package pl.polskistevek.blazepvp.utils;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.configuration.file.FileConfiguration;
import pl.polskistevek.blazepvp.Blaze;

public class Config {
    public static String perm = getString("permission-prefix");
    public static String noperm = getString("messages.no-permission");

    public static FileConfiguration getConfig(){
        return Blaze.getPlugin().getConfig();
    }
    public static Material getMaterial(String string){
        return Material.getMaterial(Config.getString(string));
    }
    public static String getString(String string){
        return getConfig().getString(string);
    }
    public static int getInt(String string){
        return getConfig().getInt(string);
    }
    public static boolean getBoolean(String string){
        return getConfig().getBoolean(string);
    }
    public static void set(String section, String value){
        getConfig().set(section, value);
        save();
    }
    public static void set(String section, int value){
        getConfig().set(section, value);
        save();
    }
    public static void save(){
        Blaze.getPlugin().saveConfig();
    }

    public static Location getSpawn(){
        final Location loc = new Location(Bukkit.getWorld("world"), 0.0, 0.0, 0.0, 0.0f, 0.0f);
        loc.setX(Double.parseDouble(getString("Locations.spawn.x")));
        loc.setY(Double.parseDouble(getString("Locations.spawn.y")));
        loc.setZ(Double.parseDouble(getString("Locations.spawn.z")));
        return loc;
    }

    public static void setSpawn(final Location str){
        getConfig().set("Locations.spawn.x", str.getX());
        getConfig().set("Locations.spawn.y", str.getY());
        getConfig().set("Locations.spawn.z", str.getZ());
    }
}
