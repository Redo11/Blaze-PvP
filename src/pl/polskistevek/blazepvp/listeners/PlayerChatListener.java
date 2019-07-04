package pl.polskistevek.blazepvp.listeners;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;
import pl.polskistevek.blazepvp.utils.ChatUtil;
import pl.polskistevek.blazepvp.utils.Config;
import ru.tehkode.permissions.bukkit.PermissionsEx;

public class PlayerChatListener implements Listener {
    @EventHandler
    public void onChat(AsyncPlayerChatEvent e){
        String prefix = PermissionsEx.getUser(e.getPlayer()).getGroups()[0].getPrefix();
        if (!e.getPlayer().isOp()) {
            if (!e.getPlayer().hasPermission(Config.perm + ".fly")){
                e.setFormat(ChatUtil.fix(Config.getString("messages.chat-format").replace("{PLAYER}", e.getPlayer().getName()).replace("{GROUP}", prefix).replace("{MSG}", e.getMessage())));
            } else{
                e.setFormat(ChatUtil.fix(Config.getString("messages.chat-format-helper").replace("{PLAYER}", e.getPlayer().getName()).replace("{GROUP}", prefix).replace("{MSG}", e.getMessage())));
            }
        } else{
            e.setFormat(ChatUtil.fix(Config.getString("messages.chat-format-op").replace("{PLAYER}", e.getPlayer().getDisplayName()).replace("{GROUP}", prefix).replace("{MSG}", e.getMessage())));
        }
    }
}