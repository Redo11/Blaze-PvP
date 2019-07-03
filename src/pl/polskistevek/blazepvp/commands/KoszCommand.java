package pl.polskistevek.blazepvp.commands;
import org.bukkit.command.Command;
        import org.bukkit.command.CommandExecutor;
        import org.bukkit.command.CommandSender;
        import org.bukkit.entity.Player;
        import pl.polskistevek.core.efekty.EfektyListener;

public class KoszCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender Sender, Command command, String s, String[] strings) {
        EfektyListener.kosz((Player) Sender);
        return false;
    }
}