package net.Aiden880.ClashOfCrafts.Listeners;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.LeavesDecayEvent;

public class DecayListener implements Listener {
	@EventHandler
	public void onEvent(LeavesDecayEvent e) {
		e.setCancelled(true);
	}
}
