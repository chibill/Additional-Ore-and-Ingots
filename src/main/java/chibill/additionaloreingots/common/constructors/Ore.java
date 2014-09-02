package chibill.additionaloreingots.common.constructors;

import chibill.additionaloreingots.common.Main;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.util.IIcon;

public class Ore extends Block {
	private IIcon[] icons = new IIcon[Main.OresNames.length] ;
	private int type;
	
	public Ore(int type) {
		super(Material.rock);
		this.type = type;
		this.setBlockName("ore"+Main.OresNames[type]);
		this.setCreativeTab(CreativeTabs.tabBlock);

	}

	@Override
	public IIcon getIcon(int temp, int pass)
	{
		
		return icons[type];
	}
	
	
	@SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister ir) {
		
		
			icons[type] = ir.registerIcon(Main.MODID + ":" + this.getUnlocalizedName().replaceFirst("tile.", ""));

	}
}
