package net.swofty.rankcolor;

import net.luckperms.api.LuckPerms;
import net.luckperms.api.LuckPermsProvider;
import net.luckperms.api.event.EventBus;
import net.luckperms.api.event.node.NodeAddEvent;
import net.luckperms.api.event.node.NodeMutateEvent;
import net.luckperms.api.event.node.NodeRemoveEvent;
import net.luckperms.api.event.user.UserDataRecalculateEvent;
import net.luckperms.api.event.user.UserLoadEvent;
import net.luckperms.api.event.user.track.UserDemoteEvent;
import net.luckperms.api.event.user.track.UserPromoteEvent;
import net.luckperms.api.event.user.track.UserTrackEvent;
import net.luckperms.api.node.NodeType;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.java.JavaPlugin;

public class Loader extends JavaPlugin implements CommandExecutor {

    private static Loader instance;

    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(new GUIs(), this);
        instance = this;
        LuckpermsListener();
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        net.swofty.rankcolor.Command.executeRankColorCommand(sender, label, args);
        return false;
    }

    public void LuckpermsListener() {
        LuckPerms api = LuckPermsProvider.get();

        EventBus eventBus = api.getEventBus();

        eventBus.subscribe(instance, UserDemoteEvent.class, this::onUserDemote);
        eventBus.subscribe(instance, UserPromoteEvent.class, this::onUserPromote);
        eventBus.subscribe(instance, NodeAddEvent.class, this::nodeAdd);
        eventBus.subscribe(instance, NodeRemoveEvent.class, this::nodeRemove);
    }

    private void nodeAdd(NodeAddEvent event) {
        if (event.isUser() && event.getNode().getType() == NodeType.INHERITANCE) {
            Bukkit.getPlayer(event.getTarget().getFriendlyName()).sendMessage(API.colorize("&cAs your rank was changed you have lost your plus color"));
            Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "lp user " + event.getTarget().getFriendlyName() + " meta clear");
        }
    }

    private void nodeRemove(NodeRemoveEvent event) {
        if (event.isUser() && event.getNode().getType() == NodeType.INHERITANCE) {
            Bukkit.getPlayer(event.getTarget().getFriendlyName()).sendMessage(API.colorize("&cAs your rank was changed you have lost your plus color"));
            Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "lp user " + event.getTarget().getFriendlyName() + " meta clear");
        }
    }

    private void onUserPromote(UserPromoteEvent event) {
        Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "lp user " + event.getUser().getUsername() + " meta clear");
        Bukkit.getPlayer(event.getUser().getUsername()).sendMessage(API.colorize("&cAs your rank was changed you have lost your plus color"));
    }

    private void onUserDemote(UserDemoteEvent event) {
        Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "lp user " + event.getUser().getUsername() + " meta clear");
        Bukkit.getPlayer(event.getUser().getUsername()).sendMessage(API.colorize("&cAs your rank was changed you have lost your plus color"));
    }
}
