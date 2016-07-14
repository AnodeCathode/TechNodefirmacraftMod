package TechNodefirmacraft.Containers;

import com.bioxx.tfc.api.TFCItems;

import TechNodefirmacraft.TileEntities.TETNFCBeacon;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;

import net.minecraft.inventory.ICrafting;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;



public class ContainerTNFCBeacon extends Container{
	   private TETNFCBeacon tileBeacon;
	    /** This beacon's slot where you put in Emerald, Diamond, Gold or Wrought Iron Ingot. */
	    private final ContainerTNFCBeacon.BeaconSlot beaconSlot;
	    private int levels;
	    private int primaryeffect;
	    private int secondaryeffect;

	public ContainerTNFCBeacon(InventoryPlayer p, TETNFCBeacon tebeacon)
    {
        this.tileBeacon = tebeacon;
        this.addSlotToContainer(this.beaconSlot = new ContainerTNFCBeacon.BeaconSlot(tebeacon, 0, 136, 110));
        byte b0 = 36;
        short short1 = 137;
        int i;

        for (i = 0; i < 3; ++i)
        {
            for (int j = 0; j < 9; ++j)
            {
                this.addSlotToContainer(new Slot(p, j + i * 9 + 9, b0 + j * 18, short1 + i * 18));
            }
        }

        for (i = 0; i < 9; ++i)
        {
            this.addSlotToContainer(new Slot(p, i, b0 + i * 18, 58 + short1));
        }

        this.levels = tebeacon.getLevels();
        this.primaryeffect = tebeacon.getPrimaryEffect();
        this.secondaryeffect = tebeacon.getSecondaryEffect();
    }





	public void addCraftingToCrafters(ICrafting ic)
    {
        super.addCraftingToCrafters(ic);
        ic.sendProgressBarUpdate(this, 0, this.levels);
        ic.sendProgressBarUpdate(this, 1, this.primaryeffect);
        ic.sendProgressBarUpdate(this, 2, this.secondaryeffect);
    }

    @SideOnly(Side.CLIENT)
    public void updateProgressBar(int mode, int value)
    {
        if (mode == 0)
        {
            this.tileBeacon.getLevels(value);
        }

        if (mode == 1)
        {
            this.tileBeacon.setPrimaryEffect(value);
        }

        if (mode == 2)
        {
            this.tileBeacon.setSecondaryEffect(value);
        }
    }

    public TETNFCBeacon func_148327_e()
    {
        return this.tileBeacon;
    }

    public boolean canInteractWith(EntityPlayer p)
    {
        return this.tileBeacon.isUseableByPlayer(p);
    }

    /**
     * Called when a player shift-clicks on a slot. You must override this or you will crash when someone does that.
     */
    public ItemStack transferStackInSlot(EntityPlayer p, int slotnum)
    {
        ItemStack itemstack = null;
        Slot slot = (Slot)this.inventorySlots.get(slotnum);

        if (slot != null && slot.getHasStack())
        {
            ItemStack itemstack1 = slot.getStack();
            itemstack = itemstack1.copy();

            if (slotnum == 0)
            {
                if (!this.mergeItemStack(itemstack1, 1, 37, true))
                {
                    return null;
                }

                slot.onSlotChange(itemstack1, itemstack);
            }
            else if (!this.beaconSlot.getHasStack() && this.beaconSlot.isItemValid(itemstack1) && itemstack1.stackSize == 1)
            {
                if (!this.mergeItemStack(itemstack1, 0, 1, false))
                {
                    return null;
                }
            }
            else if (slotnum >= 1 && slotnum < 28)
            {
                if (!this.mergeItemStack(itemstack1, 28, 37, false))
                {
                    return null;
                }
            }
            else if (slotnum >= 28 && slotnum < 37)
            {
                if (!this.mergeItemStack(itemstack1, 1, 28, false))
                {
                    return null;
                }
            }
            else if (!this.mergeItemStack(itemstack1, 1, 37, false))
            {
                return null;
            }

            if (itemstack1.stackSize == 0)
            {
                slot.putStack((ItemStack)null);
            }
            else
            {
                slot.onSlotChanged();
            }

            if (itemstack1.stackSize == itemstack.stackSize)
            {
                return null;
            }

            slot.onPickupFromSlot(p, itemstack1);
        }

        return itemstack;
    }

    class BeaconSlot extends Slot
    {


        public BeaconSlot(IInventory inventory, int x, int y, int z)
        {
            super(inventory, x, y, z);
        }

        /**
         * Check if the stack is a valid item for this slot. Always true beside for the armor slots.
         */
        public boolean isItemValid(ItemStack is)
        {
            return is.getItem() != null && 
            		(is.getItem() == TFCItems.blueSteelIngot || is.getItem() == TFCItems.redSteelIngot 
            		|| (is.getItem() == TFCItems.gemDiamond && is.getItemDamage() >= 3) 
            		|| (is.getItem() == TFCItems.gemEmerald && is.getItemDamage() >= 3));
        }

        /**
         * Returns the maximum stack size for a given slot (usually the same as getInventoryStackLimit(), but 1 in the
         * case of armor slots)
         */
        public int getSlotStackLimit()
        {
            return 1;
        }
    }

	
}
