package com.battleasya.kbpatch;

import org.bukkit.configuration.file.FileConfiguration;

import java.util.HashSet;

public class Config {

    private final KBPatch plugin;

    public Config(KBPatch plugin) {
        this.plugin = plugin;
    }

    public static HashSet<String> worldList = new HashSet<>();

    public static boolean block_kb_selectkit_enable;
    public static String block_kb_selectkit_message;

    public static boolean iron_fist_patch_enable;
    public static String iron_fist_patch_kit_selector;

    public static boolean kit_lock_patch_enable;

    public static String incorrect_syntax;
    public static String no_permission;
    public static String reload_config;

    public void fetchConfig() {

        FileConfiguration config = plugin.getConfig();

        worldList.clear();
        worldList.addAll(config.getStringList("world"));

        block_kb_selectkit_enable = config.getBoolean("block-kb-selectkit.enable");
        block_kb_selectkit_message = config.getString("block-kb-selectkit.message");

        iron_fist_patch_enable = config.getBoolean("iron-fist-patch.enable");
        iron_fist_patch_kit_selector = config.getString("iron-fist-patch.kit-selector");

        kit_lock_patch_enable = config.getBoolean("kit-lock-patch.enable");

        incorrect_syntax = config.getString("incorrect-syntax");
        no_permission = config.getString("no-permission");
        reload_config = config.getString("reload-config");

    }

}
