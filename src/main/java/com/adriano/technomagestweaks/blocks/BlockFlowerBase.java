package com.adriano.technomagestweaks.blocks;

import java.util.List;

import com.adriano.technomagestweaks.Main;
import com.adriano.technomagestweaks.init.ModBlocks;
import com.adriano.technomagestweaks.init.ModItems;

import net.minecraft.block.BlockBush;
import net.minecraft.block.BlockFlower;
import net.minecraft.block.SoundType;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.EnumDyeColor;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class BlockFlowerBase extends BlockBush{
	
	public BlockFlowerBase(String name) {
		setUnlocalizedName(name);
		setDefaultState(blockState.getBaseState());
		setRegistryName(name);
		setHardness(0F);
		setSoundType(SoundType.PLANT);
		setTickRandomly(false);
		setCreativeTab(Main.generaltab);
		ModBlocks.BLOCKS.add(this);
		ModItems.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
	}

}
