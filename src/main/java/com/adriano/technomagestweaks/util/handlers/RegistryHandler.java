package com.adriano.technomagestweaks.util.handlers;

import com.adriano.technomagestweaks.Main;
import com.adriano.technomagestweaks.commands.AdminBalance;
import com.adriano.technomagestweaks.commands.Balance;
import com.adriano.technomagestweaks.commands.Message;
import com.adriano.technomagestweaks.commands.WithdrawCoins;
import com.adriano.technomagestweaks.commands.factions.FactionChat;
import com.adriano.technomagestweaks.init.ModBlocks;
import com.adriano.technomagestweaks.init.ModEntities;
import com.adriano.technomagestweaks.init.ModItems;
import com.adriano.technomagestweaks.util.IHasModel;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@EventBusSubscriber
public class RegistryHandler {
	@SubscribeEvent
	public static void onItemRegister(RegistryEvent.Register<Item> event) {
		event.getRegistry().registerAll(ModItems.ITEMS.toArray(new Item[0]));
	}
	
	@SubscribeEvent
	public static void onBlockRegister(RegistryEvent.Register<Block> event) {
		event.getRegistry().registerAll(ModBlocks.BLOCKS.toArray(new Block[0]));
	}
	@SubscribeEvent
	public static void onModelRegister(ModelRegistryEvent event) {
		for(Item item : ModItems.ITEMS) {
			Main.proxy.registerItemRenderer(item, 0, "inventory");
			
		}
		for(Block block : ModBlocks.BLOCKS) {
				Main.proxy.registerItemRenderer(Item.getItemFromBlock(block), 0, "inventory");
			}
		RenderHandler.registerEntityRenders();
		}
		
	public static void preInitRegistries() {
		ModEntities.registerEntities();
	}

	public static void initRegistries() {
		
	}

	public static void postInitRegistries() {
		
	}

	public static void serverRegistries(FMLServerStartingEvent event) {
		event.registerServerCommand(new Balance());
		event.registerServerCommand(new AdminBalance());
		event.registerServerCommand(new WithdrawCoins());
		event.registerServerCommand(new Message());
		event.registerServerCommand(new FactionChat());
	}

}
