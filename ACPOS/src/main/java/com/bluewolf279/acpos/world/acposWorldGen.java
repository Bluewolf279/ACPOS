package com.bluewolf279.acpos.world;

import com.bluewolf279.acpos.blocks.ModBlocks;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.fml.common.IWorldGenerator;

import java.util.Random;

/**
 * Created by Matt on 13/03/2016.
 */
public class acposWorldGen implements IWorldGenerator {
	private WorldGenMinable genRutileOreRock;
	private WorldGenMinable genIlmeniteOreRock;

	public acposWorldGen(){
		this.genRutileOreRock= new WorldGenMinable(ModBlocks.rutileOreStone.getDefaultState(),64);
		this.genIlmeniteOreRock= new WorldGenMinable(ModBlocks.ilmeniteOreStone.getDefaultState(),64);
	}

	private void runGenerator(WorldGenerator generator, World world, Random rand, int chunk_X, int chunk_Z, int chancesToSpawn, int minHeight, int maxHeight, int chanceToSpawnInChunk) {
		if (minHeight < 0 || maxHeight > 256 || minHeight > maxHeight)
			throw new IllegalArgumentException("Illegal Height Arguments for WorldGenerator");

		int heightDiff = maxHeight - minHeight + 1;
		if ((Math.floor(chanceToSpawnInChunk * Math.random()))==0) {
			for (int i = 0; i < chancesToSpawn; i++) {
				int x = chunk_X * 16 + rand.nextInt(16);
				int y = minHeight + rand.nextInt(heightDiff);
				int z = chunk_Z * 16 + rand.nextInt(16);
				generator.generate(world, rand, new BlockPos(x, y, z));
			}
		}
	}

	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
		//chance to spawn in chunk is where 1 is a 100% chance to spawn
		switch (world.provider.getDimensionId()) {
			case 0: //Overworld
				this.runGenerator(genRutileOreRock, world, random, chunkX, chunkZ, 1, 0, 128, 40);
				this.runGenerator(genIlmeniteOreRock, world, random, chunkX, chunkZ, 1, 0, 128, 40);
				break;
			case -1: //Nether

				break;
			case 1: //End

				break;
		}
	}
}
