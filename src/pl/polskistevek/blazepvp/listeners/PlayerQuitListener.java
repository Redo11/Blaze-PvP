package pl.polskistevek.blazepvp.listeners;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerQuitEvent;
import pl.polskistevek.blazepvp.utils.ChatUtils;
import pl.polskistevek.blazepvp.utils.Config;

public class PlayerQuitListener implements Listener {
    @EventHandler
    public void onQuit(PlayerQuitEvent e){
        e.setQuitMessage(ChatUtils.fix(Config.getString("messages.quit").replace("{PLAYER}", e.getPlayer().getName())));
    }
}
