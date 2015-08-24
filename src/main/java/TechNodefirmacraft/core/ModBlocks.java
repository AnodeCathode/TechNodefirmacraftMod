package TechNodefirmacraft.core;

import TechNodefirmacraft.blocks.BlockLiquidMix;



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
	

	
	public static void initialise()
	{
		System.out.println("[" + ModDetails.ModName + "] Registering Blocks");
		
		registerBlocks();
		
		System.out.println("[" + ModDetails.ModName + "] Done Registering Blocks");
	}

	private static void registerBlocks()
	{
		OakMix = (new BlockLiquidMix(ModFluids.OAKMIX)).setHardness(100.0F).setLightOpacity(3).setBlockName("OakMix");
		BirchMix = (new BlockLiquidMix(ModFluids.BIRCHMIX)).setHardness(100.0F).setLightOpacity(3).setBlockName("BirchMix");
		SpruceMix = (new BlockLiquidMix(ModFluids.SPRUCEMIX)).setHardness(100.0F).setLightOpacity(3).setBlockName("SpruceMix");
		JungleMix = (new BlockLiquidMix(ModFluids.JUNGLEMIX)).setHardness(100.0F).setLightOpacity(3).setBlockName("JungleMix");
		AcaciaMix = (new BlockLiquidMix(ModFluids.ACACIAMIX)).setHardness(100.0F).setLightOpacity(3).setBlockName("AcaciaMix");
		DarkOakMix = (new BlockLiquidMix(ModFluids.DARKOAKMIX)).setHardness(100.0F).setLightOpacity(3).setBlockName("DarkOakMix");
		
	}
}
