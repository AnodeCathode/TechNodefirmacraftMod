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
		OreDictionary.registerOre("oreAluminum", new ItemStack(TFCBlocks.Ore, 1, 30));
		OreDictionary.registerOre("craftingChest", new ItemStack(TFCBlocks.Chest, 1, WILD));
		OreDictionary.registerOre("fenceGate", new ItemStack(TFCBlocks.FenceGate, 1, WILD));
		OreDictionary.registerOre("fenceGate", new ItemStack(TFCBlocks.FenceGate2, 1, WILD));
		OreDictionary.registerOre("fenceWood", new ItemStack(TFCBlocks.Fence, 1, WILD));
		OreDictionary.registerOre("fenceGate", new ItemStack(TFCBlocks.FenceGate, 1, WILD));
		OreDictionary.registerOre("plateIron", new ItemStack(TFCItems.WroughtIronSheet, 1, WILD));

		//TFC Tools
		//Hammers
		OreDictionary.registerOre("craftingToolLowHammer", new ItemStack(TFCItems.WroughtIronHammer, 1, WILD));
		OreDictionary.registerOre("craftingToolLowHammer", new ItemStack(TFCItems.SteelHammer, 1, WILD));
		OreDictionary.registerOre("craftingToolLowHammer", new ItemStack(TFCItems.BlackSteelHammer, 1, WILD));
		OreDictionary.registerOre("craftingToolLowHammer", new ItemStack(TFCItems.BlueSteelHammer, 1, WILD));
		OreDictionary.registerOre("craftingToolLowHammer", new ItemStack(TFCItems.RedSteelHammer, 1, WILD));
		OreDictionary.registerOre("craftingToolMediumHammer", new ItemStack(TFCItems.SteelHammer, 1, WILD));
		OreDictionary.registerOre("craftingToolMediumHammer", new ItemStack(TFCItems.BlackSteelHammer, 1, WILD));
		OreDictionary.registerOre("craftingToolMediumHammer", new ItemStack(TFCItems.BlueSteelHammer, 1, WILD));
		OreDictionary.registerOre("craftingToolMediumHammer", new ItemStack(TFCItems.RedSteelHammer, 1, WILD));
		OreDictionary.registerOre("craftingToolHardHammer", new ItemStack(TFCItems.BlueSteelHammer, 1, WILD));
		OreDictionary.registerOre("craftingToolHardHammer", new ItemStack(TFCItems.RedSteelHammer, 1, WILD));
		//Chisels
		OreDictionary.registerOre("craftingToolMediumChisel", new ItemStack(TFCItems.SteelChisel, 1, WILD));
		OreDictionary.registerOre("craftingToolMediumChisel", new ItemStack(TFCItems.BlackSteelChisel, 1, WILD));
		OreDictionary.registerOre("craftingToolMediumChisel", new ItemStack(TFCItems.BlueSteelChisel, 1, WILD));
		OreDictionary.registerOre("craftingToolMediumChisel", new ItemStack(TFCItems.RedSteelChisel, 1, WILD));
		OreDictionary.registerOre("craftingToolHardChisel", new ItemStack(TFCItems.BlueSteelChisel, 1, WILD));
		OreDictionary.registerOre("craftingToolHardChisel", new ItemStack(TFCItems.RedSteelChisel, 1, WILD));
		//Saws
		OreDictionary.registerOre("craftingToolSaw", new ItemStack(TFCItems.WroughtIronSaw, 1, WILD));
		OreDictionary.registerOre("craftingToolSaw", new ItemStack(TFCItems.SteelSaw, 1, WILD));
		OreDictionary.registerOre("craftingToolSaw", new ItemStack(TFCItems.BlackSteelSaw, 1, WILD));
		OreDictionary.registerOre("craftingToolSaw", new ItemStack(TFCItems.RedSteelSaw, 1, WILD));
		OreDictionary.registerOre("craftingToolSaw", new ItemStack(TFCItems.BlueSteelSaw, 1, WILD));
		OreDictionary.registerOre("craftingToolMediumSaw", new ItemStack(TFCItems.SteelSaw, 1, WILD));
		OreDictionary.registerOre("craftingToolMediumSaw", new ItemStack(TFCItems.BlackSteelSaw, 1, WILD));
		OreDictionary.registerOre("craftingToolMediumSaw", new ItemStack(TFCItems.RedSteelSaw, 1, WILD));
		OreDictionary.registerOre("craftingToolMediumSaw", new ItemStack(TFCItems.BlueSteelSaw, 1, WILD));
		OreDictionary.registerOre("craftingToolHardSaw", new ItemStack(TFCItems.RedSteelSaw, 1, WILD));
		OreDictionary.registerOre("craftingToolHardSaw", new ItemStack(TFCItems.BlueSteelSaw, 1, WILD));
		
		
		//TFC-Gems
		OreDictionary.registerOre("craftingBlueGem", new ItemStack(TFCItems.GemSapphire, 1, WILD));
		OreDictionary.registerOre("craftingBlueGem", new ItemStack(TFCItems.GemJasper, 1, WILD));
		OreDictionary.registerOre("craftingBlueGem", new ItemStack(TFCItems.GemOpal, 1, WILD));
		OreDictionary.registerOre("craftingBlueGem", new ItemStack(TFCItems.GemAmethyst, 1, WILD));
		OreDictionary.registerOre("craftingGreenGem", new ItemStack(TFCItems.GemEmerald, 1, WILD));
		OreDictionary.registerOre("craftingGreenGem", new ItemStack(TFCItems.GemBeryl, 1, WILD));
		OreDictionary.registerOre("craftingGreenGem", new ItemStack(TFCItems.GemJade, 1, WILD));
		OreDictionary.registerOre("craftingGreenGem", new ItemStack(TFCItems.GemTourmaline, 1, WILD));
		OreDictionary.registerOre("craftingRedGem", new ItemStack(TFCItems.GemRuby, 1, WILD));
		OreDictionary.registerOre("craftingRedGem", new ItemStack(TFCItems.GemGarnet, 1, WILD));
		OreDictionary.registerOre("craftingRedGem", new ItemStack(TFCItems.GemAgate, 1, WILD));
		OreDictionary.registerOre("craftingRedGem", new ItemStack(TFCItems.GemTopaz, 1, WILD));
		//TFC Gravel
		OreDictionary.registerOre("blockGravel", new ItemStack(TFCBlocks.Gravel, 1, WILD));
		OreDictionary.registerOre("blockGravel", new ItemStack(TFCBlocks.Gravel2, 1, WILD));
		//TFC Seeds
		OreDictionary.registerOre("bagSeed", new ItemStack(TFCItems.SeedsWheat, 1, WILD));
		OreDictionary.registerOre("bagSeed", new ItemStack(TFCItems.SeedsMaize, 1, WILD));
		OreDictionary.registerOre("bagSeed", new ItemStack(TFCItems.SeedsTomato, 1, WILD));
		OreDictionary.registerOre("bagSeed", new ItemStack(TFCItems.SeedsBarley, 1, WILD));
		OreDictionary.registerOre("bagSeed", new ItemStack(TFCItems.SeedsRye, 1, WILD));
		OreDictionary.registerOre("bagSeed", new ItemStack(TFCItems.SeedsOat, 1, WILD));
		OreDictionary.registerOre("bagSeed", new ItemStack(TFCItems.SeedsRice, 1, WILD));
		OreDictionary.registerOre("bagSeed", new ItemStack(TFCItems.SeedsPotato, 1, WILD));
		OreDictionary.registerOre("bagSeed", new ItemStack(TFCItems.SeedsOnion, 1, WILD));
		OreDictionary.registerOre("bagSeed", new ItemStack(TFCItems.SeedsCabbage, 1, WILD));
		OreDictionary.registerOre("bagSeed", new ItemStack(TFCItems.SeedsGarlic, 1, WILD));
		OreDictionary.registerOre("bagSeed", new ItemStack(TFCItems.SeedsCarrot, 1, WILD));
		OreDictionary.registerOre("bagSeed", new ItemStack(TFCItems.SeedsSugarcane, 1, WILD));
		//OreDictionary.registerOre("bagSeed", new ItemStack(TFCItems.SeedsHemp, 1, WILD));
		OreDictionary.registerOre("bagSeed", new ItemStack(TFCItems.SeedsYellowBellPepper, 1, WILD));
		OreDictionary.registerOre("bagSeed", new ItemStack(TFCItems.SeedsRedBellPepper, 1, WILD));
		OreDictionary.registerOre("bagSeed", new ItemStack(TFCItems.SeedsSoybean, 1, WILD));
		OreDictionary.registerOre("bagSeed", new ItemStack(TFCItems.SeedsGreenbean, 1, WILD));
		OreDictionary.registerOre("bagSeed", new ItemStack(TFCItems.SeedsSquash, 1, WILD));
		OreDictionary.registerOre("bagSeed", new ItemStack(TFCItems.SeedsJute, 1, WILD));	
		//Other
		OreDictionary.registerOre("ingotStoneBrick", new ItemStack(TFCItems.StoneBrick, 1, WILD));
		OreDictionary.registerOre("toolFlintSteel", new ItemStack(TFCItems.FlintSteel, 1, WILD));
		
		//Replacement for netherrack: TFC petrified wood
		OreDictionary.registerOre("stoneNetherrack", new ItemStack(TFCBlocks.Ore, 1, 22));
		OreDictionary.registerOre("stoneNetherrack", new ItemStack(Blocks.netherrack, 1, WILD));
		
		
		//Replacement for Glowstone: (renamed Scapolite) TFC Selenite
		OreDictionary.registerOre("oreScapolite", new ItemStack(TFCItems.OreChunk, 1, 19));
		
		//Replacement for Osmium: TFC Microcline
		OreDictionary.registerOre("oreOsmium", new ItemStack(TFCItems.OreChunk, 1, 25));
		
		//Replacement for Apatite: TFC Olivine
		OreDictionary.registerOre("gemApatite", new ItemStack(TFCItems.OreChunk, 1, 33));
		
		
		//MetalsOres
		OreDictionary.registerOre("ingotBronze", new ItemStack(TFCItems.BlackBronzeIngot, 1, WILD));
		OreDictionary.registerOre("ingotBronze", new ItemStack(TFCItems.BismuthBronzeIngot, 1, WILD));
		OreDictionary.registerOre("plateAnyBronze", new ItemStack(TFCItems.BronzeSheet, 1, WILD));
		OreDictionary.registerOre("ingotBronze", new ItemStack(TFCItems.BlackBronzeSheet, 1, WILD));
		OreDictionary.registerOre("ingotBronze", new ItemStack(TFCItems.BismuthBronzeSheet, 1, WILD));
		
		//Replacement for BlazeRods/Powder: TFC Sulfur (Renamed Strontium)
		OreDictionary.registerOre("oreStrontium", new ItemStack(TFCBlocks.Ore, 1, 23));
		OreDictionary.registerOre("oreStrontium", new ItemStack(Items.blaze_rod, 1, WILD));		
		
		//LogSappy creation for providing slimeballs
		OreDictionary.registerOre("logSappy", new ItemStack(TFCItems.Logs, 1, 4));
		OreDictionary.registerOre("logSappy", new ItemStack(TFCItems.Logs, 1, 8));
		OreDictionary.registerOre("logSappy", new ItemStack(TFCItems.Logs, 1, 9));
		OreDictionary.registerOre("logSappy", new ItemStack(TFCItems.Logs, 1, 10));
		
		//StoneRaw
		OreDictionary.registerOre("stoneRaw", new ItemStack(TFCBlocks.StoneSed, 1, WILD));
		OreDictionary.registerOre("stoneRaw", new ItemStack(TFCBlocks.StoneMM, 1, WILD));
		OreDictionary.registerOre("stoneRaw", new ItemStack(TFCBlocks.StoneIgIn, 1, WILD));
		OreDictionary.registerOre("stoneRaw", new ItemStack(TFCBlocks.StoneIgEx, 1, WILD));
		OreDictionary.registerOre("stoneRaw", new ItemStack(TFCBlocks.StoneSedSmooth, 1, WILD));
		OreDictionary.registerOre("stoneRaw", new ItemStack(TFCBlocks.StoneMMSmooth, 1, WILD));
		OreDictionary.registerOre("stoneRaw", new ItemStack(TFCBlocks.StoneIgInSmooth, 1, WILD));
		OreDictionary.registerOre("stoneRaw", new ItemStack(TFCBlocks.StoneIgExSmooth, 1, WILD));
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
			OreDictionary.registerOre("dustBizmuth", new ItemStack(GameData.getItemRegistry().getObject("TabulaRasa:RasaItem1"), 1, 1));
			OreDictionary.registerOre("dustNickel", new ItemStack(GameData.getItemRegistry().getObject("TabulaRasa:RasaItem1"), 1, 2));
			OreDictionary.registerOre("dustZinc", new ItemStack(GameData.getItemRegistry().getObject("TabulaRasa:RasaItem1"), 1, 0));
			OreDictionary.registerOre("clumpPlatinum", new ItemStack(GameData.getItemRegistry().getObject("TabulaRasa:RasaItem3"), 1, 3));
			OreDictionary.registerOre("clumpBizmuth", new ItemStack(GameData.getItemRegistry().getObject("TabulaRasa:RasaItem3"), 1, 1));
			OreDictionary.registerOre("clumpNickel", new ItemStack(GameData.getItemRegistry().getObject("TabulaRasa:RasaItem3"), 1, 2));
			OreDictionary.registerOre("clumpZinc", new ItemStack(GameData.getItemRegistry().getObject("TabulaRasa:RasaItem3"), 1, 0));
			OreDictionary.registerOre("shardPlatinum", new ItemStack(GameData.getItemRegistry().getObject("TabulaRasa:RasaItem4"), 1, 3));
			OreDictionary.registerOre("shardBizmuth", new ItemStack(GameData.getItemRegistry().getObject("TabulaRasa:RasaItem4"), 1, 1));
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
