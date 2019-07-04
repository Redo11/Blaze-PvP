package pl.polskistevek.blazepvp.managers;

import org.bukkit.entity.Player;
import java.util.ArrayList;
import java.util.List;

public class User {
    public static List<String> gracze;
    private String arena;
    private Player nick;

    public User(final Player u) {
        this.arena = "Brak";
        this.nick = u;
    }

    public void setArena(final String debil) {
        this.arena = debil;
    }

    public Player getPlayer() {
        return this.nick;
    }

    public String getArena() {
        return this.arena;
    }

    static {
        User.gracze = new ArrayList<String>();
    }
}
