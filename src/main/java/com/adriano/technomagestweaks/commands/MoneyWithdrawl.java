package com.adriano.technomagestweaks.commands;

import java.util.ArrayList;

import com.adriano.technomagestweaks.util.Reference;
import com.google.common.collect.Lists;

import net.minecraft.command.CommandBase;
import net.minecraft.command.CommandException;
import net.minecraft.command.ICommandSender;
import net.minecraft.server.MinecraftServer;


public class MoneyWithdrawl extends CommandBase{
	
	
	@Override
	public String getName() {
		return "withdraw";
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
		if(args.length < 1) return;
		
		
	}

}
