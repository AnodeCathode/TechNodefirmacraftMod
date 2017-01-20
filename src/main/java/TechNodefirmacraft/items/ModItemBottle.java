package TechNodefirmacraft.items;

import TechNodefirmacraft.core.ModDetails;
import com.bioxx.tfc.Items.ItemTerra;
import com.bioxx.tfc.Reference;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.util.MovingObjectPosition.MovingObjectType;
import net.minecraft.world.World;
import net.minecraftforge.fluids.FluidContainerRegistry;

public class ModItemBottle extends ItemBase {


    public ModItemBottle() {
        super();
        this.setContainerItem(Items.glass_bottle);

    }

    @Override
    public ItemStack onItemRightClick(ItemStack is, World world, EntityPlayer player) {
        MovingObjectPosition mop = this.getMovingObjectPositionFromPlayer(world, player, false);

        if (mop == null)
            return is;

        if (mop.typeOfHit == MovingObjectType.BLOCK) {
            int x = mop.blockX;
            int y = mop.blockY;
            int z = mop.blockZ;

            if (!world.canMineBlock(player, x, y, z))
                return is;

            return new ItemStack(this);
        }
        return is;

    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IIconRegister registerer)
    {
        this.itemIcon = registerer.registerIcon(ModDetails.ModID + ":" + "Glass Bottle Overlay");
    }

    @Override
    @SideOnly(Side.CLIENT)
    public IIcon getIcon(ItemStack stack, int pass)
    {
        return pass == 1 ? this.itemIcon : this.getContainerItem().getIcon(stack, pass);
    }

    @Override
    @SideOnly(Side.CLIENT)
    public int getColorFromItemStack(ItemStack is, int pass)
    {
        return pass == 1 ? FluidContainerRegistry.getFluidForFilledItem(is).getFluid().getColor() : super.getColorFromItemStack(is, pass);
    }

    @Override
    @SideOnly(Side.CLIENT)
    public boolean requiresMultipleRenderPasses()
    {
        return true;
    }



}
