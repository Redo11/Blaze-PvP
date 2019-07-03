package pl.polskistevek.blazepvp.commands;

import org.bukkit.command.Command;
        import org.bukkit.command.CommandExecutor;
        import org.bukkit.command.CommandSender;
        import pl.polskistevek.blazepvp.utils.ChatUtil;
public class PutinPlusCommand implements CommandExecutor {
    public boolean onCommand(CommandSender sender, Command command, String s, String[] strings) {
        sender.sendMessage(ChatUtil.fix("     &8&m-------------&8 ( >> &6&lPUTIN&c&l+ &8<< ) &8&m-------------&8 "));
        sender.sendMessage(ChatUtil.fix(" &8>> &6Jak Zdobyc - Zakupic pod /sklep,lub wygrac w konkursie na discordzie."));
        sender.sendMessage(ChatUtil.fix(" &8>> &6Permisje:&b/feed,/team zaloz,/ubgrade,/hat,ec,repair,..."));
        sender.sendMessage(ChatUtil.fix(" &8>> &6Posiadanie rangi na serwerze wiaze sie z specjalna rola na discordzie"));
        sender.sendMessage(ChatUtil.fix(" &8>> &6Specjalny prefix na chacie &7[&2Putin&c&l+&7] " + sender.getName()));
        sender.sendMessage(ChatUtil.fix(     "          &8&m-------------&8 ( >> &6&lPUTIN&c&l+ &8<< ) &8&m-------------&8 "));
        return false;
    }
}