package net.Aiden880.ClashOfCrafts.Commands;

import net.Aiden880.ClashOfCrafts.Utils;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class UserCommand implements CommandExecutor {
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if(cmd.getName().equalsIgnoreCase("user")) { 
			sender.sendMessage(Utils.MsgHeader + "Clash Of Crafts User Commands");
			sender.sendMessage(Utils.MsgHeader + "Stuck? Use /user help");
		}
		return true;
	}
	
}
