package pl.polskistevek.blazepvp.listeners;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.server.ServerListPingEvent;
import pl.polskistevek.blazepvp.utils.ChatUtil;
import pl.polskistevek.blazepvp.utils.Config;

public class ServerListListener implements Listener {
    @EventHandler
    public void onPing(ServerListPingEvent e){
        e.setMotd(ChatUtil.fix(Config.getString("motd.description")));
        e.setMaxPlayers(Config.getInt("slots"));
    }
}
