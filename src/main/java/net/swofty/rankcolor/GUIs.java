package net.swofty.rankcolor;

import org.bukkit.Bukkit;
import org.bukkit.DyeColor;
import org.bukkit.Material;
import org.bukkit.entity.Item;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.InventoryMoveItemEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.material.Dye;

import java.util.ArrayList;

public class GUIs implements Listener {

    @EventHandler
    public void clickEvent(InventoryClickEvent event) {
        switch (event.getClickedInventory().getTitle()) {
            case "VIP+ Rank Color":

                switch (event.getCurrentItem().getItemMeta().getDisplayName()) {
                    case "§aRed VIP+ Rank Color":
                        event.getWhoClicked().sendMessage(API.colorize("&aSelected VIP+ Red!"));
                        Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "lp user " + event.getWhoClicked().getName() + " meta setprefix \"&a[VIP&c+&a] &a\"");
                        event.getWhoClicked().closeInventory();

                        break;

                    case "§aOrange VIP+ Rank Color":
                        event.getWhoClicked().sendMessage(API.colorize("&aSelected VIP+ Orange!"));
                        Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "lp user " + event.getWhoClicked().getName() + " meta setprefix \"&a[VIP&6+&a] &a\"");
                        event.getWhoClicked().closeInventory();
                        break;

                    case "§aLime VIP+ Rank Color":
                        event.getWhoClicked().sendMessage(API.colorize("&aSelected VIP+ Lime!"));
                        Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "lp user " + event.getWhoClicked().getName() + " meta setprefix \"&a[VIP&a+&a] &a\"");
                        event.getWhoClicked().closeInventory();
                        break;

