package pl.polskistevek.blazepvp.utils.titleapi;

import org.bukkit.event.*;
import org.bukkit.entity.*;

public class TitleSendEvent extends Event
{
    private static final HandlerList handlers;
    private final Player player;
    private String title;
    private String subtitle;
    private boolean cancelled;
    
    public TitleSendEvent(final Player player, final String title, final String subtitle) {
        this.cancelled = false;
        this.player = player;
        this.title = title;
        this.subtitle = subtitle;
    }
    
    public HandlerList getHandlers() {
        return TitleSendEvent.handlers;
    }
    public Player getPlayer() {
        return this.player;
    }
    public boolean isCancelled() {
        return this.cancelled;
    }
    public void setCancelled(final boolean cancelled) {
        this.cancelled = cancelled;
    }
    static {
        handlers = new HandlerList();
    }
}
