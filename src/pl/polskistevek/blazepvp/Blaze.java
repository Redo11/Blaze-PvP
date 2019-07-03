package pl.polskistevek.blazepvp;

import org.bukkit.Bukkit;
import org.bukkit.Difficulty;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;
import pl.polskistevek.blazepvp.commands.ExampleCommand;
import pl.polskistevek.blazepvp.commands.SetSpawnCommand;
import pl.polskistevek.blazepvp.listeners.PlayerChatListener;
import pl.polskistevek.blazepvp.listeners.PlayerJoinListener;
import pl.polskistevek.blazepvp.listeners.PlayerQuitListener;

public class Blaze extends JavaPlugin {
    private static Blaze instance;
    private static PluginManager pm = Bukkit.getPluginManager();

    public void onEnable(){
        setPlugin(this);
        saveDefaultConfig();
        registerCommands();
        registerListeners();
        Bukkit.getWorld("world").setDifficulty(Difficulty.PEACEFUL);
    }

    private void registerCommands(){
        getCommand("setspawn").setExecutor(new SetSpawnCommand());
        getCommand("test").setExecutor(new ExampleCommand());
    }
    private void registerListeners(){
        pm.registerEvents(new PlayerChatListener(), this);
        pm.registerEvents(new PlayerQuitListener(), this);
        pm.registerEvents(new PlayerJoinListener(), this);
    }

    public static Blaze getPlugin() {
        return Blaze.instance;
    }

    private static void setPlugin(final Blaze plugin) {
        Blaze.instance = plugin;
    }
}
