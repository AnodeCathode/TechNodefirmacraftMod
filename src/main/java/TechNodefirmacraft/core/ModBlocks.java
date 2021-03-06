package TechNodefirmacraft.core;

import TechNodefirmacraft.blocks.BlockBase;
import TechNodefirmacraft.blocks.BlockLiquidMix;
import TechNodefirmacraft.blocks.BlockTFCBeacon;
import TechNodefirmacraft.blocks.BlockIEDevice;
import TechNodefirmacraft.items.itemblocks.ItemBlockIEDevice;
import com.bioxx.tfc.Items.ItemBlocks.ItemTerraBlock;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;

public class ModBlocks 
{
	// Blocks Render Id's
	
	// Blocks
	public static Block TFCBeacon;
	public static Block IEModBlocks;

	
	public static void initialise()
	{
		System.out.println("[" + ModDetails.ModName + "] Registering Blocks");
		TFCBeacon = (new BlockTFCBeacon().setBlockName("TFCBeacon").setBlockTextureName("beacon"));
		IEModBlocks = (new BlockIEDevice().setHardness(10F).setResistance(2.5F).setStepSound(Block.soundTypeMetal).setBlockName("IEBlocks"));
		registerBlocks();
		
		System.out.println("[" + ModDetails.ModName + "] Done Registering Blocks");
	}

	private static void registerBlocks()
	{
		GameRegistry.registerBlock(TFCBeacon, "TFCBeacon");
		GameRegistry.registerBlock(IEModBlocks, ItemBlockIEDevice.class, "IEBlocks");
	}
}
