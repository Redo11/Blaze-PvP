package pl.polskistevek.blazepvp;

import org.bukkit.Bukkit;
import org.bukkit.Difficulty;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;
import pl.polskistevek.blazepvp.commands.*;
import pl.polskistevek.blazepvp.listeners.*;
import pl.polskistevek.blazepvp.utils.ChatUtil;

import java.util.Arrays;

public class Blaze extends JavaPlugin {
    private static Blaze instance;
    private static PluginManager pm = Bukkit.getPluginManager();

    public void onEnable(){
        setPlugin(this);
        saveDefaultConfig();
        registerCommands();
        registerListeners();
        Bukkit.getWorld("world").setDifficulty(Difficulty.PEACEFUL);
        Bukkit.broadcastMessage(ChatUtil.fix("%tag%Plugin stworzony przez PolskiStevek oraz Jambosmaha"));
        Bukkit.broadcastMessage(ChatUtil.fix("%tag%Wersja: &6" + Blaze.getPlugin().getDescription().getVersion()));
    }

    private void registerCommands() {
        try {
            getCommand("blaze").setExecutor(new BlazeCommand());
            getCommand("bc").setExecutor(new BroadcastCommand());
            getCommand("discord").setExecutor(new DiscordCommand());
            getCommand("fly").setExecutor(new FlyCommand());
            getCommand("gamemode").setExecutor(new GamemodeCommand());
            getCommand("gang").setExecutor(new GangCommand());
            getCommand("heal").setExecutor(new HealCommand());
            getCommand("help").setExecutor(new HelpCommand());
            getCommand("helpop").setExecutor(new HelpopCommand());
            getCommand("kick").setExecutor(new KickCommand());
            getCommand("list").setExecutor(new ListCommand());
            getCommand("live").setExecutor(new LiveCommand());
            getCommand("miniyt").setExecutor(new MiniYtCommand());
            getCommand("putin").setExecutor(new PutinCommand());
            getCommand("putin+").setExecutor(new PutinPlusCommand());
            getCommand("putin++").setExecutor(new PutinPlusPlusCommand());
            getCommand("setspawn").setExecutor(new SetSpawnCommand());
            getCommand("tp").setExecutor(new TpCommand());
            getCommand("whois").setExecutor(new WhoisCommand());
            getCommand("yt").setExecutor(new YouTubeCommand());
            getCommand("yt+").setExecutor(new YTPlusCommand());
        } catch (Exception e) {
            Bukkit.broadcastMessage(ChatUtil.fix("%tag% Wystapil blad w kodzie: " + Arrays.toString(e.getStackTrace())));
        }
    }
    public void onDisable(){
        Bukkit.broadcastMessage(ChatUtil.fix("%tag%Restartowanie pluginu, wystapi lag..."));
    }
    private void registerListeners(){
        pm.registerEvents(new PlayerChatListener(), this);
        pm.registerEvents(new PlayerQuitListener(), this);
        pm.registerEvents(new PlayerJoinListener(), this);
        pm.registerEvents(new PlayerCommandListener(), this);
        pm.registerEvents(new ServerListListener(), this);
        pm.registerEvents(new PlayerDamageListener(), this);
        pm.registerEvents(new BlockBreakPlaceListener(), this);
        pm.registerEvents(new InventoryClickListener(), this);
        pm.registerEvents(new PlayerPickupListener(), this);
        pm.registerEvents(new AntiCropTrampleListener(), this);
    }

    public static Blaze getPlugin() {
        return Blaze.instance;
    }

    private static void setPlugin(final Blaze plugin) {
        Blaze.instance = plugin;
    }
}
