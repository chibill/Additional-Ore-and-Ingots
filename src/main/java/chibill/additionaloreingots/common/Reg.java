package chibill.additionaloreingots.common;

import chibill.additionaloreingots.common.blocks.BasicBlock;
import chibill.additionaloreingots.common.items.BasicItem;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.entity.RenderItem;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.relauncher.Side;

public class Reg {
	private static RenderItem renderItem;
// All Ores
	private static Block TinOre;
	private static Block LeadOre;
	private static Block CopperOre;
	private static Block ChromeOre;
	private static Block SilverOre;
	private static Block ZincOre;
	private static Block AluminumOre;
// All Compressed stuff.
	private static Block Brass;
	private static Block Bronze;
	private static Block Stainless_Steel;
	private static Block Tin;
	private static Block Aluminum;
	private static Block Zinc;
	private static Block Silver;
	private static Block Lead;
	private static Block Chrome;
	private static Block Copper;
	private static Block Steel;

//All Nuggets
	private static Item BrassIngot;
	private static Item BronzeIngot;
	private static Item Stainless_SteelIngot;
	private static Item TinIngot;
	private static Item AluminumIngot;
	private static Item ZincIngot;
	private static Item SilverIngot;
	private static Item LeadIngot;
	private static Item ChromeIngot;
	private static Item CopperIngot;
	private static Item SteelIngot;

//All Nuggets
	private static Item BrassNugget;
	private static Item BronzeNugget;
	private static Item Stainless_SteelNugget;
	private static Item TinNugget;
	private static Item AluminumNugget;
	private static Item ZincNugget;
	private static Item SilverNugget;
	private static Item LeadNugget;
	private static Item ChromeNugget;
	private static Item CopperNugget;
	private static Item SteelNugget;
	 	
//All Dusts
	private static Item BrassDust;
	private static Item BronzeDust;
	private static Item Stainless_SteelDust;
	private static Item TinDust;
	private static Item AluminumDust;
	private static Item ZincDust;
	private static Item SilverDust;
	private static Item LeadDust;
	private static Item ChromeDust;
	private static Item CopperDust;
	private static Item SteelDust;
	//Minecraft Dusts
	private static Item CoalDust;
	private static Item IronDust;
//All Small Pile of Dust
	private static Item BrassSmallDust;
	private static Item BronzeSmallDust;
	private static Item Stainless_SteelSmallDust;
	private static Item TinSmallDust;
	private static Item AluminumSmallDust;
	private static Item ZincSmallDust;
	private static Item SilverSmallDust;
	private static Item LeadSmallDust;
	private static Item ChromeSmallDust;
	private static Item CopperSmallDust;
	private static Item SteelSmallDust;
	//Minecraft Small Dusts
	private static Item IronSmallDust;
	private static Item CoalSmallDust;
	
