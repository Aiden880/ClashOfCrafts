package net.Aiden880.ClashOfCrafts.Commands;

import net.Aiden880.ClashOfCrafts.Utils;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class CocCommand implements CommandExecutor {

	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if(cmd.getName().equalsIgnoreCase("coc") && args.length == 0) {
			sender.sendMessage(Utils.MsgHeader + "Clash Of Crafts Version 1");
			sender.sendMessage(Utils.MsgHeader + "Stuck? Use /coc help.");
			if(sender.hasPermission("coc.admin")) {
				sender.sendMessage(Utils.MsgHeader + "Admin page - /coc admin");
			}
			return true;
		} else {
			if(args[0].equalsIgnoreCase("help")) {
				
			}
		}
		return false;
	}
}
