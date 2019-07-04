package pl.polskistevek.blazepvp.managers;

import org.bukkit.entity.Player;

import java.util.HashMap;
import java.util.Map;

public class UserManager {
    private static Map<Player, User> users;

    public static Map<Player, User> getUsers() {
        return UserManager.users;
    }

    public static void removeUser(final Player p) {
        UserManager.users.remove(p);
    }

    public static User getUser(final Player p) {
        return UserManager.users.get(p);
    }

    public static void createUser(final Player p) {
        UserManager.users.put(p, new User(p));
    }

    static {
        UserManager.users = new HashMap<Player, User>();
    }
}
