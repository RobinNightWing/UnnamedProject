package com.adriano.technomagestweaks.commands;

import java.awt.TextComponent;
import java.util.Arrays;
import java.util.List;

import net.minecraft.command.CommandException;
import net.minecraft.command.ICommandSender;
import net.minecraft.command.PlayerNotFoundException;
import net.minecraft.command.WrongUsageException;
import net.minecraft.command.server.CommandMessage;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.util.text.TextComponentTranslation;
import net.minecraft.util.text.TextFormatting;

public class Message extends CommandMessage{
	
	@Override
    public List<String> getAliases()
    {
        return Arrays.<String>asList("w", "msg", "whisper");
    }

	
	@Override 
	public void execute(MinecraftServer server, ICommandSender sender, String[] args) throws CommandException
	{
	    if (args.length < 2)
	    {
	        throw new WrongUsageException("commands.message.usage", new Object[0]);
	    }
	    else
	    {
	        EntityPlayer entityplayer = getPlayer(server, sender, args[0]);
	
	        if (entityplayer == sender)
	        {
	            throw new PlayerNotFoundException("commands.message.sameTarget");
	        }
	        else
	        { //.getStyle().setColor(TextFormatting.WHITE).setItalic(Boolean.valueOf(true));
	            ITextComponent messageContent = getChatComponentFromNthArg(sender, args, 1, !(sender instanceof EntityPlayer));
	            ITextComponent senderName = sender.getDisplayName();
	            ITextComponent recieverName = entityplayer.getDisplayName();
	            ITextComponent outgoing = new TextComponentString("§6[");
	            ITextComponent reciept = new TextComponentString("§6[§fYou -> ");
	            reciept.appendSibling(recieverName);
	            reciept.appendText("§6]§f ");
	            reciept.appendSibling(messageContent);
	            outgoing.appendSibling(senderName);
	            outgoing.appendText(" -> You§6]§f ");
	            outgoing.appendSibling(messageContent);
	            entityplayer.sendMessage(outgoing);
	            sender.sendMessage(reciept);
	        }
	    }
}
}
