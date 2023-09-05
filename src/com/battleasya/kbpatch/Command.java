package com.battleasya.kbpatch;

import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class Command implements CommandExecutor {

    private final KBPatch plugin;

    public Command(KBPatch plugin) {
        this.plugin = plugin;
    }

    @Override
    public boolean onCommand(CommandSender sender, org.bukkit.command.Command cmd, String s, String[] args) {

        if (args.length == 0) {
            Util.sendMsg(sender, "&3[&bKBPatch&3] &7(&fv1.0.0&7) Patched by &fDennie&7.");
            return true;
        }

        if (args.length == 1) {
            if (args[0].equalsIgnoreCase("reload")) {
                if (sender.hasPermission("kbpatch.reload")) {
                    plugin.reloadConfig();
                    plugin.getConfiguration().fetchConfig();
                    Util.sendMsg(sender, Config.reload_config);
                } else {
                    Util.sendMsg(sender, Config.no_permission);
                }
                return true;
            }
        }

        Util.sendMsg(sender, Config.incorrect_syntax);
        return true;

    }

}