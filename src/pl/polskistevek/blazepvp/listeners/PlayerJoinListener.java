package pl.polskistevek.blazepvp.listeners;

import com.coloredcarrot.api.sidebar.Sidebar;
import com.coloredcarrot.api.sidebar.SidebarString;
import net.md_5.bungee.api.ChatColor;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import pl.polskistevek.blazepvp.Blaze;
import pl.polskistevek.blazepvp.managers.UserManager;
import pl.polskistevek.blazepvp.utils.ChatUtil;
import pl.polskistevek.blazepvp.utils.Config;
import pl.polskistevek.blazepvp.utils.ItemBuilder;
import pl.polskistevek.blazepvp.utils.titleapi.TitleAPI;
import ru.tehkode.permissions.bukkit.PermissionsEx;

public class PlayerJoinListener implements Listener {

    @EventHandler
    public void onJoin(PlayerJoinEvent e){
        Player p = e.getPlayer();
        UserManager.createUser(p);
        SidebarString line1 = new SidebarString(ChatUtil.fix(Config.getString("scoreboard.lobby.1").replace("{PLAYER}", p.getName()).replace("{RANK}", PermissionsEx.getUser(p).getGroupNames()[0]).replace("{ONLINE}", Bukkit.getOnlinePlayers().size() + "")));
        SidebarString line2 = new SidebarString(ChatUtil.fix(Config.getString("scoreboard.lobby.2").replace("{PLAYER}", p.getName()).replace("{RANK}", PermissionsEx.getUser(p).getGroupNames()[0]).replace("{ONLINE}", Bukkit.getOnlinePlayers().size() + "")));
        SidebarString line3 = new SidebarString(ChatUtil.fix(Config.getString("scoreboard.lobby.3").replace("{PLAYER}", p.getName()).replace("{RANK}", PermissionsEx.getUser(p).getGroupNames()[0]).replace("{ONLINE}", Bukkit.getOnlinePlayers().size() + "")));
        SidebarString line4 = new SidebarString(ChatUtil.fix(Config.getString("scoreboard.lobby.4").replace("{PLAYER}", p.getName()).replace("{RANK}", PermissionsEx.getUser(p).getGroupNames()[0]).replace("{ONLINE}", Bukkit.getOnlinePlayers().size() + "")));
        SidebarString line5 = new SidebarString(ChatUtil.fix(Config.getString("scoreboard.lobby.5").replace("{PLAYER}", p.getName()).replace("{RANK}", PermissionsEx.getUser(p).getGroupNames()[0]).replace("{ONLINE}", Bukkit.getOnlinePlayers().size() + "")));
        SidebarString line6 = new SidebarString(ChatUtil.fix(Config.getString("scoreboard.lobby.6").replace("{PLAYER}", p.getName()).replace("{RANK}", PermissionsEx.getUser(p).getGroupNames()[0]).replace("{ONLINE}", Bukkit.getOnlinePlayers().size() + "")));
        SidebarString line7 = new SidebarString(ChatUtil.fix(Config.getString("scoreboard.lobby.7").replace("{PLAYER}", p.getName()).replace("{RANK}", PermissionsEx.getUser(p).getGroupNames()[0]).replace("{ONLINE}", Bukkit.getOnlinePlayers().size() + "")));
        SidebarString line8 = new SidebarString(ChatUtil.fix(Config.getString("scoreboard.lobby.8").replace("{PLAYER}", p.getName()).replace("{RANK}", PermissionsEx.getUser(p).getGroupNames()[0]).replace("{ONLINE}", Bukkit.getOnlinePlayers().size() + "")));
        Sidebar mySidebar = new Sidebar(ChatUtil.fix(Config.getString("scoreboard.lobby.title")), Blaze.getPlugin(), 60, line1, line2, line3, line4, line5, line6, line7, line8);
        mySidebar.showTo(p);
        TitleAPI.sendTitle(p, 10, 40, 10, ChatUtil.fix(Config.getString("messages.join-title")), ChatUtil.fix(Config.getString("messages.join-subtitle")));
        e.setJoinMessage(ChatUtil.fix(Config.getString("messages.join")).replace("{PLAYER}", p.getName()));
        p.getInventory().clear();
        p.teleport(Config.getSpawn());
        ItemBuilder item0 = new ItemBuilder(Material.DIAMOND_SWORD).setTitle(ChatUtil.fix("&cWybierz Arene")).addLore(ChatUtil.fix("&7Blaze-PVP By PolskiStevek i Jambosmaha"));
        ItemBuilder item1 = new ItemBuilder(Material.AIR).setTitle(ChatUtil.fix("")).addLore(ChatUtil.fix("&7Blaze-PVP By PolskiStevek i Jambosmaha"));
        ItemBuilder item2 = new ItemBuilder(Material.EMERALD).setTitle(ChatUtil.fix("&eTwoje Informacje")).addLore(ChatUtil.fix("&7Blaze-PVP By PolskiStevek i Jambosmaha"));
        ItemBuilder item3 = new ItemBuilder(Material.AIR).setTitle(ChatUtil.fix("")).addLore(ChatUtil.fix("&7Blaze-PVP By PolskiStevek i Jambosmaha"));
        ItemBuilder item4 = new ItemBuilder(Material.ENDER_CHEST).setTitle(ChatUtil.fix("&6Dodatki &8[&7Wkrótce&8]")).addLore(ChatUtil.fix("&7Blaze-PVP By PolskiStevek i Jambosmaha"));
        ItemBuilder item5 = new ItemBuilder(Material.AIR).setTitle(ChatUtil.fix("")).addLore(ChatUtil.fix("&7Blaze-PVP By PolskiStevek i Jambosmaha"));
        ItemBuilder item6 = new ItemBuilder(Material.GOLD_NUGGET).setTitle(ChatUtil.fix("&cUstawienia &8[&7Wkrótce&8]")).addLore(ChatUtil.fix("&7Blaze-PVP By PolskiStevek i Jambosmaha"));
        ItemBuilder item7 = new ItemBuilder(Material.AIR).setTitle(ChatUtil.fix("")).addLore(ChatUtil.fix("&7Blaze-PVP By PolskiStevek i Jambosmaha"));
        ItemBuilder item8 = new ItemBuilder(Material.NETHER_STAR).setTitle(ChatUtil.fix("&eStatus Serwera")).addLore(ChatUtil.fix("&7Blaze-PVP By PolskiStevek i Jambosmaha"));
        p.getInventory().setItem(0, item0.build());
        p.getInventory().setItem(1, null);
        p.getInventory().setItem(2, item2.build());
        p.getInventory().setItem(3, null);
        p.getInventory().setItem(4, item4.build());
        p.getInventory().setItem(5, null);
        p.getInventory().setItem(6, item6.build());
        p.getInventory().setItem(7, null);
        p.getInventory().setItem(8, item8.build());
    }
}
