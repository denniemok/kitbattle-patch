package com.battleasya.kbpatch;

import org.bukkit.plugin.java.JavaPlugin;

public class KBPatch extends JavaPlugin {

    public Config config;

    @Override
    public void onEnable() {

        saveDefaultConfig();

        config = new Config(this);

        getConfiguration().fetchConfig();

        getCommand("kbpatch").setExecutor(new Command(this));

        getServer().getPluginManager().registerEvents(new Patch(), this);

    }

    public Config getConfiguration() {
        return config;
    }

}
