package TechNodefirmacraft.items.itemblocks;

import TechNodefirmacraft.core.ModReferences;
import com.bioxx.tfc.Items.ItemBlocks.ItemTerraBlock;
import net.minecraft.block.Block;

public class ItemBlockIEDevice extends ItemTerraBlock {
    public ItemBlockIEDevice(Block b)
    {
        super(b);
        metaNames = new String[ModReferences.IEBLOCK.length];
        System.arraycopy(ModReferences.IEBLOCK, 0, metaNames, 0, ModReferences.IEBLOCK.length);
    }
}
