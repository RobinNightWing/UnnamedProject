package com.adriano.technomagestweaks.blocks;

import com.adriano.technomagestweaks.Main;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BlockMachine extends Block {
	
	public BlockMachine(String name, Material material, String toolclass, Integer harvestlevel) {
		super(material);
		setHarvestLevel(toolclass, harvestlevel);
		setUnlocalizedName(name);
		setRegistryName(name);
		
		setCreativeTab(Main.generaltab);
	}
}
