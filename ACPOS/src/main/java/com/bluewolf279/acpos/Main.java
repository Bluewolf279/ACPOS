package com.bluewolf279.acpos;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

/**
 * Created by Matt on 2/03/2016.
 * aos main class
 */

@Mod(modid=Main.MODID,name=Main.MODNAME,version=Main.VERSION)
//ACPOS Application of Chemistry for Orbatal Science
//TODO processing titanium

//TODO Gauss Rifle
public class Main {
	public static final String MODID="acpos";
	public static final String MODNAME="Application of Chemistry and Physics for Orbital Science";
	public static final String VERSION="0.1";


	@Mod.Instance
	public static Main instance = new Main();

	@SidedProxy(clientSide = "com.bluewolf279.acpos.ClientProxy",serverSide = "com.bluewolf279.acpos.ServerProxy")
	public static CommonProxy proxy;

	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event){
		proxy.preInit();
	}
	@Mod.EventHandler
	public void init(FMLInitializationEvent event){
		proxy.init();
	}

	@Mod.EventHandler
	public void postInit(FMLInitializationEvent event){
		proxy.postInit();
	}
}
