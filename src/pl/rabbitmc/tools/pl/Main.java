package pl.rabbitmc.tools.pl;

import org.bukkit.command.Command;
import org.bukkit.entity.Player;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.java.JavaPlugin;

public class Main{
	
	public void onEnable(){ 
	    System.out.PrintIn("RabbitMC.pl > Uruchamianie!");
	}

	public void onDisable() {
		System.out.PrintIn("RabbitMC.pl > Wylaczanie"); 
	}

	public boolean onCommand(CommandSender sender, Command cmd, String label , String[] args){ 
		if(cmd.getName().equalsIgnoreCase("ranga"))
			if(Sender instanceof Player){
				Player p = (Player) sender;
				p.sendMessage("Twoja ranga to:");{
		}
	}
}

			
		

