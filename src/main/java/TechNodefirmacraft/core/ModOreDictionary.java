package TechNodefirmacraft.core;

import com.bioxx.tfc.api.TFCItems;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;
import cpw.mods.fml.common.Loader;
import cpw.mods.fml.common.registry.GameData;

import com.bioxx.tfc.api.TFCBlocks;
import com.bioxx.tfc.api.TFCItems;


public class ModOreDictionary {

	public static void register() {
		// Register all the Ore Dictionary 'stuff' that used to be done by MT
		System.out.println("[" + ModDetails.ModName + "] Registering OreDictionary entries");
		
		//Minecraft stuff
		final int WILD = OreDictionary.WILDCARD_VALUE;
		OreDictionary.registerOre("craftingPiston", new ItemStack(Blocks.piston, 1, WILD));
		OreDictionary.registerOre("craftingPiston", new ItemStack(Blocks.sticky_piston, 1, WILD));
		OreDictionary.registerOre("fenceGate", new ItemStack(Blocks.fence_gate, 1, WILD));
		OreDictionary.registerOre("fenceWood", new ItemStack(Blocks.fence, 1, WILD));
		OreDictionary.registerOre("toolFlintSteel", new ItemStack(Items.flint_and_steel, 1, WILD));

		//TFC stuff
		OreDictionary.registerOre("oreAluminum", new ItemStack(TFCItems.oreChunk, 1, 30));
		OreDictionary.registerOre("craftingChest", new ItemStack(TFCBlocks.chest, 1, WILD));
		OreDictionary.registerOre("fenceGate", new ItemStack(TFCBlocks.fenceGate, 1, WILD));
		OreDictionary.registerOre("fenceGate", new ItemStack(TFCBlocks.fenceGate2, 1, WILD));
		OreDictionary.registerOre("fenceWood", new ItemStack(TFCBlocks.fence, 1, WILD));
		OreDictionary.registerOre("fenceGate", new ItemStack(TFCBlocks.fenceGate, 1, WILD));
		OreDictionary.registerOre("plateIron", new ItemStack(TFCItems.wroughtIronSheet, 1, WILD));

		//TFC In-World Ores
        OreDictionary.registerOre("tfcCopper", new ItemStack(TFCBlocks.ore, 1, 0));
        OreDictionary.registerOre("tfcCopper", new ItemStack(TFCBlocks.ore, 1, 9));
        OreDictionary.registerOre("tfcCopper", new ItemStack(TFCBlocks.ore, 1, 13));
        OreDictionary.registerOre("tfcGold", new ItemStack(TFCBlocks.ore, 1, 1));
        OreDictionary.registerOre("tfcPlatinum", new ItemStack(TFCBlocks.ore, 1, 2));
        OreDictionary.registerOre("tfcIron", new ItemStack(TFCBlocks.ore, 1, 3));
		OreDictionary.registerOre("tfcIron", new ItemStack(TFCBlocks.ore, 1, 10));
		OreDictionary.registerOre("tfcIron", new ItemStack(TFCBlocks.ore, 1, 11));
		OreDictionary.registerOre("tfcSilver", new ItemStack(TFCBlocks.ore, 1, 4));
		OreDictionary.registerOre("tfcCassiterite", new ItemStack(TFCBlocks.ore, 1, 5));
		OreDictionary.registerOre("tfcGalena", new ItemStack(TFCBlocks.ore, 1, 6));
		OreDictionary.registerOre("tfcBismuth", new ItemStack(TFCBlocks.ore, 1, 7));
		OreDictionary.registerOre("tfcGarnierite", new ItemStack(TFCBlocks.ore, 1, 8));
		OreDictionary.registerOre("tfcSphalerite", new ItemStack(TFCBlocks.ore, 1, 12));
		OreDictionary.registerOre("tfcCoal", new ItemStack(TFCBlocks.ore, 1, 14));
		OreDictionary.registerOre("tfcCoal", new ItemStack(TFCBlocks.ore, 1, 15));
		OreDictionary.registerOre("tfcKaolinite", new ItemStack(TFCBlocks.ore2, 1, 0));
		OreDictionary.registerOre("tfcGypsum", new ItemStack(TFCBlocks.ore2, 1, 1));
		OreDictionary.registerOre("tfcScheelite", new ItemStack(TFCBlocks.ore2, 1, 2));
		OreDictionary.registerOre("tfcScapolite", new ItemStack(TFCBlocks.ore2, 1, 3));
		OreDictionary.registerOre("tfcGraphite", new ItemStack(TFCBlocks.ore2, 1, 4));
		OreDictionary.registerOre("tfcKimberlite", new ItemStack(TFCBlocks.ore2, 1, 5));
		OreDictionary.registerOre("tfcPetrifiedWood", new ItemStack(TFCBlocks.ore2, 1, 6));
		OreDictionary.registerOre("tfcStrontium", new ItemStack(TFCBlocks.ore2, 1, 7));
		OreDictionary.registerOre("tfcJet", new ItemStack(TFCBlocks.ore2, 1, 8));
		OreDictionary.registerOre("tfcOsmium", new ItemStack(TFCBlocks.ore2, 1, 9));
		OreDictionary.registerOre("tfcPitchBlende", new ItemStack(TFCBlocks.ore2, 1, 10));
		OreDictionary.registerOre("tfcRedstone", new ItemStack(TFCBlocks.ore2, 1, 11));
		OreDictionary.registerOre("tfcRedstone", new ItemStack(TFCBlocks.ore2, 1, 12));
		OreDictionary.registerOre("tfcSaltpeter", new ItemStack(TFCBlocks.ore2, 1, 13));
		OreDictionary.registerOre("tfcBauxite", new ItemStack(TFCBlocks.ore2, 1, 14));
		OreDictionary.registerOre("tfcSylvite", new ItemStack(TFCBlocks.ore2, 1, 15));
		OreDictionary.registerOre("tfcBorax", new ItemStack(TFCBlocks.ore3, 1, 0));
		OreDictionary.registerOre("tfcApatite", new ItemStack(TFCBlocks.ore3, 1, 1));
		OreDictionary.registerOre("tfcLapis", new ItemStack(TFCBlocks.ore3, 1, 2));

		//TFC Tools
		//Hammers
		OreDictionary.registerOre("craftingToolLowHammer", new ItemStack(TFCItems.wroughtIronHammer, 1, WILD));
		OreDictionary.registerOre("craftingToolLowHammer", new ItemStack(TFCItems.steelHammer, 1, WILD));
		OreDictionary.registerOre("craftingToolLowHammer", new ItemStack(TFCItems.blackSteelHammer, 1, WILD));
		OreDictionary.registerOre("craftingToolLowHammer", new ItemStack(TFCItems.blueSteelHammer, 1, WILD));
		OreDictionary.registerOre("craftingToolLowHammer", new ItemStack(TFCItems.redSteelHammer, 1, WILD));
		OreDictionary.registerOre("craftingToolMediumHammer", new ItemStack(TFCItems.steelHammer, 1, WILD));
		OreDictionary.registerOre("craftingToolMediumHammer", new ItemStack(TFCItems.blackSteelHammer, 1, WILD));
		OreDictionary.registerOre("craftingToolMediumHammer", new ItemStack(TFCItems.blueSteelHammer, 1, WILD));
		OreDictionary.registerOre("craftingToolMediumHammer", new ItemStack(TFCItems.redSteelHammer, 1, WILD));
		OreDictionary.registerOre("craftingToolHardHammer", new ItemStack(TFCItems.blueSteelHammer, 1, WILD));
		OreDictionary.registerOre("craftingToolHardHammer", new ItemStack(TFCItems.redSteelHammer, 1, WILD));
		//Chisels
		OreDictionary.registerOre("craftingToolMediumChisel", new ItemStack(TFCItems.steelChisel, 1, WILD));
		OreDictionary.registerOre("craftingToolMediumChisel", new ItemStack(TFCItems.blackSteelChisel, 1, WILD));
		OreDictionary.registerOre("craftingToolMediumChisel", new ItemStack(TFCItems.blueSteelChisel, 1, WILD));
		OreDictionary.registerOre("craftingToolMediumChisel", new ItemStack(TFCItems.redSteelChisel, 1, WILD));
		OreDictionary.registerOre("craftingToolHardChisel", new ItemStack(TFCItems.blueSteelChisel, 1, WILD));
		OreDictionary.registerOre("craftingToolHardChisel", new ItemStack(TFCItems.redSteelChisel, 1, WILD));
		//Saws
		OreDictionary.registerOre("craftingToolSaw", new ItemStack(TFCItems.wroughtIronSaw, 1, WILD));
		OreDictionary.registerOre("craftingToolSaw", new ItemStack(TFCItems.steelSaw, 1, WILD));
		OreDictionary.registerOre("craftingToolSaw", new ItemStack(TFCItems.blackSteelSaw, 1, WILD));
		OreDictionary.registerOre("craftingToolSaw", new ItemStack(TFCItems.redSteelSaw, 1, WILD));
		OreDictionary.registerOre("craftingToolSaw", new ItemStack(TFCItems.blueSteelSaw, 1, WILD));
		OreDictionary.registerOre("craftingToolMediumSaw", new ItemStack(TFCItems.steelSaw, 1, WILD));
		OreDictionary.registerOre("craftingToolMediumSaw", new ItemStack(TFCItems.blackSteelSaw, 1, WILD));
		OreDictionary.registerOre("craftingToolMediumSaw", new ItemStack(TFCItems.redSteelSaw, 1, WILD));
		OreDictionary.registerOre("craftingToolMediumSaw", new ItemStack(TFCItems.blueSteelSaw, 1, WILD));
		OreDictionary.registerOre("craftingToolHardSaw", new ItemStack(TFCItems.redSteelSaw, 1, WILD));
		OreDictionary.registerOre("craftingToolHardSaw", new ItemStack(TFCItems.blueSteelSaw, 1, WILD));
		
		
		//TFC-Gems
		OreDictionary.registerOre("craftingBlueGem", new ItemStack(TFCItems.gemSapphire, 1, WILD));
		OreDictionary.registerOre("craftingBlueGem", new ItemStack(TFCItems.gemJasper, 1, WILD));
		OreDictionary.registerOre("craftingBlueGem", new ItemStack(TFCItems.gemOpal, 1, WILD));
		OreDictionary.registerOre("craftingBlueGem", new ItemStack(TFCItems.gemAmethyst, 1, WILD));
		OreDictionary.registerOre("craftingGreenGem", new ItemStack(TFCItems.gemEmerald, 1, WILD));
		OreDictionary.registerOre("craftingGreenGem", new ItemStack(TFCItems.gemBeryl, 1, WILD));
		OreDictionary.registerOre("craftingGreenGem", new ItemStack(TFCItems.gemJade, 1, WILD));
		OreDictionary.registerOre("craftingGreenGem", new ItemStack(TFCItems.gemTourmaline, 1, WILD));
		OreDictionary.registerOre("craftingRedGem", new ItemStack(TFCItems.gemRuby, 1, WILD));
		OreDictionary.registerOre("craftingRedGem", new ItemStack(TFCItems.gemGarnet, 1, WILD));
		OreDictionary.registerOre("craftingRedGem", new ItemStack(TFCItems.gemAgate, 1, WILD));
		OreDictionary.registerOre("craftingRedGem", new ItemStack(TFCItems.gemTopaz, 1, WILD));
		//TFC Gravel
		OreDictionary.registerOre("blockGravel", new ItemStack(TFCBlocks.gravel, 1, WILD));
		OreDictionary.registerOre("blockGravel", new ItemStack(TFCBlocks.gravel2, 1, WILD));
		//TFC Seeds
		OreDictionary.registerOre("bagSeed", new ItemStack(TFCItems.seedsWheat, 1, WILD));
		OreDictionary.registerOre("bagSeed", new ItemStack(TFCItems.seedsMaize, 1, WILD));
		OreDictionary.registerOre("bagSeed", new ItemStack(TFCItems.seedsTomato, 1, WILD));
		OreDictionary.registerOre("bagSeed", new ItemStack(TFCItems.seedsBarley, 1, WILD));
		OreDictionary.registerOre("bagSeed", new ItemStack(TFCItems.seedsRye, 1, WILD));
		OreDictionary.registerOre("bagSeed", new ItemStack(TFCItems.seedsOat, 1, WILD));
		OreDictionary.registerOre("bagSeed", new ItemStack(TFCItems.seedsRice, 1, WILD));
		OreDictionary.registerOre("bagSeed", new ItemStack(TFCItems.seedsPotato, 1, WILD));
		OreDictionary.registerOre("bagSeed", new ItemStack(TFCItems.seedsOnion, 1, WILD));
		OreDictionary.registerOre("bagSeed", new ItemStack(TFCItems.seedsCabbage, 1, WILD));
		OreDictionary.registerOre("bagSeed", new ItemStack(TFCItems.seedsGarlic, 1, WILD));
		OreDictionary.registerOre("bagSeed", new ItemStack(TFCItems.seedsCarrot, 1, WILD));
		OreDictionary.registerOre("bagSeed", new ItemStack(TFCItems.seedsSugarcane, 1, WILD));
		//OreDictionary.registerOre("bagSeed", new ItemStack(TFCItems.SeedsHemp, 1, WILD));
		OreDictionary.registerOre("bagSeed", new ItemStack(TFCItems.seedsYellowBellPepper, 1, WILD));
		OreDictionary.registerOre("bagSeed", new ItemStack(TFCItems.seedsRedBellPepper, 1, WILD));
		OreDictionary.registerOre("bagSeed", new ItemStack(TFCItems.seedsSoybean, 1, WILD));
		OreDictionary.registerOre("bagSeed", new ItemStack(TFCItems.seedsGreenbean, 1, WILD));
		OreDictionary.registerOre("bagSeed", new ItemStack(TFCItems.seedsSquash, 1, WILD));
		OreDictionary.registerOre("bagSeed", new ItemStack(TFCItems.seedsJute, 1, WILD));	
		//Other
		OreDictionary.registerOre("ingotStoneBrick", new ItemStack(TFCItems.stoneBrick, 1, WILD));
		OreDictionary.registerOre("toolFlintSteel", new ItemStack(TFCItems.flintSteel, 1, WILD));
		
		//Replacement for netherrack: TFC petrified wood
		OreDictionary.registerOre("stoneNetherrack", new ItemStack(TFCItems.oreChunk, 1, 22));
		OreDictionary.registerOre("stoneNetherrack", new ItemStack(Blocks.netherrack, 1, WILD));
		
		
		//Replacement for Glowstone: (renamed Scapolite) TFC Selenite
		OreDictionary.registerOre("oreScapolite", new ItemStack(TFCItems.oreChunk, 1, 19));
		
		//Replacement for Osmium: TFC Microcline
		OreDictionary.registerOre("oreOsmium", new ItemStack(TFCItems.oreChunk, 1, 25));
		
		//Replacement for Apatite: TFC Olivine
		OreDictionary.registerOre("gemApatite", new ItemStack(TFCItems.oreChunk, 1, 33));
		
		
		//MetalsOres
		OreDictionary.registerOre("ingotBronze", new ItemStack(TFCItems.blackBronzeIngot, 1, WILD));
		OreDictionary.registerOre("ingotBronze", new ItemStack(TFCItems.bismuthBronzeIngot, 1, WILD));
		OreDictionary.registerOre("plateAnyBronze", new ItemStack(TFCItems.bronzeSheet, 1, WILD));
		OreDictionary.registerOre("plateAnyBronze", new ItemStack(TFCItems.blackBronzeSheet, 1, WILD));
		OreDictionary.registerOre("plateAnyBronze", new ItemStack(TFCItems.bismuthBronzeSheet, 1, WILD));
		
		//Replacement for BlazeRods/Powder: TFC Sulfur (Renamed Strontium)
		OreDictionary.registerOre("oreStrontium", new ItemStack(TFCItems.oreChunk, 1, 23));
		OreDictionary.registerOre("oreStrontium", new ItemStack(Items.blaze_rod, 1, WILD));		
		
		//LogSappy creation for providing slimeballs
		OreDictionary.registerOre("logSappy", new ItemStack(TFCItems.logs, 1, 4));
		OreDictionary.registerOre("logSappy", new ItemStack(TFCItems.logs, 1, 8));
		OreDictionary.registerOre("logSappy", new ItemStack(TFCItems.logs, 1, 9));
		OreDictionary.registerOre("logSappy", new ItemStack(TFCItems.logs, 1, 10));
		
		//StoneRaw
		OreDictionary.registerOre("stoneRaw", new ItemStack(TFCBlocks.stoneSed, 1, WILD));
		OreDictionary.registerOre("stoneRaw", new ItemStack(TFCBlocks.stoneMM, 1, WILD));
		OreDictionary.registerOre("stoneRaw", new ItemStack(TFCBlocks.stoneIgIn, 1, WILD));
		OreDictionary.registerOre("stoneRaw", new ItemStack(TFCBlocks.stoneIgEx, 1, WILD));
		OreDictionary.registerOre("stoneRaw", new ItemStack(TFCBlocks.stoneSedSmooth, 1, WILD));
		OreDictionary.registerOre("stoneRaw", new ItemStack(TFCBlocks.stoneMMSmooth, 1, WILD));
		OreDictionary.registerOre("stoneRaw", new ItemStack(TFCBlocks.stoneIgInSmooth, 1, WILD));
		OreDictionary.registerOre("stoneRaw", new ItemStack(TFCBlocks.stoneIgExSmooth, 1, WILD));
		if (Loader.isModLoaded("Railcraft")) {
			OreDictionary.registerOre("stoneRaw", new ItemStack(GameData.getItemRegistry().getObject("Railcraft:cube"), 1, 6));
			OreDictionary.registerOre("stoneRaw", new ItemStack(GameData.getItemRegistry().getObject("Railcraft:cube"), 1, 7));
			OreDictionary.registerOre("stoneRaw", new ItemStack(GameData.getItemRegistry().getObject("Railcraft:brick.infernal"), 1, 2));
			OreDictionary.registerOre("stoneRaw", new ItemStack(GameData.getItemRegistry().getObject("Railcraft:brick.abyssal"), 1, 2));
			OreDictionary.registerOre("stoneRaw", new ItemStack(GameData.getItemRegistry().getObject("Railcraft:brick.sandy"), 1, 2));
			OreDictionary.registerOre("stoneRaw", new ItemStack(GameData.getItemRegistry().getObject("Railcraft:brick.frostbound"), 1, 2));
			OreDictionary.registerOre("stoneRaw", new ItemStack(GameData.getItemRegistry().getObject("Railcraft:brick.quarried"), 1, 2));
			OreDictionary.registerOre("stoneRaw", new ItemStack(GameData.getItemRegistry().getObject("Railcraft:brick.bleachedbone"), 1, 2));
			OreDictionary.registerOre("stoneRaw", new ItemStack(GameData.getItemRegistry().getObject("Railcraft:brick.bloodstained"), 1, 2));
			OreDictionary.registerOre("stoneRaw", new ItemStack(GameData.getItemRegistry().getObject("Railcraft:brick.nether"), 1, 2));
		//StoneBrick
			OreDictionary.registerOre("stoneBrick", new ItemStack(GameData.getItemRegistry().getObject("Railcraft:brick.infernal"), 1, 1));
			OreDictionary.registerOre("stoneBrick", new ItemStack(GameData.getItemRegistry().getObject("Railcraft:brick.abyssal"), 1, 1));
			OreDictionary.registerOre("stoneBrick", new ItemStack(GameData.getItemRegistry().getObject("Railcraft:brick.sandy"), 1, 1));
			OreDictionary.registerOre("stoneBrick", new ItemStack(GameData.getItemRegistry().getObject("Railcraft:brick.frostbound"), 1, 1));
			OreDictionary.registerOre("stoneBrick", new ItemStack(GameData.getItemRegistry().getObject("Railcraft:brick.quarried"), 1, 1));
			OreDictionary.registerOre("stoneBrick", new ItemStack(GameData.getItemRegistry().getObject("Railcraft:brick.bleachedbone"), 1, 1));
			OreDictionary.registerOre("stoneBrick", new ItemStack(GameData.getItemRegistry().getObject("Railcraft:brick.bloodstained"), 1, 1));
			OreDictionary.registerOre("stoneBrick", new ItemStack(GameData.getItemRegistry().getObject("Railcraft:brick.nether"), 1, 1));
		//Other railcraft bits
			OreDictionary.registerOre("gearGold", new ItemStack(GameData.getItemRegistry().getObject("Railcraft:part.gear"), 1, 0));
			OreDictionary.registerOre("plateSteel", new ItemStack(GameData.getItemRegistry().getObject("Railcraft:part.plate"), 1, 1));
			OreDictionary.registerOre("plateIron", new ItemStack(GameData.getItemRegistry().getObject("Railcraft:part.plate"), 1, 0));
			OreDictionary.registerOre("plateTin", new ItemStack(GameData.getItemRegistry().getObject("Railcraft:part.plate"), 1, 2));
			OreDictionary.registerOre("plateCopper", new ItemStack(GameData.getItemRegistry().getObject("Railcraft:part.plate"), 1, 3));
        }
		
		//TabulaRasa
		if (Loader.isModLoaded("TabulaRasa")) {
			OreDictionary.registerOre("oreCopper", new ItemStack(GameData.getItemRegistry().getObject("TabulaRasa:RasaItem0"), 1, 0));
			OreDictionary.registerOre("oreCopper", new ItemStack(GameData.getItemRegistry().getObject("TabulaRasa:RasaItem0"), 1, 9));
			OreDictionary.registerOre("oreCopper", new ItemStack(GameData.getItemRegistry().getObject("TabulaRasa:RasaItem0"), 1, 13));
			OreDictionary.registerOre("oreGold", new ItemStack(GameData.getItemRegistry().getObject("TabulaRasa:RasaItem0"), 1, 1));
			OreDictionary.registerOre("orePlatinum", new ItemStack(GameData.getItemRegistry().getObject("TabulaRasa:RasaItem0"), 1, 2));
			OreDictionary.registerOre("oreIron", new ItemStack(GameData.getItemRegistry().getObject("TabulaRasa:RasaItem0"), 1, 3));
			OreDictionary.registerOre("oreIron", new ItemStack(GameData.getItemRegistry().getObject("TabulaRasa:RasaItem0"), 1, 10));
			OreDictionary.registerOre("oreIron", new ItemStack(GameData.getItemRegistry().getObject("TabulaRasa:RasaItem0"), 1, 11));
			OreDictionary.registerOre("oreSilver", new ItemStack(GameData.getItemRegistry().getObject("TabulaRasa:RasaItem0"), 1, 4));
			OreDictionary.registerOre("oreTin", new ItemStack(GameData.getItemRegistry().getObject("TabulaRasa:RasaItem0"), 1,5));
			OreDictionary.registerOre("oreLead", new ItemStack(GameData.getItemRegistry().getObject("TabulaRasa:RasaItem0"), 1, 6));
			OreDictionary.registerOre("oreBismuth", new ItemStack(GameData.getItemRegistry().getObject("TabulaRasa:RasaItem0"), 1, 7));
			OreDictionary.registerOre("oreNickel", new ItemStack(GameData.getItemRegistry().getObject("TabulaRasa:RasaItem0"), 1, 8));
			OreDictionary.registerOre("oreZinc", new ItemStack(GameData.getItemRegistry().getObject("TabulaRasa:RasaItem0"), 1, 12));
			OreDictionary.registerOre("dustPlatinum", new ItemStack(GameData.getItemRegistry().getObject("TabulaRasa:RasaItem1"), 1, 3));
			OreDictionary.registerOre("dustBismuth", new ItemStack(GameData.getItemRegistry().getObject("TabulaRasa:RasaItem1"), 1, 1));
			OreDictionary.registerOre("dustNickel", new ItemStack(GameData.getItemRegistry().getObject("TabulaRasa:RasaItem1"), 1, 2));
			OreDictionary.registerOre("dustZinc", new ItemStack(GameData.getItemRegistry().getObject("TabulaRasa:RasaItem1"), 1, 0));
			OreDictionary.registerOre("clumpPlatinum", new ItemStack(GameData.getItemRegistry().getObject("TabulaRasa:RasaItem3"), 1, 3));
			OreDictionary.registerOre("clumpBismuth", new ItemStack(GameData.getItemRegistry().getObject("TabulaRasa:RasaItem3"), 1, 1));
			OreDictionary.registerOre("clumpNickel", new ItemStack(GameData.getItemRegistry().getObject("TabulaRasa:RasaItem3"), 1, 2));
			OreDictionary.registerOre("clumpZinc", new ItemStack(GameData.getItemRegistry().getObject("TabulaRasa:RasaItem3"), 1, 0));
			OreDictionary.registerOre("shardPlatinum", new ItemStack(GameData.getItemRegistry().getObject("TabulaRasa:RasaItem4"), 1, 3));
			OreDictionary.registerOre("shardBismuth", new ItemStack(GameData.getItemRegistry().getObject("TabulaRasa:RasaItem4"), 1, 1));
			OreDictionary.registerOre("shardNickel", new ItemStack(GameData.getItemRegistry().getObject("TabulaRasa:RasaItem4"), 1, 2));
			OreDictionary.registerOre("shardZinc", new ItemStack(GameData.getItemRegistry().getObject("TabulaRasa:RasaItem4"), 1, 0));
			
		}
		
		//DecorationsTFC
		if (Loader.isModLoaded("DecorationsTFC")) {
			//CREATION of Ore Dictionary Entry for basicLanterCore for crafting of Railcraft Lanterns
			for (int i=1; i<9; i++) {
				OreDictionary.registerOre("basicLanternCore", new ItemStack(GameData.getItemRegistry().getObject("DecorationsTFC:item.LanternCore.Copper"), 1, i));
				OreDictionary.registerOre("basicLanternCore", new ItemStack(GameData.getItemRegistry().getObject("DecorationsTFC:item.LanternCore.Bronze"), 1, i));
				OreDictionary.registerOre("basicLanternCore", new ItemStack(GameData.getItemRegistry().getObject("DecorationsTFC:item.LanternCore.BismuthBronze"), 1, i));
				OreDictionary.registerOre("basicLanternCore", new ItemStack(GameData.getItemRegistry().getObject("DecorationsTFC:item.LanternCore.BlackBronze"), 1, i));
				//# CREATION of Ore Dictionary Entry copperLanternCore for crafting of Railcraft Lanterns
				OreDictionary.registerOre("copperLanternCore", new ItemStack(GameData.getItemRegistry().getObject("DecorationsTFC:item.LanternCore.Copper"), 1, i));
				OreDictionary.registerOre("goldLanternCore", new ItemStack(GameData.getItemRegistry().getObject("DecorationsTFC:item.LanternCore.Gold"), 1, i));
				OreDictionary.registerOre("leadLanternCore", new ItemStack(GameData.getItemRegistry().getObject("DecorationsTFC:item.LanternCore.Lead"), 1, i));
				OreDictionary.registerOre("ironLanternCore", new ItemStack(GameData.getItemRegistry().getObject("DecorationsTFC:item.LanternCore.WroughtIron"), 1, i));	
			}
		}
		
		//Forestry
		if (Loader.isModLoaded("Forestry")) {
			OreDictionary.registerOre("blockAlveary", new ItemStack(GameData.getItemRegistry().getObject("Forestry:alveary"), 1, 0));
			OreDictionary.registerOre("blockAlveary", new ItemStack(GameData.getItemRegistry().getObject("Forestry:alveary"), 1, 2));
			OreDictionary.registerOre("blockAlveary", new ItemStack(GameData.getItemRegistry().getObject("Forestry:alveary"), 1, 3));
			OreDictionary.registerOre("blockAlveary", new ItemStack(GameData.getItemRegistry().getObject("Forestry:alveary"), 1, 4));
			OreDictionary.registerOre("blockAlveary", new ItemStack(GameData.getItemRegistry().getObject("Forestry:alveary"), 1, 5));
			OreDictionary.registerOre("blockAlveary", new ItemStack(GameData.getItemRegistry().getObject("Forestry:alveary"), 1, 6));
			OreDictionary.registerOre("blockAlveary", new ItemStack(GameData.getItemRegistry().getObject("Forestry:alveary"), 1, 7));
		}
		
		//Pneumaticcraft
		if (Loader.isModLoaded("PneumaticCraft")) {
			OreDictionary.registerOre("pressureChamber", new ItemStack(GameData.getItemRegistry().getObject("PneumaticCraft:pressureChamberWall"), 1, 6));
		OreDictionary.registerOre("pressureChamber", new ItemStack(GameData.getItemRegistry().getObject("PneumaticCraft:pressureChamberWall"), 1, 0));
		}
		
		System.out.println("[" + ModDetails.ModName + "] Finished Registering OreDictionary entries");		
		
	}

}
