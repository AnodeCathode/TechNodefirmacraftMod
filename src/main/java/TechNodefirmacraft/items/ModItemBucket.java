package TechNodefirmacraft.items;




import cpw.mods.fml.relauncher.Side;
import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.ItemBucket;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.util.MovingObjectPosition.MovingObjectType;
import net.minecraft.world.World;

public class ModItemBucket extends ItemBucket {



	public ModItemBucket(Block block) {
		super(block);

	}	

	@Override
	public ItemStack onItemRightClick(ItemStack is, World world, EntityPlayer player)
	{
		MovingObjectPosition mop = this.getMovingObjectPositionFromPlayer(world, player, false);

        if (mop == null)
            return is;

        if (mop.typeOfHit == MovingObjectType.BLOCK)
        {
            int x = mop.blockX;
            int y = mop.blockY;
            int z = mop.blockZ;

            if (!world.canMineBlock(player, x, y, z))
                return is;

            return new ItemStack(Items.bucket);
        }
        return is;
		
	}


    @Override
	public IIcon getIconFromDamage(int i)
	{
		return this.itemIcon;
	}
    

}
