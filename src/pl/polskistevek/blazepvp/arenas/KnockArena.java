package pl.polskistevek.blazepvp.arenas;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Item;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import pl.polskistevek.blazepvp.managers.User;
import pl.polskistevek.blazepvp.managers.UserManager;
import pl.polskistevek.blazepvp.utils.ChatUtil;
import pl.polskistevek.blazepvp.utils.Config;
import pl.polskistevek.blazepvp.utils.ItemBuilder;

public class KnockArena implements Listener {

    public static void join(Player p){
        User u = UserManager.getUser(p);
        if (!u.getArena().equals("Brak")){
            p.sendMessage(ChatUtil.fix("%tag%Wystapil blad: Juz jestes na arenie, relognij!"));
        }
        p.sendMessage("%tag%Dolaczanie do areny: &6KNOCK");
        u.setArena("Knock");
        p.teleport(Config.getArena("knock"));
        ItemBuilder sword1 = new ItemBuilder(Material.DIAMOND_SWORD).addEnchantment(Enchantment.DAMAGE_ALL, 5).addEnchantment(Enchantment.FIRE_ASPECT, 2);
        ItemBuilder sword2 = new ItemBuilder(Material.DIAMOND_SWORD).addEnchantment(Enchantment.KNOCKBACK, 2);
        ItemBuilder kox = new ItemBuilder(Material.GOLDEN_APPLE, (short)1);
        ItemBuilder ref = new ItemBuilder(Material.GOLDEN_APPLE);
        ItemBuilder water = new ItemBuilder(Material.WATER_BUCKET);
        ItemBuilder pearl = new ItemBuilder(Material.ENDER_PEARL);
        ItemBuilder kilof = new ItemBuilder(Material.DIAMOND_PICKAXE).addEnchantment(Enchantment.DIG_SPEED, 3);
        ItemBuilder slime = new ItemBuilder(Material.SLIME_BLOCK);
        ItemBuilder cobble = new ItemBuilder(Material.COBBLESTONE);
        p.getInventory().addItem(sword1.build());
        p.getInventory().addItem(sword2.build());
        p.getInventory().addItem(kox.build());
        for (int i = 0; i < 8; i++) {
            p.getInventory().addItem(ref.build());
        }
        p.getInventory().addItem(water.build());
        for (int i = 0; i < 2; i++) {
            p.getInventory().addItem(pearl.build());
        }
        p.getInventory().addItem(kilof.build());
        p.getInventory().addItem(slime.build());
        for (int i = 0; i < 128; i++) {
            p.getInventory().addItem(cobble.build());
        }
    }

    public static void set(Player p){
        p.sendMessage(ChatUtil.fix("%tag%Ustawiono spawn dla areny: &6KNOCK"));
        Config.setArena("knock", p.getLocation());
    }
}
