package pl.polskistevek.blazepvp.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import pl.polskistevek.blazepvp.utils.ChatUtils;

public class ExampleCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String s, String[] args) {
        sender.sendMessage(ChatUtils.fix("%tag% &cPlugin dziala poprawnie!"));
        return false;
    }
}
