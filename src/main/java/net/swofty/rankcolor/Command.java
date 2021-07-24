package net.swofty.rankcolor;

import net.luckperms.api.LuckPerms;
import net.luckperms.api.LuckPermsProvider;
import net.luckperms.api.model.user.User;
import net.luckperms.api.model.user.UserManager;
import org.bukkit.Bukkit;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;

import java.util.List;

public class Command {

    public static void executeRankColorCommand(CommandSender sender, String label, String[] args) {
        if (label.equalsIgnoreCase("rankcolor")) {
            Player player = (Player) sender;

            if (player.hasPermission("rankcolor.vipplus")) {
                GUIs.giveVIPPlusGUI(player);
            } else if (player.hasPermission("rankcolor.mvpplus")) {
                GUIs.giveMVPPlusGUI(player);
            } else if (player.hasPermission("rankcolor.svpplus")) {
                GUIs.giveSVPPlusPlusGUI(player);
            } else {
                player.sendMessage(API.colorize("&cYou do not have VIP+ / MVP+ / SVP+"));
            }
        }
    }
}
