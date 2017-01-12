package TechNodefirmacraft.core;

import com.bioxx.tfc.Items.ItemMetalSheet;
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

		//TFC stuff
        //Food
		OreDictionary.registerOre("foodWholeGrain", new ItemStack(TFCItems.wheatWhole, 1, WILD));
		OreDictionary.registerOre("foodWholeGrain", new ItemStack(TFCItems.ryeWhole, 1, WILD));
		OreDictionary.registerOre("foodWholeGrain", new ItemStack(TFCItems.barleyWhole, 1, WILD));
		OreDictionary.registerOre("foodWholeGrain", new ItemStack(TFCItems.oatWhole, 1, WILD));
		OreDictionary.registerOre("foodWholeGrain", new ItemStack(TFCItems.riceWhole, 1, WILD));

        OreDictionary.registerOre("foodGrain", new ItemStack(TFCItems.maizeEar, 1, WILD));
        OreDictionary.registerOre("foodGrain", new ItemStack(TFCItems.wheatGrain, 1, WILD));
        OreDictionary.registerOre("foodGrain", new ItemStack(TFCItems.ryeGrain, 1, WILD));
        OreDictionary.registerOre("foodGrain", new ItemStack(TFCItems.barleyGrain, 1, WILD));
        OreDictionary.registerOre("foodGrain", new ItemStack(TFCItems.oatGrain, 1, WILD));
        OreDictionary.registerOre("foodGrain", new ItemStack(TFCItems.riceGrain, 1, WILD));

        OreDictionary.registerOre("foodFlour", new ItemStack(TFCItems.cornmealGround, 1, WILD));
        OreDictionary.registerOre("foodFlour", new ItemStack(TFCItems.wheatGround, 1, WILD));
        OreDictionary.registerOre("foodFlour", new ItemStack(TFCItems.ryeGround, 1, WILD));
        OreDictionary.registerOre("foodFlour", new ItemStack(TFCItems.barleyGround, 1, WILD));
        OreDictionary.registerOre("foodFlour", new ItemStack(TFCItems.oatGround, 1, WILD));
        OreDictionary.registerOre("foodFlour", new ItemStack(TFCItems.riceGround, 1, WILD));

        OreDictionary.registerOre("foodDough", new ItemStack(TFCItems.cornmealDough, 1, WILD));
        OreDictionary.registerOre("foodDough", new ItemStack(TFCItems.wheatDough, 1, WILD));
        OreDictionary.registerOre("foodDough", new ItemStack(TFCItems.ryeDough, 1, WILD));
        OreDictionary.registerOre("foodDough", new ItemStack(TFCItems.barleyDough, 1, WILD));
        OreDictionary.registerOre("foodDough", new ItemStack(TFCItems.oatDough, 1, WILD));
        OreDictionary.registerOre("foodDough", new ItemStack(TFCItems.riceDough, 1, WILD));

        OreDictionary.registerOre("foodBread", new ItemStack(TFCItems.cornBread, 1, WILD));
        OreDictionary.registerOre("foodBread", new ItemStack(TFCItems.wheatBread, 1, WILD));
        OreDictionary.registerOre("foodBread", new ItemStack(TFCItems.ryeBread, 1, WILD));
        OreDictionary.registerOre("foodBread", new ItemStack(TFCItems.barleyBread, 1, WILD));
        OreDictionary.registerOre("foodBread", new ItemStack(TFCItems.oatBread, 1, WILD));
        OreDictionary.registerOre("foodBread", new ItemStack(TFCItems.riceBread, 1, WILD));

        OreDictionary.registerOre("foodFruit", new ItemStack(TFCItems.wintergreenBerry, 1, WILD));
        OreDictionary.registerOre("foodFruit", new ItemStack(TFCItems.blackberry, 1, WILD));
        OreDictionary.registerOre("foodFruit", new ItemStack(TFCItems.blueberry, 1, WILD));
        OreDictionary.registerOre("foodFruit", new ItemStack(TFCItems.bunchberry, 1, WILD));
        OreDictionary.registerOre("foodFruit", new ItemStack(TFCItems.cloudberry, 1, WILD));
        OreDictionary.registerOre("foodFruit", new ItemStack(TFCItems.cranberry, 1, WILD));
        OreDictionary.registerOre("foodFruit", new ItemStack(TFCItems.elderberry, 1, WILD));
        OreDictionary.registerOre("foodFruit", new ItemStack(TFCItems.gooseberry, 1, WILD));
        OreDictionary.registerOre("foodFruit", new ItemStack(TFCItems.raspberry, 1, WILD));
        OreDictionary.registerOre("foodFruit", new ItemStack(TFCItems.snowberry, 1, WILD));
        OreDictionary.registerOre("foodFruit", new ItemStack(TFCItems.strawberry, 1, WILD));
        OreDictionary.registerOre("foodFruit", new ItemStack(TFCItems.greenApple, 1, WILD));
        OreDictionary.registerOre("foodFruit", new ItemStack(TFCItems.redApple, 1, WILD));
        OreDictionary.registerOre("foodFruit", new ItemStack(TFCItems.orange, 1, WILD));
        OreDictionary.registerOre("foodFruit", new ItemStack(TFCItems.lemon, 1, WILD));
        OreDictionary.registerOre("foodFruit", new ItemStack(TFCItems.peach, 1, WILD));
        OreDictionary.registerOre("foodFruit", new ItemStack(TFCItems.plum, 1, WILD));
        OreDictionary.registerOre("foodFruit", new ItemStack(TFCItems.cherry, 1, WILD));
        OreDictionary.registerOre("foodFruit", new ItemStack(TFCItems.olive, 1, WILD));
        OreDictionary.registerOre("foodFruit", new ItemStack(TFCItems.banana, 1, WILD));

        OreDictionary.registerOre("foodVegetable", new ItemStack(TFCItems.cabbage, 1, WILD));
        OreDictionary.registerOre("foodVegetable", new ItemStack(TFCItems.carrot, 1, WILD));
        OreDictionary.registerOre("foodVegetable", new ItemStack(TFCItems.garlic, 1, WILD));
        OreDictionary.registerOre("foodVegetable", new ItemStack(TFCItems.greenbeans, 1, WILD));
        OreDictionary.registerOre("foodVegetable", new ItemStack(TFCItems.greenBellPepper, 1, WILD));
        OreDictionary.registerOre("foodVegetable", new ItemStack(TFCItems.onion, 1, WILD));
        OreDictionary.registerOre("foodVegetable", new ItemStack(TFCItems.potato, 1, WILD));
        OreDictionary.registerOre("foodVegetable", new ItemStack(TFCItems.redBellPepper, 1, WILD));
        OreDictionary.registerOre("foodVegetable", new ItemStack(TFCItems.seaWeed, 1, WILD));
        OreDictionary.registerOre("foodVegetable", new ItemStack(TFCItems.squash, 1, WILD));
        OreDictionary.registerOre("foodVegetable", new ItemStack(TFCItems.tomato, 1, WILD));
        OreDictionary.registerOre("foodVegetable", new ItemStack(TFCItems.yellowBellPepper, 1, WILD));

        OreDictionary.registerOre("foodProtein", new ItemStack(TFCItems.beefRaw, 1, WILD));
        OreDictionary.registerOre("foodProtein", new ItemStack(TFCItems.calamariRaw, 1, WILD));
        OreDictionary.registerOre("foodProtein", new ItemStack(TFCItems.eggCooked, 1, WILD));
        OreDictionary.registerOre("foodProtein", new ItemStack(TFCItems.fishRaw, 1, WILD));
        OreDictionary.registerOre("foodProtein", new ItemStack(TFCItems.horseMeatRaw, 1, WILD));
        OreDictionary.registerOre("foodProtein", new ItemStack(TFCItems.muttonRaw, 1, WILD));
        OreDictionary.registerOre("foodProtein", new ItemStack(TFCItems.porkchopRaw, 1, WILD));
        OreDictionary.registerOre("foodProtein", new ItemStack(TFCItems.chickenRaw, 1, WILD));
        OreDictionary.registerOre("foodProtein", new ItemStack(TFCItems.venisonRaw, 1, WILD));
        OreDictionary.registerOre("foodProtein", new ItemStack(TFCItems.soybean, 1, WILD));

        OreDictionary.registerOre("foodDairy", new ItemStack(TFCItems.cheese, 1, WILD));
        OreDictionary.registerOre("foodDairy", new ItemStack(TFCItems.woodenBucketMilk, 1, WILD));

        //Anvils
		OreDictionary.registerOre("anvilTier2", new ItemStack(TFCBlocks.anvil, 1, 1));
		OreDictionary.registerOre("anvilTier3", new ItemStack(TFCBlocks.anvil, 1, 2));
        OreDictionary.registerOre("anvilTier3", new ItemStack(TFCBlocks.anvil2, 1, 0));
        OreDictionary.registerOre("anvilTier3", new ItemStack(TFCBlocks.anvil2, 1, 1));
        OreDictionary.registerOre("anvilTier3", new ItemStack(TFCBlocks.anvil2, 1, 2));
		OreDictionary.registerOre("anvilTier4", new ItemStack(TFCBlocks.anvil, 1, 3));
		OreDictionary.registerOre("anvilTier5", new ItemStack(TFCBlocks.anvil, 1, 4));
		OreDictionary.registerOre("anvilTier6", new ItemStack(TFCBlocks.anvil, 1, 5));
		OreDictionary.registerOre("anvilTier7", new ItemStack(TFCBlocks.anvil, 1, 6));
		OreDictionary.registerOre("anvilTier7", new ItemStack(TFCBlocks.anvil, 1, 7));

        //TFC In-World Ore Blocks
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
		OreDictionary.registerOre("tfcOsmium", new ItemStack(TFCBlocks.ore, 1, 14));
		OreDictionary.registerOre("tfcBauxite", new ItemStack(TFCBlocks.ore, 1, 15));
		OreDictionary.registerOre("tfcTungsten", new ItemStack(TFCBlocks.ore2, 1, 0));
		OreDictionary.registerOre("tfcTungsten", new ItemStack(TFCBlocks.ore2, 1, 1));

		OreDictionary.registerOre("tfcKaolinite", new ItemStack(TFCBlocks.ore3, 1, 0));
		OreDictionary.registerOre("tfcGypsum", new ItemStack(TFCBlocks.ore3, 1, 1));
		OreDictionary.registerOre("tfcSatinspar", new ItemStack(TFCBlocks.ore3, 1, 2));
		OreDictionary.registerOre("tfcSelenite", new ItemStack(TFCBlocks.ore3, 1, 3));
		OreDictionary.registerOre("tfcGraphite", new ItemStack(TFCBlocks.ore3, 1, 4));
		OreDictionary.registerOre("tfcKimberlite", new ItemStack(TFCBlocks.ore3, 1, 5));
		OreDictionary.registerOre("tfcPetrifiedWood", new ItemStack(TFCBlocks.ore3, 1, 6));
		OreDictionary.registerOre("tfcSulfur", new ItemStack(TFCBlocks.ore3, 1, 7));
		OreDictionary.registerOre("tfcJet", new ItemStack(TFCBlocks.ore3, 1, 8));
		OreDictionary.registerOre("tfcMicrocline", new ItemStack(TFCBlocks.ore2, 1, 9));
		OreDictionary.registerOre("tfcPitchBlende", new ItemStack(TFCBlocks.ore2, 1, 10));
		OreDictionary.registerOre("tfcRedstone", new ItemStack(TFCBlocks.ore2, 1, 11));
		OreDictionary.registerOre("tfcRedstone", new ItemStack(TFCBlocks.ore2, 1, 12));
		OreDictionary.registerOre("tfcSaltpeter", new ItemStack(TFCBlocks.ore2, 1, 13));
		OreDictionary.registerOre("tfcSerpentine", new ItemStack(TFCBlocks.ore2, 1, 14));
		OreDictionary.registerOre("tfcBorax", new ItemStack(TFCBlocks.ore3, 1, 15));
		OreDictionary.registerOre("tfcCoal", new ItemStack(TFCBlocks.ore4, 1, 0));
		OreDictionary.registerOre("tfcCoal", new ItemStack(TFCBlocks.ore4, 1, 1));
		OreDictionary.registerOre("tfcOlivine", new ItemStack(TFCBlocks.ore4, 1, 2));
		OreDictionary.registerOre("tfcLapis", new ItemStack(TFCBlocks.ore4, 1, 3));
		OreDictionary.registerOre("tfcSylvite", new ItemStack(TFCBlocks.ore4, 1, 4));
		OreDictionary.registerOre("tfcApatite", new ItemStack(TFCBlocks.ore4, 1, 5));
		OreDictionary.registerOre("tfcScapolite", new ItemStack(TFCBlocks.ore4, 1, 6));
		OreDictionary.registerOre("tfcStrontium", new ItemStack(TFCBlocks.ore4, 1, 7));
		OreDictionary.registerOre("tfcQuartz", new ItemStack(TFCBlocks.ore4, 1, 8));

		//TFC Tools for use in Crafting
		//Hammers
		OreDictionary.registerOre("craftingToolHammer", new ItemStack(TFCItems.wroughtIronHammer, 1, WILD));
		OreDictionary.registerOre("craftingToolHammer", new ItemStack(TFCItems.steelHammer, 1, WILD));
		OreDictionary.registerOre("craftingToolHammer", new ItemStack(TFCItems.blackSteelHammer, 1, WILD));
		OreDictionary.registerOre("craftingToolHammer", new ItemStack(TFCItems.blueSteelHammer, 1, WILD));
		OreDictionary.registerOre("craftingToolHammer", new ItemStack(TFCItems.redSteelHammer, 1, WILD));
		OreDictionary.registerOre("craftingToolMediumHammer", new ItemStack(TFCItems.steelHammer, 1, WILD));
		OreDictionary.registerOre("craftingToolMediumHammer", new ItemStack(TFCItems.blackSteelHammer, 1, WILD));
		OreDictionary.registerOre("craftingToolMediumHammer", new ItemStack(TFCItems.blueSteelHammer, 1, WILD));
		OreDictionary.registerOre("craftingToolMediumHammer", new ItemStack(TFCItems.redSteelHammer, 1, WILD));
		OreDictionary.registerOre("craftingToolHardHammer", new ItemStack(TFCItems.blueSteelHammer, 1, WILD));
		OreDictionary.registerOre("craftingToolHardHammer", new ItemStack(TFCItems.redSteelHammer, 1, WILD));
		//Chisels
		OreDictionary.registerOre("craftingToolChisel", new ItemStack(TFCItems.wroughtIronChisel, 1, WILD));
		OreDictionary.registerOre("craftingToolChisel", new ItemStack(TFCItems.steelChisel, 1, WILD));
		OreDictionary.registerOre("craftingToolChisel", new ItemStack(TFCItems.blackSteelChisel, 1, WILD));
		OreDictionary.registerOre("craftingToolChisel", new ItemStack(TFCItems.blueSteelChisel, 1, WILD));
		OreDictionary.registerOre("craftingToolChisel", new ItemStack(TFCItems.redSteelChisel, 1, WILD));
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
		//Knives
		OreDictionary.registerOre("craftingToolKnife", new ItemStack(TFCItems.wroughtIronKnife, 1, WILD));
		OreDictionary.registerOre("craftingToolKnife", new ItemStack(TFCItems.steelKnife, 1, WILD));
		OreDictionary.registerOre("craftingToolKnife", new ItemStack(TFCItems.blackSteelKnife, 1, WILD));
		OreDictionary.registerOre("craftingToolKnife", new ItemStack(TFCItems.redSteelKnife, 1, WILD));
		OreDictionary.registerOre("craftingToolKnife", new ItemStack(TFCItems.blueSteelKnife, 1, WILD));
		OreDictionary.registerOre("craftingToolMediumKnife", new ItemStack(TFCItems.steelKnife, 1, WILD));
		OreDictionary.registerOre("craftingToolMediumKnife", new ItemStack(TFCItems.blackSteelKnife, 1, WILD));
		OreDictionary.registerOre("craftingToolMediumKnife", new ItemStack(TFCItems.redSteelKnife, 1, WILD));
		OreDictionary.registerOre("craftingToolMediumKnife", new ItemStack(TFCItems.blueSteelKnife, 1, WILD));
		OreDictionary.registerOre("craftingToolHardKnife", new ItemStack(TFCItems.redSteelKnife, 1, WILD));
		OreDictionary.registerOre("craftingToolHardKnife", new ItemStack(TFCItems.blueSteelKnife, 1, WILD));
		
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
		//Flawless+ Gems
		OreDictionary.registerOre("craftingFlawlessPlus", new ItemStack(TFCItems.gemSapphire, 1, 3));
		OreDictionary.registerOre("craftingFlawlessPlus", new ItemStack(TFCItems.gemJasper, 1, 3));
		OreDictionary.registerOre("craftingFlawlessPlus", new ItemStack(TFCItems.gemOpal, 1, 3));
		OreDictionary.registerOre("craftingFlawlessPlus", new ItemStack(TFCItems.gemAmethyst, 1, 3));
		OreDictionary.registerOre("craftingFlawlessPlus", new ItemStack(TFCItems.gemEmerald, 1, 3));
		OreDictionary.registerOre("craftingFlawlessPlus", new ItemStack(TFCItems.gemBeryl, 1, 3));
		OreDictionary.registerOre("craftingFlawlessPlus", new ItemStack(TFCItems.gemJade, 1, 3));
		OreDictionary.registerOre("craftingFlawlessPlus", new ItemStack(TFCItems.gemTourmaline, 1, 3));
		OreDictionary.registerOre("craftingFlawlessPlus", new ItemStack(TFCItems.gemRuby, 1, 3));
		OreDictionary.registerOre("craftingFlawlessPlus", new ItemStack(TFCItems.gemGarnet, 1, 3));
		OreDictionary.registerOre("craftingFlawlessPlus", new ItemStack(TFCItems.gemAgate, 1, 3));
		OreDictionary.registerOre("craftingFlawlessPlus", new ItemStack(TFCItems.gemTopaz, 1, 3));
		OreDictionary.registerOre("craftingFlawlessPlus", new ItemStack(TFCItems.gemSapphire, 1, 4));
		OreDictionary.registerOre("craftingFlawlessPlus", new ItemStack(TFCItems.gemJasper, 1, 4));
		OreDictionary.registerOre("craftingFlawlessPlus", new ItemStack(TFCItems.gemOpal, 1, 4));
		OreDictionary.registerOre("craftingFlawlessPlus", new ItemStack(TFCItems.gemAmethyst, 1, 4));
		OreDictionary.registerOre("craftingFlawlessPlus", new ItemStack(TFCItems.gemEmerald, 1, 4));
		OreDictionary.registerOre("craftingFlawlessPlus", new ItemStack(TFCItems.gemBeryl, 1, 4));
		OreDictionary.registerOre("craftingFlawlessPlus", new ItemStack(TFCItems.gemJade, 1, 4));
		OreDictionary.registerOre("craftingFlawlessPlus", new ItemStack(TFCItems.gemTourmaline, 1, 4));
		OreDictionary.registerOre("craftingFlawlessPlus", new ItemStack(TFCItems.gemRuby, 1, 4));
		OreDictionary.registerOre("craftingFlawlessPlus", new ItemStack(TFCItems.gemGarnet, 1, 4));
		OreDictionary.registerOre("craftingFlawlessPlus", new ItemStack(TFCItems.gemAgate, 1, 4));
		OreDictionary.registerOre("craftingFlawlessPlus", new ItemStack(TFCItems.gemTopaz, 1, 4));

		//Replacement for netherrack: TFC petrified wood
		OreDictionary.registerOre("stoneNetherrack", new ItemStack(TFCItems.oreChunk, 1, 22));
		OreDictionary.registerOre("stoneNetherrack", new ItemStack(Blocks.netherrack, 1, WILD));

        //Replacement for BlazeRods(Renamed Strontium)
		OreDictionary.registerOre("oreStrontium", new ItemStack(Items.blaze_rod, 1, WILD));

		//LogSappy creation for providing slimeballs
		OreDictionary.registerOre("logSappy", new ItemStack(TFCItems.logs, 1, 4));
		OreDictionary.registerOre("logSappy", new ItemStack(TFCItems.logs, 1, 8));
		OreDictionary.registerOre("logSappy", new ItemStack(TFCItems.logs, 1, 9));
		OreDictionary.registerOre("logSappy", new ItemStack(TFCItems.logs, 1, 10));

		//Supports
		OreDictionary.registerOre("supportWood", new ItemStack(TFCBlocks.woodSupportV, 1, WILD));
		OreDictionary.registerOre("supportWood", new ItemStack(TFCBlocks.woodSupportV2, 1, WILD));

		//StoneAny - Catch all for Raw and Smooth Stone
		OreDictionary.registerOre("stoneAny", new ItemStack(TFCBlocks.stoneSed, 1, WILD));
		OreDictionary.registerOre("stoneAny", new ItemStack(TFCBlocks.stoneMM, 1, WILD));
		OreDictionary.registerOre("stoneAny", new ItemStack(TFCBlocks.stoneIgIn, 1, WILD));
		OreDictionary.registerOre("stoneAny", new ItemStack(TFCBlocks.stoneIgEx, 1, WILD));
		OreDictionary.registerOre("stoneAny", new ItemStack(TFCBlocks.stoneSedSmooth, 1, WILD));
		OreDictionary.registerOre("stoneAny", new ItemStack(TFCBlocks.stoneMMSmooth, 1, WILD));
		OreDictionary.registerOre("stoneAny", new ItemStack(TFCBlocks.stoneIgInSmooth, 1, WILD));
		OreDictionary.registerOre("stoneAny", new ItemStack(TFCBlocks.stoneIgExSmooth, 1, WILD));
		if (Loader.isModLoaded("Railcraft")) {
			OreDictionary.registerOre("stoneAny", new ItemStack(GameData.getItemRegistry().getObject("Railcraft:cube"), 1, 6));
			OreDictionary.registerOre("stoneAny", new ItemStack(GameData.getItemRegistry().getObject("Railcraft:cube"), 1, 7));
			OreDictionary.registerOre("stoneAny", new ItemStack(GameData.getItemRegistry().getObject("Railcraft:brick.infernal"), 1, 2));
			OreDictionary.registerOre("stoneAny", new ItemStack(GameData.getItemRegistry().getObject("Railcraft:brick.abyssal"), 1, 2));
			OreDictionary.registerOre("stoneAny", new ItemStack(GameData.getItemRegistry().getObject("Railcraft:brick.sandy"), 1, 2));
			OreDictionary.registerOre("stoneAny", new ItemStack(GameData.getItemRegistry().getObject("Railcraft:brick.frostbound"), 1, 2));
			OreDictionary.registerOre("stoneAny", new ItemStack(GameData.getItemRegistry().getObject("Railcraft:brick.quarried"), 1, 2));
			OreDictionary.registerOre("stoneAny", new ItemStack(GameData.getItemRegistry().getObject("Railcraft:brick.bleachedbone"), 1, 2));
			OreDictionary.registerOre("stoneAny", new ItemStack(GameData.getItemRegistry().getObject("Railcraft:brick.bloodstained"), 1, 2));
			OreDictionary.registerOre("stoneAny", new ItemStack(GameData.getItemRegistry().getObject("Railcraft:brick.nether"), 1, 2));
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
		/*
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
		}*/
		
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

		//Immersive Engineering
		if (Loader.isModLoaded("ImmersiveEngineering") && Loader.isModLoaded("TabulaRasa")) {
			OreDictionary.registerOre("moldBlank", new ItemStack(GameData.getItemRegistry().getObject("TabulaRasa:RasaItem7"), 1, 15));
		}

		//Leather Water Sac
		if (Loader.isModLoaded("lwstfc")) {
			OreDictionary.registerOre("itemBladder", new ItemStack(GameData.getItemRegistry().getObject("lwstfc:item.Bladder"), 1, WILD));
		}
		
		System.out.println("[" + ModDetails.ModName + "] Finished Registering OreDictionary entries");		
		
	}

}
