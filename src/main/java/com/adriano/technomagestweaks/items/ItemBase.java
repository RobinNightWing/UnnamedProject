package com.adriano.technomagestweaks.items;

import com.adriano.technomagestweaks.Main;
import com.adriano.technomagestweaks.init.ModItems;
import com.adriano.technomagestweaks.util.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBase extends Item{

	public ItemBase(String name) {
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Main.generaltab);
		
		ModItems.ITEMS.add(this);
	}
	
}
