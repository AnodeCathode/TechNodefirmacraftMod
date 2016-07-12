package TechNodefirmacraft.TileEntities;

import java.util.Iterator;
import java.util.List;

import com.bioxx.tfc.api.TFCItems;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.Packet;
import net.minecraft.network.play.server.S35PacketUpdateTileEntity;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.stats.AchievementList;
import net.minecraft.tileentity.TileEntityBeacon;
import net.minecraft.util.AxisAlignedBB;

public class TETFCBeacon extends TileEntityBeacon {

	    /** List of effects that Beacon can apply */
	    public static final Potion[][] effectsList = new Potion[][] {{Potion.moveSpeed, Potion.digSpeed}, {Potion.resistance, Potion.jump}, {Potion.damageBoost}, {Potion.regeneration}};
	    @SideOnly(Side.CLIENT)
	    private long field_146016_i;
	    @SideOnly(Side.CLIENT)
	    private float field_146014_j;
	    private boolean beaconEnabled;
	    /** Level of this beacon's pyramid. */
	    private int levels = -1;
	    /** Primary potion effect given by this beacon. */
	    private int primaryEffect;
	    /** Secondary potion effect given by this beacon. */
	    private int secondaryEffect;
	    /** Item given to this beacon as payment. */
	    private ItemStack payment;
	    private String displayName;


	    @Override
	    public void updateEntity()
	    {
	        if (this.worldObj.getTotalWorldTime() % 80L == 0L)
	        {
	            this.updateStatus();
	            this.updateEffects();
	        }
	    }

	    private void updateEffects()
	    {
	        if (this.beaconEnabled && this.levels > 0 && !this.worldObj.isRemote && this.primaryEffect > 0)
	        {
	            double d0 = (double)(this.levels * 10 + 10);
	            byte b0 = 0;

	            if (this.levels >= 4 && this.primaryEffect == this.secondaryEffect)
	            {
	                b0 = 1;
	            }

	            AxisAlignedBB axisalignedbb = AxisAlignedBB.getBoundingBox((double)this.xCoord, (double)this.yCoord, (double)this.zCoord, (double)(this.xCoord + 1), (double)(this.yCoord + 1), (double)(this.zCoord + 1)).expand(d0, d0, d0);
	            axisalignedbb.maxY = (double)this.worldObj.getHeight();
	            List list = this.worldObj.getEntitiesWithinAABB(EntityPlayer.class, axisalignedbb);
	            Iterator iterator = list.iterator();
	            EntityPlayer entityplayer;

	            while (iterator.hasNext())
	            {
	                entityplayer = (EntityPlayer)iterator.next();
	                entityplayer.addPotionEffect(new PotionEffect(this.primaryEffect, 180, b0, true));
	        		if (entityplayer instanceof EntityLivingBase && this.primaryEffect == 10)
	        		{
	        			EntityLivingBase e = ((EntityLivingBase) entityplayer);
	        			if(this.worldObj.rand.nextInt(25) == 0 && e.getHealth() < e.getMaxHealth())
	        			{
	        				float diff = e.getMaxHealth() - e.getHealth();
	        				e.heal(Math.max(diff * 0.001f, 0.0001f));
	        			}
	        		}
	            }

	            if (this.levels >= 4 && this.primaryEffect != this.secondaryEffect && this.secondaryEffect > 0)
	            {
	                iterator = list.iterator();

	                while (iterator.hasNext())
	                {
	                    entityplayer = (EntityPlayer)iterator.next();
	                    entityplayer.addPotionEffect(new PotionEffect(this.secondaryEffect, 180, 0, true));
	                }
	            }
	        }
	    }


	    private void updateStatus()
	    {
	        int i = this.levels;

	        if (!this.worldObj.canBlockSeeTheSky(this.xCoord, this.yCoord + 1, this.zCoord))
	        {
	            this.beaconEnabled = false;
	            this.levels = 0;
	        }
	        else
	        {
	            this.beaconEnabled = true;
	            this.levels = 0;

	            for (int j = 1; j <= 4; this.levels = j++)
	            {
	                int k = this.yCoord - j;

	                if (k < 0)
	                {
	                    break;
	                }

	                boolean flag = true;

	                for (int l = this.xCoord - j; l <= this.xCoord + j && flag; ++l)
	                {
	                    for (int i1 = this.zCoord - j; i1 <= this.zCoord + j; ++i1)
	                    {
	                        Block block = this.worldObj.getBlock(l, k, i1);

	                        if (!block.isBeaconBase(this.worldObj, l, k, i1, xCoord, yCoord, zCoord))
	                        {
	                            flag = false;
	                            break;
	                        }
	                    }
	                }

	                if (!flag)
	                {
	                    break;
	                }
	            }

	            if (this.levels == 0)
	            {
	                this.beaconEnabled = false;
	            }
	        }

	        if (!this.worldObj.isRemote && this.levels == 4 && i < this.levels)
	        {
	            Iterator iterator = this.worldObj.getEntitiesWithinAABB(EntityPlayer.class, AxisAlignedBB.getBoundingBox((double)this.xCoord, (double)this.yCoord, (double)this.zCoord, (double)this.xCoord, (double)(this.yCoord - 4), (double)this.zCoord).expand(10.0D, 5.0D, 10.0D)).iterator();

	            while (iterator.hasNext())
	            {
	                EntityPlayer entityplayer = (EntityPlayer)iterator.next();
	                entityplayer.triggerAchievement(AchievementList.field_150965_K);
	            }
	        }
	    }

