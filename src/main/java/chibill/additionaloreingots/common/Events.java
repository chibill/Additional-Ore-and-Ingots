package chibill.additionaloreingots.common;

import net.minecraftforge.fml.client.event.ConfigChangedEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;


public class Events {
	
	   @SubscribeEvent
	    public void onConfigChanged(ConfigChangedEvent.OnConfigChangedEvent eventArgs) {
	        if(eventArgs.modID.equals(Main.MODID))
	            Main.syncConfig();
	    }
}
