package com.adriano.technomagestweaks.creativetabs;

import com.adriano.technomagestweaks.Main;
import com.adriano.technomagestweaks.init.ModItems;
import com.adriano.technomagestweaks.util.Reference;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class CustomTab extends CreativeTabs{

	private Item icon;
	public CustomTab(Item obj) {
		super(Reference.MOD_ID);
		this.icon = obj;
	}
	@Override
	public ItemStack getTabIconItem() {
		return new ItemStack(icon); 
	}
}
