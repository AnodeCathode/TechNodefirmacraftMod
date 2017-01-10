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

    public static final String[] IEBLOCK = {
            "BFCasing", "BFCore", "RawHempcrete"
    };

    public static final String[] MULCH = {
            "mulchAcacia", "mulchBirch", "mulchDarkOak", "mulchJungle", "mulchOak", "mulchSpruce"
    };

    public static final String[] MOLD = {
            "mold_pick", "mold_propick", "mold_shovel", "mold_axe", "mold_hammer", "mold_chisel", "mold_hoe", "mold_mace",
            "mold_javelin", "mold_saw", "mold_sword", "mold_scythe", "mold_knife", "mold_tuyere", "mold_doubleIngot",
            "mold_blank", "mold_block", "mold_bucket", "mold_grill", "mold_hopper","mold_shears", "mold_lanternCore"
    };

    public static final String[] AMALGAM = {
            "HCBlackSteelAmalgam", "HCBlueSteelAmalgam", "HCRedSteelAmalgam"
    };
}
