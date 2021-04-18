package com.adriano.technomagestweaks.gui;

import com.feed_the_beast.mods.money.FTBMoney;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import org.lwjgl.opengl.GL11;

public class WithdrawGUI extends GuiScreen{

    Minecraft mc = Minecraft.getMinecraft();
    private final int ImageHeight = 250, ImageWidth = 250, ImageScale = 250;
    long currentBalance;
    private static final ResourceLocation GUITextures = new ResourceLocation("technomagestweaks:textures/gui/back.png");

    private GUIWithdrawGUI.GenericButton one;
    private GUIWithdrawGUI.GenericButton ten;
    private GUIWithdrawGUI.GenericButton hundo;
    private GUIWithdrawGUI.GenericButton thousand;
    private GUIWithdrawGUI.GenericButton fiThousand;
    private GUIWithdrawGUI.GenericButton twenThousand;

    public WithdrawGUI(EntityPlayer player) {
        currentBalance = FTBMoney.getMoney(player);
    }

    @Override
    public void initGui() {
        buttonList.clear();
        int offLeft = (width - ImageWidth) / 2;
        int offTop = 0;
        buttonList.add(one = new GUIWithdrawGUI.GenericButton(offLeft + (177 - 140) + (40 / 3), 95 + offTop, 40, 20, "$1"));
        buttonList.add(ten = new GUIWithdrawGUI.GenericButton(offLeft + (248 - 140) + (40 / 3), 95 + offTop, 40, 20, "$10"));
        buttonList.add(hundo = new GUIWithdrawGUI.GenericButton(offLeft + (320 - 140) + (40 / 3), 95 + offTop, 40, 20, "$100"));
        buttonList.add(thousand = new GUIWithdrawGUI.GenericButton(offLeft + (180 - 140) + (40 / 3), 190 + offTop, 40, 20, "$1000"));
        buttonList.add(fiThousand = new GUIWithdrawGUI.GenericButton(offLeft + (250 - 140) + (40 / 3), 190 + offTop, 40, 20, "$5000"));
        buttonList.add(twenThousand = new GUIWithdrawGUI.GenericButton(offLeft + (320 - 140) + (45 / 3), 190 + offTop, 45, 20, "$20000"));
    }

    @Override
    public void updateScreen() {
        one.visible = true;
        ten.visible = true;
        hundo.visible = true;
        thousand.visible = true;
        fiThousand.visible = true;
        twenThousand.visible = true;
    }

    @Override
    public void drawScreen(int parWidth, int parHeight, float particle) {
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        GlStateManager.enableColorMaterial();
        this.mc.getTextureManager().bindTexture(GUITextures);

        //Adjust these values to move locations of elements without individual adjustment
        int offLeft = (int) ((width - ImageWidth) / 2.0F);
        int offTop = 30;
        int topOffset = 20;

        drawModalRectWithCustomSizedTexture(offLeft, offTop, 0, 0, ImageScale,ImageScale,ImageScale,ImageScale);


        super.drawScreen(parWidth, parHeight, particle);
    }
    @Override
    protected void keyTyped(char typedChar, int keyCode){
    }
    @Override
    protected void mouseClickMove(int parMouseX, int parMouseY, int parLastButtonClicked, long parTimeSinceMouseClick) { }

    @Override
    protected void actionPerformed(GuiButton button) {
        //Within the if statements write your button actions (if you have buttons)
        if(button == one){
            System.out.println("+1");
        }
        if(button == ten){
            System.out.println("+10");
        }
        if(button == hundo){
            System.out.println("+100");
        }
        if(button == thousand){
            System.out.println("+1000");
        }
        if(button == fiThousand){
            System.out.println("+5000");
        }
        if(button == twenThousand){
            System.out.println("+20000");
        }
    }

    @Override
    public void onGuiClosed() { }

    @Override
    public boolean doesGuiPauseGame() {
        return false;
    }

    @SideOnly(Side.CLIENT)
    static class GenericButton extends GuiButton{
        public GenericButton(int x, int y, int width, int height, String text) {
            super(1, x, y, width, height, text);
        }
    }
}
