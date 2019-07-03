package pl.polskistevek.blazepvp.utils.titleapi;

import org.bukkit.event.*;
import org.bukkit.entity.*;

public class TabTitleSendEvent extends Event
{
    private static final HandlerList handlers;
    private final Player player;
    private String header;
    private String footer;
    private boolean cancelled;
    
    public TabTitleSendEvent(final Player player, final String header, final String footer) {
        this.cancelled = false;
        this.player = player;
        this.header = header;
        this.footer = footer;
    }
    public HandlerList getHandlers() {
        return TabTitleSendEvent.handlers;
    }
    public Player getPlayer() {
        return this.player;
    }
    public void setCancelled(final boolean cancelled) {
        this.cancelled = cancelled;
    }
    static {
        handlers = new HandlerList();
    }
}
