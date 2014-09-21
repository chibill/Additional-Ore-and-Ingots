package chibill.additionaloreingots.common;

import net.minecraft.block.Block;
import net.minecraft.client.resources.I18n;
import net.minecraft.item.Item;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.common.util.EnumHelper;
import chibill.additionaloreingots.common.compatibility.OreDictionaryRegistry;
import chibill.additionaloreingots.common.constructors.Dust;
import chibill.additionaloreingots.common.constructors.Ingot;
import chibill.additionaloreingots.common.constructors.IngotCompressed;
import chibill.additionaloreingots.common.constructors.Ore;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;


@Mod(modid=Main.MODID, name="Additional Ore & Ingots", version="1.0.0",guiFactory = "chibill.additionaloreingots.client.GUIFactory")
public class Main {

	public static Configuration configFile;
	public static Boolean DisableOreGen = false;
	public static int OreDenistyMod = 1;
	public static final String MODID = "additionaloreingots";
	public static String[] IngotsDustsBlocksNames = new String[] {"Steel","Copper","Tin","Lead","Chrome","Silver","Brass","Bronze","Stainless_Steel","Zinc","Aluminum"};
	public static String[] OresNames = new String[] {"Copper","Tin","Lead","Chrome","Silver","Zinc","Aluminum"};
	public static Item[] Ingots = new Item[IngotsDustsBlocksNames.length] ;
	public static Item[] Dusts = new Item[IngotsDustsBlocksNames.length] ;
	public static Block Compressed[] = new Block[IngotsDustsBlocksNames.length];
	public static Block Ores[] = new Block[OresNames.length];

	@Instance(value = "additionaloreingots")
	public static Main instance;

	@SidedProxy(clientSide="chibill.additionaloreingots.client.ClientProxy", serverSide="chibill.additionaloreingots.common.CommonProxy")
	public static CommonProxy proxy;

	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		for(int temp = 0;temp < IngotsDustsBlocksNames.length;++temp){
			
			Ingots[temp] = new Ingot(temp);
			Compressed[temp] = new IngotCompressed(temp);
			GameRegistry.registerItem(Ingots[temp],Ingots[temp].getUnlocalizedName());
			GameRegistry.registerBlock(Compressed[temp],Compressed[temp].getUnlocalizedName());
		
		}for(int temp = 0;temp < IngotsDustsBlocksNames.length;++temp){
			
			Dusts[temp] = new Dust(temp);
			GameRegistry.registerItem(Dusts[temp],Dusts[temp].getUnlocalizedName());
			
		
		}
		for(int temp = 0;temp < OresNames.length;++temp){
			
			Ores[temp] = new Ore(temp);
			GameRegistry.registerBlock(Ores[temp],Ores[temp].getUnlocalizedName());
			
			
		}
		FMLCommonHandler.instance().bus().register(Events.class);
		 configFile = new Configuration(event.getSuggestedConfigurationFile());
		 syncConfig();
		 OreDictionaryRegistry.Register();
	}

	public static void syncConfig() {
		 OreDenistyMod = configFile.getInt( I18n.format("additional.OreDenistyMod"), Configuration.CATEGORY_GENERAL, 1, 1, Integer.MAX_VALUE,I18n.format("additional.OreDenistyMod"));
	        DisableOreGen = configFile.getBoolean(I18n.format("additional.DisableOreGen"), Configuration.CATEGORY_GENERAL, false, I18n.format("additional.DisableOreGen"));
	 
	        if(configFile.hasChanged())
	            configFile.save();
	}

	@EventHandler 
	public void load(FMLInitializationEvent event) {
		GameRegistry.registerWorldGenerator(new OreGen(), 256);
		proxy.registerRenderers();
	}

	@EventHandler 
	public void postInit(FMLPostInitializationEvent event) {


	}
}