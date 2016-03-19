package com.bluewolf279.acpos.world;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

import java.util.Random;

/**
 * Created by Matt on 13/03/2016.
 * Thanks to bedrockminer for his OreGen Tutorial: http://bedrockminer.jimdo.com/modding-tutorials/basic-modding-1-7/world-generation/
 */
public class acposWorldGenRare /**extends WorldGenerator */{

	private Block block;
	private int blockmeta;
	private Block target;

	public acposWorldGenRare(Block block, int meta, Block target) {
		this.block = block;
		this.blockmeta = meta;
		this.target = target;
	}

	public acposWorldGenRare(Block block, Block target) {
		this(block, 0, target);
	}

	public acposWorldGenRare(Block block) {
		this(block, Blocks.stone);
	}
/**
	@Override
	public boolean generate(World worldIn, Random rand, BlockPos position) {
		if (worldIn.getBlock(x, y, z).isReplaceableOreGen(worldIn, x, y, z, this.target))
			worldIn.setBlock(x, y, z, this.block, this.blockmeta, 2);
		return true;
	}*/
}
