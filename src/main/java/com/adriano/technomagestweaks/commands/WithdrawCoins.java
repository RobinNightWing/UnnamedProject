package com.adriano.technomagestweaks.commands;

import java.util.List;

import com.adriano.technomagestweaks.Main;
import com.adriano.technomagestweaks.util.Reference;
import com.google.common.collect.Lists;

import net.minecraft.command.CommandBase;
import net.minecraft.command.CommandException;
import net.minecraft.command.ICommandSender;
import net.minecraft.command.WrongUsageException;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.server.MinecraftServer;

public class WithdrawCoins extends CommandBase{
	private final List<String> aliases = Lists.newArrayList(Reference.MOD_ID, "wdraw", "withdraw");
	
	@Override
	public String getName() {
		return "withdraw";
	}
	
	@Override
	public List<String> getAliases() {
		return aliases;
	}
	
	@Override
	public String getUsage(ICommandSender sender) {
		return "commands.technomagestweaks.withdraw.usage";
	}
	@Override
	public int getRequiredPermissionLevel()
	{
		return 0;
	}

	@Override
	public boolean checkPermission(MinecraftServer server, ICommandSender sender)
	{
		return true;
	}

	@Override
	public void execute(MinecraftServer server, ICommandSender sender, String[] args) throws CommandException {
		EntityPlayerMP player = getCommandSenderAsPlayer(sender);
		int j = parseInt(args[1]);
		if (args.length < 1) {
			throw new WrongUsageException("/withdraw [currency] <amount>", new Object[0]);
		}
		if (args[0] == "coins") {
			Main.withdrawCoins(player, j);
		}
		else if(args[0] == "stack") {
			Main.withdrawStack(player, j);
		}
		else if(args[0] == "pile") {
			Main.withdrawStack(player, j);
		}
		else if(args[0] == "bag") {
			Main.withdrawBag(player, j);
		}
		else if(args[0] == "stack") {
			Main.withdrawBag(player, j);
		}
		else if(args[0] == "chest") {
			Main.withdrawChest(player, j);
		}
		
	}
}
