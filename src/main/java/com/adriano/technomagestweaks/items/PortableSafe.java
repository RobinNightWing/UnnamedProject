package com.adriano.technomagestweaks.items;

import com.adriano.technomagestweaks.Main;
import com.adriano.technomagestweaks.init.ModItems;

import net.minecraft.item.Item;

public class PortableSafe extends Item{

	
	public PortableSafe() {
		setUnlocalizedName("portable_safe");
		setRegistryName("portable_safe");
		setCreativeTab(Main.generaltab);
		ModItems.ITEMS.add(this);
	}
}
