package valiblackdragon.mtmobile.events;

import io.github.bananapuncher714.nbteditor.NBTEditor;
import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.ItemStack;

public class inventoryLock implements Listener {

    @SuppressWarnings( "deprecation" )
    @EventHandler (priority = EventPriority.HIGHEST)
    public void lock(InventoryClickEvent e) {
        try {
            int data = e.getCurrentItem().getTypeId();
            ItemStack item = e.getCurrentItem();
            if (data == 160 && NBTEditor.getBoolean(item, "NoClick")) {
                e.setCancelled(true);
                Bukkit.getServer().getConsoleSender().sendMessage("InventoryLock");
            }
        } catch(Exception ignored){
        }
    }
    }

