package me.jacklin213.linfarm;

import java.util.logging.Logger;

import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class LinFarm extends JavaPlugin {
	
	PluginDescriptionFile pdfFile;
	private static final Logger log = Logger.getLogger("Minecraft");
	public LinFarm plugin;
	public LinFarmListener lfl = new LinFarmListener(this);
	

	public void onDisable() {
		log.info(String.format("[%s] Disabled Version %s", getDescription()
				.getName(), getDescription().getVersion()));
	}

	public void onEnable() {
		PluginManager pm = getServer().getPluginManager();
		log.info(String.format("[%s] Enabled Version %s by jacklin213", getDescription()
				.getName(), getDescription().getVersion()));
		pm.registerEvents(this.lfl,this);
	}
	
	

}
