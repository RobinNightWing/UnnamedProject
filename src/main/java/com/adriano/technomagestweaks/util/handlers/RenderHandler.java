package com.adriano.technomagestweaks.util.handlers;

import com.adriano.technomagestweaks.entity.EntityForklift;
import com.adriano.technomagestweaks.entity.render.RenderForklift;

import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraftforge.fml.client.registry.IRenderFactory;
import net.minecraftforge.fml.client.registry.RenderingRegistry;

public class RenderHandler {
	public static void registerEntityRenders() {
		RenderingRegistry.registerEntityRenderingHandler(EntityForklift.class, new IRenderFactory<EntityForklift>() 
		{
			@Override
			public Render<? super EntityForklift> createRenderFor(RenderManager manager) {
				return new RenderForklift(manager);
			}
		});
	}
}
