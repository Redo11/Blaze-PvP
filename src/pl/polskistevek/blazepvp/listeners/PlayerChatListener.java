package pl.polskistevek.blazepvp.listeners;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;
import pl.polskistevek.blazepvp.utils.ChatUtils;
import pl.polskistevek.blazepvp.utils.Config;

public class PlayerChatListener implements Listener {
    @EventHandler
    public void onChat(AsyncPlayerChatEvent e){
        e.setFormat(ChatUtils.fix(Config.getString("messages.chat-format")));
    }
}
