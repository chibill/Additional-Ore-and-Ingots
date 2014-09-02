package chibill.additionaloreingots.common.constructors;

import java.util.List;

import chibill.additionaloreingots.common.Main;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;

public class Ingot extends Item {
	private int type;
	private IIcon[] icons = new IIcon[Main.IngotsDustsBlocksNames.length] ;
	public Ingot(int type){
		this.type = type;
		this.maxStackSize = 64;
		this.setUnlocalizedName("ingot"+Main.IngotsDustsBlocksNames[type]);
		this.setCreativeTab(CreativeTabs.tabMaterials);
	}
	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IIconRegister ir) 
	{
		icons[type] = ir.registerIcon(Main.MODID + ":" + this.getUnlocalizedName().replaceFirst("item.", ""));
	
	}
	
	
	@Override
	public IIcon getIcon(ItemStack stack, int pass)
	{
		// TODO Auto-generated method stub
		return icons[type];
	}
   
}
