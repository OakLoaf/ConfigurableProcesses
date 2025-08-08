package org.lushplugins.configurableprocesses;

import org.bukkit.plugin.java.JavaPlugin;

public final class ConfigurableProcesses extends JavaPlugin {
    private static ConfigurableProcesses plugin;

    @Override
    public void onLoad() {
        plugin = this;
    }

    @Override
    public void onEnable() {
        // Enable implementation
    }

    @Override
    public void onDisable() {
        // Disable implementation
    }

    public static ConfigurableProcesses getInstance() {
        return plugin;
    }
}
