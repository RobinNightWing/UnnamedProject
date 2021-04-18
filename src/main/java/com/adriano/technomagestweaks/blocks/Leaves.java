package com.adriano.technomagestweaks.blocks;

import java.util.List;

import com.adriano.technomagestweaks.Main;
import com.adriano.technomagestweaks.init.ModBlocks;
import com.adriano.technomagestweaks.init.ModItems;
import com.adriano.technomagestweaks.util.IHasModel;

import net.minecraft.block.Block;
import net.minecraft.block.BlockGlass;
import net.minecraft.block.BlockLeaves;
import net.minecraft.block.BlockPlanks.EnumType;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class Leaves extends Block{

	public Leaves(String name) {
		super(Material.LEAVES);
		setUnlocalizedName(name);
		setRegistryName(name);
		setSoundType(SoundType.PLANT);
		setResistance(0.2F);
		setHarvestLevel("shears", 0);
		setLightOpacity(1);
		setHardness(1);
		setCreativeTab(Main.generaltab);
		ModBlocks.BLOCKS.add(this);
		ModItems.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
		
	}
	@Override
    public boolean isOpaqueCube(IBlockState state)
    {
        return false;
    }

    @Override
    public boolean isTranslucent(IBlockState state)
    {
        return true;
    }

    @SideOnly(Side.CLIENT)
    public BlockRenderLayer getBlockLayer()
    {
        return BlockRenderLayer.TRANSLUCENT;
    }

}
