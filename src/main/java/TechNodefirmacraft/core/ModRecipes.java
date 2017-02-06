package TechNodefirmacraft.core;

import com.bioxx.tfc.Food.ItemFoodTFC;
import com.bioxx.tfc.api.Crafting.BarrelAlcoholRecipe;
import com.bioxx.tfc.api.Crafting.BarrelManager;
import com.bioxx.tfc.api.Crafting.BarrelRecipe;
import com.bioxx.tfc.api.TFCBlocks;
import com.bioxx.tfc.api.TFCFluids;
import com.bioxx.tfc.api.TFCItems;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fluids.FluidStack;
import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.oredict.ShapedOreRecipe;


public class ModRecipes
{
	public static final int WILD = OreDictionary.WILDCARD_VALUE;
	public static boolean ScriptsReloaded = false;
	private static int tickcount = 0;

    public static final Item itemPolyethene = GameRegistry.findItem("Mekanism", "Polyethene");
    public static final ItemStack polyetheneItemStack = new ItemStack(itemPolyethene,1,2);
    
	//private static AnvilManager anvilManager = AnvilManager.getInstance();
	//private static BarrelManager barrelManager = BarrelManager.getInstance();
	//private static CraftingManagerTFC craftingManager = CraftingManagerTFC.getInstance();
	//private static KilnCraftingManager kilnCraftingManager = KilnCraftingManager.getInstance();
	//private static QuernManager quernManager = QuernManager.getInstance();

	// Plans

	public static void initialise()
	{
		System.out.println("[" + ModDetails.ModName + "] Registering Recipes");
		
		registerRecipes();
		registerBarrelRecipes();

		System.out.println("[" + ModDetails.ModName + "] Done Registering Recipes");
	}

	public static void initialiseAnvil()
	{
		// check if the plans/recipes have already been initialised.
		if (ModRecipes.areAnvilRecipesInitialised()) return;
		
		System.out.println("[" + ModDetails.ModName + "] Registering Anvil Recipes");
		
		//registerAnvilPlans();
		//registerAnvilRecipes();
		
		System.out.println("[" + ModDetails.ModName + "] Done Registering Anvil Recipes");
	}

    public static boolean areAnvilRecipesInitialised() 
    { 
        return true;
    } 

	private static void registerAnvilPlans()
	{
	}
	
	private static void registerAnvilRecipes()
	{		
	}
	
