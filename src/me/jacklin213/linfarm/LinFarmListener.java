package me.jacklin213.linfarm;

import org.bukkit.Material;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;

public class LinFarmListener implements Listener {
	LinFarm plugin;
	
	public LinFarmListener(LinFarm instance){
		plugin = instance;
	}
	
	public void onSoilInteract(PlayerInteractEvent event){
		if(event.getAction() == Action.PHYSICAL && event.getClickedBlock().getType() == Material.SOIL)
			event.setCancelled(true);
	}

}
