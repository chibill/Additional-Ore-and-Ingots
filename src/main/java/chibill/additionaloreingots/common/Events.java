package chibill.additionaloreingots.common;

import cpw.mods.fml.client.event.ConfigChangedEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;

public class Events {
	
	   @SubscribeEvent
	    public void onConfigChanged(ConfigChangedEvent.OnConfigChangedEvent eventArgs) {
	        if(eventArgs.modID.equals(Main.MODID))
	            Main.syncConfig();
	    }
}
