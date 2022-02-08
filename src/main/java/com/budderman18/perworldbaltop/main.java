package com.budderman18.perworldbaltop;

import java.util.*;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.permissions.Permission;
import org.bukkit.permissions.PermissionDefault;
/*
 * This clas file is used for enabling, command parsing,
 * reloading and disabling the plugin.
 */
public class main extends JavaPlugin {
    /*
    * Enables the plugin.
    * Check if MC version isn't the latest.
    * If its not, warn the player about lacking support
    */
    @Override
    public void onEnable() {
        if (!(Bukkit.getVersion().contains("1.18.1"))) {
            getLogger().warning("PerWorldBaltop does not support your version!");
            getLogger().warning("Only 1.18.1 is supported");
            getLogger().warning("This plugin will likely not work and you will get no help for issues");
            return;   
        }
        getServer().getPluginManager().enablePlugin(this);
    }
    /*
    * Disables the plugin.
    */
    @Override
    public void onDisable() {
        getServer().getPluginManager().disablePlugin(this);
        getLogger().info("PerWorldBaltop has been disabled!");
    }
}
    
    
