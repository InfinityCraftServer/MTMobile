package valiblackdragon.mtmobile.commands;

import io.github.bananapuncher714.nbteditor.NBTEditor;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import valiblackdragon.mtmobile.main;

import java.util.List;

public class getUser implements CommandExecutor {

    main plugin = main.getPlugin(main.class);

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        List<String> ExistingNumbers = plugin.getphoneData().getStringList("phones");
        String Telefoon = args[0];
        if (ExistingNumbers.contains(Telefoon)) {
            for (Player player : Bukkit.getOnlinePlayers()) {
                for (int size = 0; size < player.getInventory().getSize(); size++) {
                    ItemStack item = player.getInventory().getItem(size);
                    if (!(item == null)) {
                        if (NBTEditor.getBoolean(item, "IsPhone") && NBTEditor.getString(item, "PhoneNumber").contains(Telefoon)) {
                            Bukkit.getServer().getConsoleSender().sendMessage(player.getDisplayName());
                        }
                    }


                }

            }
        }


        return false;
    }
}
