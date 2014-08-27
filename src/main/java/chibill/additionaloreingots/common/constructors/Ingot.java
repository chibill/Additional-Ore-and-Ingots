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
import net.minecraft.util.MathHelper;

public class Ingot extends Item {

	private IIcon icons ;
	private String[] Names = new String[] {"Steel","Copper","Tin","Lead","Chrome","Silver","Brass","Bronze","Stainless_Steel","Zinc","Alunumim"};
	
	public Ingot(){
		this.maxStackSize = 64;
		this.setUnlocalizedName("ingots");
		this.setHasSubtypes(true);
		this.setCreativeTab(CreativeTabs.tabMaterials);
	}
	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IIconRegister ir) 
	{
		icons = ir.registerIcon(Main.MODID+":"+"ingot");
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public int getColorFromItemStack(ItemStack par1ItemStack, int par2)
	{
		if(par1ItemStack.getItemDamage() == 0){
				 return 0xC0C0C0;
			}else{
				
				if(par1ItemStack.getItemDamage() == 1){
					
				}
				
			}
			
			
	
		return par2;
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public boolean requiresMultipleRenderPasses()
	{
		return true;
	}
	
	@Override
	public int getRenderPasses(int metadata)
	{
		// TODO Auto-generated method stub
		return 1;
	}
	
	@Override
	public IIcon getIcon(ItemStack stack, int pass)
	{
		// TODO Auto-generated method stub
		return icons;
	}

	 @SideOnly(Side.CLIENT)
	    public void getSubItems(Item p_150895_1_, CreativeTabs p_150895_2_, List p_150895_3_)
	    {
	        for (int i = 0; i < 10; ++i)
	        {
	            p_150895_3_.add(new ItemStack(p_150895_1_, 1, i));
	        }
	    }
	 public String getUnlocalizedName(ItemStack p_77667_1_)
	    {
	        int i = MathHelper.clamp_int(p_77667_1_.getItemDamage(), 0, 10);
	        return super.getUnlocalizedName() + "." + Names [i];
	    }
   
}
