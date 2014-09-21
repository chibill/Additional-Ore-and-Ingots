package chibill.additionaloreingots.common.compatibility;

import cpw.mods.fml.common.registry.GameRegistry;
import chibill.additionaloreingots.common.Main;
import chibill.additionaloreingots.common.constructors.Ore;
import net.minecraftforge.oredict.OreDictionary;

public class OreDictionaryRegistry {

	public static void Register(){
		for(int temp = 0;temp < Main.Ores.length;++temp){
			
			OreDictionary.registerOre("ore"+Main.OresNames[temp], Main.Ores[temp]);
		}
for(int temp = 0;temp < Main.Ingots.length;++temp){
			
			OreDictionary.registerOre("ingot"+Main.IngotsDustsBlocksNames[temp], Main.Ingots[temp]);
			OreDictionary.registerOre("block"+Main.IngotsDustsBlocksNames[temp], Main.Compressed[temp]);
			OreDictionary.registerOre("dust"+Main.IngotsDustsBlocksNames[temp],Main.Dusts[temp]);
}

	}
	
}
