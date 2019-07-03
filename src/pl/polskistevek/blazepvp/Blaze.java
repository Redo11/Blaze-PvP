package pl.polskistevek.blazepvp;

import org.bukkit.Bukkit;
import org.bukkit.Difficulty;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;
import pl.polskistevek.blazepvp.commands.*;
import pl.polskistevek.blazepvp.listeners.*;

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
        getCommand("yt").setExecutor(new YouTubeCommand());
        getCommand("tp").setExecutor(new TpCommand());
        getCommand("help").setExecutor(new HelpCommand());
        getCommand("list").setExecutor(new ListCommand());
        getCommand("blaze").setExecutor(new BlazeCommand());
        getCommand("yt+").setExecutor(new (YTPlusCommand));
        getCommand("miniyt").setExecutor(new MiniYtCommand());
        getCommand("putin").setExecutor(new PutinCommand());
        getCommand("discord").setExecutor(new DiscordCommand());
        getCommand("kosz").setExecutor(new KoszCommand());
        getCommand("whois").setExecutor(new WhoisCommand());
        getCommand("www").setExecutor(new WwwCommand());


    }


    private void registerListeners(){
        pm.registerEvents(new PlayerChatListener(), this);
        pm.registerEvents(new PlayerQuitListener(), this);
        pm.registerEvents(new PlayerJoinListener(), this);
        pm.registerEvents(new PlayerCommandListener(), this);
        pm.registerEvents(new ServerListListener(), this);
        pm.registerEvents(new PlayerDamageListener(), this);
        pm.registerEvents(new BlockBreakPlaceListener(), this);
    }

    public static Blaze getPlugin() {
        return Blaze.instance;
    }

    private static void setPlugin(final Blaze plugin) {
        Blaze.instance = plugin;
    }
}
