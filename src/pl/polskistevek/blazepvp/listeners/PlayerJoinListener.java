package pl.polskistevek.blazepvp.listeners;

import com.coloredcarrot.api.sidebar.Sidebar;
import com.coloredcarrot.api.sidebar.SidebarString;
import org.bukkit.GameMode;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import pl.polskistevek.blazepvp.Blaze;
import pl.polskistevek.blazepvp.utils.ChatUtil;
import pl.polskistevek.blazepvp.utils.Config;
import pl.polskistevek.blazepvp.utils.ItemBuilder;
import pl.polskistevek.blazepvp.utils.titleapi.TitleAPI;

public class PlayerJoinListener implements Listener {

    @EventHandler
    public void onJoin(PlayerJoinEvent e){
        Player p = e.getPlayer();
        SidebarString line1 = new SidebarString(ChatUtil.fix(Config.getString("scoreboard.lobby.1")));
        SidebarString line2 = new SidebarString(ChatUtil.fix(Config.getString("scoreboard.lobby.2")));
        SidebarString line3 = new SidebarString(ChatUtil.fix(Config.getString("scoreboard.lobby.3")));
        SidebarString line4 = new SidebarString(ChatUtil.fix(Config.getString("scoreboard.lobby.4")));
        SidebarString line5 = new SidebarString(ChatUtil.fix(Config.getString("scoreboard.lobby.5")));
        SidebarString line6 = new SidebarString(ChatUtil.fix(Config.getString("scoreboard.lobby.6")));
        SidebarString line7 = new SidebarString(ChatUtil.fix(Config.getString("scoreboard.lobby.7")));
        SidebarString line8 = new SidebarString(ChatUtil.fix(Config.getString("scoreboard.lobby.8")));
        Sidebar mySidebar = new Sidebar(ChatUtil.fix(Config.getString("scoreboard.lobby.title")), Blaze.getPlugin(), 60, line1, line2, line3, line4, line5, line6, line7, line8);
        mySidebar.showTo(p);
        TitleAPI.sendTitle(p, 10, 40, 10, ChatUtil.fix(Config.getString("messages.join-title")), ChatUtil.fix(Config.getString("messages.join-subtitle")));
        e.setJoinMessage(ChatUtil.fix(Config.getString("messages.join")).replace("{PLAYER}", p.getName()));
        p.getInventory().clear();
        p.teleport(Config.getSpawn());
        ItemBuilder item0 = new ItemBuilder(Config.getMaterial("items.1.type")).setTitle(ChatUtil.fix(Config.getString("items.1.name"))).addLore(ChatUtil.fix(Config.getString("items.1.lore")));
        ItemBuilder item1 = new ItemBuilder(Config.getMaterial("items.2.type")).setTitle(ChatUtil.fix(Config.getString("items.2.name"))).addLore(ChatUtil.fix(Config.getString("items.2.lore")));
        ItemBuilder item2 = new ItemBuilder(Config.getMaterial("items.3.type")).setTitle(ChatUtil.fix(Config.getString("items.3.name"))).addLore(ChatUtil.fix(Config.getString("items.3.lore")));
        ItemBuilder item3 = new ItemBuilder(Config.getMaterial("items.4.type")).setTitle(ChatUtil.fix(Config.getString("items.4.name"))).addLore(ChatUtil.fix(Config.getString("items.4.lore")));
        ItemBuilder item4 = new ItemBuilder(Config.getMaterial("items.5.type")).setTitle(ChatUtil.fix(Config.getString("items.5.name"))).addLore(ChatUtil.fix(Config.getString("items.5.lore")));
        ItemBuilder item5 = new ItemBuilder(Config.getMaterial("items.6.type")).setTitle(ChatUtil.fix(Config.getString("items.6.name"))).addLore(ChatUtil.fix(Config.getString("items.6.lore")));
        ItemBuilder item6 = new ItemBuilder(Config.getMaterial("items.7.type")).setTitle(ChatUtil.fix(Config.getString("items.7.name"))).addLore(ChatUtil.fix(Config.getString("items.7.lore")));
        ItemBuilder item7 = new ItemBuilder(Config.getMaterial("items.8.type")).setTitle(ChatUtil.fix(Config.getString("items.8.name"))).addLore(ChatUtil.fix(Config.getString("items.8.lore")));
        ItemBuilder item8 = new ItemBuilder(Config.getMaterial("items.9.type")).setTitle(ChatUtil.fix(Config.getString("items.9.name"))).addLore(ChatUtil.fix(Config.getString("items.9.lore")));
        p.getInventory().setItem(0, null);
        p.getInventory().setItem(1, item1.build());
        p.getInventory().setItem(2, null);
        p.getInventory().setItem(3, item3.build());
        p.getInventory().setItem(4, item4.build());
        p.getInventory().setItem(5, null);
        p.getInventory().setItem(6, null);
        p.getInventory().setItem(7, item7.build());
        p.getInventory().setItem(8, item8.build());
    }
}
