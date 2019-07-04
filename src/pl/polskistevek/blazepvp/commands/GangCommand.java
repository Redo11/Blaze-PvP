package pl.polskistevek.blazepvp.commands;

import org.bukkit.command.Command;
        import org.bukkit.command.CommandExecutor;
        import org.bukkit.command.CommandSender;
        import pl.polskistevek.blazepvp.utils.ChatUtil;
public class GangInfoCommand implements CommandExecutor {
    public boolean onCommand(CommandSender sender, Command command, String s, String[] strings) {
        sender.sendMessage(ChatUtil.fix("     &8&m-------------&8 ( >> &e&lGANG &6&lINFORMACJE  &8<< ) &8&m-------------&8 "));
        sender.sendMessage(ChatUtil.fix(" &8>> &6/gang stworz (Tag) (Nazwa) &8- &a7Tworzenie Gangu."));
        sender.sendMessage(ChatUtil.fix(" &8>> &6/gang zapros (nick) &8- &aZaproszenie gracza do gangu"));
        sender.sendMessage(ChatUtil.fix(" &8>> &6/gang usun   &8-&a Usuwa gang (wymagane potwierdzenie) ."));
        sender.sendMessage(ChatUtil.fix(" &8>> &6/gang dolacz (tag)&8- &a Dolacza do Gangu (koszt 25 Monet)."));
        sender.sendMessage(ChatUtil.fix(" &8>> &6/gang lider (nick) &8- &aPrzekazuje Lidera Gangu."));
        sender.sendMessage(ChatUtil.fix(" &8>> &6/gang zastepca (nick) &8- &aNadaje zastepce gangu."));
        sender.sendMessage(ChatUtil.fix(" &8>> &6/gang przedluz &8- &aPrzedluza waznosc gangu."));
        sender.sendMessage(ChatUtil.fix(" &8>> &6/gang info (tag) - &a  Sprawdzainforamcje odanym gangu"));
        sender.sendMessage(ChatUtil.fix(" &8>> &6/gang skarbiec &8- &a Skarbiec Gangu "));
        sender.sendMessage(ChatUtil.fix(" &8>> &6/gang wyrzuc (nick) &8- &a Wyrzucagracza  z gangu"));
        sender.sendMessage(ChatUtil.fix(" &8>> &6/gang sojusz (tag) &8- &aNawiazywanie sojuszy z innymi gangami"));
        sender.sendMessage(ChatUtil.fix(" &8>> &6/gang rozwiaz (tag) &8-&aRozwiazuje sojusz z   innym gangiem "));
        sender.sendMessage(ChatUtil.fix(""));
        sender.sendMessage(ChatUtil.fix(" &8>>  &6! &8-&a Pisanie na czacie gangu "));
        sender.sendMessage(ChatUtil.fix(" &8>>  &6!! &8-&e Pisanie na  czacie sojuszniczym- "));
        sender.sendMessage(ChatUtil.fix(" &8>>  &6!!!&8- &cPisanie na ogolnym czacie gangow "));
        sender.sendMessage(ChatUtil.fix("    &8&m-------------&8 ( >> &e&lGANG &6&lINFORMACJE &8<< ) &8&m-------------&8 "));
        return false;
    }
}