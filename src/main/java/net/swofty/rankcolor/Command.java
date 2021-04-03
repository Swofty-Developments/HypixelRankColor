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

            List<User> usersInGroupVIPPlus = API.getUsersInGroup("vip+");
            List<User> usersInGroupMVPPlus = API.getUsersInGroup("mvp+");
            List<User> usersInGroupMVPPlusPlus = API.getUsersInGroup("mvp++");
            LuckPerms api = LuckPermsProvider.get();
            UserManager userManager = api.getUserManager();

            if (usersInGroupVIPPlus.contains(userManager.getUser(player.getUniqueId()))) {
                GUIs.giveVIPPlusGUI(player);
            } else if (usersInGroupMVPPlus.contains(userManager.getUser(player.getUniqueId()))) {
                GUIs.giveMVPPlusGUI(player);
            } else if (usersInGroupMVPPlusPlus.contains(userManager.getUser(player.getUniqueId()))) {
                GUIs.giveMVPPlusPlusGUI(player);
            } else {
                player.sendMessage(API.colorize("&cYou do not have VIP+ / MVP+ / MVP++"));
            }
        }
    }
}
