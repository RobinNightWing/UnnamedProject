package com.adriano.technomagestweaks.commands;

import com.feed_the_beast.ftbutilities.FTBUtilities;
import com.feed_the_beast.ftblib.lib.command.CmdBase;
import net.minecraft.command.CommandException;
import net.minecraft.command.ICommandSender;
import net.minecraft.server.MinecraftServer;

public class Prefix extends CmdBase {

    public Prefix() {
        super("prefix", Level.OP_OR_SP);
    }


    @Override
    public void execute(MinecraftServer server, ICommandSender sender, String[] args) throws CommandException {

    }
}

