package com.adriano.technomagestweaks.blocks;

import net.minecraft.block.BlockSlab;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class BlockDoubleSlabBase extends BlockSlabBase{

	public BlockDoubleSlabBase(String name, Material material, SoundType soundType, float hardnessLevel,
			String toolType, int harvestLevel, int hardness, BlockSlab half) {
		super(name, material, half);
		setSoundType(soundType);
		setResistance(hardnessLevel);
		setHarvestLevel(toolType, harvestLevel);
		setHardness(hardness);
	}
	
	@Override
	public boolean isDouble() {
		return true;
	}

}
