package com.adriano.technomagestweaks.items;

import com.adriano.technomagestweaks.Main;
import com.adriano.technomagestweaks.init.ModItems;

import net.minecraft.item.ItemFood;

public class Sweets extends ItemFood{

	public Sweets(String name, int amount) {
		super(amount, false);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Main.generaltab);
		ModItems.ITEMS.add(this);
	}

}
