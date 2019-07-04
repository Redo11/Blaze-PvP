package pl.polskistevek.blazepvp.listeners;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;
import pl.polskistevek.blazepvp.utils.ChatUtil;
import pl.polskistevek.blazepvp.utils.Config;

public class PlayerChatListener implements Listener {
    @EventHandler
    public void onChat(AsyncPlayerChatEvent e){
        if (!e.getPlayer().isOp()) {
            e.setFormat(ChatUtil.fix(Config.getString("messages.chat-format").replace("{PLAYER}", e.getPlayer().getDisplayName()).replace("{MSG}", e.getMessage())));
        } else{
            e.setFormat(ChatUtil.fix(Config.getString("messages.chat-format-op").replace("{PLAYER}", e.getPlayer().getDisplayName()).replace("{MSG}", e.getMessage())));
        }
    }
}