	private static void registerRecipes()
	{
		GameRegistry.addRecipe(new ShapedOreRecipe(
				new ItemStack(ModBlocks.TFCBeacon, 1), "2 4", "536", "171", '1', new ItemStack(TFCBlocks.metalBlock,1,13), '2', "craftingToolHardChisel", '3', new ItemStack(Items.nether_star,1), '4', "craftingToolHardHammer", '5', "gemExquisiteRuby", '6', "gemExquisiteSapphire", '7', "blockDiamond"));
		//Music disks.. Cigarettes and Beer has no recipe.
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.record_TfcMusic, 1), "111", "121", "111", '1', polyetheneItemStack , '2', "gemExquisiteDiamond"));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Items.record_11, 1), "111", "121", "111", '1', polyetheneItemStack , '2', "gemExquisiteRuby"));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Items.record_13, 1), "111", "121", "111", '1', polyetheneItemStack , '2', "gemExquisiteAgate"));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Items.record_blocks, 1), "111", "121", "111", '1', polyetheneItemStack , '2', "gemExquisiteAmethyst"));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Items.record_cat, 1), "111", "121", "111", '1', polyetheneItemStack , '2', "gemExquisiteEmerald"));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Items.record_chirp, 1), "111", "121", "111", '1', polyetheneItemStack , '2', "gemExquisiteGarnet"));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Items.record_far, 1), "111", "121", "111", '1', polyetheneItemStack , '2', "gemExquisiteJade"));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Items.record_mall, 1), "111", "121", "111", '1', polyetheneItemStack , '2', "gemExquisiteJasper"));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Items.record_mellohi, 1), "111", "121", "111", '1', polyetheneItemStack , '2', "gemExquisiteOpal"));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Items.record_strad, 1), "111", "121", "111", '1', polyetheneItemStack , '2', "gemExquisiteSapphire"));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Items.record_stal, 1), "111", "121", "111", '1', polyetheneItemStack , '2', "gemExquisiteTopaz"));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Items.record_wait, 1), "111", "121", "111", '1', polyetheneItemStack , '2', "gemExquisiteTourmaline"));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Items.record_ward, 1), "111", "121", "111", '1', polyetheneItemStack , '2', "gemExquisiteBeryl"));
		//Evil new jukebox recipe:
		//GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Blocks.jukebox, 1), "123", "456", "789", '1', "gemExquisiteRuby" , '2', "gemExquisiteBeryl", '3',"gemExquisiteAgate",'4',"gemExquisiteAmethyst",'5',"gemExquisiteDiamond",'6',"gemExquisiteEmerald",'7',"gemExquisiteOpal",'8',"gemExquisiteTourmaline",'9',"gemExquisiteJade"));
		// Slightly less evil jukebox recipe:
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Blocks.jukebox, 1), "111", "151", "111", '1', "craftingFlawlessPlus" ,'5',"gemExquisiteDiamond"));

		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.mulch, 1, 0), "ABA", "CSC", "DBD",
				'A', new ItemStack(TFCBlocks.sapling, 1, 14), 'B', new ItemStack(TFCBlocks.fruitTreeSapling, 1, 1),
				'C', new ItemStack(TFCBlocks.sapling, 1, 13), 'D', new ItemStack(TFCBlocks.sapling, 1, 11),
				'S', new ItemStack(TFCItems.shearsBlackSteel, 1, WILD)));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.mulch, 1, 1), "ABA", "CSC", "DBD",
				'A', new ItemStack(TFCBlocks.sapling, 1, 2), 'B', new ItemStack(TFCBlocks.fruitTreeSapling, 1, 8),
				'C', new ItemStack(TFCBlocks.fruitTreeSapling, 1, 7), 'D', new ItemStack(TFCBlocks.sapling, 1, 1),
				'S', new ItemStack(TFCItems.shearsBlackSteel, 1, WILD)));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.mulch, 1, 2), "ABA", "CSC", "DBD",
				'A', new ItemStack(TFCBlocks.sapling, 1, 3), 'B', new ItemStack(TFCBlocks.fruitTreeSapling, 1, 4),
				'C', new ItemStack(TFCBlocks.fruitTreeSapling, 1, 2), 'D', new ItemStack(TFCBlocks.sapling, 1, 5),
				'S', new ItemStack(TFCItems.shearsBlackSteel, 1, WILD)));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.mulch, 1, 3), "ABA", "CSC", "DBD",
				'A', new ItemStack(TFCBlocks.sapling, 1, 4), 'B', new ItemStack(TFCBlocks.fruitTreeSapling, 1, 6),
				'C', new ItemStack(TFCBlocks.sapling, 1, 9), 'D', new ItemStack(TFCBlocks.sapling, 1, 7),
				'S', new ItemStack(TFCItems.shearsBlackSteel, 1, WILD)));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.mulch, 1, 4), "ABA", "CSC", "DBD",
				'A', new ItemStack(TFCBlocks.sapling, 1, 0), 'B', new ItemStack(TFCBlocks.fruitTreeSapling, 1, 0),
				'C', new ItemStack(TFCBlocks.sapling, 1, 3), 'D', new ItemStack(TFCBlocks.sapling, 1, 6),
				'S', new ItemStack(TFCItems.shearsBlackSteel, 1, WILD)));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.mulch, 1, 5), "ABA", "CSC", "DBD",
				'A', new ItemStack(TFCBlocks.sapling, 1, 10), 'B', new ItemStack(TFCBlocks.sapling, 1, 12),
				'C', new ItemStack(TFCBlocks.fruitTreeSapling, 1, 5), 'D', new ItemStack(TFCBlocks.sapling, 1, 8),
				'S', new ItemStack(TFCItems.shearsBlackSteel, 1, WILD)));
	}
	private static void registerBarrelRecipes() {
		BarrelManager.getInstance().addRecipe(new BarrelRecipe(new ItemStack(ModItems.mulch, 1, 0), new FluidStack(TFCFluids.FRESHWATER, 1000), null, new FluidStack(ModFluids.ACACIAMIX, 1000), 24).setMinTechLevel(1).setSealedRecipe(true).setRemovesLiquid(false).setAllowAnyStack(true));
		BarrelManager.getInstance().addRecipe(new BarrelRecipe(new ItemStack(ModItems.mulch, 1, 1), new FluidStack(TFCFluids.FRESHWATER, 1000), null, new FluidStack(ModFluids.BIRCHMIX, 1000), 24).setMinTechLevel(1).setSealedRecipe(true).setRemovesLiquid(false).setAllowAnyStack(true));
		BarrelManager.getInstance().addRecipe(new BarrelRecipe(new ItemStack(ModItems.mulch, 1, 2), new FluidStack(TFCFluids.FRESHWATER, 1000), null, new FluidStack(ModFluids.DARKOAKMIX, 1000), 24).setMinTechLevel(1).setSealedRecipe(true).setRemovesLiquid(false).setAllowAnyStack(true));
		BarrelManager.getInstance().addRecipe(new BarrelRecipe(new ItemStack(ModItems.mulch, 1, 3), new FluidStack(TFCFluids.FRESHWATER, 1000), null, new FluidStack(ModFluids.JUNGLEMIX, 1000), 24).setMinTechLevel(1).setSealedRecipe(true).setRemovesLiquid(false).setAllowAnyStack(true));
		BarrelManager.getInstance().addRecipe(new BarrelRecipe(new ItemStack(ModItems.mulch, 1, 4), new FluidStack(TFCFluids.FRESHWATER, 1000), null, new FluidStack(ModFluids.OAKMIX, 1000), 24).setMinTechLevel(1).setSealedRecipe(true).setRemovesLiquid(false).setAllowAnyStack(true));
		BarrelManager.getInstance().addRecipe(new BarrelRecipe(new ItemStack(ModItems.mulch, 1, 5), new FluidStack(TFCFluids.FRESHWATER, 1000), null, new FluidStack(ModFluids.SPRUCEMIX, 1000), 24).setMinTechLevel(1).setSealedRecipe(true).setRemovesLiquid(false).setAllowAnyStack(true));

		BarrelManager.getInstance().addRecipe(new BarrelRecipe(new ItemStack(TFCBlocks.fruitTreeSapling, 1, 1), new FluidStack(ModFluids.ACACIAMIX, 2000), new ItemStack(Blocks.sapling, 1, 4), new FluidStack(ModFluids.ACACIAMIX, 2000), 24).setMinTechLevel(1).setSealedRecipe(true).setRemovesLiquid(true).setAllowAnyStack(true));
		BarrelManager.getInstance().addRecipe(new BarrelRecipe(new ItemStack(TFCBlocks.sapling, 1, 2), new FluidStack(ModFluids.BIRCHMIX, 2000), new ItemStack(Blocks.sapling, 1, 2), new FluidStack(ModFluids.BIRCHMIX, 2000), 24).setMinTechLevel(1).setSealedRecipe(true).setRemovesLiquid(true).setAllowAnyStack(true));
		BarrelManager.getInstance().addRecipe(new BarrelRecipe(new ItemStack(TFCBlocks.sapling, 1, 3), new FluidStack(ModFluids.DARKOAKMIX, 2000), new ItemStack(Blocks.sapling, 1, 5), new FluidStack(ModFluids.DARKOAKMIX, 2000), 24).setMinTechLevel(1).setSealedRecipe(true).setRemovesLiquid(true).setAllowAnyStack(true));
		BarrelManager.getInstance().addRecipe(new BarrelRecipe(new ItemStack(TFCBlocks.sapling, 1, 4), new FluidStack(ModFluids.JUNGLEMIX, 2000), new ItemStack(Blocks.sapling, 1, 3), new FluidStack(ModFluids.JUNGLEMIX, 2000), 24).setMinTechLevel(1).setSealedRecipe(true).setRemovesLiquid(true).setAllowAnyStack(true));
		BarrelManager.getInstance().addRecipe(new BarrelRecipe(new ItemStack(TFCBlocks.sapling, 1, 0), new FluidStack(ModFluids.OAKMIX, 2000), new ItemStack(Blocks.sapling, 1, 0), new FluidStack(ModFluids.OAKMIX, 2000), 24).setMinTechLevel(1).setSealedRecipe(true).setRemovesLiquid(true).setAllowAnyStack(true));
		BarrelManager.getInstance().addRecipe(new BarrelRecipe(new ItemStack(TFCBlocks.sapling, 1, 10), new FluidStack(ModFluids.SPRUCEMIX, 2000), new ItemStack(Blocks.sapling, 1, 1), new FluidStack(ModFluids.SPRUCEMIX, 2000), 24).setMinTechLevel(1).setSealedRecipe(true).setRemovesLiquid(true).setAllowAnyStack(true));

		BarrelManager.getInstance().addRecipe(new BarrelRecipe(new ItemStack(TFCItems.logs, 1, 4), new FluidStack(TFCFluids.VINEGAR, 625), new ItemStack(Items.slime_ball, 4, 0), new FluidStack(TFCFluids.VINEGAR, 625), 8).setMinTechLevel(0).setSealedRecipe(true).setRemovesLiquid(true).setAllowAnyStack(true));
		BarrelManager.getInstance().addRecipe(new BarrelRecipe(new ItemStack(TFCItems.logs, 1, 8), new FluidStack(TFCFluids.VINEGAR, 625), new ItemStack(Items.slime_ball, 4, 0), new FluidStack(TFCFluids.VINEGAR, 625), 8).setMinTechLevel(0).setSealedRecipe(true).setRemovesLiquid(true).setAllowAnyStack(true));
		BarrelManager.getInstance().addRecipe(new BarrelRecipe(new ItemStack(TFCItems.logs, 1, 9), new FluidStack(TFCFluids.VINEGAR, 625), new ItemStack(Items.slime_ball, 4, 0), new FluidStack(TFCFluids.VINEGAR, 625), 8).setMinTechLevel(0).setSealedRecipe(true).setRemovesLiquid(true).setAllowAnyStack(true));
		BarrelManager.getInstance().addRecipe(new BarrelRecipe(new ItemStack(TFCItems.logs, 1, 10), new FluidStack(TFCFluids.VINEGAR, 625), new ItemStack(Items.slime_ball, 4, 0), new FluidStack(TFCFluids.VINEGAR, 625), 8).setMinTechLevel(0).setSealedRecipe(true).setRemovesLiquid(true).setAllowAnyStack(true));

		BarrelManager.getInstance().addRecipe(new BarrelRecipe(new ItemStack(Items.spider_eye, 1, 0), new FluidStack(TFCFluids.BRINE, 100), new ItemStack(Items.fermented_spider_eye, 1, 0), new FluidStack(TFCFluids.BRINE, 100), 8).setMinTechLevel(0).setSealedRecipe(true).setRemovesLiquid(true).setAllowAnyStack(true));

		BarrelManager.getInstance().addRecipe(new BarrelRecipe(new ItemStack(Items.fermented_spider_eye, 1, 0), new FluidStack(TFCFluids.LIMEWATER, 250), null, new FluidStack(ModFluids.POISONPOT, 250), 72).setMinTechLevel(1).setSealedRecipe(true).setRemovesLiquid(false).setAllowAnyStack(true));
		BarrelManager.getInstance().addRecipe(new BarrelRecipe(new ItemStack(TFCBlocks.fungi, 1, 1), new FluidStack(TFCFluids.BRINE, 250), null, new FluidStack(ModFluids.WEAKNESSPOT, 250), 72).setMinTechLevel(1).setSealedRecipe(true).setRemovesLiquid(false).setAllowAnyStack(true));
		BarrelManager.getInstance().addRecipe(new BarrelRecipe(new ItemStack(Items.rotten_flesh, 1, 0), new FluidStack(TFCFluids.VINEGAR, 250), null, new FluidStack(ModFluids.HARMPOT, 250), 72).setMinTechLevel(1).setSealedRecipe(true).setRemovesLiquid(false).setAllowAnyStack(true));
		BarrelManager.getInstance().addRecipe(new BarrelRecipe(new ItemStack(TFCItems.dye, 1, 15), new FluidStack(TFCFluids.CORNWHISKEY, 250), null, new FluidStack(ModFluids.INVISIBILITYPOT, 250), 72).setMinTechLevel(1).setSealedRecipe(true).setRemovesLiquid(false).setAllowAnyStack(true));
		BarrelManager.getInstance().addRecipe(new BarrelAlcoholRecipe(ItemFoodTFC.createTag(new ItemStack(TFCItems.sugar), 160), new FluidStack(TFCFluids.RYEWHISKEY, 4000), null, new FluidStack(ModFluids.REGENPOT, 4000)));
		BarrelManager.getInstance().addRecipe(new BarrelAlcoholRecipe(ItemFoodTFC.createTag(new ItemStack(TFCItems.soybean), 160), new FluidStack(TFCFluids.VODKA, 4000), null, new FluidStack(ModFluids.SWIFTPOT, 4000)));
		BarrelManager.getInstance().addRecipe(new BarrelAlcoholRecipe(ItemFoodTFC.createTag(new ItemStack(TFCItems.seaWeed), 160), new FluidStack(TFCFluids.OLIVEOIL, 4000), null, new FluidStack(ModFluids.FIRERESPOT, 4000)));
		BarrelManager.getInstance().addRecipe(new BarrelAlcoholRecipe(ItemFoodTFC.createTag(new ItemStack(TFCItems.garlic), 160), new FluidStack(TFCFluids.RUM, 4000), null, new FluidStack(ModFluids.HEALTHPOT, 4000)));
		BarrelManager.getInstance().addRecipe(new BarrelAlcoholRecipe(ItemFoodTFC.createTag(new ItemStack(TFCItems.carrot), 160), new FluidStack(TFCFluids.SAKE, 4000), null, new FluidStack(ModFluids.NIGHTVISIONPOT, 4000)));
		BarrelManager.getInstance().addRecipe(new BarrelAlcoholRecipe(ItemFoodTFC.createTag(new ItemStack(TFCItems.beefRaw), 160), new FluidStack(TFCFluids.WHISKEY, 4000), null, new FluidStack(ModFluids.STRPOT, 4000)));
		BarrelManager.getInstance().addRecipe(new BarrelAlcoholRecipe(ItemFoodTFC.createTag(new ItemStack(TFCItems.potato), 160), new FluidStack(TFCFluids.BEER, 4000), null, new FluidStack(ModFluids.SLOWPOT, 4000)));
		BarrelManager.getInstance().addRecipe(new BarrelAlcoholRecipe(ItemFoodTFC.createTag(new ItemStack(TFCItems.fishRaw), 160), new FluidStack(TFCFluids.CIDER, 4000), null, new FluidStack(ModFluids.WATERBREATHINGPOT, 4000)));

		BarrelManager.getInstance().addRecipe(new BarrelRecipe(new ItemStack(Items.ender_eye, 1, 0), new FluidStack(TFCFluids.SALTWATER, 250), null, new FluidStack(ModFluids.ENERGIZINGFLUID, 250), 72).setMinTechLevel(0).setSealedRecipe(true).setRemovesLiquid(false).setAllowAnyStack(true));
		BarrelManager.getInstance().addRecipe(new BarrelRecipe(new ItemStack(Items.ender_pearl, 1, 0), new FluidStack(TFCFluids.FRESHWATER, 625), null, new FluidStack(ModFluids.EXTENDINGFLUID, 625), 72).setMinTechLevel(0).setSealedRecipe(true).setRemovesLiquid(false).setAllowAnyStack(true));

		BarrelManager.getInstance().addRecipe(new BarrelRecipe(new ItemStack(ModItems.BottleRegenPot, 1, 0), new FluidStack(ModFluids.ENERGIZINGFLUID, 250), new ItemStack(Items.potionitem, 1, 8193), new FluidStack(ModFluids.ENERGIZINGFLUID, 250), 8).setMinTechLevel(1).setSealedRecipe(true).setRemovesLiquid(true).setAllowAnyStack(true));
		BarrelManager.getInstance().addRecipe(new BarrelRecipe(new ItemStack(ModItems.BottleSwiftPot, 1, 0), new FluidStack(ModFluids.ENERGIZINGFLUID, 250), new ItemStack(Items.potionitem, 1, 8194), new FluidStack(ModFluids.ENERGIZINGFLUID, 250), 8).setMinTechLevel(1).setSealedRecipe(true).setRemovesLiquid(true).setAllowAnyStack(true));
		BarrelManager.getInstance().addRecipe(new BarrelRecipe(new ItemStack(ModItems.BottleFireResPot, 1, 0), new FluidStack(ModFluids.ENERGIZINGFLUID, 250), new ItemStack(Items.potionitem, 1, 8195), new FluidStack(ModFluids.ENERGIZINGFLUID, 250), 8).setMinTechLevel(1).setSealedRecipe(true).setRemovesLiquid(true).setAllowAnyStack(true));
		BarrelManager.getInstance().addRecipe(new BarrelRecipe(new ItemStack(ModItems.BottlePoisonPot, 1, 0), new FluidStack(ModFluids.ENERGIZINGFLUID, 250), new ItemStack(Items.potionitem, 1, 8196), new FluidStack(ModFluids.ENERGIZINGFLUID, 250), 8).setMinTechLevel(1).setSealedRecipe(true).setRemovesLiquid(true).setAllowAnyStack(true));
		BarrelManager.getInstance().addRecipe(new BarrelRecipe(new ItemStack(ModItems.BottleHealthPot, 1, 0), new FluidStack(ModFluids.ENERGIZINGFLUID, 250), new ItemStack(Items.potionitem, 1, 8197), new FluidStack(ModFluids.ENERGIZINGFLUID, 250), 8).setMinTechLevel(1).setSealedRecipe(true).setRemovesLiquid(true).setAllowAnyStack(true));
		BarrelManager.getInstance().addRecipe(new BarrelRecipe(new ItemStack(ModItems.BottleNightVisionPot, 1, 0), new FluidStack(ModFluids.ENERGIZINGFLUID, 250), new ItemStack(Items.potionitem, 1, 8198), new FluidStack(ModFluids.ENERGIZINGFLUID, 250), 8).setMinTechLevel(1).setSealedRecipe(true).setRemovesLiquid(true).setAllowAnyStack(true));
		BarrelManager.getInstance().addRecipe(new BarrelRecipe(new ItemStack(ModItems.BottleWeaknessPot, 1, 0), new FluidStack(ModFluids.ENERGIZINGFLUID, 250), new ItemStack(Items.potionitem, 1, 8200), new FluidStack(ModFluids.ENERGIZINGFLUID, 250), 8).setMinTechLevel(1).setSealedRecipe(true).setRemovesLiquid(true).setAllowAnyStack(true));
		BarrelManager.getInstance().addRecipe(new BarrelRecipe(new ItemStack(ModItems.BottleStrPot, 1, 0), new FluidStack(ModFluids.ENERGIZINGFLUID, 250), new ItemStack(Items.potionitem, 1, 8201), new FluidStack(ModFluids.ENERGIZINGFLUID, 250), 8).setMinTechLevel(1).setSealedRecipe(true).setRemovesLiquid(true).setAllowAnyStack(true));
		BarrelManager.getInstance().addRecipe(new BarrelRecipe(new ItemStack(ModItems.BottleSlowPot, 1, 0), new FluidStack(ModFluids.ENERGIZINGFLUID, 250), new ItemStack(Items.potionitem, 1, 8202), new FluidStack(ModFluids.ENERGIZINGFLUID, 250), 8).setMinTechLevel(1).setSealedRecipe(true).setRemovesLiquid(true).setAllowAnyStack(true));
		BarrelManager.getInstance().addRecipe(new BarrelRecipe(new ItemStack(ModItems.BottleHarmPot, 1, 0), new FluidStack(ModFluids.ENERGIZINGFLUID, 250), new ItemStack(Items.potionitem, 1, 8204), new FluidStack(ModFluids.ENERGIZINGFLUID, 250), 8).setMinTechLevel(1).setSealedRecipe(true).setRemovesLiquid(true).setAllowAnyStack(true));
		BarrelManager.getInstance().addRecipe(new BarrelRecipe(new ItemStack(ModItems.BottleWaterBreathingPot, 1, 0), new FluidStack(ModFluids.ENERGIZINGFLUID, 250), new ItemStack(Items.potionitem, 1, 8205), new FluidStack(ModFluids.ENERGIZINGFLUID, 250), 8).setMinTechLevel(1).setSealedRecipe(true).setRemovesLiquid(true).setAllowAnyStack(true));
		BarrelManager.getInstance().addRecipe(new BarrelRecipe(new ItemStack(ModItems.BottleInvisibilityPot, 1, 0), new FluidStack(ModFluids.ENERGIZINGFLUID, 250), new ItemStack(Items.potionitem, 1, 8206), new FluidStack(ModFluids.ENERGIZINGFLUID, 250), 8).setMinTechLevel(1).setSealedRecipe(true).setRemovesLiquid(true).setAllowAnyStack(true));

		//Enhance Potion
		BarrelManager.getInstance().addRecipe(new BarrelRecipe(new ItemStack(Items.potionitem, 1, 8193), new FluidStack(ModFluids.ENERGIZINGFLUID, 250), new ItemStack(Items.potionitem, 1, 8225), new FluidStack(ModFluids.ENERGIZINGFLUID, 250), 4).setMinTechLevel(1).setSealedRecipe(true).setRemovesLiquid(true).setAllowAnyStack(true));
		BarrelManager.getInstance().addRecipe(new BarrelRecipe(new ItemStack(Items.potionitem, 1, 8194), new FluidStack(ModFluids.ENERGIZINGFLUID, 250), new ItemStack(Items.potionitem, 1, 8226), new FluidStack(ModFluids.ENERGIZINGFLUID, 250), 4).setMinTechLevel(1).setSealedRecipe(true).setRemovesLiquid(true).setAllowAnyStack(true));
		BarrelManager.getInstance().addRecipe(new BarrelRecipe(new ItemStack(Items.potionitem, 1, 8196), new FluidStack(ModFluids.ENERGIZINGFLUID, 250), new ItemStack(Items.potionitem, 1, 8228), new FluidStack(ModFluids.ENERGIZINGFLUID, 250), 4).setMinTechLevel(1).setSealedRecipe(true).setRemovesLiquid(true).setAllowAnyStack(true));
		BarrelManager.getInstance().addRecipe(new BarrelRecipe(new ItemStack(Items.potionitem, 1, 8197), new FluidStack(ModFluids.ENERGIZINGFLUID, 250), new ItemStack(Items.potionitem, 1, 8229), new FluidStack(ModFluids.ENERGIZINGFLUID, 250), 4).setMinTechLevel(1).setSealedRecipe(true).setRemovesLiquid(true).setAllowAnyStack(true));
		BarrelManager.getInstance().addRecipe(new BarrelRecipe(new ItemStack(Items.potionitem, 1, 8201), new FluidStack(ModFluids.ENERGIZINGFLUID, 250), new ItemStack(Items.potionitem, 1, 8233), new FluidStack(ModFluids.ENERGIZINGFLUID, 250), 4).setMinTechLevel(1).setSealedRecipe(true).setRemovesLiquid(true).setAllowAnyStack(true));
		BarrelManager.getInstance().addRecipe(new BarrelRecipe(new ItemStack(Items.potionitem, 1, 8204), new FluidStack(ModFluids.ENERGIZINGFLUID, 250), new ItemStack(Items.potionitem, 1, 8236), new FluidStack(ModFluids.ENERGIZINGFLUID, 250), 4).setMinTechLevel(1).setSealedRecipe(true).setRemovesLiquid(true).setAllowAnyStack(true));

		//Extend Potion
		BarrelManager.getInstance().addRecipe(new BarrelRecipe(new ItemStack(Items.potionitem, 1, 8193), new FluidStack(ModFluids.EXTENDINGFLUID, 250), new ItemStack(Items.potionitem, 1, 8257), new FluidStack(ModFluids.EXTENDINGFLUID, 250), 4).setMinTechLevel(1).setSealedRecipe(true).setRemovesLiquid(true).setAllowAnyStack(true));
		BarrelManager.getInstance().addRecipe(new BarrelRecipe(new ItemStack(Items.potionitem, 1, 8194), new FluidStack(ModFluids.EXTENDINGFLUID, 250), new ItemStack(Items.potionitem, 1, 8258), new FluidStack(ModFluids.EXTENDINGFLUID, 250), 4).setMinTechLevel(1).setSealedRecipe(true).setRemovesLiquid(true).setAllowAnyStack(true));
		BarrelManager.getInstance().addRecipe(new BarrelRecipe(new ItemStack(Items.potionitem, 1, 8195), new FluidStack(ModFluids.EXTENDINGFLUID, 250), new ItemStack(Items.potionitem, 1, 8259), new FluidStack(ModFluids.EXTENDINGFLUID, 250), 4).setMinTechLevel(1).setSealedRecipe(true).setRemovesLiquid(true).setAllowAnyStack(true));
		BarrelManager.getInstance().addRecipe(new BarrelRecipe(new ItemStack(Items.potionitem, 1, 8196), new FluidStack(ModFluids.EXTENDINGFLUID, 250), new ItemStack(Items.potionitem, 1, 8260), new FluidStack(ModFluids.EXTENDINGFLUID, 250), 4).setMinTechLevel(1).setSealedRecipe(true).setRemovesLiquid(true).setAllowAnyStack(true));
		BarrelManager.getInstance().addRecipe(new BarrelRecipe(new ItemStack(Items.potionitem, 1, 8198), new FluidStack(ModFluids.EXTENDINGFLUID, 250), new ItemStack(Items.potionitem, 1, 8262), new FluidStack(ModFluids.EXTENDINGFLUID, 250), 4).setMinTechLevel(1).setSealedRecipe(true).setRemovesLiquid(true).setAllowAnyStack(true));
		BarrelManager.getInstance().addRecipe(new BarrelRecipe(new ItemStack(Items.potionitem, 1, 8200), new FluidStack(ModFluids.EXTENDINGFLUID, 250), new ItemStack(Items.potionitem, 1, 8264), new FluidStack(ModFluids.EXTENDINGFLUID, 250), 4).setMinTechLevel(1).setSealedRecipe(true).setRemovesLiquid(true).setAllowAnyStack(true));
		BarrelManager.getInstance().addRecipe(new BarrelRecipe(new ItemStack(Items.potionitem, 1, 8201), new FluidStack(ModFluids.EXTENDINGFLUID, 250), new ItemStack(Items.potionitem, 1, 8265), new FluidStack(ModFluids.EXTENDINGFLUID, 250), 4).setMinTechLevel(1).setSealedRecipe(true).setRemovesLiquid(true).setAllowAnyStack(true));
		BarrelManager.getInstance().addRecipe(new BarrelRecipe(new ItemStack(Items.potionitem, 1, 8202), new FluidStack(ModFluids.EXTENDINGFLUID, 250), new ItemStack(Items.potionitem, 1, 8266), new FluidStack(ModFluids.EXTENDINGFLUID, 250), 4).setMinTechLevel(1).setSealedRecipe(true).setRemovesLiquid(true).setAllowAnyStack(true));
		BarrelManager.getInstance().addRecipe(new BarrelRecipe(new ItemStack(Items.potionitem, 1, 8205), new FluidStack(ModFluids.EXTENDINGFLUID, 250), new ItemStack(Items.potionitem, 1, 8269), new FluidStack(ModFluids.EXTENDINGFLUID, 250), 4).setMinTechLevel(1).setSealedRecipe(true).setRemovesLiquid(true).setAllowAnyStack(true));
		BarrelManager.getInstance().addRecipe(new BarrelRecipe(new ItemStack(Items.potionitem, 1, 8206), new FluidStack(ModFluids.EXTENDINGFLUID, 250), new ItemStack(Items.potionitem, 1, 8270), new FluidStack(ModFluids.EXTENDINGFLUID, 250), 4).setMinTechLevel(1).setSealedRecipe(true).setRemovesLiquid(true).setAllowAnyStack(true));
	}
}