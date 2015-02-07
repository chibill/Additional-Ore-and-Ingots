package chibill.additionaloreingots.client.config;

import java.util.List;

import chibill.additionaloreingots.common.Main;
import net.minecraft.client.gui.GuiScreen;
import net.minecraftforge.common.config.ConfigElement;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.client.config.GuiConfig;

public class Config extends GuiConfig {

	 public Config(GuiScreen parent) {
	        super(parent,
	                new ConfigElement(Main.configFile.getCategory(Configuration.CATEGORY_GENERAL)).getChildElements(),
	                Main.MODID, true,false, GuiConfig.getAbridgedConfigPath(Main.configFile.toString()));
	    }

}
