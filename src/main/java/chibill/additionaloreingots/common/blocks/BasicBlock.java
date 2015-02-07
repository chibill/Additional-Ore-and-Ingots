package chibill.additionaloreingots.common.blocks;

import java.util.List;

import chibill.additionaloreingots.common.Main;


import chibill.additionaloreingots.common.Type;
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
import net.minecraftforge.fml.common.registry.GameRegistry;

public class BasicBlock extends Block {

	private final String Name;
	
	public BasicBlock(Material materialIn,String name,Type type) {
		super(materialIn);
		this.Name =(type+ name);
		this.setUnlocalizedName(Name);
		this.setCreativeTab(CreativeTabs.tabBlock);
		GameRegistry.registerBlock(this,getName());
		}

	public String getName() {
		return Name;
	}

}