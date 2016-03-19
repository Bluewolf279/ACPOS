package com.bluewolf279.acpos.client.render.blocks;

import com.bluewolf279.acpos.Main;
import com.bluewolf279.acpos.blocks.ModBlocks;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;

/**
 * Created by Matt on 13/03/2016.
 */
public class blockRenderRegister {
	private static String modid = Main.MODID;

	public static void blockRenderRegister(){

		reg(ModBlocks.rutileOreStone);
		reg(ModBlocks.ilmeniteOreStone);

	}



	public static void reg(Block block) {
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(block), 0, new ModelResourceLocation(modid + ":" + block.getUnlocalizedName().substring(5), "inventory"));

	}
}
