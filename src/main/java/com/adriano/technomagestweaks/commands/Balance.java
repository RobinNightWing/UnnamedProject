package com.adriano.technomagestweaks.commands;

import java.util.ArrayList;
import java.util.List;

import com.adriano.technomagestweaks.util.Reference;
import com.feed_the_beast.mods.money.FTBMoney;
import com.google.common.collect.Lists;

import net.minecraft.command.CommandBase;
import net.minecraft.command.CommandException;
import net.minecraft.command.ICommandSender;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.server.MinecraftServer;

public class Balance extends CommandBase{
	private final List<String> aliases = Lists.newArrayList(Reference.MOD_ID, "bal", "balance");
	
	@Override
	public String getName() {
		return "balance";
	}
	
	@Override
	public List<String> getAliases() {
		return aliases;
	}
	
	@Override
	public String getUsage(ICommandSender sender) {
		return "commands.technomagestweaks.balance.usage";
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
	public void execute(MinecraftServer server, ICommandSender sender, String[] args) throws CommandException
	{
		EntityPlayerMP player = getCommandSenderAsPlayer(sender);
		player.sendMessage(FTBMoney.moneyComponent(FTBMoney.getMoney(player)));
	}

}
