package pl.polskistevek.blazepvp.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import pl.polskistevek.blazepvp.utils.ChatUtil;
public class DiscordCommand implements CommandExecutor {
            public boolean onCommand(CommandSender sender, Command command, String s, String[] strings) {
                sender.sendMessage(ChatUtil.fix("     &8&m-------------&8 ( >> &c&lDISCORD &8<< ) &8&m-------------&8 "));
                sender.sendMessage(ChatUtil.fix(" &8  >>>DISCORD: https://discord.gg/w8NwPTn                                                     "));
                sender.sendMessage(ChatUtil.fix("     &8&m-------------&8 ( >> &c&lDISCORD &8<< ) &8&m-------------&8"));