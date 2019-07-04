package pl.polskistevek.blazepvp.listeners;

import org.bukkit.GameMode;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import pl.polskistevek.blazepvp.utils.Config;

public class InventoryClickListener implements Listener {
    @EventHandler
    public void onClick(InventoryClickEvent event){
        if(!event.getClickedInventory().getName().contains(Config.getString("ip"))) {
            if (!event.getWhoClicked().getGameMode().equals(GameMode.CREATIVE)) {
                event.setCancelled(true);
            }
        }
    }
}
