package net.Aiden880.ClashOfCrafts;

import net.Aiden880.ClashOfCrafts.Commands.CocCommand;
import net.Aiden880.ClashOfCrafts.Commands.UserCommand;
import net.Aiden880.ClashOfCrafts.Listeners.DecayListener;
import net.Aiden880.ClashOfCrafts.Listeners.NewUserListener;

import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
	public void onEnable() {
		getCommand("coc").setExecutor( new CocCommand() );
		getCommand("user").setExecutor( new UserCommand() );
		getServer().getPluginManager().registerEvents(new DecayListener(), this);	
        	getServer().getPluginManager().registerEvents(new NewUserListener(), this);		
	}
	public void onDisable() {
		
	}

}
