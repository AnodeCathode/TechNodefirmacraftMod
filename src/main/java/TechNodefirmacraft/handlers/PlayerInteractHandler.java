package TechNodefirmacraft.handlers;

import TechNodefirmacraft.core.ModDetails;
import net.minecraft.item.ItemStack;
import net.minecraft.block.Block;
import com.bioxx.tfc.api.TFCBlocks;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.event.entity.player.PlayerInteractEvent.Action;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;


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
		System.out.println("[" + ModDetails.ModName + "] Done Registering Items");	
		
	}
}
