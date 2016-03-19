package com.bluewolf279.acpos;


import com.bluewolf279.acpos.client.render.blocks.blockRenderRegister;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class ClientProxy extends CommonProxy {

	public void preInit() {
		super.preInit();

	}

	public void init() {
		super.init();
		blockRenderRegister.blockRenderRegister();
	}

	public void postInit() {
		super.postInit();
	}
}
