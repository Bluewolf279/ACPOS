package com.bluewolf279.acpos.items;

import com.bluewolf279.acpos.blocks.ModBlocks;
import com.bluewolf279.acpos.carts.cartItemBase;
import com.bluewolf279.acpos.items.GaussRifle.GaussRifleItem;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.item.Item;
import com.bluewolf279.acpos.unlocalisedName;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Created by Matt on 13/03/2016.
 */
public class ModItems {

	public static final CreativeTabs ACPOS = new CreativeTabs("acpos") {
		@Override
		public Item getTabIconItem() {
			return itemBase.getItemFromBlock(ModBlocks.rutileOreStone);
		}
	};

	public static Item industrialTankCart = new cartItemBase(EntityMinecart.EnumMinecartType.RIDEABLE,unlocalisedName.industrialTankCart);
	public static Item GaussRifle = new GaussRifleItem();

	public static void createItems(){
		GameRegistry.registerItem(industrialTankCart, unlocalisedName.industrialTankCart);
		GameRegistry.registerItem(GaussRifle,unlocalisedName.GaussRifle);
	}
}
