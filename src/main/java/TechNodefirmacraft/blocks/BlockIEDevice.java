package TechNodefirmacraft.blocks;

import TechNodefirmacraft.core.ModDetails;
import TechNodefirmacraft.core.ModReferences;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;

import java.util.List;

public class BlockIEDevice extends BlockBase {
    public IIcon[] topIcon;
    public IIcon[] sideIcon;

    public BlockIEDevice() {
        super();
        names = new String[ModReferences.IEBLOCK.length];
        System.arraycopy(ModReferences.IEBLOCK, 0, names, 0, 3);
        topIcon = new IIcon[names.length];
        sideIcon = new IIcon[names.length];
    }

    @SideOnly(Side.CLIENT)
    @Override
    public IIcon getIcon(int par1, int par2)
    {
            if (par1 == 1 || par1 == 0)
                return topIcon[par2];
            else
                return sideIcon[par2];
    }

    @SideOnly(Side.CLIENT)
    @Override
    public void getSubBlocks(Item par1, CreativeTabs par2CreativeTabs, List list)
    {
        for(int i = 0; i < names.length; i++)
            list.add(new ItemStack(this, 1, i));
    }

    @Override
    public int damageDropped(int meta) { return meta; }

    @SideOnly(Side.CLIENT)
    @Override
    public void registerBlockIcons(IIconRegister reg)
    {
        for(int i = 0; i < names.length; i++) {
            topIcon[i] = reg.registerIcon(ModDetails.ModID + ":" + names[i] + "Top");
            sideIcon[i] = reg.registerIcon(ModDetails.ModID + ":" + names[i] + "Side");
        }
    }
}
