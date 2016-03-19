package com.bluewolf279.acpos.blocks;

import com.bluewolf279.acpos.items.ModItems;
import net.minecraft.block.Block;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;

/**
 * Created by Matt on 13/03/2016.
 */
public class blockBase extends Block{
	public blockBase(String name, Material material, float hardness, float resistance) {
		super(material);
		this.setUnlocalizedName(name);
		this.setHardness(hardness);
		this.setResistance(resistance);
		this.setCreativeTab(ModItems.ACPOS);
	}
	public blockBase(String name, float hardness, float resistance){
		this(name,Material.rock, hardness,resistance);
	}
	public blockBase(String name){this(name,2.0f,10.0f);}
}
