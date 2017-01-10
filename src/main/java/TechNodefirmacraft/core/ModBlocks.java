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
	public static Block OakMix;
	public static Block BirchMix;
	public static Block SpruceMix;
	public static Block JungleMix;
	public static Block AcaciaMix;
	public static Block DarkOakMix;
	public static Block TFCBeacon;
	public static Block IEModBlocks;

	
	public static void initialise()
	{
		System.out.println("[" + ModDetails.ModName + "] Registering Blocks");
		
		OakMix = (new BlockLiquidMix(ModFluids.OAKMIX)).setHardness(100.0F).setLightOpacity(3).setBlockName("OakMix");
		BirchMix = (new BlockLiquidMix(ModFluids.BIRCHMIX)).setHardness(100.0F).setLightOpacity(3).setBlockName("BirchMix");
		SpruceMix = (new BlockLiquidMix(ModFluids.SPRUCEMIX)).setHardness(100.0F).setLightOpacity(3).setBlockName("SpruceMix");
		JungleMix = (new BlockLiquidMix(ModFluids.JUNGLEMIX)).setHardness(100.0F).setLightOpacity(3).setBlockName("JungleMix");
		AcaciaMix = (new BlockLiquidMix(ModFluids.ACACIAMIX)).setHardness(100.0F).setLightOpacity(3).setBlockName("AcaciaMix");
		DarkOakMix = (new BlockLiquidMix(ModFluids.DARKOAKMIX)).setHardness(100.0F).setLightOpacity(3).setBlockName("DarkOakMix");
		TFCBeacon = (new BlockTFCBeacon().setBlockName("TFCBeacon"));
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
