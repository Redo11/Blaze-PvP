package pl.polskistevek.blazepvp.listeners;

import org.bukkit.GameMode;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.block.BlockPlaceEvent;
import pl.polskistevek.blazepvp.utils.titleapi.TitleAPI;

public class BlockBreakPlaceListener implements Listener {
    @EventHandler
    public void onBreak(BlockBreakEvent e){
        Player p = e.getPlayer();
        if (p.getGameMode().equals(GameMode.SURVIVAL)){
            e.setCancelled(true);
            TitleAPI.sendTitle(p, 5, 5, 5, "", "&cNie mozesz niszczyc blokow!");
        }
    }
    @EventHandler
    public void onPlace(BlockPlaceEvent e){
        Player p = e.getPlayer();
        if (p.getGameMode().equals(GameMode.SURVIVAL)){
            e.setCancelled(true);
            TitleAPI.sendTitle(p, 5, 5, 5, "", "&cNie mozesz klasc blokow!");
        }
    }
}
