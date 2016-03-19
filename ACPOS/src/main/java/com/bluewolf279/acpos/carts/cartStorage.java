package com.bluewolf279.acpos.carts;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.entity.item.EntityMinecart.EnumMinecartType;
import net.minecraft.entity.item.EntityMinecartChest;
import net.minecraft.world.World;

/**
 * Created by Matt on 14/03/2016.
 */
public class cartStorage extends EntityMinecart {

	public cartStorage(World worldIn) {
		super(worldIn);
	}

	@Override
	public EnumMinecartType getMinecartType() {
		return null;
	}
}
