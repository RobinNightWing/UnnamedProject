package com.adriano.technomagestweaks.init;

import java.util.ArrayList;
import java.util.List;

import com.adriano.technomagestweaks.blocks.BlockBase;
import com.adriano.technomagestweaks.blocks.BlockDirtBase;
import com.adriano.technomagestweaks.blocks.BlockHalfSlabBase;
import com.adriano.technomagestweaks.blocks.BlockRoofing;
import com.adriano.technomagestweaks.blocks.BlockRotational;
import com.adriano.technomagestweaks.blocks.BlockSlabBase;
import com.adriano.technomagestweaks.blocks.BlockDoubleSlabBase;
import com.adriano.technomagestweaks.blocks.BlockFlowerBase;
import com.adriano.technomagestweaks.blocks.Leaves;

import net.minecraft.block.Block;
import net.minecraft.block.BlockSlab;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;

public class ModBlocks {
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	/*
			
		protected BlockRoofing(
			String name,
			IBlockState modelState, 	 
			Material materialIn,
			SoundType soundType, 
			float hardnessLevel, 
			String toolType, 
			int harvestLevel,
			int hardness)
			
		public BlockSlabBase(
			String name, 
			Material materialIn,
			SoundType soundType, 
			float hardnessLevel, 
			String toolType, 
			int harvestLevel,
			int hardness,
			BlockSlab half) 
	{
		public BlockDoubleSlabBase(
			String name, 
			Material material, 
			SoundType soundType, 
			float hardnessLevel,
			String toolType, 
			int harvestLevel, 
			int hardness, 
			BlockSlab half)

		public BlockBase (
			String name,
			Material materialIn,
			int lightOpacity
			SoundType soundtype,
			float hardnessLevel,
			String toolType,
			int harvestLevel)
	*/
	public static final Block WHITE_OAK_BARK_VERTICAL = new 
			BlockBase(
				"white_oak_bark_vertical", 
				Material.WOOD,
				SoundType.WOOD,
				2.0F,
				"axe",
				0,
				5);
	
	public static final Block WHITE_OAK_BARK_HORIZANTAL = new 
			BlockBase(
				"white_oak_bark_horizantal",
				Material.WOOD,
				SoundType.WOOD,
				2.0F,
				"axe",
				0,
				5);
	
	public static final Block WHITE_OAK_LEAVES = new Leaves("white_oak_leaves");
	
	public static final Block WHITE_OAK_LOG = new BlockRotational("white_oak_log", SoundType.WOOD, Material.WOOD, "axe", 0);
	
	public static final Block THATCH = new BlockRotational("thatch", SoundType.PLANT, Material.GROUND, "shears", 0);

	public static final Block THATCH_ROOFING = new 
			BlockRoofing(
				"thatch_roofing", 
				ModBlocks.THATCH.getDefaultState(), 
				Material.GROUND, 
				SoundType.PLANT, 
				0.2F,
				"shears",
				0,
				1);
	public static final BlockSlab THATCH_DOUBLE_SLAB = new BlockDoubleSlabBase(
				"thatch_double_slab",
				Material.GROUND,
				SoundType.PLANT,
				0.2F,
				"shears", 
				0, 
				1, 
				ModBlocks.THATCH_DOUBLE_SLAB);	
	
	public static final BlockSlab THATCH_SLAB_HALF = new BlockHalfSlabBase(
				"thatch_slab_half", 
				Material.GROUND,
				SoundType.PLANT, 
				0.2F, 
				"shears", 
				0,
				1, 
				ModBlocks.THATCH_SLAB_HALF, 
				ModBlocks.THATCH_DOUBLE_SLAB);
	
	public static final Block HEAVENLY_GRASS = new BlockDirtBase(
				"heavenly_grass", 
				Material.GROUND,
				SoundType.PLANT);
	
	public static final Block HEAVENLY_DIRT = new BlockDirtBase(
				"heavenly_dirt", 
				Material.GROUND,
				SoundType.GROUND);
	
	public static final Block LIGHT_BLUE_FLOWER = new BlockFlowerBase("light_blue_flower");
	public static final Block BLUE_FLOWER = new BlockFlowerBase("blue_flower");
	public static final Block WHITE_FLOWER = new BlockFlowerBase("white_flower");
	public static final Block LAVENDER_FLOWER = new BlockFlowerBase("lavender_flower");
	public static final Block HEAVENLY_TALL_GRASS = new BlockFlowerBase("heavenly_tall_grass");
	public static final Block ICE_LILY = new BlockFlowerBase("ice_lily");
	public static final Block BLOO_FLOO = new BlockFlowerBase("bloo_floo");
	public static final Block LITTLE_BLUE_GREEN_FLOWER = new BlockFlowerBase("little_blue_green_flower");
	public static final Block BLUE_GRASS_FLOWER = new BlockFlowerBase("blue_grass_flower");


}
