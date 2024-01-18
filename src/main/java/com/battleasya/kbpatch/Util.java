package com.battleasya.kbpatch;

import org.bukkit.ChatColor;
import org.bukkit.command.CommandSender;

public class Util {

    public static void sendMsg(CommandSender sender, String message) {
        sender.sendMessage(ChatColor.translateAlternateColorCodes('&', message));
    }

}