	    @SideOnly(Side.CLIENT)
	    public float func_146002_i()
	    {
	        if (!this.beaconEnabled)
	        {
	            return 0.0F;
	        }
	        else
	        {
	            int i = (int)(this.worldObj.getTotalWorldTime() - this.field_146016_i);
	            this.field_146016_i = this.worldObj.getTotalWorldTime();

	            if (i > 1)
	            {
	                this.field_146014_j -= (float)i / 40.0F;

	                if (this.field_146014_j < 0.0F)
	                {
	                    this.field_146014_j = 0.0F;
	                }
	            }

	            this.field_146014_j += 0.025F;

	            if (this.field_146014_j > 1.0F)
	            {
	                this.field_146014_j = 1.0F;
	            }

	            return this.field_146014_j;
	        }
	    }

	    /**
	     * Return the primary potion effect given by this beacon.
	     */
	    @Override
	    public int getPrimaryEffect()
	    {
	        return this.primaryEffect;
	    }

	    /**
	     * Return the secondary potion effect given by this beacon.
	     */
	    @Override
	    public int getSecondaryEffect()
	    {
	        return this.secondaryEffect;
	    }

	    /**
	     * Return the levels of this beacon's pyramid.
	     */
	    @Override
	    public int getLevels()
	    {
	        return this.levels;
	    }

	    @SideOnly(Side.CLIENT)
	    public void func_146005_c(int level)
	    {
	        this.levels = level;
	    }

	    @Override
	    public void setPrimaryEffect(int effectID)
	    {
	        this.primaryEffect = 0;

	        for (int j = 0; j < this.levels && j < 3; ++j)
	        {
	            Potion[] apotion = effectsList[j];
	            int k = apotion.length;

	            for (int l = 0; l < k; ++l)
	            {
	                Potion potion = apotion[l];

	                if (potion.id == effectID)
	                {
	                    this.primaryEffect = effectID;
	                    return;
	                }
	            }
	        }
	    }
	    @Override
	    public void setSecondaryEffect(int effectID)
	    {
	        this.secondaryEffect = 0;

	        if (this.levels >= 4)
	        {
	            for (int j = 0; j < 4; ++j)
	            {
	                Potion[] apotion = effectsList[j];
	                int k = apotion.length;

	                for (int l = 0; l < k; ++l)
	                {
	                    Potion potion = apotion[l];

	                    if (potion.id == effectID)
	                    {
	                        this.secondaryEffect = effectID;
	                        return;
	                    }
	                }
	            }
	        }
	    }

	    /**
	     * Overriden in a sign to provide the text.
	     */
	    @Override
	    public Packet getDescriptionPacket()
	    {
	        NBTTagCompound nbttagcompound = new NBTTagCompound();
	        this.writeToNBT(nbttagcompound);
	        return new S35PacketUpdateTileEntity(this.xCoord, this.yCoord, this.zCoord, 3, nbttagcompound);
	    }

	    @SideOnly(Side.CLIENT) @Override
	    public double getMaxRenderDistanceSquared()
	    {
	        return 65536.0D;
	    }
	    @Override
	    public void readFromNBT(NBTTagCompound nbtTag)
	    {
	        super.readFromNBT(nbtTag);
	        this.primaryEffect = nbtTag.getInteger("Primary");
	        this.secondaryEffect = nbtTag.getInteger("Secondary");
	        this.levels = nbtTag.getInteger("Levels");
	    }

	    @Override
	    public void writeToNBT(NBTTagCompound nbtTag)
	    {
	        super.writeToNBT(nbtTag);
	        nbtTag.setInteger("Primary", this.primaryEffect);
	        nbtTag.setInteger("Secondary", this.secondaryEffect);
	        nbtTag.setInteger("Levels", this.levels);
	    }

	    /**
	     * Returns the name of the inventory
	     */
	    public String getInventoryName()
	    {
	        return this.hasCustomInventoryName() ? this.displayName : "container.tfcbeacon";
	    }

	    /**
	     * Returns if the inventory is named
	     */
	    public boolean hasCustomInventoryName()
	    {
	        return this.displayName != null && this.displayName.length() > 0;
	    }

	    public void func_145999_a(String p_145999_1_)
	    {
	        this.displayName = p_145999_1_;
	    }

	    /**
	     * Returns the maximum stack size for a inventory slot.
	     */
	    public int getInventoryStackLimit()
	    {
	        return 1;
	    }

	    /**
	     * Do not make give this method the name canInteractWith because it clashes with Container
	     */
	    public boolean isUseableByPlayer(EntityPlayer p_70300_1_)
	    {
	        return this.worldObj.getTileEntity(this.xCoord, this.yCoord, this.zCoord) != this ? false : p_70300_1_.getDistanceSq((double)this.xCoord + 0.5D, (double)this.yCoord + 0.5D, (double)this.zCoord + 0.5D) <= 64.0D;
	    }

	    public void openInventory() {}

	    public void closeInventory() {}

	    /**
	     * Returns true if automation is allowed to insert the given stack (ignoring stack size) into the given slot.
	     */
	@Override
    public boolean isItemValidForSlot(int slot, ItemStack is)
    {
        return is.getItem() != null && 
        		(is.getItem() == TFCItems.blueSteelIngot || is.getItem() == TFCItems.redSteelIngot 
        		|| (is.getItem() == TFCItems.gemDiamond && is.getItemDamage() >= 3) 
        		|| (is.getItem() == TFCItems.gemEmerald && is.getItemDamage() >= 3));
    }

	public void handleDataPacket(int primary, int secondary) {
		this.primaryEffect = primary;
		this.secondaryEffect = secondary;
		
	}

}
