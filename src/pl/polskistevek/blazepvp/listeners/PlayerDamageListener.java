package pl.polskistevek.blazepvp.listeners;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;

public class PlayerDamageListener implements Listener {
    @EventHandler
    public void onDamage(EntityDamageByEntityEvent e) {
        if (e.getEntity().getWorld().getName().equals("world")){
            e.setCancelled(true);
        }
        if (e.getDamager().getWorld().getName().equals("world")){
            e.setCancelled(true);
        }
    }
}
