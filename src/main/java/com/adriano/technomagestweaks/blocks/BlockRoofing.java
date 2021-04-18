package com.adriano.technomagestweaks.blocks;

import com.adriano.technomagestweaks.Main;
import com.adriano.technomagestweaks.init.ModBlocks;
import com.adriano.technomagestweaks.init.ModItems;
import com.adriano.technomagestweaks.util.IHasModel;

import net.minecraft.block.BlockStairs;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

public class BlockRoofing extends BlockStairs{

	public BlockRoofing(
			String name, 
			IBlockState modelState, 
			Material materialIn,
			SoundType soundType, 
			float hardnessLevel, 
			String toolType, 
			int harvestLevel,
			int hardness) {
		super(modelState);
		setUnlocalizedName(name);
		setRegistryName(name);
		setSoundType(soundType);
		setResistance(hardnessLevel);
		setHarvestLevel(toolType, harvestLevel);
		setHardness(hardness);
		setCreativeTab(Main.generaltab);
		ModBlocks.BLOCKS.add(this);
		ModItems.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
	}
	
}
