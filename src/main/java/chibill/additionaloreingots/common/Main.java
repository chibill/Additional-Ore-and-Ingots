package chibill.additionaloreingots.common;

import net.minecraft.block.Block;
import net.minecraft.client.resources.I18n;
import net.minecraft.item.Item;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import chibill.additionaloreingots.common.compatibility.OreDictionaryRegistry;
import chibill.additionaloreingots.common.worldgen.OreGen;

@Mod(modid=Main.MODID, name="Additional Ore & Ingots", version="1.0.0",guiFactory = "chibill.additionaloreingots.client.GUIFactory")
public class Main {

	public static Configuration configFile;
	public static Boolean DisableOreGen = false;
	public static int OreDenistyMod = 1;
	public static final String MODID = "additionaloreingots";
	
	/*public static String[] IngotsDustsBlocksNames = new String[] {"Steel","Copper","Tin","Lead","Chrome","Silver","Brass","Bronze","Stainless_Steel","Zinc","Aluminum"};
	public static String[] OresNames = new String[] {"Copper","Tin","Lead","Chrome","Silver","Zinc","Aluminum"};
	public static Item[] Ingots = new Item[IngotsDustsBlocksNames.length] ;
	public static Item[] Dusts = new Item[IngotsDustsBlocksNames.length] ;
	public static Block Compressed[] = new Block[IngotsDustsBlocksNames.length];
	public static Block Ores[] = new Block[OresNames.length];
*/
	@Instance(value = "additionaloreingots")
	public static Main instance;

	@SidedProxy(clientSide="chibill.additionaloreingots.client.ClientProxy", serverSide="chibill.additionaloreingots.common.CommonProxy")
	public static CommonProxy proxy;

	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
	
		Reg.Preint(event);
		
		FMLCommonHandler.instance().bus().register(Events.class);
		 configFile = new Configuration(event.getSuggestedConfigurationFile());
		 syncConfig();
	//	 OreDictionaryRegistry.RegisterMetals();
	
	
		
		
	}

	public static void syncConfig() {
		 OreDenistyMod = configFile.getInt( I18n.format("additional.OreDenistyMod"), Configuration.CATEGORY_GENERAL, 1, 1, Integer.MAX_VALUE,I18n.format("additional.OreDenistyMod"));
	        DisableOreGen = configFile.getBoolean(I18n.format("additional.DisableOreGen"), Configuration.CATEGORY_GENERAL, false, I18n.format("additional.DisableOreGen"));
	 
	        if(configFile.hasChanged())
	            configFile.save();
	}

	@EventHandler 
	public void load(FMLInitializationEvent event) {
		Reg.Init(event);
		GameRegistry.registerWorldGenerator(new OreGen(), 256);
		proxy.registerRenderers();
	}

	@EventHandler 
	public void postInit(FMLPostInitializationEvent event) {


	}
}