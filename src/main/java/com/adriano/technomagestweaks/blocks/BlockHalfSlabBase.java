package com.adriano.technomagestweaks.blocks;

import com.adriano.technomagestweaks.init.ModItems;

import net.minecraft.block.BlockSlab;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemSlab;

public class BlockHalfSlabBase extends BlockSlabBase{

	public BlockHalfSlabBase(
			String name, 
			Material material, 
			SoundType soundType, 
			float hardnessLevel,
			String toolType, 
			int harvestLevel, 
			int hardness, 
			BlockSlab half,
			BlockSlab doubleSlab) {
		super(name, material, half);
		setSoundType(soundType);
		setResistance(hardnessLevel);
		setHarvestLevel(toolType, harvestLevel);
		setHardness(hardness);
		
		ModItems.ITEMS.add(new ItemSlab(this, this, doubleSlab).setRegistryName(name));
	}
	@Override
	public boolean isDouble() {
		return false;
	}
}
