package com.adriano.technomagestweaks.blocks;

import net.minecraft.block.BlockDirt;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class BlockDirtBase extends BlockBase{

	public BlockDirtBase(String name, Material materialIn, SoundType soundType) 
	{
		super(name, materialIn, soundType, 0.2F, "shovel", 0, 1);
		// TODO Auto-generated constructor stub
	}
	@Override
	public boolean isFertile(World world, BlockPos pos) {
		return true;
	}

	@Override
	public boolean canSustainPlant(IBlockState state, IBlockAccess world, BlockPos pos, EnumFacing direction,
			net.minecraftforge.common.IPlantable plantable) {
		//IBlockState plant = plantable.getPlant(world, pos.offset(direction));
        net.minecraftforge.common.EnumPlantType plantType = plantable.getPlantType(world, pos.offset(direction));
		switch (plantType) {
            case Desert: return true;
            case Nether: return false;
            case Crop:   return true;
            case Cave:   return true;
            case Plains: return true;
            case Water:  return false;
            case Beach:  return true;
        }
		return super.canSustainPlant(state, world, pos, direction, plantable);
	}

}
