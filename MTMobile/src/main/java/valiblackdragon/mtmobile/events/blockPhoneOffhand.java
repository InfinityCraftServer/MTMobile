package valiblackdragon.mtmobile.events;

import io.github.bananapuncher714.nbteditor.NBTEditor;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.InventoryDragEvent;
import org.bukkit.event.inventory.InventoryType;
import org.bukkit.event.player.PlayerSwapHandItemsEvent;
import org.bukkit.inventory.ItemStack;

public class blockPhoneOffhand implements Listener {

    @EventHandler(priority = EventPriority.HIGHEST)
    public void blockOffhand(PlayerSwapHandItemsEvent e) {
        ItemStack item = e.getOffHandItem();
        boolean isphone = NBTEditor.getBoolean(item, "IsPhone");
        if (isphone) {
            e.setCancelled(true);
            Bukkit.getServer().getConsoleSender().sendMessage("PlayerSwapHandItemsEvent");
        }
    }

    @EventHandler(priority = EventPriority.HIGHEST)
    public void blockOffhand2(InventoryClickEvent e) {
        if (e.getSlot() != 40)
            return;
        ItemStack item = e.getCursor();

        if (NBTEditor.getBoolean(item, "IsPhone")) {
            e.getWhoClicked().sendMessage(ChatColor.DARK_RED + "Telefoons in je offhand zijn niet supported!");
        }
    }

    @EventHandler(priority = EventPriority.HIGHEST)
    public void blockOffhand3(InventoryDragEvent e) {
        if (e.getInventory().getType() != InventoryType.CRAFTING || e.getInventorySlots().contains(40))
            return;
        ItemStack item = e.getCursor();
        if (NBTEditor.getBoolean(item, "IsPhone")) {
            e.setCancelled(true);
            Bukkit.getServer().getConsoleSender().sendMessage("InventoryDrag");
        }
    }
}

