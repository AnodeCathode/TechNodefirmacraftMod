package TechNodefirmacraft.blocks;

import TechNodefirmacraft.TechNodefirmacraftCore;
import TechNodefirmacraft.TileEntities.TETFCBeacon;
import net.minecraft.block.BlockBeacon;
import net.minecraft.client.gui.inventory.GuiBeacon;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityBeacon;
import net.minecraft.world.World;

public class BlockTFCBeacon extends BlockBeacon {
	
	
    public BlockTFCBeacon()
    {
        super();
        
        
    }

    /**
     * Returns a new instance of a block's tile entity class. Called on placing the block.
     */
    @Override
    public TileEntity createNewTileEntity(World world, int foo)
    {
        return new TETFCBeacon();
    }
    
    /**
     * Called when the block is placed in the world.
     */
    @Override
    public void onBlockPlacedBy(World world, int x, int y, int z, EntityLivingBase player, ItemStack is)
    {
        if (is.hasDisplayName())
        {
            ((TETFCBeacon)world.getTileEntity(x, y, z)).func_145999_a(is.getDisplayName());
        }
    }
    
    /*
    * Called upon block activation (right click on the block.)
    */
   @Override
    public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int metadata, float sideX, float sideY, float sideZ)
   {
       if (world.isRemote)
       {
           return true;
       }
       else
       {
           TETFCBeacon tebeacon = (TETFCBeacon)world.getTileEntity(x, y, z);

           if (tebeacon != null)
           {
                   player.openGui(TechNodefirmacraft.TechNodefirmacraft.instance, 0, world, x, y, z);
           }

           return true;
       }
   }


}
