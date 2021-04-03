package net.swofty.rankcolor;

import net.luckperms.api.LuckPerms;
import net.luckperms.api.LuckPermsProvider;
import net.luckperms.api.model.group.Group;
import net.luckperms.api.model.user.User;
import net.luckperms.api.model.user.UserManager;
import net.luckperms.api.node.matcher.NodeMatcher;
import net.luckperms.api.node.types.InheritanceNode;
import org.bukkit.entity.Player;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class API {

    public static List<User> getUsersInGroup(String groupName) {
        LuckPerms api = LuckPermsProvider.get();
        Group group = api.getGroupManager().getGroup(groupName);
        if (group == null) throw new IllegalArgumentException("Group " + groupName + " not found");
        UserManager userManager = api.getUserManager();
        List<User> users = new ArrayList<>();
        for (UUID uuid : userManager.searchAll(NodeMatcher.key(InheritanceNode.builder(group).build())).join().keySet()) {
            User user = userManager.isLoaded(uuid) ? userManager.getUser(uuid) : userManager.loadUser(uuid).join();
            if (user == null) throw new IllegalStateException("Could not load data of " + uuid);
            users.add(user);
        }
        return users;
    }

    public static String colorize(String input) { return input.replace("&", "§"); }
}
