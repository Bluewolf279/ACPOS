package com.bluewolf279.acpos.carts;

import com.bluewolf279.acpos.items.ModItems;
import net.minecraft.block.BlockRailBase;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemMinecart;
import net.minecraft.item.ItemStack;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.world.World;

/**
 * Created by Matt on 13/03/2016.
 */
public class cartItemBase extends ItemMinecart {
	public cartItemBase(EntityMinecart.EnumMinecartType type, String name) {
		super(type);
		this.maxStackSize = 3;
		this.setUnlocalizedName(name);
		this.setCreativeTab(ModItems.ACPOS);
	}

	@Override
	public boolean onItemUse(ItemStack stack, EntityPlayer playerIn, World worldIn, BlockPos pos, EnumFacing side, float hitX, float hitY, float hitZ) {
		IBlockState iblockstate = worldIn.getBlockState(pos);
		if (BlockRailBase.isRailBlock(iblockstate)) {
			if (!worldIn.isRemote) {
				cartBase cart = new cartBase(worldIn);

				worldIn.spawnEntityInWorld(cart);
			}
			--stack.stackSize;
			return true;
		}
		else
		{
			return false;
		}

	}
}


