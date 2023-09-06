package com.battleasya.kbpatch;

import org.bukkit.Material;
import org.bukkit.entity.*;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.InventoryType;
import org.bukkit.event.player.PlayerCommandPreprocessEvent;
import org.bukkit.event.player.PlayerTeleportEvent;
import org.bukkit.inventory.Inventory;

public class Patch implements Listener {

    // smuggling patch
    @EventHandler
    public void onTeleport(PlayerTeleportEvent e) {

        if (!Config.smuggling_patch_enable) {
            return;
        }

        Player p = e.getPlayer();

        if (p == null) {
            return;
        }

        if (!Config.worldList.contains(p.getWorld().getName())) {
            return;
        }

        if (p.hasPermission("kbpatch.bypass")) {
            return;
        }

        if (p.getOpenInventory().getType() == InventoryType.CRAFTING){
            p.getOpenInventory().getTopInventory().clear();
        }

        p.setItemOnCursor(null);
        p.updateInventory();

    }

    // iron fist patch
    @EventHandler
    public void onClick(InventoryClickEvent e) {

        if (!Config.iron_fist_patch_enable) {
            return;
        }

        Player p = (Player) e.getWhoClicked();

        if (p == null) {
            return;
        }

        if (!Config.worldList.contains(p.getWorld().getName())) {
            return;
        }

        if (p.hasPermission("kbpatch.bypass")) {
            return;
        }

        Material kitSelector = Material.getMaterial(Config.iron_fist_patch_kit_selector);

        if (kitSelector == null) {
            return;
        }

        Inventory inv = e.getClickedInventory();

        if (inv == null) {
            return;
        }

        if (inv.contains(kitSelector)) {
            e.setCancelled(true);
        }

    }

    // block kb selectkit
    @EventHandler
    public void onSelectKit(PlayerCommandPreprocessEvent e) {

        if (!Config.block_kb_selectkit_enable) {
            return;
        }

        Player p = e.getPlayer();

        if (p == null) {
            return;
        }

        if (!Config.worldList.contains(p.getWorld().getName())) {
            return;
        }

        if (p.hasPermission("kbpatch.bypass")) {
            return;
        }

        String command = e.getMessage().toLowerCase();

        if (command.startsWith("/kb selectkit") || command.startsWith("/kitbattle selectkit")
        || command.startsWith("/kitbattle:")){
            e.setCancelled(true);
            Util.sendMsg(p, Config.block_kb_selectkit_message);
        }

    }

}
