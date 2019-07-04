package pl.polskistevek.blazepvp.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import pl.polskistevek.blazepvp.utils.ChatUtil;
public class AdminiCommand implements CommandExecutor {
    public boolean onCommand(CommandSender sender, Command command, String s, String[] strings) {
        sender.sendMessage(ChatUtil.fix("     &8&m-------------&8 ( >> &6&lADMINISTRACJA &8<< ) &8&m-------------&8 "));
        sender.sendMessage(ChatUtil.fix(" &8>> &C&lWlasciciel&7-PolskiStevek,jambosmaha."));
        sender.sendMessage(ChatUtil.fix(" &8>> &4&lHeadAdmini&7- Brak                              "));
        sender.sendMessage(ChatUtil.fix(" &8>> &6Administratorzy&7- Brak                             "));
        sender.sendMessage(ChatUtil.fix(" &8>>&aModeraotrzy&7- xXerek,JjayCob          "));
        sender.sendMessage(ChatUtil.fix(" &8>>&2KidModeratorzy&7- MaslankaYouTybe "));
        sender.sendMessage(ChatUtil.fix(" &8>>Helperzy&7-GremlinYt,dircioch,toxic,elpoider,Of_Demi_Of,Wikalska,Premka12,BulbaO,opiul,vinux, "));
        sender.sendMessage(ChatUtil.fix(" &8>>&Rekrutacja trwa  nadal wbijaj napisac podanie na discordzie &b/discord "));
      sender.sendMessage(ChatUtil.fix("    " + " &8&m-------------&8 ( >> &6&lADMINISTRACJA &8<< ) &8&m-------------&8 "));
      return false;