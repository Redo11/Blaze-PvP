package pl.polskistevek.blazepvp.listeners;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import pl.polskistevek.blazepvp.utils.ChatUtils;
import pl.polskistevek.blazepvp.utils.Config;
import pl.polskistevek.blazepvp.utils.ItemBuilder;

public class PlayerJoinListener implements Listener {

    @EventHandler
    public void onJoin(PlayerJoinEvent e){
        Player p = e.getPlayer();
        e.setJoinMessage(ChatUtils.fix(Config.getString("messages.join")).replace("{PLAYER}", p.getName()));
        p.getInventory().clear();
        p.teleport(Config.getSpawn());
        ItemBuilder item0 = new ItemBuilder(Config.getMaterial("items.1.type")).setTitle(ChatUtils.fix(Config.getString("items.1.name"))).addLore(ChatUtils.fix(Config.getString("items.1.lore")));
        ItemBuilder item1 = new ItemBuilder(Config.getMaterial("items.2.type")).setTitle(ChatUtils.fix(Config.getString("items.2.name"))).addLore(ChatUtils.fix(Config.getString("items.2.lore")));
        ItemBuilder item2 = new ItemBuilder(Config.getMaterial("items.3.type")).setTitle(ChatUtils.fix(Config.getString("items.3.name"))).addLore(ChatUtils.fix(Config.getString("items.3.lore")));
        ItemBuilder item3 = new ItemBuilder(Config.getMaterial("items.4.type")).setTitle(ChatUtils.fix(Config.getString("items.4.name"))).addLore(ChatUtils.fix(Config.getString("items.4.lore")));
        ItemBuilder item4 = new ItemBuilder(Config.getMaterial("items.5.type")).setTitle(ChatUtils.fix(Config.getString("items.5.name"))).addLore(ChatUtils.fix(Config.getString("items.5.lore")));
        ItemBuilder item5 = new ItemBuilder(Config.getMaterial("items.6.type")).setTitle(ChatUtils.fix(Config.getString("items.6.name"))).addLore(ChatUtils.fix(Config.getString("items.6.lore")));
        ItemBuilder item6 = new ItemBuilder(Config.getMaterial("items.7.type")).setTitle(ChatUtils.fix(Config.getString("items.7.name"))).addLore(ChatUtils.fix(Config.getString("items.7.lore")));
        ItemBuilder item7 = new ItemBuilder(Config.getMaterial("items.8.type")).setTitle(ChatUtils.fix(Config.getString("items.8.name"))).addLore(ChatUtils.fix(Config.getString("items.8.lore")));
        ItemBuilder item8 = new ItemBuilder(Config.getMaterial("items.9.type")).setTitle(ChatUtils.fix(Config.getString("items.9.name"))).addLore(ChatUtils.fix(Config.getString("items.9.lore")));
        p.getInventory().setItem(0, item0.build());
        p.getInventory().setItem(1, item1.build());
        p.getInventory().setItem(2, item2.build());
        p.getInventory().setItem(3, item3.build());
        p.getInventory().setItem(4, item4.build());
        p.getInventory().setItem(5, item5.build());
        p.getInventory().setItem(6, item6.build());
        p.getInventory().setItem(7, item7.build());
        p.getInventory().setItem(8, item8.build());
    }
}
