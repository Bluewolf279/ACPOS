package com.bluewolf279.acpos.blocks;

import com.bluewolf279.acpos.unlocalisedName;
import net.minecraft.block.Block;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Created by Matt on 13/03/2016.
 */
public class ModBlocks {

	//Ores
	public static Block rutileOreStone = new blockBase(unlocalisedName.rutileOreRock,6.0f,20.0f);
	public static Block ilmeniteOreStone = new blockBase(unlocalisedName.ilmeniteOreRock,6.0f,20.0f);

	public static void createBlocks(){

		GameRegistry.registerBlock(rutileOreStone,unlocalisedName.rutileOreRock);
		GameRegistry.registerBlock(ilmeniteOreStone,unlocalisedName.ilmeniteOreRock);
	}
}
