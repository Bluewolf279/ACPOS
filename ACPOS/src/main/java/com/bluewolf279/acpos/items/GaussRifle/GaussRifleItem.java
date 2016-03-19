package com.bluewolf279.acpos.items.GaussRifle;

import com.bluewolf279.acpos.items.ModItems;
import com.bluewolf279.acpos.unlocalisedName;
import net.minecraft.entity.Entity;
import net.minecraft.entity.passive.EntityPig;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntitySnowball;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBow;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.player.ArrowNockEvent;

/**
 * Created by Matt on 17/03/2016.
 */
public class GaussRifleItem extends ItemBow{

	public GaussRifleItem(){
		this.setUnlocalizedName(unlocalisedName.GaussRifle);
		this.setCreativeTab(ModItems.ACPOS);
	}

	@Override
	public ItemStack onItemRightClick(ItemStack itemStackIn, World worldIn, EntityPlayer playerIn){
		ArrowNockEvent event = new ArrowNockEvent(playerIn, itemStackIn);
		MinecraftForge.EVENT_BUS.post(event);
		if (event.isCanceled()) {return event.result;}
		playerIn.setItemInUse(itemStackIn, this.getMaxItemUseDuration(itemStackIn));
		return itemStackIn;
	}

	@Override
	public void onPlayerStoppedUsing(ItemStack itemStackIn, World worldIn, EntityPlayer playerIn, int timeLeft){

		worldIn.playSoundAtEntity(playerIn, "random.bow", 0.5F, 0.4F / (itemRand.nextFloat() * 0.4F + 0.8F));
		if (!worldIn.isRemote) {


			worldIn.spawnEntityInWorld(new GaussShot(worldIn, playerIn));
		}
	}
}
