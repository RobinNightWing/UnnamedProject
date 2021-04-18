package com.adriano.technomagestweaks.items;

import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class GlowingItemBase extends ItemBase{

	public GlowingItemBase(String name) {
		super(name);
		// TODO Auto-generated constructor stub
		
	}

    @SideOnly(Side.CLIENT)
    public boolean hasEffect(ItemStack stack)
    {
        return true;
    }
}
