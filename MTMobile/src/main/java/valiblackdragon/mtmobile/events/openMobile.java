package valiblackdragon.mtmobile.events;

import io.github.bananapuncher714.nbteditor.NBTEditor;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;
import valiblackdragon.mtmobile.main;
import valiblackdragon.mtmobile.phoneMenus.mainMenu;

public class openMobile implements Listener {

    public mainMenu menu;


    @EventHandler
    public void mobileOpen(PlayerInteractEvent event) {
        this.menu = new mainMenu(main.getPlugin(main.class));

        if (phone(event.getPlayer()) != null) {
            event.setCancelled(true);
            Bukkit.broadcastMessage("Holding phone");
            menu.mainMenu(event.getPlayer());
        }

    }

    public static String phone(Player p) {

        ItemStack Mainhand = new ItemStack(p.getInventory().getItemInMainHand());
        boolean mainHandIsPhone = NBTEditor.getBoolean(Mainhand, "IsPhone");
        String mainHandNumber = NBTEditor.getString(Mainhand, "PhoneNumber");

        if (mainHandIsPhone) {
            return mainHandNumber;
        }

        return null;
    }


}
