package valiblackdragon.mtmobile.listeners;

import io.github.bananapuncher714.nbteditor.NBTEditor;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.ItemStack;
import valiblackdragon.mtmobile.main;
import valiblackdragon.mtmobile.phoneMenus.callMenu;
import valiblackdragon.mtmobile.phoneMenus.mainMenu;


public class menuManager implements Listener {


    private callMenu callmenu = new callMenu();
    private mainMenu mainmenu = new mainMenu(main.getPlugin(main.class));


    @EventHandler
    public void manageMenu(InventoryClickEvent event) {

        ItemStack item = event.getCurrentItem();
        if (item == null || item == new ItemStack(Material.AIR)) {
            Bukkit.getServer().getConsoleSender().sendMessage("Air");
            return;
        }
        if (NBTEditor.contains(item, "direct")) {
            event.setCancelled(true);
            try {
                if (NBTEditor.getString(item, "direct").contains("callmenu")) {
                    callmenu.openCallmenu((Player) event.getWhoClicked());
                }
                if (NBTEditor.getString(item, "direct").contains("mainmenu")) {
                    mainmenu.mainMenu((Player) event.getWhoClicked());
                } else {
                    return;
                }
            } catch (NullPointerException e) {
                return;
            }
        }
        return;
    }
}
