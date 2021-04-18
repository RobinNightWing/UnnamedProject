package com.adriano.technomagestweaks;

import java.util.ArrayList;
import java.util.List;

import com.adriano.technomagestweaks.creativetabs.CustomTab;
import com.adriano.technomagestweaks.init.ModItems;
import com.adriano.technomagestweaks.proxy.CommonProxy;
import com.adriano.technomagestweaks.util.Reference;
import com.adriano.technomagestweaks.util.handlers.RegistryHandler;
import com.feed_the_beast.mods.money.FTBMoney;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.util.text.TextFormatting;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;

@Mod(modid = Reference.MOD_ID, name = Reference.NAME, version = Reference.VERSION, dependencies = "required-after:ftbmoney")
public class Main {
	
	@Instance
	public static Main instance;
	
	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.COMMON_PROXY_CLASS)
	public static CommonProxy proxy;

	public static CreativeTabs tab;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		RegistryHandler.preInitRegistries();
	}
	
	@EventHandler
	public void init(FMLInitializationEvent event)
	{
		RegistryHandler.initRegistries();
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event)
	{
		RegistryHandler.postInitRegistries();
	}
	
	@EventHandler
	public void serverInit(FMLServerStartingEvent event)
	{
		RegistryHandler.serverRegistries(event);
	}
	 public static void addMoney(EntityPlayer player, int amount) {
	        long current = FTBMoney.getMoney(player);
	        FTBMoney.setMoney(player, current + amount);
	    }
	 
	 public static void sendMessage(EntityPlayer player, String message, TextFormatting color, Boolean isBold) {
		 TextComponentString component = new TextComponentString(message);
		 component.getStyle().setColor(color).setBold(isBold);
		 player.sendStatusMessage(component, true);
	 }
	 
	 public static void withdrawCoins(EntityPlayer player, int amount) {
		 int withdrawAmount = amount * 5;
		 long currentBalance = FTBMoney.getMoney(player); 
		 
		 if(currentBalance > withdrawAmount) {
			 ItemStack stack = new ItemStack(ModItems.COIN);
			 long newBalance = currentBalance - withdrawAmount;
			 FTBMoney.setMoney(player, newBalance);
			 for(int i = 0; i < amount; i++) {
				 player.addItemStackToInventory(stack);
			 }
		 }
		 else {
			 Main.sendMessage(player, "You do not have enough money for that!", TextFormatting.RED, false);
		 }
	 }
	 
	
	 public static void withdrawStack(EntityPlayer player, int amount) {
		 int withdrawAmount = amount * 250;
		 long currentBalance = FTBMoney.getMoney(player); 
		 
		 if(currentBalance > withdrawAmount) {
			 ItemStack stack = new ItemStack(ModItems.COIN_STACK);
			 long newBalance = currentBalance - withdrawAmount;
			 FTBMoney.setMoney(player, newBalance);
			 for(int i = 0; i < amount; i++) {
				 player.addItemStackToInventory(stack);
			 }
		 }
		 else {
			 Main.sendMessage(player, "You do not have enough money for that!", TextFormatting.RED, false);
		 }
	 }
	 
		 
	 public static void withdrawBag(EntityPlayer player, int amount) {
		 int withdrawAmount = amount * 5000;
		 long currentBalance = FTBMoney.getMoney(player); 
		 
		 if(currentBalance > withdrawAmount) {
			 ItemStack stack = new ItemStack(ModItems.COIN_BAG);
			 long newBalance = currentBalance - withdrawAmount;
			 FTBMoney.setMoney(player, newBalance);
			 for(int i = 0; i < amount; i++) {
				 player.addItemStackToInventory(stack);
			 }
		 }
		 else {
			 Main.sendMessage(player, "You do not have enough money for that!", TextFormatting.RED, false);
		 }
	 }
	 
	 
	 public static void withdrawChest(EntityPlayer player, int amount) {
		 int withdrawAmount = amount * 20000;
		 long currentBalance = FTBMoney.getMoney(player); 
		 
		 if(currentBalance > withdrawAmount) {
			 ItemStack stack = new ItemStack(ModItems.COIN_CHEST);
			 long newBalance = currentBalance - withdrawAmount;
			 FTBMoney.setMoney(player, newBalance);
			 for(int i = 0; i < amount; i++) {
				 player.addItemStackToInventory(stack);
			 }
		 }
	 
		 else {
			 Main.sendMessage(player, "You do not have enough money for that!", TextFormatting.RED, false);
		 }
	 }
	 
	 
	 public static boolean checkBalance(EntityPlayer player, int withdrawAmount) {
		 boolean check;	 
		 if(FTBMoney.getMoney(player) < withdrawAmount) {
			return false;
		 }
		 
		 else {
			 return true;
		 }
	 }
	 
	 
	 
	 
	 
	 
	 
	 
	 public static final CreativeTabs generaltab = new CustomTab(ModItems.COIN_CHEST);
}