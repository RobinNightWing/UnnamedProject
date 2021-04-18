package com.adriano.technomagestweaks.blocks;

import com.adriano.technomagestweaks.Main;
import com.adriano.technomagestweaks.init.ModBlocks;
import com.adriano.technomagestweaks.init.ModItems;
import com.adriano.technomagestweaks.util.IHasModel;

import net.minecraft.block.BlockRotatedPillar;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

public class BlockRotational extends BlockRotatedPillar{

	public BlockRotational(String name, SoundType soundType, Material material, String toolType, int harvestLevel) {
		super(material);
		setUnlocalizedName(name);
		setRegistryName(name);
		setSoundType(soundType);
		setResistance(1);
		setHarvestLevel(toolType, harvestLevel);
		setHardness(1);
		setCreativeTab(Main.generaltab);
		ModBlocks.BLOCKS.add(this);
		ModItems.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
	}
}
