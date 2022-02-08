package com.budderman18.perworldbaltop;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;
/*
 * This clas file is used for enabling, command parsing,
 * reloading and disabling the plugin.
 */
public class main extends JavaPlugin {
    final String prefix = ChatColor.DARK_GREEN + "[" + ChatColor.BLUE + "PerWorldBaltop" + ChatColor.DARK_GREEN + "] ";
    /*
    * Enables the plugin.
    * Check if MC version isn't the latest.
    * If its not, warn the player about lacking support
    * Also checks for dependencies
    */
    @Override
    public void onEnable() {
        //version checker
        if (!(Bukkit.getVersion().contains("1.18.1"))) {
            getServer().getConsoleSender().sendMessage(prefix + ChatColor.DARK_RED + "PerWorldBaltop does not support your version!");
            getServer().getConsoleSender().sendMessage(prefix + ChatColor.GREEN +"Only 1.18.1 is supported");
            getServer().getConsoleSender().sendMessage(prefix + ChatColor.GREEN +"This plugin will likely not work and you will get no help for issues");
            return;   
        }
        //multiverse checker
        if (Bukkit.getPluginManager().getPlugin("Multiverse-Core") == null) {
            getServer().getConsoleSender().sendMessage(prefix + ChatColor.DARK_RED + "Could not find Multiverse! You may lack features!");
          }
        else {
            getServer().getConsoleSender().sendMessage(prefix + ChatColor.AQUA + "Multiverse Found!");
        }
        //essentials checker
        if (Bukkit.getPluginManager().getPlugin("Essentials") == null) {
            getServer().getConsoleSender().sendMessage(prefix + ChatColor.DARK_RED + "Could not find Essentials! You may lack features!");
          }
        else {
            getServer().getConsoleSender().sendMessage(prefix + ChatColor.AQUA +"EssentialsX Found!");
        }
        //multiworldmoney checker
        if (Bukkit.getPluginManager().getPlugin("MultiWorldMoney") == null) {
            getServer().getConsoleSender().sendMessage(prefix + ChatColor.DARK_RED + "Could not find MultiWorldMoney! You may lack features!");
          }
        else {
            getServer().getConsoleSender().sendMessage(prefix + ChatColor.AQUA + "MultiWorldMoney Found!");
        }
        //commands
        this.getCommand("pwbt").setExecutor(new Commands());
        this.getCommand("baltop").setExecutor(new BaltopCMD());
        getServer().getPluginManager().enablePlugin(this);
        getServer().getConsoleSender().sendMessage(prefix + ChatColor.YELLOW + "PerWorldBaltop by Budderman18 has been enabled!");
    }
    /*
    * Disables the plugin.
    */
    @Override
    public void onDisable() {
        getServer().getPluginManager().disablePlugin(this);
        getServer().getConsoleSender().sendMessage(prefix + ChatColor.YELLOW + "PerWorldBaltop has been disabled!");
    }
}
    
    
