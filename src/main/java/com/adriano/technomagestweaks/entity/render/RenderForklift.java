package com.adriano.technomagestweaks.entity.render;

import com.adriano.technomagestweaks.entity.EntityForklift;
import com.adriano.technomagestweaks.entity.model.ModelForklift;
import com.adriano.technomagestweaks.util.Reference;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.passive.EntityBat;
import net.minecraft.util.ResourceLocation;

public class RenderForklift extends RenderLiving<EntityForklift>{

	public static final ResourceLocation TEXTURES = new ResourceLocation(Reference.MOD_ID + ":textures/entity/forklift.png");
	
	public RenderForklift(RenderManager manager) {
		super(manager, new ModelForklift(), 0.5F);
		// TODO Auto-generated constructor stub
	}
	@Override
	protected ResourceLocation getEntityTexture(EntityForklift entity) {
		return TEXTURES;
	}

	@Override
	protected void applyRotations(EntityForklift entityLiving, float p_77043_2_, float rotationYaw,float partialTicks) {
		super.applyRotations(entityLiving, p_77043_2_, rotationYaw, partialTicks);
	}
}
