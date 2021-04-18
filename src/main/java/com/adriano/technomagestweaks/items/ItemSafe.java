package com.adriano.technomagestweaks.items;

import com.adriano.technomagestweaks.Main;
import com.adriano.technomagestweaks.gui.WithdrawGUI;
import com.adriano.technomagestweaks.util.Reference;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.world.World;

public class ItemSafe extends ItemBase{
    public ItemSafe() {
        super("mysterious_safe");
    }

    public ActionResult<ItemStack> onItemRightClick(World world, EntityPlayer player, EnumHand hand) {
        ItemStack stack = player.getHeldItem(hand);
        if(world.isRemote) {
            player.openGui(Main.instance, Reference.WITHDRAWGUI, world, (int) player.posX, (int) player.posY, (int) player.posZ);
            return new ActionResult<>(EnumActionResult.SUCCESS, stack);
        }
            return new ActionResult<>(EnumActionResult.SUCCESS, stack);
        }
}
