package TechNodefirmacraft.items.itemblocks;

import TechNodefirmacraft.core.ModReferences;
import com.bioxx.tfc.Items.ItemBlocks.ItemTerraBlock;
import net.minecraft.block.Block;

public class ItemBlockIEDevice extends ItemTerraBlock {
    public ItemBlockIEDevice(Block b)
    {
        super(b);
        metaNames = new String[ModReferences.IEBlocks.length];
        System.arraycopy(ModReferences.IEBlocks, 0, metaNames, 0, ModReferences.IEBlocks.length);
    }
}
