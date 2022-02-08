/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.budderman18.perworldbaltop;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class BaltopCMD implements CommandExecutor {
    final String prefix = ChatColor.DARK_GREEN + "[" + ChatColor.BLUE + "PerWorldBaltop" + ChatColor.DARK_GREEN + "] ";
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (cmd.getName().equalsIgnoreCase("baltop")) {
            if (args.length >= 0) {
                sender.sendMessage(prefix + ChatColor.RED + "COMING SOON...");
                return true;
            }
        }
        return true;
    }
}
