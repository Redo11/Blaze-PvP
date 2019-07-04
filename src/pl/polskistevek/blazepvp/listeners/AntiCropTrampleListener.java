package pl.polskistevek.blazepvp.listeners;

import org.bukkit.event.player.*;
import org.bukkit.event.block.*;
import org.bukkit.*;
import org.bukkit.block.*;
import org.bukkit.event.*;

public class AntiCropTrampleListener implements Listener
{
    @EventHandler(priority = EventPriority.MONITOR)
    public void onTrample(final PlayerInteractEvent event) {
        if (event.isCancelled()) {
            return;
        }
        if (event.getAction() == Action.PHYSICAL) {
            final Block block = event.getClickedBlock();
            if (block == null) {
                return;
            }
            final int blockType = block.getTypeId();
            if (blockType == Material.getMaterial(59).getId()) {
                event.setUseInteractedBlock(Event.Result.DENY);
                event.setCancelled(true);
                block.setTypeId(blockType);
                block.setData(block.getData());
            }
        }
        if (event.getAction() == Action.PHYSICAL) {
            final Block block = event.getClickedBlock();
            if (block == null) {
                return;
            }
            final int blockType = block.getTypeId();
            if (blockType == Material.getMaterial(60).getId()) {
                event.setUseInteractedBlock(Event.Result.DENY);
                event.setCancelled(true);
                block.setType(Material.getMaterial(60));
                block.setData(block.getData());
            }
        }
    }
}
