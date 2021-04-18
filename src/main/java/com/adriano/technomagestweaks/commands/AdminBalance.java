package com.adriano.technomagestweaks.commands;

import java.util.Collections;
import java.util.List;

import javax.annotation.Nullable;

import com.adriano.technomagestweaks.util.Reference;
import com.feed_the_beast.mods.money.FTBMoney;
import com.google.common.collect.Lists;

import net.minecraft.command.CommandBase;
import net.minecraft.command.CommandException;
import net.minecraft.command.ICommandSender;
import net.minecraft.command.WrongUsageException;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.math.BlockPos;

public class AdminBalance extends CommandBase{
		private final List<String> aliases = Lists.newArrayList(Reference.MOD_ID, "abal", "adminbal", "adminbalance", "abalance");
		
		@Override
		public String getName() {
			return "adminbalance";
		}
		
		@Override
		public List<String> getAliases() {
			return aliases;
		}
		
		@Override
		public String getUsage(ICommandSender sender) {
			return "commands.technomagestweaks.adminbalance.usage";
		}
		@Override
		public int getRequiredPermissionLevel()
		{
			return 4;
		}

		@Override
		public boolean checkPermission(MinecraftServer server, ICommandSender sender)
		{
			return true;
		}

		@Override
		public List<String> getTabCompletions(MinecraftServer server, ICommandSender sender, String[] args, @Nullable BlockPos pos)
		{
			if (args.length == 0)
			{
				return Collections.emptyList();
			}
			else if (isUsernameIndex(args, args.length - 1))
			{
				return getListOfStringsMatchingLastWord(args, server.getOnlinePlayerNames());
			}

			return super.getTabCompletions(server, sender, args, pos);
		}
		@Override
	    public boolean isUsernameIndex(String[] args, int index)
	    {
	        return index == 0;
	    }
		
		@Override
		public void execute(MinecraftServer server, ICommandSender sender, String[] args) throws CommandException
		{
			if (args.length < 1) {
				throw new WrongUsageException("/adminbalance [player]", new Object[0]);
			}
			EntityPlayerMP player = (EntityPlayerMP) getEntity(server, sender, args[0]);;
			sender.sendMessage(FTBMoney.moneyComponent(FTBMoney.getMoney(player)));
		}

}
