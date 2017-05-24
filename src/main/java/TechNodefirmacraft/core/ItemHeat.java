package TechNodefirmacraft.core;

import com.bioxx.tfc.api.HeatIndex;
import com.bioxx.tfc.api.HeatRegistry;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class ItemHeat
{
    public static void setupItemHeat() {
        HeatRegistry manager = HeatRegistry.getInstance();

        manager.addIndex(new HeatIndex(new ItemStack(Items.potionitem, 1, 8193), 1, 500, new ItemStack(Items.potionitem, 1, 16385)).setMinMax(16385));
        manager.addIndex(new HeatIndex(new ItemStack(Items.potionitem, 1, 8194), 1, 500, new ItemStack(Items.potionitem, 1, 16386)).setMinMax(16386));
        manager.addIndex(new HeatIndex(new ItemStack(Items.potionitem, 1, 8195), 1, 500, new ItemStack(Items.potionitem, 1, 16387)).setMinMax(16387));
        manager.addIndex(new HeatIndex(new ItemStack(Items.potionitem, 1, 8196), 1, 500, new ItemStack(Items.potionitem, 1, 16388)).setMinMax(16388));
        manager.addIndex(new HeatIndex(new ItemStack(Items.potionitem, 1, 8197), 1, 500, new ItemStack(Items.potionitem, 1, 16389)).setMinMax(16389));
        manager.addIndex(new HeatIndex(new ItemStack(Items.potionitem, 1, 8198), 1, 500, new ItemStack(Items.potionitem, 1, 16390)).setMinMax(16390));
        manager.addIndex(new HeatIndex(new ItemStack(Items.potionitem, 1, 8200), 1, 500, new ItemStack(Items.potionitem, 1, 16392)).setMinMax(16392));
        manager.addIndex(new HeatIndex(new ItemStack(Items.potionitem, 1, 8201), 1, 500, new ItemStack(Items.potionitem, 1, 16393)).setMinMax(16393));
        manager.addIndex(new HeatIndex(new ItemStack(Items.potionitem, 1, 8202), 1, 500, new ItemStack(Items.potionitem, 1, 16394)).setMinMax(16394));
        manager.addIndex(new HeatIndex(new ItemStack(Items.potionitem, 1, 8204), 1, 500, new ItemStack(Items.potionitem, 1, 16396)).setMinMax(16396));
        manager.addIndex(new HeatIndex(new ItemStack(Items.potionitem, 1, 8205), 1, 500, new ItemStack(Items.potionitem, 1, 16397)).setMinMax(16397));
        manager.addIndex(new HeatIndex(new ItemStack(Items.potionitem, 1, 8206), 1, 500, new ItemStack(Items.potionitem, 1, 16398)).setMinMax(16398));

        //Enhance Potion
        manager.addIndex(new HeatIndex(new ItemStack(Items.potionitem, 1, 8225), 1, 500, new ItemStack(Items.potionitem, 1, 16417)).setMinMax(16417));
        manager.addIndex(new HeatIndex(new ItemStack(Items.potionitem, 1, 8226), 1, 500, new ItemStack(Items.potionitem, 1, 16418)).setMinMax(16418));
        manager.addIndex(new HeatIndex(new ItemStack(Items.potionitem, 1, 8228), 1, 500, new ItemStack(Items.potionitem, 1, 16420)).setMinMax(16420));
        manager.addIndex(new HeatIndex(new ItemStack(Items.potionitem, 1, 8229), 1, 500, new ItemStack(Items.potionitem, 1, 16421)).setMinMax(16421));
        manager.addIndex(new HeatIndex(new ItemStack(Items.potionitem, 1, 8201), 1, 500, new ItemStack(Items.potionitem, 1, 16425)).setMinMax(16425));
        manager.addIndex(new HeatIndex(new ItemStack(Items.potionitem, 1, 8233), 1, 500, new ItemStack(Items.potionitem, 1, 16428)).setMinMax(16428));

        //Extend Potion
        manager.addIndex(new HeatIndex(new ItemStack(Items.potionitem, 1, 8257), 1, 500, new ItemStack(Items.potionitem, 1, 16449)).setMinMax(16449));
        manager.addIndex(new HeatIndex(new ItemStack(Items.potionitem, 1, 8258), 1, 500, new ItemStack(Items.potionitem, 1, 16450)).setMinMax(16450));
        manager.addIndex(new HeatIndex(new ItemStack(Items.potionitem, 1, 8259), 1, 500, new ItemStack(Items.potionitem, 1, 16451)).setMinMax(16451));
        manager.addIndex(new HeatIndex(new ItemStack(Items.potionitem, 1, 8260), 1, 500, new ItemStack(Items.potionitem, 1, 16452)).setMinMax(16452));
        manager.addIndex(new HeatIndex(new ItemStack(Items.potionitem, 1, 8262), 1, 500, new ItemStack(Items.potionitem, 1, 16454)).setMinMax(16454));
        manager.addIndex(new HeatIndex(new ItemStack(Items.potionitem, 1, 8264), 1, 500, new ItemStack(Items.potionitem, 1, 16456)).setMinMax(16456));
        manager.addIndex(new HeatIndex(new ItemStack(Items.potionitem, 1, 8265), 1, 500, new ItemStack(Items.potionitem, 1, 16457)).setMinMax(16457));
        manager.addIndex(new HeatIndex(new ItemStack(Items.potionitem, 1, 8266), 1, 500, new ItemStack(Items.potionitem, 1, 16458)).setMinMax(16458));
        manager.addIndex(new HeatIndex(new ItemStack(Items.potionitem, 1, 8269), 1, 500, new ItemStack(Items.potionitem, 1, 16461)).setMinMax(16461));
        manager.addIndex(new HeatIndex(new ItemStack(Items.potionitem, 1, 8270), 1, 500, new ItemStack(Items.potionitem, 1, 16462)).setMinMax(16462));

        System.out.println("[" + ModDetails.ModName + "] Done Registering ItemHeat");
    }
}
