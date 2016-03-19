package com.bluewolf279.acpos.items;

import net.minecraft.item.Item;

/**
 * Created by Matt on 13/03/2016.
 */
public class itemBase extends Item {

	public itemBase (String unlocalizedName) {
		super();
		this.setUnlocalizedName(unlocalizedName);
		this.setCreativeTab(ModItems.ACPOS);
	}
}
