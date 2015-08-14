package TechNodefirmacraft.handlers;


import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.block.Block;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.server.MinecraftServer;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.event.entity.player.PlayerInteractEvent.Action;
import net.minecraftforge.event.entity.living.LivingDeathEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;

import com.bioxx.tfc.Entities.Mobs.EntityBear;
import com.bioxx.tfc.api.TFCBlocks;

import TechNodefirmacraft.core.ModOptions;

public class PlayerInteractHandler {
	
	
	@SubscribeEvent
	public void onPlayerInteract(PlayerInteractEvent event)
	{
		if (event.entityPlayer.worldObj.isRemote)
			return;
		
		ItemStack itemInHand = event.entityPlayer.getCurrentEquippedItem();
		if (itemInHand == null) {
			return;
		}
		//Disable interaction between Mek and OpenBlock tanks and TFC Barrels or Vessels **Dupe bug***
		boolean validAction = event.action == Action.RIGHT_CLICK_BLOCK;
				
		if(validAction) {
			Block target = event.world.getBlock(event.x, event.y, event.z);
			if (target == TFCBlocks.Barrel || target == TFCBlocks.Vessel) {
				String name = itemInHand.getUnlocalizedName();
				if (name.contains("tile.openblocks.tank") || name.contains("tile.MachineBlock2.PortableTank")) {
					event.setCanceled(true);
					return;
				}
			}
		}
	}
	
	@SubscribeEvent
	public void onEntityLivingDeath(LivingDeathEvent event)
	{
		
		if(event.entityLiving instanceof EntityPlayer)
		{
			// You play with the bear, you sometimes get your head ripped clean off!
			if(event.source.getEntity() instanceof EntityBear && event.entityLiving.worldObj.rand. nextDouble() * 100 <= ModOptions.dropChance)
			{
				ItemStack playerHead = new ItemStack(Items.skull, 1, 3);
				playerHead.setTagCompound(new NBTTagCompound());
				EntityPlayer player = (EntityPlayer)event.entityLiving;
				String playerName = player.getCommandSenderName();
				playerHead.getTagCompound().setString("SkullOwner", playerName);
				event.entityLiving.entityDropItem(playerHead, 0.5F);
				
			}
		}		
	}
}
