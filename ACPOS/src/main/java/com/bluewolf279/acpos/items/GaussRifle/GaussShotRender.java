package com.bluewolf279.acpos.items.GaussRifle;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.EntityRenderer;
import net.minecraft.client.resources.IResourceManager;
import net.minecraft.entity.Entity;
import net.minecraftforge.client.event.EntityViewRenderEvent;

/**
 * Created by Matt on 19/03/2016.
 */
public class GaussShotRender extends EntityViewRenderEvent {

	public GaussShotRender(EntityRenderer renderer, Entity entity, Block block, double renderPartialTicks) {
		super(renderer, entity, block, renderPartialTicks);
	}
}

