package valiblackdragon.mtmobile;

import org.bukkit.Bukkit;

import org.bukkit.configuration.InvalidConfigurationException;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;


import valiblackdragon.mtmobile.commands.getPhone;
import valiblackdragon.mtmobile.commands.getUser;
import valiblackdragon.mtmobile.events.blockPhoneOffhand;
import valiblackdragon.mtmobile.events.inventoryLock;
import valiblackdragon.mtmobile.events.openMobile;
import valiblackdragon.mtmobile.listeners.callNumber;
import valiblackdragon.mtmobile.listeners.menuManager;

import java.io.File;
import java.io.IOException;


public final class main extends JavaPlugin implements Listener {

    public void onEnable() {
        getCommand("getPhone").setExecutor(new getPhone());
        getCommand("getuser").setExecutor(new getUser());

        Bukkit.getServer().getPluginManager().registerEvents(new openMobile(), this);
        Bukkit.getServer().getPluginManager().registerEvents(new blockPhoneOffhand(), this);
        Bukkit.getServer().getPluginManager().registerEvents(new inventoryLock(), this);
        Bukkit.getServer().getPluginManager().registerEvents(new menuManager(), this);
        Bukkit.getServer().getPluginManager().registerEvents(new callNumber(), this);
        CreatePhones();
        CreateContacts();
    }
    private File phoneDataFile;
    private FileConfiguration phoneData;

    public FileConfiguration getphoneData() {
        return this.phoneData;
    }

    private void CreatePhones() {
        phoneDataFile = new File(getDataFolder(), "phones.yml");
        if (!phoneDataFile.exists()) {
            phoneDataFile.getParentFile().mkdirs();
            saveResource("phones.yml", false);
        }

        phoneData = new YamlConfiguration();
        try {
            phoneData.load(phoneDataFile);
        } catch (IOException | InvalidConfigurationException e) {
            e.printStackTrace();
        }
    }
    private File ContactDataFile;
    private FileConfiguration ContactData;

    public FileConfiguration getContactData() {
        return this.ContactData;
    }

    private void CreateContacts() {
        ContactDataFile = new File(getDataFolder(), "Contacts.yml");
        if (!ContactDataFile.exists()) {
            ContactDataFile.getParentFile().mkdirs();
            saveResource("Contacts.yml", false);
        }

        ContactData = new YamlConfiguration();
        try {
            ContactData.load(ContactDataFile);
        } catch (IOException | InvalidConfigurationException e) {
            e.printStackTrace();
        }
    }
}

