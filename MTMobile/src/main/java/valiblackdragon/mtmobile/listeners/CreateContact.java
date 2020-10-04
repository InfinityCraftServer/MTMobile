package valiblackdragon.mtmobile.listeners;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import valiblackdragon.mtmobile.main;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CreateContact {

    private main plugin;

    public CreateContact(main plugin) {
        this.plugin = plugin;
    }
    public void createContact(Player player, String contact) {
        String path = "Contacts." + player.getUniqueId();
        List<String> existingcontacts = plugin.getContactData().isSet(path) ? plugin.getContactData().getStringList(path) : new ArrayList<>();
        if(!existingcontacts.contains(contact+""))
            existingcontacts.add(contact+"");
        plugin.getContactData().set(path, existingcontacts);
        try {
            Bukkit.getServer().getConsoleSender().sendMessage(existingcontacts + "");
            plugin.getContactData().save(plugin.getDataFolder() + "/Contacts.yml");
        } catch (IOException ignored) {
        }

    }

    }

