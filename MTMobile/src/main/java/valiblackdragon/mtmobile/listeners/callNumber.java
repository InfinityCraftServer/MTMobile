package valiblackdragon.mtmobile.listeners;

import io.github.bananapuncher714.nbteditor.NBTEditor;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.ItemStack;
import valiblackdragon.mtmobile.main;

@SuppressWarnings( "deprecation" )
public class callNumber implements Listener {

    private phoneHolder phoneholder = new phoneHolder(main.getPlugin(main.class));
    private CreateContact createContact= new CreateContact(main.getPlugin(main.class));



    @EventHandler
    public void pickNumber(InventoryClickEvent event) {


        ItemStack number = event.getCurrentItem();
        if (number == null){
        Bukkit.getServer().getConsoleSender().sendMessage("Null");
            return;
        }

        if(!(NBTEditor.contains(number, "NumberButton")) && !(NBTEditor.contains(number, "Backspace")) && !(NBTEditor.contains(number, "callButton")) &&!(NBTEditor.contains(number, "contactButton"))){return;}

        boolean Button = NBTEditor.getBoolean(number, "NumberButton");
        boolean backspace = NBTEditor.getBoolean(number, "Backspace");
        boolean makecall = NBTEditor.getBoolean(number, "callButton");
        boolean createcontact = NBTEditor.getBoolean(number, "contactButton");
        event.setCancelled(true);
        if (Button) {
            Bukkit.getServer().getConsoleSender().sendMessage("Check");
            for (int openslot = 10; openslot < 17; openslot++) {
                ItemStack item = event.getInventory().getItem(openslot);
                if (item == null) {
                    Bukkit.getServer().getConsoleSender().sendMessage("Check 2");
                    event.getInventory().setItem(openslot, number);
                    break;
                }
            }
        } else if (backspace) {
            Bukkit.getServer().getConsoleSender().sendMessage("CheckBack");
            for (int openslot = 10; openslot < 18; openslot++) {
                ItemStack item = event.getInventory().getItem(openslot);
                try {
                    if (item == null || item.getType().getId() == 160) {
                        if (event.getInventory().getItem(openslot - 1).getTypeId() != 160) {
                            Bukkit.getServer().getConsoleSender().sendMessage("CheckBack2");
                            event.getInventory().setItem(openslot - 1, new ItemStack(Material.AIR));
                            break;
                        }
                    }
                } catch (NullPointerException ignored){}
            }
        } else if (makecall){
            String Nummer = "";
            boolean FullNummer = true;
            for (int openslot = 10; openslot < 18; openslot++) {
                try {
                    String item = event.getInventory().getItem(openslot).getItemMeta().getDisplayName();
                    Nummer += item;
                } catch(NullPointerException err) {
                    FullNummer = false;
                }

            }
            if(!FullNummer){event.getWhoClicked().sendMessage(ChatColor.RED + "Voer een heel nummer in!");}
            else{

                Bukkit.getServer().getConsoleSender().sendMessage("Nummer: " + Nummer);
                Bukkit.getServer().getConsoleSender().sendMessage("Owner: " + phoneholder.getHolder(Nummer));
            }

        } else if(createcontact){
            Player player = (Player) event.getWhoClicked();
            String Nummer = "test:";
            boolean FullNummer = true;
            for (int openslot = 10; openslot < 18; openslot++) {
                try {
                    String item = event.getInventory().getItem(openslot).getItemMeta().getDisplayName();
                    Nummer += item;
                } catch(NullPointerException err) {
                    FullNummer = false;
                }

            }
            if(!FullNummer){event.getWhoClicked().sendMessage(ChatColor.RED + "Voer een heel nummer in!");}
            else{
                createContact.createContact(player, Nummer);
            }
        }



    }
}

