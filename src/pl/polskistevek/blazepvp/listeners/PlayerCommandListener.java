package pl.polskistevek.blazepvp.listeners;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerCommandPreprocessEvent;
import org.bukkit.help.HelpTopic;
import pl.polskistevek.blazepvp.utils.ChatUtil;
import pl.polskistevek.blazepvp.utils.Config;

public class PlayerCommandListener implements Listener {
    @EventHandler
    public void onCommand(PlayerCommandPreprocessEvent event){
        Player p = event.getPlayer();
        String cmd = event.getMessage().split(" ")[0];
        HelpTopic topic = Bukkit.getServer().getHelpMap().getHelpTopic(cmd);
        if (topic == null) {
            p.sendMessage(ChatUtil.fix("%tag%" + Config.getString("messages.unknown-cmd")));
            event.setCancelled(true);
        }
    }
}
