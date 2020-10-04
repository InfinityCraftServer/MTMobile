package valiblackdragon.mtmobile.phoneMenus;

import dev.dbassett.skullcreator.SkullCreator;
import io.github.bananapuncher714.nbteditor.NBTEditor;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class callMenu {

    @SuppressWarnings( "deprecation" )
    public void openCallmenu(Player player) {
        Inventory callmenu = Bukkit.createInventory(player, 45, ChatColor.RED + "User bellen");

        ItemStack backgroundItem = new ItemStack(Material.STAINED_GLASS_PANE);
        ItemStack backgroundItemIcon = NBTEditor.set(backgroundItem, true, "NoClick");
        for (int size = 0; size < 45; size++) {
            if (!(size >= 10 && size <= 16) || (size >= 27 && size <= 44)) {
                ItemStack slot = player.getInventory().getItem(size);
                if (!(slot == null)) {
                }
                callmenu.setItem(size, backgroundItemIcon);
            }
        }
        String link1 = "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNzFiYzJiY2ZiMmJkMzc1OWU2YjFlODZmYzdhNzk1ODVlMTEyN2RkMzU3ZmMyMDI4OTNmOWRlMjQxYmM5ZTUzMCJ9fX0=";
        ItemStack block1 = SkullCreator.itemFromBase64(link1);
        ItemMeta meta1 = block1.getItemMeta();
        meta1.setDisplayName("1");
        block1.setItemMeta(meta1);
        ItemStack addNumber1 = NBTEditor.set(block1, true, "NumberButton");
        callmenu.setItem(27, addNumber1);

        String link2 = "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNGNkOWVlZWU4ODM0Njg4ODFkODM4NDhhNDZiZjMwMTI0ODVjMjNmNzU3NTNiOGZiZTg0ODczNDE0MTk4NDcifX19";
        ItemStack block2 = SkullCreator.itemFromBase64(link2);
        ItemMeta meta2 = block2.getItemMeta();
        meta2.setDisplayName("2");
        block2.setItemMeta(meta2);
        ItemStack addNumber2 = NBTEditor.set(block2, true, "NumberButton");
        callmenu.setItem(28, addNumber2);

        String link3 = "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMWQ0ZWFlMTM5MzM4NjBhNmRmNWU4ZTk1NTY5M2I5NWE4YzNiMTVjMzZiOGI1ODc1MzJhYzA5OTZiYzM3ZTUifX19";
        ItemStack block3 = SkullCreator.itemFromBase64(link3);
        ItemMeta meta3 = block2.getItemMeta();
        meta3.setDisplayName("3");
        block3.setItemMeta(meta3);
        ItemStack addNumber3 = NBTEditor.set(block3, true, "NumberButton");
        callmenu.setItem(29, addNumber3);

        String link4 = "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZDJlNzhmYjIyNDI0MjMyZGMyN2I4MWZiY2I0N2ZkMjRjMWFjZjc2MDk4NzUzZjJkOWMyODU5ODI4N2RiNSJ9fX0=";
        ItemStack block4 = SkullCreator.itemFromBase64(link4);
        ItemMeta meta4 = block4.getItemMeta();
        meta4.setDisplayName("4");
        block4.setItemMeta(meta4);
        ItemStack addNumber4 = NBTEditor.set(block4, true, "NumberButton");
        callmenu.setItem(30, addNumber4);

        String link5 = "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNmQ1N2UzYmM4OGE2NTczMGUzMWExNGUzZjQxZTAzOGE1ZWNmMDg5MWE2YzI0MzY0M2I4ZTU0NzZhZTIifX19";
        ItemStack block5 = SkullCreator.itemFromBase64(link5);
        ItemMeta meta5 = block5.getItemMeta();
        meta5.setDisplayName("5");
        block5.setItemMeta(meta5);
        ItemStack addNumber5 = NBTEditor.set(block5, true, "NumberButton");
        callmenu.setItem(31, addNumber5);

        String link6 = "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMzM0YjM2ZGU3ZDY3OWI4YmJjNzI1NDk5YWRhZWYyNGRjNTE4ZjVhZTIzZTcxNjk4MWUxZGNjNmIyNzIwYWIifX19";
        ItemStack block6 = SkullCreator.itemFromBase64(link6);
        ItemMeta meta6 = block6.getItemMeta();
        meta6.setDisplayName("6");
        block6.setItemMeta(meta6);
        ItemStack addNumber6 = NBTEditor.set(block6, true, "NumberButton");
        callmenu.setItem(32, addNumber6);

        String link7 = "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNmRiNmViMjVkMWZhYWJlMzBjZjQ0NGRjNjMzYjU4MzI0NzVlMzgwOTZiN2UyNDAyYTNlYzQ3NmRkN2I5In19fQ==";
        ItemStack block7 = SkullCreator.itemFromBase64(link7);
        ItemMeta meta7 = block7.getItemMeta();
        meta7.setDisplayName("7");
        block7.setItemMeta(meta7);
        ItemStack addNumber7 = NBTEditor.set(block7, true, "NumberButton");
        callmenu.setItem(33, addNumber7);

        String link8 = "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNTkxOTQ5NzNhM2YxN2JkYTk5NzhlZDYyNzMzODM5OTcyMjI3NzRiNDU0Mzg2YzgzMTljMDRmMWY0Zjc0YzJiNSJ9fX0=";
        ItemStack block8 = SkullCreator.itemFromBase64(link8);
        ItemMeta meta8 = block8.getItemMeta();
        meta8.setDisplayName("8");
        block8.setItemMeta(meta8);
        ItemStack addNumber8 = NBTEditor.set(block8, true, "NumberButton");
        callmenu.setItem(34, addNumber8);

        String link9 = "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZTY3Y2FmNzU5MWIzOGUxMjVhODAxN2Q1OGNmYzY0MzNiZmFmODRjZDQ5OWQ3OTRmNDFkMTBiZmYyZTViODQwIn19fQ==";
        ItemStack block9 = SkullCreator.itemFromBase64(link9);
        ItemMeta meta9 = block9.getItemMeta();
        meta9.setDisplayName("9");
        block9.setItemMeta(meta9);
        ItemStack addNumber9 = NBTEditor.set(block9, true, "NumberButton");
        callmenu.setItem(35, addNumber9);

        String link0 = "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMGViZTdlNTIxNTE2OWE2OTlhY2M2Y2VmYTdiNzNmZGIxMDhkYjg3YmI2ZGFlMjg0OWZiZTI0NzE0YjI3In19fQ==";
        ItemStack block0 = SkullCreator.itemFromBase64(link0);
        ItemMeta meta0 = block0.getItemMeta();
        meta0.setDisplayName("0");
        block0.setItemMeta(meta0);
        ItemStack addNumber0 = NBTEditor.set(block0, true, "NumberButton");
        callmenu.setItem(36, addNumber0);

        String backspaceLink = "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZjg0ZjU5NzEzMWJiZTI1ZGMwNThhZjg4OGNiMjk4MzFmNzk1OTliYzY3Yzk1YzgwMjkyNWNlNGFmYmEzMzJmYyJ9fX0=";
        ItemStack backspace = SkullCreator.itemFromBase64(backspaceLink);
        ItemMeta backspaceskull = backspace.getItemMeta();
        backspaceskull.setDisplayName("Backspace");
        backspace.setItemMeta(backspaceskull);
        ItemStack backspacebutton = NBTEditor.set(backspace, true, "Backspace");
        callmenu.setItem(37, backspacebutton);

        String callLink = "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNDMxMmNhNDYzMmRlZjVmZmFmMmViMGQ5ZDdjYzdiNTVhNTBjNGUzOTIwZDkwMzcyYWFiMTQwNzgxZjVkZmJjNCJ9fX0=";
        ItemStack callskull = SkullCreator.itemFromBase64(callLink);
        ItemMeta callmeta = callskull.getItemMeta();
        callmeta.setDisplayName("Bellen");
        callskull.setItemMeta(callmeta);
        ItemStack callButton = NBTEditor.set(callskull, true, "callButton");
        callmenu.setItem(40, callButton);

        ItemStack mainMenu = new ItemStack(Material.BARRIER);
        ItemMeta mainMeta = mainMenu.getItemMeta();
        mainMeta.setDisplayName(ChatColor.RED + "Home screen");
        mainMenu.setItemMeta(mainMeta);
        ItemStack homeButton = NBTEditor.set(mainMenu, "mainmenu", "direct");
        callmenu.setItem(44, homeButton);

        String contactskull = "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNmViYmJkYmEzNzI5NjNjOWQ2ZDMzMjhjMjliZjEyM2FlMDlkMzBjZTdiYTNhMDU3Y2VkNjA2YzFjODAyOGI3YiJ9fX0=";
        ItemStack blockitem = SkullCreator.itemFromBase64(contactskull);
        ItemMeta contactmeta = blockitem.getItemMeta();
        contactmeta.setDisplayName("4");
        blockitem.setItemMeta(contactmeta);
        ItemStack contactitem = NBTEditor.set(blockitem, true, "contactButton");
        callmenu.setItem(41, contactitem);



        player.openInventory(callmenu);
    }


}
