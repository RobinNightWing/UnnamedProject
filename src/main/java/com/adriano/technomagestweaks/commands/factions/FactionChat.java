package com.adriano.technomagestweaks.commands.factions;

import com.adriano.technomagestweaks.Main;
import com.adriano.technomagestweaks.util.Reference;
import com.feed_the_beast.ftblib.FTBLib;
import com.feed_the_beast.ftblib.lib.command.CmdBase;
import com.feed_the_beast.ftblib.lib.command.CommandUtils;
import com.feed_the_beast.ftblib.lib.data.FTBLibAPI;
import com.feed_the_beast.ftblib.lib.data.ForgePlayer;
import com.feed_the_beast.ftblib.lib.data.ForgeTeam;
import com.feed_the_beast.ftblib.lib.data.Universe;
import com.google.common.collect.Lists;
import net.minecraft.command.CommandException;
import net.minecraft.command.ICommandSender;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.server.MinecraftServer;
import net.minecraft.server.management.PlayerList;
import net.minecraft.util.text.TextComponentString;

import java.util.List;

public class FactionChat extends CmdBase {

    private final List<String> aliases = Lists.newArrayList(Reference.MOD_ID, "fchat", "chat", "factionchat");

    public FactionChat() {
        super("fchat", Level.ALL);
    }


    @Override
    public List<String> getAliases() {
        return aliases;
    }

    @Override
    public void execute(MinecraftServer server, ICommandSender sender, String[] args) throws CommandException {

        ForgePlayer fPlayer = CommandUtils.getForgePlayer(getCommandSenderAsPlayer(sender));

        if(!fPlayer.hasTeam()) {
            throw FTBLib.error(sender, "ftblib.lang.team.error.no_team");
        } else {
            String displayNameOfSender = fPlayer.getDisplayNameString();
            String message = "U+00A78[U+00A79" + displayNameOfSender + "U+00A78]U+00A7f" + args;
            TextComponentString component = new TextComponentString(message);
            String t = fPlayer.team.getId();
            ForgeTeam team = Universe.get().getTeam(t);
            for (ForgePlayer player : team.getMembers()) {
                EntityPlayer regPlayer = player.getPlayer();
                regPlayer.sendStatusMessage(component, true);
            }
        }

    }
}