	public static void Preint(FMLPreInitializationEvent event){
		
		// All Ores
		 TinOre = new BasicBlock(Material.rock,"Tin",Type.ORE);
		 LeadOre = new BasicBlock(Material.rock,"Lead",Type.ORE);
		 CopperOre = new BasicBlock(Material.rock,"Copper",Type.ORE);
		 ChromeOre = new BasicBlock(Material.rock,"Chrome",Type.ORE);
		 SilverOre = new BasicBlock(Material.rock,"Silver",Type.ORE);
		 ZincOre = new BasicBlock(Material.rock,"Zinc",Type.ORE);
		 AluminumOre = new BasicBlock(Material.rock,"Aluminum",Type.ORE);
	// All Compressed stuff.
		 Brass = new BasicBlock(Material.rock,"Brass",Type.COMPRESSED);
		 Bronze = new BasicBlock(Material.rock,"Bronze",Type.COMPRESSED);
		 Stainless_Steel  = new BasicBlock(Material.rock,"Stainless_Steel",Type.COMPRESSED);
		 Tin = new BasicBlock(Material.rock,"Tin",Type.COMPRESSED);
		 Aluminum  = new BasicBlock(Material.rock,"Aluminum",Type.COMPRESSED);
		 Zinc  = new BasicBlock(Material.rock,"Zinc",Type.COMPRESSED);
		 Silver = new BasicBlock(Material.rock,"Silver",Type.COMPRESSED);
		 Lead = new BasicBlock(Material.rock,"Lead",Type.COMPRESSED);
		 Chrome = new BasicBlock(Material.rock,"Chrome",Type.COMPRESSED);
		 Copper = new BasicBlock(Material.rock,"Copper",Type.COMPRESSED);
		 Steel  = new BasicBlock(Material.rock,"Steel",Type.COMPRESSED);
	//All Dusts
		 BrassDust = new BasicItem("Brass",Type.DUST);
		 BronzeDust = new BasicItem("Bronze",Type.DUST);
		 Stainless_SteelDust  = new BasicItem("Stainless_Steel",Type.DUST);
		 TinDust  = new BasicItem("Tin",Type.DUST);
		 AluminumDust  = new BasicItem("Aluminum",Type.DUST);
		 ZincDust  = new BasicItem("Zinc",Type.DUST);
		 SilverDust  = new BasicItem("Sliver",Type.DUST);
		 LeadDust  = new BasicItem("Lead",Type.DUST);
		 ChromeDust  = new BasicItem("Chrome",Type.DUST);
		 CopperDust  = new BasicItem("Copper",Type.DUST);
		 SteelDust  = new BasicItem("Steel",Type.DUST);
		//Minecraft Dusts
		 CoalDust = new BasicItem("Coal",Type.DUST);
		 IronDust = new BasicItem("Iron",Type.DUST);
	//All Small Pile of Dust
		 BrassSmallDust = new BasicItem("Brass",Type.PILE);
		 BronzeSmallDust = new BasicItem("Bronze",Type.PILE);
		 Stainless_SteelSmallDust  = new BasicItem("Stainless_Steel",Type.PILE);
		 TinSmallDust  = new BasicItem("Tin",Type.PILE);
		 AluminumSmallDust  = new BasicItem("Aluminum",Type.PILE);
		 ZincSmallDust  = new BasicItem("Zinc",Type.PILE);
		 SilverSmallDust  = new BasicItem("Sliver",Type.PILE);
		 LeadSmallDust  = new BasicItem("Lead",Type.PILE);
		 ChromeSmallDust  = new BasicItem("Chrome",Type.PILE);
		 CopperSmallDust  = new BasicItem("Copper",Type.PILE);
		 SteelSmallDust  = new BasicItem("Steel",Type.PILE);
		//Minecraft Small SmallDusts
		 CoalSmallDust = new BasicItem("Coal",Type.PILE);
		 IronSmallDust = new BasicItem("Iron",Type.PILE);
		
		//All Ingots
		 BrassIngot = new BasicItem("Brass",Type.INGOT);
		 BronzeIngot = new BasicItem("Bronze",Type.INGOT);
		 Stainless_SteelIngot  = new BasicItem("Stainless_Steel",Type.INGOT);
		 TinIngot  = new BasicItem("Tin",Type.INGOT);
		 AluminumIngot  = new BasicItem("Aluminum",Type.INGOT);
		 ZincIngot  = new BasicItem("Zinc",Type.INGOT);
		 SilverIngot  = new BasicItem("Silver",Type.INGOT);
		 LeadIngot  = new BasicItem("Lead",Type.INGOT);
		 ChromeIngot  = new BasicItem("Chrome",Type.INGOT);
		 CopperIngot  = new BasicItem("Copper",Type.INGOT);
		 SteelIngot  = new BasicItem("Steel",Type.INGOT);
		 
		 //All Nuggets
		 BrassNugget = new BasicItem("Brass",Type.NUGGET);
		 BronzeNugget = new BasicItem("Bronze",Type.NUGGET);
		 Stainless_SteelNugget  = new BasicItem("Stainless_Steel",Type.NUGGET);
		 TinNugget  = new BasicItem("Tin",Type.NUGGET);
		 AluminumNugget  = new BasicItem("Aluminum",Type.NUGGET);
		 ZincNugget  = new BasicItem("Zinc",Type.NUGGET);
		 SilverNugget  = new BasicItem("Sliver",Type.NUGGET);
		 LeadNugget  = new BasicItem("Lead",Type.NUGGET);
		 ChromeNugget  = new BasicItem("Chrome",Type.NUGGET);
		 CopperNugget  = new BasicItem("Copper",Type.NUGGET);
		 SteelNugget  = new BasicItem("Steel",Type.NUGGET);
	
	
		 
	}
	public static void Init(FMLInitializationEvent event){
	
		 if(event.getSide() == Side.CLIENT){
			 renderItem = Minecraft.getMinecraft().getRenderItem();
			 //All ingots
			 renderItem.getItemModelMesher().register(CopperIngot, 0, new ModelResourceLocation(Main.MODID + ":" + ((BasicItem) CopperIngot).getName(), "inventory"));
			 renderItem.getItemModelMesher().register( SilverIngot, 0, new ModelResourceLocation(Main.MODID + ":" + ((BasicItem)  SilverIngot).getName(), "inventory"));
			 renderItem.getItemModelMesher().register( ChromeIngot, 0, new ModelResourceLocation(Main.MODID + ":" + ((BasicItem)  ChromeIngot).getName(), "inventory"));
			 renderItem.getItemModelMesher().register(LeadIngot, 0, new ModelResourceLocation(Main.MODID + ":" + ((BasicItem) LeadIngot).getName(), "inventory"));
			 renderItem.getItemModelMesher().register( SteelIngot, 0, new ModelResourceLocation(Main.MODID + ":" + ((BasicItem)  SteelIngot).getName(), "inventory"));
			 renderItem.getItemModelMesher().register( ZincIngot, 0, new ModelResourceLocation(Main.MODID + ":" + ((BasicItem)  ZincIngot).getName(), "inventory"));
			 renderItem.getItemModelMesher().register(AluminumIngot, 0, new ModelResourceLocation(Main.MODID + ":" + ((BasicItem) AluminumIngot).getName(), "inventory"));
			 renderItem.getItemModelMesher().register( TinIngot, 0, new ModelResourceLocation(Main.MODID + ":" + ((BasicItem)  TinIngot).getName(), "inventory"));
			 renderItem.getItemModelMesher().register( Stainless_SteelIngot, 0, new ModelResourceLocation(Main.MODID + ":" + ((BasicItem)  Stainless_SteelIngot).getName(), "inventory"));
			 renderItem.getItemModelMesher().register(BronzeIngot, 0, new ModelResourceLocation(Main.MODID + ":" + ((BasicItem) BronzeIngot).getName(), "inventory"));
			 renderItem.getItemModelMesher().register( BrassIngot, 0, new ModelResourceLocation(Main.MODID + ":" + ((BasicItem)  BrassIngot).getName(), "inventory"));
			 //All Dusts
			 renderItem.getItemModelMesher().register(CopperDust, 0, new ModelResourceLocation(Main.MODID + ":" + ((BasicItem) CopperDust).getName(), "inventory"));
			 renderItem.getItemModelMesher().register( SilverDust, 0, new ModelResourceLocation(Main.MODID + ":" + ((BasicItem)  SilverDust).getName(), "inventory"));
			 renderItem.getItemModelMesher().register( ChromeDust, 0, new ModelResourceLocation(Main.MODID + ":" + ((BasicItem)  ChromeDust).getName(), "inventory"));
			 renderItem.getItemModelMesher().register(LeadDust, 0, new ModelResourceLocation(Main.MODID + ":" + ((BasicItem) LeadDust).getName(), "inventory"));
			 renderItem.getItemModelMesher().register( SteelDust, 0, new ModelResourceLocation(Main.MODID + ":" + ((BasicItem)  SteelDust).getName(), "inventory"));
			 renderItem.getItemModelMesher().register( ZincDust, 0, new ModelResourceLocation(Main.MODID + ":" + ((BasicItem)  ZincDust).getName(), "inventory"));
			 renderItem.getItemModelMesher().register(AluminumDust, 0, new ModelResourceLocation(Main.MODID + ":" + ((BasicItem) AluminumDust).getName(), "inventory"));
			 renderItem.getItemModelMesher().register( TinDust, 0, new ModelResourceLocation(Main.MODID + ":" + ((BasicItem)  TinDust).getName(), "inventory"));
			 renderItem.getItemModelMesher().register( Stainless_SteelDust, 0, new ModelResourceLocation(Main.MODID + ":" + ((BasicItem)  Stainless_SteelDust).getName(), "inventory"));
			 renderItem.getItemModelMesher().register(BronzeDust, 0, new ModelResourceLocation(Main.MODID + ":" + ((BasicItem) BronzeDust).getName(), "inventory"));
			 renderItem.getItemModelMesher().register( BrassDust, 0, new ModelResourceLocation(Main.MODID + ":" + ((BasicItem)  BrassDust).getName(), "inventory"));
			 //All Pile
			 renderItem.getItemModelMesher().register(CopperSmallDust, 0, new ModelResourceLocation(Main.MODID + ":" + ((BasicItem) CopperSmallDust).getName(), "inventory"));
			 renderItem.getItemModelMesher().register( SilverSmallDust, 0, new ModelResourceLocation(Main.MODID + ":" + ((BasicItem)  SilverSmallDust).getName(), "inventory"));
			 renderItem.getItemModelMesher().register( ChromeSmallDust, 0, new ModelResourceLocation(Main.MODID + ":" + ((BasicItem)  ChromeSmallDust).getName(), "inventory"));
			 renderItem.getItemModelMesher().register(LeadSmallDust, 0, new ModelResourceLocation(Main.MODID + ":" + ((BasicItem) LeadSmallDust).getName(), "inventory"));
			 renderItem.getItemModelMesher().register( SteelSmallDust, 0, new ModelResourceLocation(Main.MODID + ":" + ((BasicItem)  SteelSmallDust).getName(), "inventory"));
			 renderItem.getItemModelMesher().register( ZincSmallDust, 0, new ModelResourceLocation(Main.MODID + ":" + ((BasicItem)  ZincSmallDust).getName(), "inventory"));
			 renderItem.getItemModelMesher().register(AluminumSmallDust, 0, new ModelResourceLocation(Main.MODID + ":" + ((BasicItem) AluminumSmallDust).getName(), "inventory"));
			 renderItem.getItemModelMesher().register( TinSmallDust, 0, new ModelResourceLocation(Main.MODID + ":" + ((BasicItem)  TinSmallDust).getName(), "inventory"));
			 renderItem.getItemModelMesher().register( Stainless_SteelSmallDust, 0, new ModelResourceLocation(Main.MODID + ":" + ((BasicItem)  Stainless_SteelSmallDust).getName(), "inventory"));
			 renderItem.getItemModelMesher().register(BronzeSmallDust, 0, new ModelResourceLocation(Main.MODID + ":" + ((BasicItem) BronzeSmallDust).getName(), "inventory"));
			 renderItem.getItemModelMesher().register( BrassSmallDust, 0, new ModelResourceLocation(Main.MODID + ":" + ((BasicItem)  BrassSmallDust).getName(), "inventory"));
			 //All Nugget
			 renderItem.getItemModelMesher().register(CopperNugget, 0, new ModelResourceLocation(Main.MODID + ":" + ((BasicItem) CopperNugget).getName(), "inventory"));
			 renderItem.getItemModelMesher().register( SilverNugget, 0, new ModelResourceLocation(Main.MODID + ":" + ((BasicItem)  SilverNugget).getName(), "inventory"));
			 renderItem.getItemModelMesher().register( ChromeNugget, 0, new ModelResourceLocation(Main.MODID + ":" + ((BasicItem)  ChromeNugget).getName(), "inventory"));
			 renderItem.getItemModelMesher().register(LeadNugget, 0, new ModelResourceLocation(Main.MODID + ":" + ((BasicItem) LeadNugget).getName(), "inventory"));
			 renderItem.getItemModelMesher().register( SteelNugget, 0, new ModelResourceLocation(Main.MODID + ":" + ((BasicItem)  SteelNugget).getName(), "inventory"));
			 renderItem.getItemModelMesher().register( ZincNugget, 0, new ModelResourceLocation(Main.MODID + ":" + ((BasicItem)  ZincNugget).getName(), "inventory"));
			 renderItem.getItemModelMesher().register(AluminumNugget, 0, new ModelResourceLocation(Main.MODID + ":" + ((BasicItem) AluminumNugget).getName(), "inventory"));
			 renderItem.getItemModelMesher().register( TinNugget, 0, new ModelResourceLocation(Main.MODID + ":" + ((BasicItem)  TinNugget).getName(), "inventory"));
			 renderItem.getItemModelMesher().register( Stainless_SteelNugget, 0, new ModelResourceLocation(Main.MODID + ":" + ((BasicItem)  Stainless_SteelNugget).getName(), "inventory"));
			 renderItem.getItemModelMesher().register(BronzeNugget, 0, new ModelResourceLocation(Main.MODID + ":" + ((BasicItem) BronzeNugget).getName(), "inventory"));
			 renderItem.getItemModelMesher().register( BrassNugget, 0, new ModelResourceLocation(Main.MODID + ":" + ((BasicItem)  BrassNugget).getName(), "inventory"));
			 
			 
		 }
	}
}
