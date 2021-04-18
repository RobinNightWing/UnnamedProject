package com.adriano.technomagestweaks.blocks;

import javax.annotation.Nullable;

import com.adriano.technomagestweaks.Main;
import com.adriano.technomagestweaks.init.ModBlocks;
import com.adriano.technomagestweaks.init.ModItems;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class BlockNatural extends Block{

	public BlockNatural(String name) {
		super(Material.PLANTS);
		setUnlocalizedName(name);
		setRegistryName(name);
		setSoundType(SoundType.PLANT);
		setResistance(0);
		setCreativeTab(Main.generaltab);
		ModBlocks.BLOCKS.add(this);
		ModItems.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
	}
	 public boolean isOpaqueCube(IBlockState state)
	    {
	        return false;
	    }

    @Nullable
    public AxisAlignedBB getCollisionBoundingBox(IBlockState blockState, IBlockAccess worldIn, BlockPos pos)
	    {
	        return NULL_AABB;
	    }

    public boolean isFullCube(IBlockState state)
	    {
	        return false;
	    }
    @SideOnly(Side.CLIENT)
    public BlockRenderLayer getBlockLayer()
	    {
	        return BlockRenderLayer.CUTOUT;
	    }


}
