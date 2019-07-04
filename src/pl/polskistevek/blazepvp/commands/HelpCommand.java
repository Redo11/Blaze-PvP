package pl.polskistevek.blazepvp.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import pl.polskistevek.blazepvp.utils.ChatUtil;

public class HelpCommand implements CommandExecutor {
    public boolean onCommand(CommandSender sender, Command command, String s, String[] strings) {
        sender.sendMessage(ChatUtil.fix("     &8&m-------------&8 ( >> &c&lPOMOC &8<< ) &8&m-------------&8 "));
        sender.sendMessage(ChatUtil.fix(" &8>> &6/youtuber &8- &7Informacje o randze YouTuber."));
        sender.sendMessage(ChatUtil.fix(" &8>> &6/putin -informacje o randze Putin."));
        sender.sendMessage(ChatUtil.fix(" &8>> &6/miniyt &8- &7Informajce O Randze YouTuber ."));
        sender.sendMessage(ChatUtil.fix(" &8>> &6/Live &8- &7Pokazuje osoby prowadzace Streama z serwera."));
        sender.sendMessage(ChatUtil.fix(" &8>> &6/helpop <wiadomosc> &8- &7Szybki Kontakt z Administracja."));
        sender.sendMessage(ChatUtil.fix(" &8>> &6/lobby - &7 Przenosi Do lobby głownego"));
        sender.sendMessage(ChatUtil.fix(" "));
        sender.sendMessage(ChatUtil.fix(" &8>> &7Discord: &6/discord"));
        sender.sendMessage(ChatUtil.fix("    &8&m-------------&8 ( >> &c&lPOMOC &8<< ) &8&m-------------&8 "));
        return false;
    }
}