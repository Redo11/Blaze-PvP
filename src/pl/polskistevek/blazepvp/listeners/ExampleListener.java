package pl.polskistevek.blazepvp.listeners;

import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class ExampleListener implements Listener {
    @EventHandler
    public void onJoin(PlayerJoinEvent e){
        System.out.println("Listener dziala poprawnie.");
    }
}
