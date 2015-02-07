package chibill.additionaloreingots.common.items;

import java.util.List;

import chibill.additionaloreingots.common.Main;
import chibill.additionaloreingots.common.Type;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class BasicItem extends Item {
	
	private final String Name;
	
	public BasicItem(String name,Type type){
		super();
		this.Name = type + name;
		this.maxStackSize = 64;
		this.setUnlocalizedName(getName());
		this.setCreativeTab(CreativeTabs.tabMaterials);
		GameRegistry.registerItem(this, Name);
	}

	public String getName() {
		return Name;
	}
	
   
}
