package net.Aiden880.ClashOfCrafts.Listeners;

import java.io.File;
import java.io.IOException;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class NewUserListener implements Listener {
	@EventHandler
	public void onNewUserJoin(PlayerJoinEvent e) {
		Bukkit.broadcastMessage("Working so far.");
		File plugindir = new File("plugins/ClashOfCrafts");
		if(!plugindir.exists()) {
			plugindir.mkdir();
		}
		File usersdir = new File("plugins/ClashOfCrafts/users");
		if(!usersdir.exists()) {
			usersdir.mkdir();
		}
		File userfile = new File("plugins/ClashOfCrafts/users/" + e.getPlayer().getName() + ".yml");
		if(!userfile.exists()) {
			try {
				userfile.createNewFile();
				Bukkit.broadcastMessage(ChatColor.AQUA + e.getPlayer().getName() + " is new! Welcome to Clash Of Crafts!");
				Location location = e.getPlayer().getLocation().subtract(15, 0, 15);
					while(!location.getBlock().getType().equals(Material.AIR)) {
						location.add(0, 0, 1);
					}
					int addz1;
					for(addz1 = 0; addz1 < 31; addz1++) {
						location.getBlock().setType(Material.LEAVES);
						Bukkit.broadcastMessage("Working addz1");
						location.add(0, 0, 1);
					}
					int addx1;
					for(addx1 = 0; addx1 < 31; addx1++) {
						location.getBlock().setType(Material.LEAVES);
						location.add(1, 0, 0);
					}
					int addz2;
					for(addz2 = 0; addz2 < 31; addz2++) {
						location.getBlock().setType(Material.LEAVES);
						Bukkit.broadcastMessage("Working addz1");
						location.subtract(0, 0, 1);
					}
					int addx2;
					for(addx2 = 0; addx2 < 31; addx2++) {
						location.getBlock().setType(Material.LEAVES);
						location.subtract(1, 0, 0);
					}
					location.add(0, 1, 0);
					int addz3;
					for(addz3 = 0; addz3 < 31; addz3++) {
						location.getBlock().setType(Material.LEAVES);
						Bukkit.broadcastMessage("Working addz1");
						location.add(0, 0, 1);
					}
					int addx3;
					for(addx3 = 0; addx3 < 31; addx3++) {
						location.getBlock().setType(Material.LEAVES);
						location.add(1, 0, 0);
					}
					int addz4;
					for(addz4 = 0; addz4 < 31; addz4++) {
						location.getBlock().setType(Material.LEAVES);
						Bukkit.broadcastMessage("Working addz1");
						location.subtract(0, 0, 1);
					}
					int addx4;
					for(addx4 = 0; addx4 < 31; addx4++) {
						location.getBlock().setType(Material.LEAVES);
						location.subtract(1, 0, 0);
					}
					location.add(0, 1, 0);
					int addz5;
					for(addz5 = 0; addz5 < 31; addz5++) {
						location.getBlock().setType(Material.LEAVES);
						Bukkit.broadcastMessage("Working addz1");
						location.add(0, 0, 1);
					}
					int addx5;
					for(addx5 = 0; addx5 < 31; addx5++) {
						location.getBlock().setType(Material.LEAVES);
						location.add(1, 0, 0);
					}
					int addz6;
					for(addz6 = 0; addz6 < 31; addz6++) {
						location.getBlock().setType(Material.LEAVES);
						Bukkit.broadcastMessage("Working addz1");
						location.subtract(0, 0, 1);
					}
					int addx6;
					for(addx6 = 0; addx6 < 31; addx6++) {
						location.getBlock().setType(Material.LEAVES);
						location.subtract(1, 0, 0);
					}
					location.add(0, 1, 0);
					int addz7;
					for(addz7 = 0; addz7 < 31; addz7++) {
						location.getBlock().setType(Material.LEAVES);
						Bukkit.broadcastMessage("Working addz1");
						location.add(0, 0, 1);
					}
					int addx7;
					for(addx7 = 0; addx7 < 31; addx7++) {
						location.getBlock().setType(Material.LEAVES);
						location.add(1, 0, 0);
					}
					int addz8;
					for(addz8 = 0; addz8 < 31; addz8++) {
						location.getBlock().setType(Material.LEAVES);
						Bukkit.broadcastMessage("Working addz1");
						location.subtract(0, 0, 1);
					}
					int addx8;
					for(addx8 = 0; addx8 < 31; addx8++) {
						location.getBlock().setType(Material.LEAVES);
						location.subtract(1, 0, 0);
					}
				
			} catch (IOException IOException) {
				IOException.printStackTrace();
			}
		}
	}
}
