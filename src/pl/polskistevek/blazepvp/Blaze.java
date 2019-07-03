package pl.polskistevek.blazepvp;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;
import pl.polskistevek.blazepvp.commands.ExampleCommand;
import pl.polskistevek.blazepvp.listeners.ExampleListener;

public class Blaze extends JavaPlugin {
    public static Blaze plugin;

    public void onEnable(){
        registerCommands();
        registerListeners();
        plugin = this;
    }

    private void registerCommands(){
        getCommand("test").setExecutor(new ExampleCommand());
    }
    private void registerListeners(){
        Bukkit.getPluginManager().registerEvents(new ExampleListener(), this);
    }
}
