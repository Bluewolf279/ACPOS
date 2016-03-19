package com.bluewolf279.acpos;


import com.bluewolf279.acpos.blocks.ModBlocks;
import com.bluewolf279.acpos.items.ModItems;
import com.bluewolf279.acpos.world.acposWorldGen;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class CommonProxy {

	public void preInit() {
		ModItems.createItems();
		ModBlocks.createBlocks();
	}

	public void init() {
		GameRegistry.registerWorldGenerator(new acposWorldGen(),1);
	}

	public void postInit() {

	}

}