                    case "§aYellow VIP+ Rank Color":
                        event.getWhoClicked().sendMessage(API.colorize("&aSelected VIP+ Yellow!"));
                        Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "lp user " + event.getWhoClicked().getName() + " meta setprefix \"&a[VIP&e+&a] &a\"");
                        event.getWhoClicked().closeInventory();
                        break;

                    case "§aPink VIP+ Rank Color":
                        event.getWhoClicked().sendMessage(API.colorize("&aSelected VIP+ Pink!"));
                        Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "lp user " + event.getWhoClicked().getName() + " meta setprefix \"&a[VIP&d+&a] &a\"");
                        event.getWhoClicked().closeInventory();
                        break;

                    case "§aWhite VIP+ Rank Color":
                        event.getWhoClicked().sendMessage(API.colorize("&aSelected VIP+ White!"));
                        Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "lp user " + event.getWhoClicked().getName() + " meta setprefix \"&a[VIP&f+&a] &a\"");
                        event.getWhoClicked().closeInventory();
                        break;

                    case "§aLight Blue VIP+ Rank Color":
                        event.getWhoClicked().sendMessage(API.colorize("&aSelected VIP+ Light Blue!"));
                        Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "lp user " + event.getWhoClicked().getName() + " meta setprefix \"&a[VIP&b+&a] &a\"");
                        event.getWhoClicked().closeInventory();
                        break;

                    case "§aGreen VIP+ Rank Color":
                        event.getWhoClicked().sendMessage(API.colorize("&aSelected VIP+ Green!"));
                        Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "lp user " + event.getWhoClicked().getName() + " meta setprefix \"&a[VIP&2+&a] &a\"");
                        event.getWhoClicked().closeInventory();
                        break;

                    case "§aDark Red VIP+ Rank Color":
                        event.getWhoClicked().sendMessage(API.colorize("&aSelected VIP+ Dark Red!"));
                        Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "lp user " + event.getWhoClicked().getName() + " meta setprefix \"&a[VIP&4+&a] &a\"");
                        event.getWhoClicked().closeInventory();
                        break;

                    case "§aCyan VIP+ Rank Color":
                        event.getWhoClicked().sendMessage(API.colorize("&aSelected VIP+ Cyan!"));
                        Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "lp user " + event.getWhoClicked().getName() + " meta setprefix \"&a[VIP&3+&a] &a\"");
                        event.getWhoClicked().closeInventory();
                        break;

                    case "§aPurple VIP+ Rank Color":
                        event.getWhoClicked().sendMessage(API.colorize("&aSelected VIP+ Purple!"));
                        Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "lp user " + event.getWhoClicked().getName() + " meta setprefix \"&a[VIP&5+&a] &a\"");
                        event.getWhoClicked().closeInventory();
                        break;

                    case "§aGray VIP+ Rank Color":
                        event.getWhoClicked().sendMessage(API.colorize("&aSelected VIP+ Gray!"));
                        Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "lp user " + event.getWhoClicked().getName() + " meta setprefix \"&a[VIP&7+&a] &a\"");
                        event.getWhoClicked().closeInventory();
                        break;

                    case "§aBlack VIP+ Rank Color":
                        event.getWhoClicked().sendMessage(API.colorize("&aSelected VIP+ Black!"));
                        Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "lp user " + event.getWhoClicked().getName() + " meta setprefix \"&a[VIP&0+&a] &a\"");
                        event.getWhoClicked().closeInventory();
                        break;

                    case "§aDark Blue VIP+ Rank Color":
                        event.getWhoClicked().sendMessage(API.colorize("&aSelected VIP+ Dark Blue!"));
                        Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "lp user " + event.getWhoClicked().getName() + " meta setprefix \"&a[VIP&1+&a] &a\"");
                        event.getWhoClicked().closeInventory();
                        break;

                    case "§cClose":
                        event.getWhoClicked().closeInventory();
                        break;
                }


                event.setCancelled(true);
                break;

            case "MVP+ Rank Color":

                switch (event.getCurrentItem().getItemMeta().getDisplayName()) {
                    case "§aRed MVP+ Rank Color":
                        event.getWhoClicked().sendMessage(API.colorize("&aSelected MVP+ Red!"));
                        Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "lp user " + event.getWhoClicked().getName() + " meta setprefix \"&b[MVP&c+&b] &b\"");
                        event.getWhoClicked().closeInventory();

                        break;

                    case "§aOrange MVP+ Rank Color":
                        event.getWhoClicked().sendMessage(API.colorize("&aSelected MVP+ Orange!"));
                        Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "lp user " + event.getWhoClicked().getName() + " meta setprefix \"&b[MVP&6+&b] &b\"");
                        event.getWhoClicked().closeInventory();
                        break;

                    case "§aLime MVP+ Rank Color":
                        event.getWhoClicked().sendMessage(API.colorize("&aSelected MVP+ Lime!"));
                        Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "lp user " + event.getWhoClicked().getName() + " meta setprefix \"&b[MVP&a+&b] &b\"");
                        event.getWhoClicked().closeInventory();
                        break;

                    case "§aYellow MVP+ Rank Color":
                        event.getWhoClicked().sendMessage(API.colorize("&aSelected MVP+ Yellow!"));
                        Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "lp user " + event.getWhoClicked().getName() + " meta setprefix \"&b[MVP&e+&b] &b\"");
                        event.getWhoClicked().closeInventory();
                        break;

                    case "§aPink MVP+ Rank Color":
                        event.getWhoClicked().sendMessage(API.colorize("&aSelected MVP+ Pink!"));
                        Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "lp user " + event.getWhoClicked().getName() + " meta setprefix \"&b[MVP&d+&b] &b\"");
                        event.getWhoClicked().closeInventory();
                        break;

                    case "§aWhite MVP+ Rank Color":
                        event.getWhoClicked().sendMessage(API.colorize("&aSelected MVP+ White!"));
                        Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "lp user " + event.getWhoClicked().getName() + " meta setprefix \"&b[MVP&f+&b] &b\"");
                        event.getWhoClicked().closeInventory();
                        break;

                    case "§aLight Blue MVP+ Rank Color":
                        event.getWhoClicked().sendMessage(API.colorize("&aSelected MVP+ Light Blue!"));
                        Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "lp user " + event.getWhoClicked().getName() + " meta setprefix \"&b[MVP&b+&b] &b\"");
                        event.getWhoClicked().closeInventory();
                        break;

                    case "§aGreen MVP+ Rank Color":
                        event.getWhoClicked().sendMessage(API.colorize("&aSelected MVP+ Green!"));
                        Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "lp user " + event.getWhoClicked().getName() + " meta setprefix \"&b[MVP&2+&b] &b\"");
                        event.getWhoClicked().closeInventory();
                        break;

                    case "§aDark Red MVP+ Rank Color":
                        event.getWhoClicked().sendMessage(API.colorize("&aSelected MVP+ Dark Red!"));
                        Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "lp user " + event.getWhoClicked().getName() + " meta setprefix \"&b[MVP&4+&b] &b\"");
                        event.getWhoClicked().closeInventory();
                        break;

                    case "§aCyan MVP+ Rank Color":
                        event.getWhoClicked().sendMessage(API.colorize("&aSelected MVP+ Cyan!"));
                        Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "lp user " + event.getWhoClicked().getName() + " meta setprefix \"&b[MVP&3+&b] &b\"");
                        event.getWhoClicked().closeInventory();
                        break;

                    case "§aPurple MVP+ Rank Color":
                        event.getWhoClicked().sendMessage(API.colorize("&aSelected MVP+ Purple!"));
                        Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "lp user " + event.getWhoClicked().getName() + " meta setprefix \"&b[MVP&5+&b] &b\"");
                        event.getWhoClicked().closeInventory();
                        break;

                    case "§aGray MVP+ Rank Color":
                        event.getWhoClicked().sendMessage(API.colorize("&aSelected MVP+ Gray!"));
                        Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "lp user " + event.getWhoClicked().getName() + " meta setprefix \"&b[MVP&7+&b] &b\"");
                        event.getWhoClicked().closeInventory();
                        break;

                    case "§aBlack MVP+ Rank Color":
                        event.getWhoClicked().sendMessage(API.colorize("&aSelected MVP+ Black!"));
                        Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "lp user " + event.getWhoClicked().getName() + " meta setprefix \"&b[MVP&0+&b] &b\"");
                        event.getWhoClicked().closeInventory();
                        break;

                    case "§aDark Blue MVP+ Rank Color":
                        event.getWhoClicked().sendMessage(API.colorize("&aSelected MVP+ Dark Blue!"));
                        Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "lp user " + event.getWhoClicked().getName() + " meta setprefix \"&b[MVP&1+&b] &b\"");
                        event.getWhoClicked().closeInventory();
                        break;

                    case "§cClose":
                        event.getWhoClicked().closeInventory();
                        break;
                }


                event.setCancelled(true);
                break;

            case "MVP++ Rank Color":

                switch (event.getCurrentItem().getItemMeta().getDisplayName()) {
                    case "§aRed MVP++ Rank Color":
                        event.getWhoClicked().sendMessage(API.colorize("&aSelected MVP++ Red!"));
                        Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "lp user " + event.getWhoClicked().getName() + " meta setprefix \"&6[MVP&c++&6] &6\"");
                        event.getWhoClicked().closeInventory();

                        break;

                    case "§aOrange MVP++ Rank Color":
                        event.getWhoClicked().sendMessage(API.colorize("&aSelected MVP++ Orange!"));
                        Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "lp user " + event.getWhoClicked().getName() + " meta setprefix \"&6[MVP&6++&6] &6\"");
                        event.getWhoClicked().closeInventory();
                        break;

                    case "§aLime MVP++ Rank Color":
                        event.getWhoClicked().sendMessage(API.colorize("&aSelected MVP++ Lime!"));
                        Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "lp user " + event.getWhoClicked().getName() + " meta setprefix \"&6[MVP&a++&6] &6\"");
                        event.getWhoClicked().closeInventory();
                        break;

                    case "§aYellow MVP++ Rank Color":
                        event.getWhoClicked().sendMessage(API.colorize("&aSelected MVP++ Yellow!"));
                        Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "lp user " + event.getWhoClicked().getName() + " meta setprefix \"&6[MVP&e++&6] &6\"");
                        event.getWhoClicked().closeInventory();
                        break;

                    case "§aPink MVP++ Rank Color":
                        event.getWhoClicked().sendMessage(API.colorize("&aSelected MVP++ Pink!"));
                        Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "lp user " + event.getWhoClicked().getName() + " meta setprefix \"&6[MVP&d++&6] &6\"");
                        event.getWhoClicked().closeInventory();
                        break;

                    case "§aWhite MVP++ Rank Color":
                        event.getWhoClicked().sendMessage(API.colorize("&aSelected MVP++ White!"));
                        Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "lp user " + event.getWhoClicked().getName() + " meta setprefix \"&6[MVP&f++&6] &6\"");
                        event.getWhoClicked().closeInventory();
                        break;

                    case "§aLight Blue MVP++ Rank Color":
                        event.getWhoClicked().sendMessage(API.colorize("&aSelected MVP++ Light Blue!"));
                        Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "lp user " + event.getWhoClicked().getName() + " meta setprefix \"&6[MVP&6++&6] &6\"");
                        event.getWhoClicked().closeInventory();
                        break;

                    case "§aGreen MVP++ Rank Color":
                        event.getWhoClicked().sendMessage(API.colorize("&aSelected MVP++ Green!"));
                        Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "lp user " + event.getWhoClicked().getName() + " meta setprefix \"&6[MVP&2++&6] &6\"");
                        event.getWhoClicked().closeInventory();
                        break;

                    case "§aDark Red MVP++ Rank Color":
                        event.getWhoClicked().sendMessage(API.colorize("&aSelected MVP++ Dark Red!"));
                        Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "lp user " + event.getWhoClicked().getName() + " meta setprefix \"&6[MVP&4++&6] &6\"");
                        event.getWhoClicked().closeInventory();
                        break;

                    case "§aCyan MVP++ Rank Color":
                        event.getWhoClicked().sendMessage(API.colorize("&aSelected MVP++ Cyan!"));
                        Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "lp user " + event.getWhoClicked().getName() + " meta setprefix \"&6[MVP&3++&6] &6\"");
                        event.getWhoClicked().closeInventory();
                        break;

                    case "§aPurple MVP++ Rank Color":
                        event.getWhoClicked().sendMessage(API.colorize("&aSelected MVP++ Purple!"));
                        Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "lp user " + event.getWhoClicked().getName() + " meta setprefix \"&6[MVP&5++&6] &6\"");
                        event.getWhoClicked().closeInventory();
                        break;

                    case "§aGray MVP++ Rank Color":
                        event.getWhoClicked().sendMessage(API.colorize("&aSelected MVP++ Gray!"));
                        Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "lp user " + event.getWhoClicked().getName() + " meta setprefix \"&6[MVP&7++&6] &6\"");
                        event.getWhoClicked().closeInventory();
                        break;

                    case "§aBlack MVP++ Rank Color":
                        event.getWhoClicked().sendMessage(API.colorize("&aSelected MVP++ Black!"));
                        Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "lp user " + event.getWhoClicked().getName() + " meta setprefix \"&6[MVP&0++&6] &6\"");
                        event.getWhoClicked().closeInventory();
                        break;

                    case "§aDark Blue MVP++ Rank Color":
                        event.getWhoClicked().sendMessage(API.colorize("&aSelected MVP++ Dark Blue!"));
                        Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "lp user " + event.getWhoClicked().getName() + " meta setprefix \"&6[MVP&1++&6] &6\"");
                        event.getWhoClicked().closeInventory();
                        break;

                    case "§cClose":
                        event.getWhoClicked().closeInventory();
                        break;
                }


                event.setCancelled(true);
                break;


        }
    }

    public static void giveVIPPlusGUI(Player player) {
        Inventory gui = Bukkit.createInventory(player, 45, "VIP+ Rank Color");

        Dye redDyeTemp = new Dye();
        redDyeTemp.setColor(DyeColor.RED);
        ItemStack redDye = redDyeTemp.toItemStack();
        redDye.setAmount(1);
        ItemMeta redDyeMeta = redDye.getItemMeta();
        redDyeMeta.setDisplayName(API.colorize("&aRed VIP+ Rank Color"));
        ArrayList<String> redDyeLore = new ArrayList<String>();
        redDyeLore.add(API.colorize("&7Changes the color of the plus in &aVIP&6+"));
        redDyeLore.add(API.colorize("&7to red, turning it into &aVIP&c+"));
        redDyeLore.add(API.colorize("&7 "));
        redDyeLore.add(API.colorize("&7Shown in tab list also when chatting"));
        redDyeLore.add(API.colorize("&7and joining lobbies."));
        redDyeLore.add(API.colorize("&f "));
        redDyeLore.add(API.colorize("&eClick to select!"));
        redDyeMeta.setLore(redDyeLore); //Set the lore to the item
        redDye.setItemMeta(redDyeMeta);

        Dye orangeDyeTemp = new Dye();
        orangeDyeTemp.setColor(DyeColor.ORANGE);
        ItemStack orangeDye = orangeDyeTemp.toItemStack();
        orangeDye.setAmount(1);
        ItemMeta orangeDyeMeta = orangeDye.getItemMeta();
        orangeDyeMeta.setDisplayName(API.colorize("&aOrange VIP+ Rank Color"));
        ArrayList<String> orangeDyeLore = new ArrayList<String>();
        orangeDyeLore.add(API.colorize("&7The default color for &aVIP&6+"));
        orangeDyeLore.add(API.colorize("&f "));
        orangeDyeLore.add(API.colorize("&eClick to select!"));
        orangeDyeMeta.setLore(orangeDyeLore); //Set the lore to the item
        orangeDye.setItemMeta(orangeDyeMeta);

        Dye limeDyeTemp = new Dye();
        limeDyeTemp.setColor(DyeColor.LIME);
        ItemStack limeDye = limeDyeTemp.toItemStack();
        limeDye.setAmount(1);
        ItemMeta limeDyeMeta = limeDye.getItemMeta();
        limeDyeMeta.setDisplayName(API.colorize("&aLime VIP+ Rank Color"));
        ArrayList<String> limeDyeLore = new ArrayList<String>();
        limeDyeLore.add(API.colorize("&7Changes the color of the plus in &aVIP&6+"));
        limeDyeLore.add(API.colorize("&7to lime, turning it into &aVIP&a+"));
        limeDyeLore.add(API.colorize("&7 "));
        limeDyeLore.add(API.colorize("&7Shown in tab list also when chatting"));
        limeDyeLore.add(API.colorize("&7and joining lobbies."));
        limeDyeLore.add(API.colorize("&f "));
        limeDyeLore.add(API.colorize("&eClick to select!"));
        limeDyeMeta.setLore(limeDyeLore); //Set the lore to the item
        limeDye.setItemMeta(limeDyeMeta);

        Dye yellowDyeTemp = new Dye();
        yellowDyeTemp.setColor(DyeColor.YELLOW);
        ItemStack yellowDye = yellowDyeTemp.toItemStack();
        yellowDye.setAmount(1);
        ItemMeta yellowDyeMeta = yellowDye.getItemMeta();
        yellowDyeMeta.setDisplayName(API.colorize("&aYellow VIP+ Rank Color"));
        ArrayList<String> yellowDyeLore = new ArrayList<String>();
        yellowDyeLore.add(API.colorize("&7Changes the color of the plus in &aVIP&6+"));
        yellowDyeLore.add(API.colorize("&7to yellow, turning it into &aVIP&e+"));
        yellowDyeLore.add(API.colorize("&7 "));
        yellowDyeLore.add(API.colorize("&7Shown in tab list also when chatting"));
        yellowDyeLore.add(API.colorize("&7and joining lobbies."));
        yellowDyeLore.add(API.colorize("&f "));
        yellowDyeLore.add(API.colorize("&eClick to select!"));
        yellowDyeMeta.setLore(yellowDyeLore); //Set the lore to the item
        yellowDye.setItemMeta(yellowDyeMeta);

        Dye pinkDyeTemp = new Dye();
        pinkDyeTemp.setColor(DyeColor.PINK);
        ItemStack pinkDye = pinkDyeTemp.toItemStack();
        pinkDye.setAmount(1);
        ItemMeta pinkDyeMeta = pinkDye.getItemMeta();
        pinkDyeMeta.setDisplayName(API.colorize("&aPink VIP+ Rank Color"));
        ArrayList<String> pinkDyeLore = new ArrayList<String>();
        pinkDyeLore.add(API.colorize("&7Changes the color of the plus in &aVIP&6+"));
        pinkDyeLore.add(API.colorize("&7to pink, turning it into &aVIP&d+"));
        pinkDyeLore.add(API.colorize("&7 "));
        pinkDyeLore.add(API.colorize("&7Shown in tab list also when chatting"));
        pinkDyeLore.add(API.colorize("&7and joining lobbies."));
        pinkDyeLore.add(API.colorize("&f "));
        pinkDyeLore.add(API.colorize("&eClick to select!"));
        pinkDyeMeta.setLore(pinkDyeLore); //Set the lore to the item
        pinkDye.setItemMeta(pinkDyeMeta);

        Dye whiteDyeTemp = new Dye();
        whiteDyeTemp.setColor(DyeColor.WHITE);
        ItemStack whiteDye = whiteDyeTemp.toItemStack();
        whiteDye.setAmount(1);
        ItemMeta whiteDyeMeta = whiteDye.getItemMeta();
        whiteDyeMeta.setDisplayName(API.colorize("&aWhite VIP+ Rank Color"));
        ArrayList<String> whiteDyeLore = new ArrayList<String>();
        whiteDyeLore.add(API.colorize("&7Changes the color of the plus in &aVIP&6+"));
        whiteDyeLore.add(API.colorize("&7to white, turning it into &aVIP&f+"));
        whiteDyeLore.add(API.colorize("&7 "));
        whiteDyeLore.add(API.colorize("&7Shown in tab list also when chatting"));
        whiteDyeLore.add(API.colorize("&7and joining lobbies."));
        whiteDyeLore.add(API.colorize("&f "));
        whiteDyeLore.add(API.colorize("&eClick to select!"));
        whiteDyeMeta.setLore(whiteDyeLore); //Set the lore to the item
        whiteDye.setItemMeta(whiteDyeMeta);

        Dye lblueDyeTemp = new Dye();
        lblueDyeTemp.setColor(DyeColor.LIGHT_BLUE);
        ItemStack lblueDye = lblueDyeTemp.toItemStack();
        lblueDye.setAmount(1);
        ItemMeta lblueDyeMeta = lblueDye.getItemMeta();
        lblueDyeMeta.setDisplayName(API.colorize("&aLight Blue VIP+ Rank Color"));
        ArrayList<String> lblueDyeLore = new ArrayList<String>();
        lblueDyeLore.add(API.colorize("&7Changes the color of the plus in &aVIP&6+"));
        lblueDyeLore.add(API.colorize("&7to light blue, turning it into &aVIP&b+"));
        lblueDyeLore.add(API.colorize("&7 "));
        lblueDyeLore.add(API.colorize("&7Shown in tab list also when chatting"));
        lblueDyeLore.add(API.colorize("&7and joining lobbies."));
        lblueDyeLore.add(API.colorize("&f "));
        lblueDyeLore.add(API.colorize("&eClick to select!"));
        lblueDyeMeta.setLore(lblueDyeLore); //Set the lore to the item
        lblueDye.setItemMeta(lblueDyeMeta);

        Dye greenDyeTemp = new Dye();
        greenDyeTemp.setColor(DyeColor.GREEN);
        ItemStack greenDye = greenDyeTemp.toItemStack();
        greenDye.setAmount(1);
        ItemMeta greenDyeMeta = greenDye.getItemMeta();
        greenDyeMeta.setDisplayName(API.colorize("&aGreen VIP+ Rank Color"));
        ArrayList<String> greenDyeLore = new ArrayList<String>();
        greenDyeLore.add(API.colorize("&7Changes the color of the plus in &aVIP&6+"));
        greenDyeLore.add(API.colorize("&7to green, turning it into &aVIP&2+"));
        greenDyeLore.add(API.colorize("&7 "));
        greenDyeLore.add(API.colorize("&7Shown in tab list also when chatting"));
        greenDyeLore.add(API.colorize("&7and joining lobbies."));
        greenDyeLore.add(API.colorize("&f "));
        greenDyeLore.add(API.colorize("&eClick to select!"));
        greenDyeMeta.setLore(greenDyeLore); //Set the lore to the item
        greenDye.setItemMeta(greenDyeMeta);

        ItemStack darkredDye = new ItemStack(Material.REDSTONE);
        darkredDye.setAmount(1);
        ItemMeta darkredDyeMeta = darkredDye.getItemMeta();
        darkredDyeMeta.setDisplayName(API.colorize("&aDark Red VIP+ Rank Color"));
        ArrayList<String> darkredDyeLore = new ArrayList<String>();
        darkredDyeLore.add(API.colorize("&7Changes the color of the plus in &aVIP&6+"));
        darkredDyeLore.add(API.colorize("&7to dark red, turning it into &aVIP&4+"));
        darkredDyeLore.add(API.colorize("&7 "));
        darkredDyeLore.add(API.colorize("&7Shown in tab list also when chatting"));
        darkredDyeLore.add(API.colorize("&7and joining lobbies."));
        darkredDyeLore.add(API.colorize("&f "));
        darkredDyeLore.add(API.colorize("&eClick to select!"));
        darkredDyeMeta.setLore(darkredDyeLore); //Set the lore to the item
        darkredDye.setItemMeta(darkredDyeMeta);

        Dye cyanDyeTemp = new Dye();
        cyanDyeTemp.setColor(DyeColor.CYAN);
        ItemStack cyanDye = cyanDyeTemp.toItemStack();
        cyanDye.setAmount(1);
        ItemMeta cyanDyeMeta = cyanDye.getItemMeta();
        cyanDyeMeta.setDisplayName(API.colorize("&aCyan VIP+ Rank Color"));
        ArrayList<String> cyanDyeLore = new ArrayList<String>();
        cyanDyeLore.add(API.colorize("&7Changes the color of the plus in &aVIP&6+"));
        cyanDyeLore.add(API.colorize("&7to cyan, turning it into &aVIP&3+"));
        cyanDyeLore.add(API.colorize("&7 "));
        cyanDyeLore.add(API.colorize("&7Shown in tab list also when chatting"));
        cyanDyeLore.add(API.colorize("&7and joining lobbies."));
        cyanDyeLore.add(API.colorize("&f "));
        cyanDyeLore.add(API.colorize("&eClick to select!"));
        cyanDyeMeta.setLore(cyanDyeLore); //Set the lore to the item
        cyanDye.setItemMeta(cyanDyeMeta);

        Dye purpleDyeTemp = new Dye();
        purpleDyeTemp.setColor(DyeColor.PURPLE);
        ItemStack purpleDye = purpleDyeTemp.toItemStack();
        purpleDye.setAmount(1);
        ItemMeta purpleDyeMeta = purpleDye.getItemMeta();
        purpleDyeMeta.setDisplayName(API.colorize("&aPurple VIP+ Rank Color"));
        ArrayList<String> purpleDyeLore = new ArrayList<String>();
        purpleDyeLore.add(API.colorize("&7Changes the color of the plus in &aVIP&6+"));
        purpleDyeLore.add(API.colorize("&7to purple, turning it into &aVIP&5+"));
        purpleDyeLore.add(API.colorize("&7 "));
        purpleDyeLore.add(API.colorize("&7Shown in tab list also when chatting"));
        purpleDyeLore.add(API.colorize("&7and joining lobbies."));
        purpleDyeLore.add(API.colorize("&f "));
        purpleDyeLore.add(API.colorize("&eClick to select!"));
        purpleDyeMeta.setLore(purpleDyeLore); //Set the lore to the item
        purpleDye.setItemMeta(purpleDyeMeta);

        Dye greyDyeTemp = new Dye();
        greyDyeTemp.setColor(DyeColor.GRAY);
        ItemStack greyDye = greyDyeTemp.toItemStack();
        greyDye.setAmount(1);
        ItemMeta greyDyeMeta = greyDye.getItemMeta();
        greyDyeMeta.setDisplayName(API.colorize("&aGray VIP+ Rank Color"));
        ArrayList<String> greyDyeLore = new ArrayList<String>();
        greyDyeLore.add(API.colorize("&7Changes the color of the plus in &aVIP&6+"));
        greyDyeLore.add(API.colorize("&7to grey, turning it into &aVIP&7+"));
        greyDyeLore.add(API.colorize("&7 "));
        greyDyeLore.add(API.colorize("&7Shown in tab list also when chatting"));
        greyDyeLore.add(API.colorize("&7and joining lobbies."));
        greyDyeLore.add(API.colorize("&f "));
        greyDyeLore.add(API.colorize("&eClick to select!"));
        greyDyeMeta.setLore(greyDyeLore); //Set the lore to the item
        greyDye.setItemMeta(greyDyeMeta);

        Dye blackDyeTemp = new Dye();
        blackDyeTemp.setColor(DyeColor.BLACK);
        ItemStack blackDye = blackDyeTemp.toItemStack();
        blackDye.setAmount(1);
        ItemMeta blackDyeMeta = blackDye.getItemMeta();
        blackDyeMeta.setDisplayName(API.colorize("&aBlack VIP+ Rank Color"));
        ArrayList<String> blackDyeLore = new ArrayList<String>();
        blackDyeLore.add(API.colorize("&7Changes the color of the plus in &aVIP&6+"));
        blackDyeLore.add(API.colorize("&7to black, turning it into &aVIP&0+"));
        blackDyeLore.add(API.colorize("&7 "));
        blackDyeLore.add(API.colorize("&7Shown in tab list also when chatting"));
        blackDyeLore.add(API.colorize("&7and joining lobbies."));
        blackDyeLore.add(API.colorize("&f "));
        blackDyeLore.add(API.colorize("&eClick to select!"));
        blackDyeMeta.setLore(blackDyeLore); //Set the lore to the item
        blackDye.setItemMeta(blackDyeMeta);

        Dye dblueDyeTemp = new Dye();
        dblueDyeTemp.setColor(DyeColor.BLUE);
        ItemStack dblueDye = dblueDyeTemp.toItemStack();
        dblueDye.setAmount(1);
        ItemMeta dblueDyeMeta = dblueDye.getItemMeta();
        dblueDyeMeta.setDisplayName(API.colorize("&aDark Blue VIP+ Rank Color"));
        ArrayList<String> dblueDyeLore = new ArrayList<String>();
        dblueDyeLore.add(API.colorize("&7Changes the color of the plus in &aVIP&6+"));
        dblueDyeLore.add(API.colorize("&7to dark blue, turning it into &aVIP&1+"));
        dblueDyeLore.add(API.colorize("&7 "));
        dblueDyeLore.add(API.colorize("&7Shown in tab list also when chatting"));
        dblueDyeLore.add(API.colorize("&7and joining lobbies."));
        dblueDyeLore.add(API.colorize("&f "));
        dblueDyeLore.add(API.colorize("&eClick to select!"));
        dblueDyeMeta.setLore(dblueDyeLore); //Set the lore to the item
        dblueDye.setItemMeta(dblueDyeMeta);

        ItemStack close = new ItemStack(Material.BARRIER);
        close.setAmount(1);
        ItemMeta closeMeta = close.getItemMeta();
        closeMeta.setDisplayName(API.colorize("&cClose"));
        close.setItemMeta(closeMeta);

        gui.setItem(11, redDye);
        gui.setItem(10, orangeDye);
        gui.setItem(12, limeDye);
        gui.setItem(13, yellowDye);
        gui.setItem(14, pinkDye);
        gui.setItem(15, whiteDye);
        gui.setItem(16, lblueDye);
        gui.setItem(19, greenDye);
        gui.setItem(20, darkredDye);
        gui.setItem(21, cyanDye);
        gui.setItem(22, purpleDye);
        gui.setItem(23, greyDye);
        gui.setItem(24, blackDye);
        gui.setItem(25, dblueDye);
        gui.setItem(40, close);
        player.openInventory(gui);
    }

    public static void giveMVPPlusGUI(Player player) {
        Inventory gui = Bukkit.createInventory(player, 45, "MVP+ Rank Color");

        Dye redDyeTemp = new Dye();
        redDyeTemp.setColor(DyeColor.RED);
        ItemStack redDye = redDyeTemp.toItemStack();
        redDye.setAmount(1);
        ItemMeta redDyeMeta = redDye.getItemMeta();
        redDyeMeta.setDisplayName(API.colorize("&aRed MVP+ Rank Color"));
        ArrayList<String> redDyeLore = new ArrayList<String>();
        redDyeLore.add(API.colorize("&7The default color for &bMVP&c+"));
        redDyeLore.add(API.colorize("&f "));
        redDyeLore.add(API.colorize("&eClick to select!"));
        redDyeMeta.setLore(redDyeLore); //Set the lore to the item
        redDye.setItemMeta(redDyeMeta);

        Dye orangeDyeTemp = new Dye();
        orangeDyeTemp.setColor(DyeColor.ORANGE);
        ItemStack orangeDye = orangeDyeTemp.toItemStack();
        orangeDye.setAmount(1);
        ItemMeta orangeDyeMeta = orangeDye.getItemMeta();
        orangeDyeMeta.setDisplayName(API.colorize("&aOrange MVP+ Rank Color"));
        ArrayList<String> orangeDyeLore = new ArrayList<String>();
        orangeDyeLore.add(API.colorize("&7Changes the color of the plus in &bMVP&c+"));
        orangeDyeLore.add(API.colorize("&7to orange, turning it into &bMVP&6+"));
        orangeDyeLore.add(API.colorize("&7 "));
        orangeDyeLore.add(API.colorize("&7Shown in tab list also when chatting"));
        orangeDyeLore.add(API.colorize("&7and joining lobbies."));
        orangeDyeLore.add(API.colorize("&f "));
        orangeDyeLore.add(API.colorize("&eClick to select!"));
        orangeDyeMeta.setLore(orangeDyeLore); //Set the lore to the item
        orangeDye.setItemMeta(orangeDyeMeta);

        Dye limeDyeTemp = new Dye();
        limeDyeTemp.setColor(DyeColor.LIME);
        ItemStack limeDye = limeDyeTemp.toItemStack();
        limeDye.setAmount(1);
        ItemMeta limeDyeMeta = limeDye.getItemMeta();
        limeDyeMeta.setDisplayName(API.colorize("&aLime MVP+ Rank Color"));
        ArrayList<String> limeDyeLore = new ArrayList<String>();
        limeDyeLore.add(API.colorize("&7Changes the color of the plus in &bMVP&c+"));
        limeDyeLore.add(API.colorize("&7to lime, turning it into &bMVP&a+"));
        limeDyeLore.add(API.colorize("&7 "));
        limeDyeLore.add(API.colorize("&7Shown in tab list also when chatting"));
        limeDyeLore.add(API.colorize("&7and joining lobbies."));
        limeDyeLore.add(API.colorize("&f "));
        limeDyeLore.add(API.colorize("&eClick to select!"));
        limeDyeMeta.setLore(limeDyeLore); //Set the lore to the item
        limeDye.setItemMeta(limeDyeMeta);

        Dye yellowDyeTemp = new Dye();
        yellowDyeTemp.setColor(DyeColor.YELLOW);
        ItemStack yellowDye = yellowDyeTemp.toItemStack();
        yellowDye.setAmount(1);
        ItemMeta yellowDyeMeta = yellowDye.getItemMeta();
        yellowDyeMeta.setDisplayName(API.colorize("&aYellow MVP+ Rank Color"));
        ArrayList<String> yellowDyeLore = new ArrayList<String>();
        yellowDyeLore.add(API.colorize("&7Changes the color of the plus in &bMVP&c+"));
        yellowDyeLore.add(API.colorize("&7to yellow, turning it into &bMVP&e+"));
        yellowDyeLore.add(API.colorize("&7 "));
        yellowDyeLore.add(API.colorize("&7Shown in tab list also when chatting"));
        yellowDyeLore.add(API.colorize("&7and joining lobbies."));
        yellowDyeLore.add(API.colorize("&f "));
        yellowDyeLore.add(API.colorize("&eClick to select!"));
        yellowDyeMeta.setLore(yellowDyeLore); //Set the lore to the item
        yellowDye.setItemMeta(yellowDyeMeta);

        Dye pinkDyeTemp = new Dye();
        pinkDyeTemp.setColor(DyeColor.PINK);
        ItemStack pinkDye = pinkDyeTemp.toItemStack();
        pinkDye.setAmount(1);
        ItemMeta pinkDyeMeta = pinkDye.getItemMeta();
        pinkDyeMeta.setDisplayName(API.colorize("&aPink MVP+ Rank Color"));
        ArrayList<String> pinkDyeLore = new ArrayList<String>();
        pinkDyeLore.add(API.colorize("&7Changes the color of the plus in &bMVP&c+"));
        pinkDyeLore.add(API.colorize("&7to pink, turning it into &bMVP&d+"));
        pinkDyeLore.add(API.colorize("&7 "));
        pinkDyeLore.add(API.colorize("&7Shown in tab list also when chatting"));
        pinkDyeLore.add(API.colorize("&7and joining lobbies."));
        pinkDyeLore.add(API.colorize("&f "));
        pinkDyeLore.add(API.colorize("&eClick to select!"));
        pinkDyeMeta.setLore(pinkDyeLore); //Set the lore to the item
        pinkDye.setItemMeta(pinkDyeMeta);

        Dye whiteDyeTemp = new Dye();
        whiteDyeTemp.setColor(DyeColor.WHITE);
        ItemStack whiteDye = whiteDyeTemp.toItemStack();
        whiteDye.setAmount(1);
        ItemMeta whiteDyeMeta = whiteDye.getItemMeta();
        whiteDyeMeta.setDisplayName(API.colorize("&aWhite MVP+ Rank Color"));
        ArrayList<String> whiteDyeLore = new ArrayList<String>();
        whiteDyeLore.add(API.colorize("&7Changes the color of the plus in &bMVP&c+"));
        whiteDyeLore.add(API.colorize("&7to white, turning it into &bMVP&f+"));
        whiteDyeLore.add(API.colorize("&7 "));
        whiteDyeLore.add(API.colorize("&7Shown in tab list also when chatting"));
        whiteDyeLore.add(API.colorize("&7and joining lobbies."));
        whiteDyeLore.add(API.colorize("&f "));
        whiteDyeLore.add(API.colorize("&eClick to select!"));
        whiteDyeMeta.setLore(whiteDyeLore); //Set the lore to the item
        whiteDye.setItemMeta(whiteDyeMeta);

        Dye lblueDyeTemp = new Dye();
        lblueDyeTemp.setColor(DyeColor.LIGHT_BLUE);
        ItemStack lblueDye = lblueDyeTemp.toItemStack();
        lblueDye.setAmount(1);
        ItemMeta lblueDyeMeta = lblueDye.getItemMeta();
        lblueDyeMeta.setDisplayName(API.colorize("&aLight Blue MVP+ Rank Color"));
        ArrayList<String> lblueDyeLore = new ArrayList<String>();
        lblueDyeLore.add(API.colorize("&7Changes the color of the plus in &bMVP&c+"));
        lblueDyeLore.add(API.colorize("&7to light blue, turning it into &bMVP&b+"));
        lblueDyeLore.add(API.colorize("&7 "));
        lblueDyeLore.add(API.colorize("&7Shown in tab list also when chatting"));
        lblueDyeLore.add(API.colorize("&7and joining lobbies."));
        lblueDyeLore.add(API.colorize("&f "));
        lblueDyeLore.add(API.colorize("&eClick to select!"));
        lblueDyeMeta.setLore(lblueDyeLore); //Set the lore to the item
        lblueDye.setItemMeta(lblueDyeMeta);

        Dye greenDyeTemp = new Dye();
        greenDyeTemp.setColor(DyeColor.GREEN);
        ItemStack greenDye = greenDyeTemp.toItemStack();
        greenDye.setAmount(1);
        ItemMeta greenDyeMeta = greenDye.getItemMeta();
        greenDyeMeta.setDisplayName(API.colorize("&aGreen MVP+ Rank Color"));
        ArrayList<String> greenDyeLore = new ArrayList<String>();
        greenDyeLore.add(API.colorize("&7Changes the color of the plus in &bMVP&c+"));
        greenDyeLore.add(API.colorize("&7to green, turning it into &bMVP&2+"));
        greenDyeLore.add(API.colorize("&7 "));
        greenDyeLore.add(API.colorize("&7Shown in tab list also when chatting"));
        greenDyeLore.add(API.colorize("&7and joining lobbies."));
        greenDyeLore.add(API.colorize("&f "));
        greenDyeLore.add(API.colorize("&eClick to select!"));
        greenDyeMeta.setLore(greenDyeLore); //Set the lore to the item
        greenDye.setItemMeta(greenDyeMeta);

        ItemStack darkredDye = new ItemStack(Material.REDSTONE);
        darkredDye.setAmount(1);
        ItemMeta darkredDyeMeta = darkredDye.getItemMeta();
        darkredDyeMeta.setDisplayName(API.colorize("&aDark Red MVP+ Rank Color"));
        ArrayList<String> darkredDyeLore = new ArrayList<String>();
        darkredDyeLore.add(API.colorize("&7Changes the color of the plus in &bMVP&c+"));
        darkredDyeLore.add(API.colorize("&7to dark red, turning it into &bMVP&4+"));
        darkredDyeLore.add(API.colorize("&7 "));
        darkredDyeLore.add(API.colorize("&7Shown in tab list also when chatting"));
        darkredDyeLore.add(API.colorize("&7and joining lobbies."));
        darkredDyeLore.add(API.colorize("&f "));
        darkredDyeLore.add(API.colorize("&eClick to select!"));
        darkredDyeMeta.setLore(darkredDyeLore); //Set the lore to the item
        darkredDye.setItemMeta(darkredDyeMeta);

        Dye cyanDyeTemp = new Dye();
        cyanDyeTemp.setColor(DyeColor.CYAN);
        ItemStack cyanDye = cyanDyeTemp.toItemStack();
        cyanDye.setAmount(1);
        ItemMeta cyanDyeMeta = cyanDye.getItemMeta();
        cyanDyeMeta.setDisplayName(API.colorize("&aCyan MVP+ Rank Color"));
        ArrayList<String> cyanDyeLore = new ArrayList<String>();
        cyanDyeLore.add(API.colorize("&7Changes the color of the plus in &bMVP&c+"));
        cyanDyeLore.add(API.colorize("&7to cyan, turning it into &bMVP&3+"));
        cyanDyeLore.add(API.colorize("&7 "));
        cyanDyeLore.add(API.colorize("&7Shown in tab list also when chatting"));
        cyanDyeLore.add(API.colorize("&7and joining lobbies."));
        cyanDyeLore.add(API.colorize("&f "));
        cyanDyeLore.add(API.colorize("&eClick to select!"));
        cyanDyeMeta.setLore(cyanDyeLore); //Set the lore to the item
        cyanDye.setItemMeta(cyanDyeMeta);

        Dye purpleDyeTemp = new Dye();
        purpleDyeTemp.setColor(DyeColor.PURPLE);
        ItemStack purpleDye = purpleDyeTemp.toItemStack();
        purpleDye.setAmount(1);
        ItemMeta purpleDyeMeta = purpleDye.getItemMeta();
        purpleDyeMeta.setDisplayName(API.colorize("&aPurple MVP+ Rank Color"));
        ArrayList<String> purpleDyeLore = new ArrayList<String>();
        purpleDyeLore.add(API.colorize("&7Changes the color of the plus in &bMVP&c+"));
        purpleDyeLore.add(API.colorize("&7to purple, turning it into &bMVP&5+"));
        purpleDyeLore.add(API.colorize("&7 "));
        purpleDyeLore.add(API.colorize("&7Shown in tab list also when chatting"));
        purpleDyeLore.add(API.colorize("&7and joining lobbies."));
        purpleDyeLore.add(API.colorize("&f "));
        purpleDyeLore.add(API.colorize("&eClick to select!"));
        purpleDyeMeta.setLore(purpleDyeLore); //Set the lore to the item
        purpleDye.setItemMeta(purpleDyeMeta);

        Dye greyDyeTemp = new Dye();
        greyDyeTemp.setColor(DyeColor.GRAY);
        ItemStack greyDye = greyDyeTemp.toItemStack();
        greyDye.setAmount(1);
        ItemMeta greyDyeMeta = greyDye.getItemMeta();
        greyDyeMeta.setDisplayName(API.colorize("&aGray MVP+ Rank Color"));
        ArrayList<String> greyDyeLore = new ArrayList<String>();
        greyDyeLore.add(API.colorize("&7Changes the color of the plus in &bMVP&c+"));
        greyDyeLore.add(API.colorize("&7to grey, turning it into &bMVP&7+"));
        greyDyeLore.add(API.colorize("&7 "));
        greyDyeLore.add(API.colorize("&7Shown in tab list also when chatting"));
        greyDyeLore.add(API.colorize("&7and joining lobbies."));
        greyDyeLore.add(API.colorize("&f "));
        greyDyeLore.add(API.colorize("&eClick to select!"));
        greyDyeMeta.setLore(greyDyeLore); //Set the lore to the item
        greyDye.setItemMeta(greyDyeMeta);

        Dye blackDyeTemp = new Dye();
        blackDyeTemp.setColor(DyeColor.BLACK);
        ItemStack blackDye = blackDyeTemp.toItemStack();
        blackDye.setAmount(1);
        ItemMeta blackDyeMeta = blackDye.getItemMeta();
        blackDyeMeta.setDisplayName(API.colorize("&aBlack MVP+ Rank Color"));
        ArrayList<String> blackDyeLore = new ArrayList<String>();
        blackDyeLore.add(API.colorize("&7Changes the color of the plus in &bMVP&c+"));
        blackDyeLore.add(API.colorize("&7to black, turning it into &bMVP&0+"));
        blackDyeLore.add(API.colorize("&7 "));
        blackDyeLore.add(API.colorize("&7Shown in tab list also when chatting"));
        blackDyeLore.add(API.colorize("&7and joining lobbies."));
        blackDyeLore.add(API.colorize("&f "));
        blackDyeLore.add(API.colorize("&eClick to select!"));
        blackDyeMeta.setLore(blackDyeLore); //Set the lore to the item
        blackDye.setItemMeta(blackDyeMeta);

        Dye dblueDyeTemp = new Dye();
        dblueDyeTemp.setColor(DyeColor.BLUE);
        ItemStack dblueDye = dblueDyeTemp.toItemStack();
        dblueDye.setAmount(1);
        ItemMeta dblueDyeMeta = dblueDye.getItemMeta();
        dblueDyeMeta.setDisplayName(API.colorize("&aDark Blue MVP+ Rank Color"));
        ArrayList<String> dblueDyeLore = new ArrayList<String>();
        dblueDyeLore.add(API.colorize("&7Changes the color of the plus in &bMVP&c+"));
        dblueDyeLore.add(API.colorize("&7to dark blue, turning it into &bMVP&1+"));
        dblueDyeLore.add(API.colorize("&7 "));
        dblueDyeLore.add(API.colorize("&7Shown in tab list also when chatting"));
        dblueDyeLore.add(API.colorize("&7and joining lobbies."));
        dblueDyeLore.add(API.colorize("&f "));
        dblueDyeLore.add(API.colorize("&eClick to select!"));
        dblueDyeMeta.setLore(dblueDyeLore); //Set the lore to the item
        dblueDye.setItemMeta(dblueDyeMeta);

        ItemStack close = new ItemStack(Material.BARRIER);
        close.setAmount(1);
        ItemMeta closeMeta = close.getItemMeta();
        closeMeta.setDisplayName(API.colorize("&cClose"));
        close.setItemMeta(closeMeta);

        gui.setItem(10, redDye);
        gui.setItem(11, orangeDye);
        gui.setItem(12, limeDye);
        gui.setItem(13, yellowDye);
        gui.setItem(14, pinkDye);
        gui.setItem(15, whiteDye);
        gui.setItem(16, lblueDye);
        gui.setItem(19, greenDye);
        gui.setItem(20, darkredDye);
        gui.setItem(21, cyanDye);
        gui.setItem(22, purpleDye);
        gui.setItem(23, greyDye);
        gui.setItem(24, blackDye);
        gui.setItem(25, dblueDye);
        gui.setItem(40, close);
        player.openInventory(gui);
    }

    public static void giveMVPPlusPlusGUI(Player player) {
        Inventory gui = Bukkit.createInventory(player, 45, "MVP++ Rank Color");

        Dye redDyeTemp = new Dye();
        redDyeTemp.setColor(DyeColor.RED);
        ItemStack redDye = redDyeTemp.toItemStack();
        redDye.setAmount(1);
        ItemMeta redDyeMeta = redDye.getItemMeta();
        redDyeMeta.setDisplayName(API.colorize("&aRed MVP++ Rank Color"));
        ArrayList<String> redDyeLore = new ArrayList<String>();
        redDyeLore.add(API.colorize("&7The default color for &6MVP&c++"));
        redDyeLore.add(API.colorize("&f "));
        redDyeLore.add(API.colorize("&eClick to select!"));
        redDyeMeta.setLore(redDyeLore); //Set the lore to the item
        redDye.setItemMeta(redDyeMeta);

        Dye orangeDyeTemp = new Dye();
        orangeDyeTemp.setColor(DyeColor.ORANGE);
        ItemStack orangeDye = orangeDyeTemp.toItemStack();
        orangeDye.setAmount(1);
        ItemMeta orangeDyeMeta = orangeDye.getItemMeta();
        orangeDyeMeta.setDisplayName(API.colorize("&aOrange MVP++ Rank Color"));
        ArrayList<String> orangeDyeLore = new ArrayList<String>();
        orangeDyeLore.add(API.colorize("&7Changes the color of the plus in &6MVP&c++"));
        orangeDyeLore.add(API.colorize("&7to orange, turning it into &6MVP&6++"));
        orangeDyeLore.add(API.colorize("&7 "));
        orangeDyeLore.add(API.colorize("&7Shown in tab list also when chatting"));
        orangeDyeLore.add(API.colorize("&7and joining lobbies."));
        orangeDyeLore.add(API.colorize("&f "));
        orangeDyeLore.add(API.colorize("&eClick to select!"));
        orangeDyeMeta.setLore(orangeDyeLore); //Set the lore to the item
        orangeDye.setItemMeta(orangeDyeMeta);

        Dye limeDyeTemp = new Dye();
        limeDyeTemp.setColor(DyeColor.LIME);
        ItemStack limeDye = limeDyeTemp.toItemStack();
        limeDye.setAmount(1);
        ItemMeta limeDyeMeta = limeDye.getItemMeta();
        limeDyeMeta.setDisplayName(API.colorize("&aLime MVP++ Rank Color"));
        ArrayList<String> limeDyeLore = new ArrayList<String>();
        limeDyeLore.add(API.colorize("&7Changes the color of the plus in &6MVP&c++"));
        limeDyeLore.add(API.colorize("&7to lime, turning it into &6MVP&a++"));
        limeDyeLore.add(API.colorize("&7 "));
        limeDyeLore.add(API.colorize("&7Shown in tab list also when chatting"));
        limeDyeLore.add(API.colorize("&7and joining lobbies."));
        limeDyeLore.add(API.colorize("&f "));
        limeDyeLore.add(API.colorize("&eClick to select!"));
        limeDyeMeta.setLore(limeDyeLore); //Set the lore to the item
        limeDye.setItemMeta(limeDyeMeta);

        Dye yellowDyeTemp = new Dye();
        yellowDyeTemp.setColor(DyeColor.YELLOW);
        ItemStack yellowDye = yellowDyeTemp.toItemStack();
        yellowDye.setAmount(1);
        ItemMeta yellowDyeMeta = yellowDye.getItemMeta();
        yellowDyeMeta.setDisplayName(API.colorize("&aYellow MVP++ Rank Color"));
        ArrayList<String> yellowDyeLore = new ArrayList<String>();
        yellowDyeLore.add(API.colorize("&7Changes the color of the plus in &6MVP&c++"));
        yellowDyeLore.add(API.colorize("&7to yellow, turning it into &6MVP&e++"));
        yellowDyeLore.add(API.colorize("&7 "));
        yellowDyeLore.add(API.colorize("&7Shown in tab list also when chatting"));
        yellowDyeLore.add(API.colorize("&7and joining lobbies."));
        yellowDyeLore.add(API.colorize("&f "));
        yellowDyeLore.add(API.colorize("&eClick to select!"));
        yellowDyeMeta.setLore(yellowDyeLore); //Set the lore to the item
        yellowDye.setItemMeta(yellowDyeMeta);

        Dye pinkDyeTemp = new Dye();
        pinkDyeTemp.setColor(DyeColor.PINK);
        ItemStack pinkDye = pinkDyeTemp.toItemStack();
        pinkDye.setAmount(1);
        ItemMeta pinkDyeMeta = pinkDye.getItemMeta();
        pinkDyeMeta.setDisplayName(API.colorize("&aPink MVP++ Rank Color"));
        ArrayList<String> pinkDyeLore = new ArrayList<String>();
        pinkDyeLore.add(API.colorize("&7Changes the color of the plus in &6MVP&c++"));
        pinkDyeLore.add(API.colorize("&7to pink, turning it into &6MVP&d++"));
        pinkDyeLore.add(API.colorize("&7 "));
        pinkDyeLore.add(API.colorize("&7Shown in tab list also when chatting"));
        pinkDyeLore.add(API.colorize("&7and joining lobbies."));
        pinkDyeLore.add(API.colorize("&f "));
        pinkDyeLore.add(API.colorize("&eClick to select!"));
        pinkDyeMeta.setLore(pinkDyeLore); //Set the lore to the item
        pinkDye.setItemMeta(pinkDyeMeta);

        Dye whiteDyeTemp = new Dye();
        whiteDyeTemp.setColor(DyeColor.WHITE);
        ItemStack whiteDye = whiteDyeTemp.toItemStack();
        whiteDye.setAmount(1);
        ItemMeta whiteDyeMeta = whiteDye.getItemMeta();
        whiteDyeMeta.setDisplayName(API.colorize("&aWhite MVP++ Rank Color"));
        ArrayList<String> whiteDyeLore = new ArrayList<String>();
        whiteDyeLore.add(API.colorize("&7Changes the color of the plus in &6MVP&c++"));
        whiteDyeLore.add(API.colorize("&7to white, turning it into &6MVP&f++"));
        whiteDyeLore.add(API.colorize("&7 "));
        whiteDyeLore.add(API.colorize("&7Shown in tab list also when chatting"));
        whiteDyeLore.add(API.colorize("&7and joining lobbies."));
        whiteDyeLore.add(API.colorize("&f "));
        whiteDyeLore.add(API.colorize("&eClick to select!"));
        whiteDyeMeta.setLore(whiteDyeLore); //Set the lore to the item
        whiteDye.setItemMeta(whiteDyeMeta);

        Dye lblueDyeTemp = new Dye();
        lblueDyeTemp.setColor(DyeColor.LIGHT_BLUE);
        ItemStack lblueDye = lblueDyeTemp.toItemStack();
        lblueDye.setAmount(1);
        ItemMeta lblueDyeMeta = lblueDye.getItemMeta();
        lblueDyeMeta.setDisplayName(API.colorize("&aLight Blue MVP++ Rank Color"));
        ArrayList<String> lblueDyeLore = new ArrayList<String>();
        lblueDyeLore.add(API.colorize("&7Changes the color of the plus in &6MVP&c++"));
        lblueDyeLore.add(API.colorize("&7to light blue, turning it into &6MVP&b++"));
        lblueDyeLore.add(API.colorize("&7 "));
        lblueDyeLore.add(API.colorize("&7Shown in tab list also when chatting"));
        lblueDyeLore.add(API.colorize("&7and joining lobbies."));
        lblueDyeLore.add(API.colorize("&f "));
        lblueDyeLore.add(API.colorize("&eClick to select!"));
        lblueDyeMeta.setLore(lblueDyeLore); //Set the lore to the item
        lblueDye.setItemMeta(lblueDyeMeta);

        Dye greenDyeTemp = new Dye();
        greenDyeTemp.setColor(DyeColor.GREEN);
        ItemStack greenDye = greenDyeTemp.toItemStack();
        greenDye.setAmount(1);
        ItemMeta greenDyeMeta = greenDye.getItemMeta();
        greenDyeMeta.setDisplayName(API.colorize("&aGreen MVP++ Rank Color"));
        ArrayList<String> greenDyeLore = new ArrayList<String>();
        greenDyeLore.add(API.colorize("&7Changes the color of the plus in &6MVP&c++"));
        greenDyeLore.add(API.colorize("&7to green, turning it into &6MVP&2++"));
        greenDyeLore.add(API.colorize("&7 "));
        greenDyeLore.add(API.colorize("&7Shown in tab list also when chatting"));
        greenDyeLore.add(API.colorize("&7and joining lobbies."));
        greenDyeLore.add(API.colorize("&f "));
        greenDyeLore.add(API.colorize("&eClick to select!"));
        greenDyeMeta.setLore(greenDyeLore); //Set the lore to the item
        greenDye.setItemMeta(greenDyeMeta);

        ItemStack darkredDye = new ItemStack(Material.REDSTONE);
        darkredDye.setAmount(1);
        ItemMeta darkredDyeMeta = darkredDye.getItemMeta();
        darkredDyeMeta.setDisplayName(API.colorize("&aDark Red MVP++ Rank Color"));
        ArrayList<String> darkredDyeLore = new ArrayList<String>();
        darkredDyeLore.add(API.colorize("&7Changes the color of the plus in &6MVP&c++"));
        darkredDyeLore.add(API.colorize("&7to dark red, turning it into &6MVP&4++"));
        darkredDyeLore.add(API.colorize("&7 "));
        darkredDyeLore.add(API.colorize("&7Shown in tab list also when chatting"));
        darkredDyeLore.add(API.colorize("&7and joining lobbies."));
        darkredDyeLore.add(API.colorize("&f "));
        darkredDyeLore.add(API.colorize("&eClick to select!"));
        darkredDyeMeta.setLore(darkredDyeLore); //Set the lore to the item
        darkredDye.setItemMeta(darkredDyeMeta);

        Dye cyanDyeTemp = new Dye();
        cyanDyeTemp.setColor(DyeColor.CYAN);
        ItemStack cyanDye = cyanDyeTemp.toItemStack();
        cyanDye.setAmount(1);
        ItemMeta cyanDyeMeta = cyanDye.getItemMeta();
        cyanDyeMeta.setDisplayName(API.colorize("&aCyan MVP++ Rank Color"));
        ArrayList<String> cyanDyeLore = new ArrayList<String>();
        cyanDyeLore.add(API.colorize("&7Changes the color of the plus in &6MVP&c++"));
        cyanDyeLore.add(API.colorize("&7to cyan, turning it into &6MVP&3++"));
        cyanDyeLore.add(API.colorize("&7 "));
        cyanDyeLore.add(API.colorize("&7Shown in tab list also when chatting"));
        cyanDyeLore.add(API.colorize("&7and joining lobbies."));
        cyanDyeLore.add(API.colorize("&f "));
        cyanDyeLore.add(API.colorize("&eClick to select!"));
        cyanDyeMeta.setLore(cyanDyeLore); //Set the lore to the item
        cyanDye.setItemMeta(cyanDyeMeta);

        Dye purpleDyeTemp = new Dye();
        purpleDyeTemp.setColor(DyeColor.PURPLE);
        ItemStack purpleDye = purpleDyeTemp.toItemStack();
        purpleDye.setAmount(1);
        ItemMeta purpleDyeMeta = purpleDye.getItemMeta();
        purpleDyeMeta.setDisplayName(API.colorize("&aPurple MVP++ Rank Color"));
        ArrayList<String> purpleDyeLore = new ArrayList<String>();
        purpleDyeLore.add(API.colorize("&7Changes the color of the plus in &6MVP&c++"));
        purpleDyeLore.add(API.colorize("&7to purple, turning it into &6MVP&5++"));
        purpleDyeLore.add(API.colorize("&7 "));
        purpleDyeLore.add(API.colorize("&7Shown in tab list also when chatting"));
        purpleDyeLore.add(API.colorize("&7and joining lobbies."));
        purpleDyeLore.add(API.colorize("&f "));
        purpleDyeLore.add(API.colorize("&eClick to select!"));
        purpleDyeMeta.setLore(purpleDyeLore); //Set the lore to the item
        purpleDye.setItemMeta(purpleDyeMeta);

        Dye greyDyeTemp = new Dye();
        greyDyeTemp.setColor(DyeColor.GRAY);
        ItemStack greyDye = greyDyeTemp.toItemStack();
        greyDye.setAmount(1);
        ItemMeta greyDyeMeta = greyDye.getItemMeta();
        greyDyeMeta.setDisplayName(API.colorize("&aGray MVP++ Rank Color"));
        ArrayList<String> greyDyeLore = new ArrayList<String>();
        greyDyeLore.add(API.colorize("&7Changes the color of the plus in &6MVP&c++"));
        greyDyeLore.add(API.colorize("&7to grey, turning it into &6MVP&7++"));
        greyDyeLore.add(API.colorize("&7 "));
        greyDyeLore.add(API.colorize("&7Shown in tab list also when chatting"));
        greyDyeLore.add(API.colorize("&7and joining lobbies."));
        greyDyeLore.add(API.colorize("&f "));
        greyDyeLore.add(API.colorize("&eClick to select!"));
        greyDyeMeta.setLore(greyDyeLore); //Set the lore to the item
        greyDye.setItemMeta(greyDyeMeta);

        Dye blackDyeTemp = new Dye();
        blackDyeTemp.setColor(DyeColor.BLACK);
        ItemStack blackDye = blackDyeTemp.toItemStack();
        blackDye.setAmount(1);
        ItemMeta blackDyeMeta = blackDye.getItemMeta();
        blackDyeMeta.setDisplayName(API.colorize("&aBlack MVP++ Rank Color"));
        ArrayList<String> blackDyeLore = new ArrayList<String>();
        blackDyeLore.add(API.colorize("&7Changes the color of the plus in &6MVP&c++"));
        blackDyeLore.add(API.colorize("&7to black, turning it into &6MVP&0++"));
        blackDyeLore.add(API.colorize("&7 "));
        blackDyeLore.add(API.colorize("&7Shown in tab list also when chatting"));
        blackDyeLore.add(API.colorize("&7and joining lobbies."));
        blackDyeLore.add(API.colorize("&f "));
        blackDyeLore.add(API.colorize("&eClick to select!"));
        blackDyeMeta.setLore(blackDyeLore); //Set the lore to the item
        blackDye.setItemMeta(blackDyeMeta);

        Dye dblueDyeTemp = new Dye();
        dblueDyeTemp.setColor(DyeColor.BLUE);
        ItemStack dblueDye = dblueDyeTemp.toItemStack();
        dblueDye.setAmount(1);
        ItemMeta dblueDyeMeta = dblueDye.getItemMeta();
        dblueDyeMeta.setDisplayName(API.colorize("&aDark Blue MVP++ Rank Color"));
        ArrayList<String> dblueDyeLore = new ArrayList<String>();
        dblueDyeLore.add(API.colorize("&7Changes the color of the plus in &6MVP&c++"));
        dblueDyeLore.add(API.colorize("&7to dark blue, turning it into &6MVP&1++"));
        dblueDyeLore.add(API.colorize("&7 "));
        dblueDyeLore.add(API.colorize("&7Shown in tab list also when chatting"));
        dblueDyeLore.add(API.colorize("&7and joining lobbies."));
        dblueDyeLore.add(API.colorize("&f "));
        dblueDyeLore.add(API.colorize("&eClick to select!"));
        dblueDyeMeta.setLore(dblueDyeLore); //Set the lore to the item
        dblueDye.setItemMeta(dblueDyeMeta);

        ItemStack close = new ItemStack(Material.BARRIER);
        close.setAmount(1);
        ItemMeta closeMeta = close.getItemMeta();
        closeMeta.setDisplayName(API.colorize("&cClose"));
        close.setItemMeta(closeMeta);

        gui.setItem(10, redDye);
        gui.setItem(11, orangeDye);
        gui.setItem(12, limeDye);
        gui.setItem(13, yellowDye);
        gui.setItem(14, pinkDye);
        gui.setItem(15, whiteDye);
        gui.setItem(16, lblueDye);
        gui.setItem(19, greenDye);
        gui.setItem(20, darkredDye);
        gui.setItem(21, cyanDye);
        gui.setItem(22, purpleDye);
        gui.setItem(23, greyDye);
        gui.setItem(24, blackDye);
        gui.setItem(25, dblueDye);
        gui.setItem(40, close);
        player.openInventory(gui);
    }
}
