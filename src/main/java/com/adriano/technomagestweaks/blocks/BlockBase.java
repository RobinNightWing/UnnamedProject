package com.adriano.technomagestweaks.blocks;

import com.adriano.technomagestweaks.Main;
import com.adriano.technomagestweaks.creativetabs.CustomTab;
import com.adriano.technomagestweaks.init.ModBlocks;
import com.adriano.technomagestweaks.init.ModItems;
import com.adriano.technomagestweaks.util.IHasModel;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.BlockRenderLayer;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class BlockBase extends Block
{

	public BlockBase (
			String name, 
			Material materialIn,
			SoundType soundType, 
			float hardnessLevel, 
			String toolType, 
			int harvestLevel,
			int hardness) 
	{
		super(materialIn);
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
