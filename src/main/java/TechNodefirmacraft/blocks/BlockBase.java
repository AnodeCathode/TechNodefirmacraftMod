package TechNodefirmacraft.blocks;

import TechNodefirmacraft.core.CreativeTab;
import com.bioxx.tfc.Blocks.BlockTerra;
import net.minecraft.block.material.Material;

import net.minecraft.util.IIcon;


public class BlockBase extends BlockTerra {
    protected String[] names;
    protected IIcon[] icons;

    public BlockBase()
    {
        super(Material.rock);
        this.setCreativeTab(CreativeTab.TNFC_TAB);
    }

}
