package com.adriano.technomagestweaks.init;

import com.adriano.technomagestweaks.Main;
import com.adriano.technomagestweaks.entity.EntityForklift;
import com.adriano.technomagestweaks.util.Reference;

import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.EntityRegistry;

public class ModEntities {
	public static void registerEntities( ) {
		registerEntity("forklift", EntityForklift.class, Reference.ENTITY_FORKLIFT, 50, 000000, 16777215);
	}
	private static void registerEntity(String name, Class<? extends Entity> entity, int id, int range, int eggPrimary, int eggSecondary) {
		EntityRegistry.registerModEntity(new ResourceLocation(Reference.MOD_ID + ":" + name), entity, name, id, Main.instance, range, 1, true, eggPrimary, eggSecondary);
	}
}
