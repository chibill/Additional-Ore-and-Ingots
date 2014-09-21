package chibill.additionaloreingots.common.constructors;

import java.util.List;

import chibill.additionaloreingots.common.Main;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.BlockCompressed;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.util.MathHelper;
import net.minecraft.world.IBlockAccess;

public class IngotCompressed extends Block {

	private IIcon[] icons = new IIcon[Main.IngotsDustsBlocksNames.length] ;
	private int type;
	
	public IngotCompressed(int type) {
		super(Material.iron);
		this.type = type;
		this.setBlockName("block"+Main.IngotsDustsBlocksNames[type]);
		this.setCreativeTab(CreativeTabs.tabBlock);
		this.setBlockTextureName(Main.MODID + ":" + this.getUnlocalizedName().replaceFirst("tile.", ""));
	}

}