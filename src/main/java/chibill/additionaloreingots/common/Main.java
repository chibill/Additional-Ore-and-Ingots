package chibill.additionaloreingots.common;

import net.minecraft.item.Item;
import net.minecraft.util.EnumChatFormatting;
import net.minecraftforge.common.util.EnumHelper;
import chibill.additionaloreingots.common.constructors.Ingot;
import chibill.additionaloreingots.common.CommonProxy;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;


@Mod(modid=Main.MODID, name="Additional Ore & Ingots", version="1.0.0")
public class Main {

	public static final String MODID = "additionaloreingots";
	public static Item Ingot = new Ingot();
	

	@Instance(value = "additionaloreingots")
	public static Main instance;

	@SidedProxy(clientSide="chibill.additionaloreingots.client.ClientProxy", serverSide="chibill.additionaloreingots.common.CommonProxy")
	public static CommonProxy proxy;

	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		
		GameRegistry.registerItem(Ingot, Ingot.getUnlocalizedName());

	}

	@EventHandler 
	public void load(FMLInitializationEvent event) {

		proxy.registerRenderers();

	}

	@EventHandler 
	public void postInit(FMLPostInitializationEvent event) {



	}
}