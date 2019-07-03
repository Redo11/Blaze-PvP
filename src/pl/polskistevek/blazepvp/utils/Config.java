package pl.polskistevek.blazepvp.utils;

import org.bukkit.configuration.file.FileConfiguration;
import pl.polskistevek.blazepvp.Blaze;

public class Config {

    public static FileConfiguration getConfig(){
        return Blaze.plugin.getConfig();
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
        Blaze.plugin.saveConfig();
    }
}
