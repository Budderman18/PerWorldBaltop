/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.budderman18.perworldbaltop;

import java.util.ArrayList;
import java.util.List;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.TabExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
/*
* This class defines all the commands
* Baltop has to be in a different class
*/

public class Commands implements TabExecutor {
    final String prefix = ChatColor.DARK_GREEN + "[" + ChatColor.BLUE + "PerWorldBaltop" + ChatColor.DARK_GREEN + "] ";
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
         //create a new string list for tab completion
        List<String> autoCompletes;
        autoCompletes = new ArrayList<>();
        //prefix to all commands
        if (cmd.getName().equalsIgnoreCase("pwbt")) {
            if (args.length == 0) {
                sender.sendMessage(prefix + ChatColor.AQUA + "Incorrect command");
                return false;
            }
            if (args[0].equalsIgnoreCase("help")) {
                sender.sendMessage(prefix + ChatColor.AQUA + "/pwbt help - Shows this message list");
                sender.sendMessage(prefix + ChatColor.AQUA + "/pwbt reload - Reloads the plugin");
                sender.sendMessage(prefix + ChatColor.AQUA + "/pwbt addWorld - Adds a world to a world group");
                sender.sendMessage(prefix + ChatColor.AQUA + "/pwbt removeWorld - Removes a world from a world group");
                sender.sendMessage(prefix + ChatColor.AQUA + "/pwbt addGroup - Adds a world group");
                sender.sendMessage(prefix + ChatColor.AQUA + "/pwbt removeGroup - Removes a world group");
                sender.sendMessage(prefix + ChatColor.AQUA + "/pwbt listGroups - Lists all loaded groups and the worlds within them.");
                sender.sendMessage(prefix + ChatColor.AQUA + "/baltop - Shows the top balances in your world/ world group");
                return true;
            }
            //reload command
            if (args[0].equalsIgnoreCase("reload")) {
                if (sender.hasPermission("pwbt.reload")) {
                    sender.sendMessage(prefix + ChatColor.AQUA + "PerWorldBaltop Reloaded!");
                    return true;
                }
                else {
                    sender.sendMessage(prefix + ChatColor.AQUA + "You do not have permission to use that!");
                    return false;
                }
            }
            //addGroup command
            if (args[0].equalsIgnoreCase("addGroup")) {
                if (sender.hasPermission("pwbt.addGroup")) {
                    sender.sendMessage(prefix + ChatColor.RED + "COMING SOON...");
                    return true;
                }
                else {
                    sender.sendMessage(prefix + ChatColor.AQUA + "You do not have permission to use that!");
                    return false;
                }
            }
            //removeGroup command
            if (args[0].equalsIgnoreCase("removeGroup")) {
                if (sender.hasPermission("pwbt.removeGroup")) {
                    sender.sendMessage(prefix + ChatColor.RED + "COMING SOON...");
                    return true;
                }
                else {
                    sender.sendMessage(prefix + ChatColor.AQUA + "You do not have permission to use that!");
                    return false;
                }
            }
            //addWorld command
            if (args[0].equalsIgnoreCase("addWorld")) {
                if (sender.hasPermission("pwbt.addWorld")) {
                    sender.sendMessage(prefix + ChatColor.RED + "COMING SOON...");
                    return true;
                }
                else {
                    sender.sendMessage(prefix + ChatColor.AQUA + "You do not have permission to use that!");
                    return false;
                }
            }
            //removeWorld command
            if (args[0].equalsIgnoreCase("removeWorld")) {
                if (sender.hasPermission("pwbt.removeWorld")) {
                    sender.sendMessage(prefix + ChatColor.RED + "COMING SOON...");
                    return true;
                }
                else {
                    sender.sendMessage(prefix + ChatColor.AQUA + "You do not have permission to use that!");
                    return false;
                }
            }
            //listGroups command
            if (args[0].equalsIgnoreCase("listGroups")) {
                if (sender.hasPermission("pwbt.listGroups")) {
                    sender.sendMessage(prefix + ChatColor.RED + "COMING SOON...");
                    return true;
                }
                else {
                    sender.sendMessage(prefix + ChatColor.AQUA + "You do not have permission to use that!");
                    return false;
                }
            }
            else {
                sender.sendMessage(prefix + ChatColor.AQUA + "Incorrect command");
                return false;
            }
        }
        return false;
    }
    /*
    * This deals with Tab-Completion
    */
    @Override
    public List<String> onTabComplete(CommandSender sender, Command command, String alias, String[] args) {
        if (args.length == 1) {
            List<String> arguments = new ArrayList<>();
            arguments.add("help");
            arguments.add("reload");
            arguments.add("addWorld");
            arguments.add("removeWorld");
            arguments.add("addGroup");
            arguments.add("removeGroup");
            arguments.add("listGroups");
            return arguments;
        }
        return null;
    }
}
