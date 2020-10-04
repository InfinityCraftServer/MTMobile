package valiblackdragon.mtmobile.listeners;

import io.github.bananapuncher714.nbteditor.NBTEditor;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import valiblackdragon.mtmobile.main;

import java.util.List;


public class phoneHolder {
    private main plugin;

    public phoneHolder(main plugin) {
        this.plugin = plugin;
    }

    public String getHolder(String s) {

        List<String> ExistingNumbers = plugin.getphoneData().getStringList("phones");

        String owner = "";
        Bukkit.getServer().getConsoleSender().sendMessage(ExistingNumbers+ "");
        if (ExistingNumbers.contains(s)) {
            for (Player player : Bukkit.getOnlinePlayers()) {
                for (int size = 0; size < player.getInventory().getSize(); size++) {
                    ItemStack item = player.getInventory().getItem(size);
                    if (!(item == null)) {
                        if (NBTEditor.getBoolean(item, "IsPhone") == true && NBTEditor.getString(item, "PhoneNumber").contains(s)) {
                            owner = player.getDisplayName();
                            Bukkit.getServer().getConsoleSender().sendMessage(owner + "");
                        }
                    }


                }

            }
        }
        return owner;
    }
}


