package com.adriano.technomagestweaks.entity;

import net.minecraft.block.Block;
import net.minecraft.entity.Entity;
import net.minecraft.entity.ai.EntityAIFollowParent;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAIMate;
import net.minecraft.entity.ai.EntityAIPanic;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAITempt;
import net.minecraft.entity.ai.EntityAIWanderAvoidWater;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.monster.EntityIronGolem;
import net.minecraft.entity.passive.EntityCow;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EnumHand;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class EntityForklift extends EntityCow{

	public EntityForklift(World worldIn) {
		super(worldIn);
        this.setSize(2.1F, 1F);
	}

    protected boolean canDespawn()
    {
        return false;
    }
    @Override
    protected SoundEvent getAmbientSound()
    {
        return null;
    }
    @Override
    protected SoundEvent getHurtSound(DamageSource damageSourceIn)
    {
        return SoundEvents.BLOCK_ANVIL_BREAK;
    }
    @Override
    protected SoundEvent getDeathSound()
    {
        return SoundEvents.BLOCK_ANVIL_LAND;
    }
    @Override
    protected void playStepSound(BlockPos pos, Block blockIn)
    {
        this.playSound(SoundEvents.ENTITY_IRONGOLEM_STEP, 0.15F, 1.0F);
    }
    @Override
    protected void initEntityAI()
    {
        this.tasks.addTask(0, new EntityAISwimming(this));
        this.tasks.addTask(2, new EntityAIMate(this, 1.0D));
        this.tasks.addTask(4, new EntityAIFollowParent(this, 1.25D));
        this.tasks.addTask(7, new EntityAILookIdle(this));
    }
    @Override
    public boolean processInteract(EntityPlayer player, EnumHand hand) {
        if (player.isSneaking())
        {
            return false;
        }
        else
        {
            if (!this.world.isRemote)
            {
                player.startRiding(this);
            }

            return true;
        }
    }
    @Override
    public boolean canPassengerSteer()
    {
    	return true;
    }
    @Override
    public float getEyeHeight() {

    	return 0.8F;
    }
}
