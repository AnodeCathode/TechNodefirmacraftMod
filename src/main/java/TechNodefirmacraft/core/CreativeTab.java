package TechNodefirmacraft.core;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CreativeTab
{
    public static final CreativeTabs TNFC_TAB = new CreativeTabs(ModDetails.ModID)
    {
        @Override
        public Item getTabIconItem()
        {
            return Item.getItemFromBlock(ModBlocks.TFCBeacon);
        }
    };
}