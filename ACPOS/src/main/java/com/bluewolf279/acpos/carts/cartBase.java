package com.bluewolf279.acpos.carts;

import net.minecraft.entity.Entity;
import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.entity.item.EntityMinecartEmpty;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.world.World;
import net.minecraftforge.common.IMinecartCollisionHandler;
import net.minecraftforge.fluids.ItemFluidContainer;

/**
 * Created by Matt on 13/03/2016.
 */
public class cartBase extends EntityMinecart implements IMinecartCollisionHandler {
	public cartBase(World worldIn) {
		super(worldIn);
	}

	@Override
	public EnumMinecartType getMinecartType() {
		return null;
	}

	@Override
	public void onEntityCollision(EntityMinecart cart, Entity other) {

	}

	@Override
	public AxisAlignedBB getCollisionBox(EntityMinecart cart, Entity other) {
		return null;
	}

	@Override
	public AxisAlignedBB getMinecartCollisionBox(EntityMinecart cart) {
		return null;
	}

	@Override
	public AxisAlignedBB getBoundingBox(EntityMinecart cart) {
		return null;
	}
}
