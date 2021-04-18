package com.adriano.technomagestweaks.items;

import com.adriano.technomagestweaks.Main;
import com.adriano.technomagestweaks.init.ModItems;
import com.adriano.technomagestweaks.util.Reference;
import com.feed_the_beast.mods.money.FTBMoney;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.NonNullList;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.Style;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;
public class CoinBase extends Item {

	
	public final int value;
	
	public CoinBase(String name, int value) {
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Main.generaltab);
		this.value = value;
		ModItems.ITEMS.add(this);
	}
	
	
	
	@Override
	public ActionResult<ItemStack> onItemRightClick(World world, EntityPlayer player, EnumHand hand) {
		ItemStack stack = player.getHeldItem(hand);
		if (!world.isRemote) {
			int useCount = 1;
			if(player.isSneaking()) 
				useCount = stack.getCount();
			
		int moneyAdded = this.value * useCount;
		Main.addMoney(player, moneyAdded);
		String balance = String.valueOf((int) FTBMoney.getMoney(player));
		stack.shrink(useCount);
		String displayValue = String.valueOf(moneyAdded);
		String message = "+ \u0398 " + displayValue + "! Your account total is now \u0398 " + balance + "!";
		Main.sendMessage(player, message, TextFormatting.GOLD, true);
		}
		return new ActionResult<>(EnumActionResult.SUCCESS, stack);
	}
}
