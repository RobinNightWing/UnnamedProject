package com.adriano.technomagestweaks.proxy;

import com.adriano.technomagestweaks.Main;
import com.adriano.technomagestweaks.items.ItemBase;

import net.minecraft.item.Item;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.network.NetworkRegistry;

public class CommonProxy {

	public void registerItemRenderer(Item item, int meta, String id) {}

	public void init(FMLInitializationEvent e) {
		NetworkRegistry.INSTANCE.registerGuiHandler(Main.instance, new GuiProxy());
	}
}
