package pl.polskistevek.blazepvp.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import pl.polskistevek.blazepvp.utils.ChatUtil;
public class WwwCommand implements CommandExecutor {
    public boolean onCommand(CommandSender sender, Command command, String s, String[] strings) {
        sender.sendMessage(ChatUtil.fix("     &8&m-------------&8 ( >> &2&lSTRONA INTRNETOWA &8<< ) &8&m-------------&8 "));
        sender.sendMessage(ChatUtil.fix(" &8  >>>STRONA: AKTUALNIE BRAK :(                                                    "));
        sender.sendMessage(ChatUtil.fix("     &8&m-------------&8 ( >> &2&lSTRONA INETRENTOWA &8<< ) &8&m-------------&8"));