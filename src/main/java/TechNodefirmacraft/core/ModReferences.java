package TechNodefirmacraft.core;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.relauncher.Side;
import net.minecraft.util.StatCollector;
import org.lwjgl.input.Keyboard;

public class ModReferences
{

    public static String translation(String s)
    {
        return StatCollector.translateToLocal(s);
    }

    public static boolean showShiftInformation()
    {
        return FMLCommonHandler.instance().getEffectiveSide() == Side.CLIENT && Keyboard.isKeyDown(Keyboard.KEY_LSHIFT);
    }

    public static boolean showCtrlInformation()
    {
        return FMLCommonHandler.instance().getEffectiveSide() == Side.CLIENT && Keyboard.isKeyDown(Keyboard.KEY_LCONTROL);
    }

    // Common references for meta names, etc.

    public static final String[] IEBlocks = {
            "BFCasing", "BFCore", "RawHempcrete"
    };
}
