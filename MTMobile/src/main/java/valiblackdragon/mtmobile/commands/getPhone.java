package valiblackdragon.mtmobile.commands;

import io.github.bananapuncher714.nbteditor.NBTEditor;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import valiblackdragon.mtmobile.main;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class getPhone implements CommandExecutor {

    main plugin = main.getPlugin(main.class);

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (sender instanceof Player) {

            if (sender.hasPermission("MTPhones.get")) {

                String nummer = Integer.toString(createNummer());


                ItemStack createMobiel = new ItemStack(Material.DIAMOND_HOE, 1);
                ItemMeta meta = createMobiel.getItemMeta();
                meta.setDisplayName(ChatColor.AQUA + "Mobiele Telefoon");
                List<String> lore = new ArrayList<>();
                lore.add(ChatColor.BLUE + "Sycle" + ChatColor.WHITE + " Network");
                lore.add(ChatColor.BLUE + "Officiel Telefoon item");
                lore.add("" + nummer);
                meta.setLore(lore);
                meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
                meta.setUnbreakable(true);
                createMobiel.setItemMeta(meta);

                ItemStack mobiel2 = NBTEditor.set(createMobiel, true, "IsPhone");
                ItemStack mobiel = NBTEditor.set(mobiel2, nummer, "PhoneNumber");


                ((Player) sender).getInventory().addItem(mobiel);

            } else {
                sender.sendMessage(ChatColor.DARK_RED + "Geen permissie");
            }

        } else {
            Bukkit.getServer().getConsoleSender().sendMessage("Alleen spelers kunnen dit commando uitvoeren");
        }


        return false;
    }

    public int createNummer() {
        boolean FoundValidNumber = false;
        List<String> ExistingNumbers = plugin.getphoneData().getStringList("phones");

        int telefoonnummer = 0;
        while (!FoundValidNumber) {
            Random random = new Random();
            telefoonnummer = 1000000 + random.nextInt(9999990 - 1000000 + 1);
            if (!ExistingNumbers.contains(telefoonnummer + "")) {
                ExistingNumbers.add(telefoonnummer + "");
                plugin.getphoneData().set("phones", ExistingNumbers);
                try {
                    plugin.getphoneData().save(plugin.getDataFolder() + "/phones.yml");
                    FoundValidNumber = true;
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return telefoonnummer;
    }

}
