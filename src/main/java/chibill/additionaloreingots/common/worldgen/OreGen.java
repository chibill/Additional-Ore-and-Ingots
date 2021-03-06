package chibill.additionaloreingots.common.worldgen;

import java.util.Random;

import chibill.additionaloreingots.common.Main;
import net.minecraft.block.Block;
import net.minecraft.block.state.pattern.BlockHelper;
import net.minecraft.init.Blocks;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraftforge.fml.common.IWorldGenerator;

public class OreGen implements IWorldGenerator {

	 @Override
	    public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
	     if(!Main.DisableOreGen){  
		 switch (world.provider.getDimensionId()) {
	            case 0: GenerateOverworld(random, chunkX * 16, chunkZ * 16, world); break;
	            case 1: GenerateEnd(random, chunkX * 16, chunkZ * 16, world); break;
	            case -1: GenerateNether(random, chunkX * 16, chunkZ * 16, world); break;
	        }
	    }
	 }
	private void GenerateNether(Random random, int i, int j, World world) {
	//	addOreSpawn(Main.Ores[5], world, random, i, j, 3, 6, 30 * Main.OreDenistyMod, 1, 60,Blocks.netherrack);

	}

	private void GenerateEnd(Random random, int i, int j, World world) {
		// TODO Auto-generated method stub
		
	}

	private void GenerateOverworld(Random random, int i, int j, World world) {
		/*addOreSpawn(Main.Ores[0], world, random, i, j, 3, 6, 20 * Main.OreDenistyMod, 1, 100,Blocks.stone);
		addOreSpawn(Main.Ores[1], world, random, i, j, 3, 6, 20 * Main.OreDenistyMod, 1, 60,Blocks.stone);
		addOreSpawn(Main.Ores[2], world, random, i, j, 3, 5, 20 * Main.OreDenistyMod, 1, 40,Blocks.stone);
		addOreSpawn(Main.Ores[3], world, random, i, j, 1, 2, 10 * Main.OreDenistyMod, 1, 10,Blocks.stone);
		addOreSpawn(Main.Ores[4], world, random, i, j, 1, 3, 15 * Main.OreDenistyMod, 1, 20,Blocks.stone);
		addOreSpawn(Main.Ores[6], world, random, i, j, 6,10, 30 * Main.OreDenistyMod, 1, 60,Blocks.stone);
	*/}
	
	/**
    *
    * This method adds our block to the world.
    * It randomizes the coordinates, and does that as many times, as defined in spawnChance.
    * Then it gives all the params to WorldGenMinable, which handles the replacing of the ores for us.
    *
    * @param block The block you want to spawn
    * @param world The world
    * @param random The Random
    * @param blockXPos the blockXpos of a chunk
    * @param blockZPos the blockZpos of a chunk
    * @param minVeinSize min vein
    * @param maxVeinSize max vein
    * @param chancesToSpawn the chance to spawn. Usually around 2
    * @param minY lowest point to spawn
    * @param maxY highest point to spawn
    * @param block2 What block it can replace
    */

   public void addOreSpawn(Block block, World world, Random random, int blockXPos, int blockZPos, int minVeinSize, int maxVeinSize, int chancesToSpawn, int minY, int maxY ,Block block2)
   {
	   
	 
		  WorldGenMinable minable = new WorldGenMinable(block.getDefaultState(), (minVeinSize + random.nextInt(maxVeinSize - minVeinSize)),BlockHelper.forBlock(block2));
	  
       for(int i = 0; i < chancesToSpawn; i++)
       {
           int posX = blockXPos + random.nextInt(16);
           int posY = minY + random.nextInt(maxY - minY);
           int posZ = blockZPos + random.nextInt(16);
           minable.generate(world, random,new BlockPos( posX, posY, posZ));
       }
   }
}
