package TechNodefirmacraft.core;

import com.bioxx.tfc.api.TFCBlocks;
import com.bioxx.tfc.api.TFCItems;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.oredict.ShapedOreRecipe;


public class ModRecipes
{	
	public static final int WILDCARD_VALUE = OreDictionary.WILDCARD_VALUE;
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
		
		System.out.println("[" + ModDetails.ModName + "] Done Registering Recipes");
	}

	public static void initialiseAnvil()
	{
		// check if the plans/recipes have already been initialised.
		if (ModRecipes.areAnvilRecipesInitialised()) return;
		
		System.out.println("[" + ModDetails.ModName + "] Registering Anvil Recipes");
		
		registerAnvilPlans();
		registerAnvilRecipes();
		
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
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Blocks.jukebox, 1), "123", "456", "789", '1', "gemExquisiteRuby" , '2', "gemExquisiteBeryl", '3',"gemExquisiteAgate",'4',"gemExquisiteAmethyst",'5',"gemExquisiteDiamond",'6',"gemExquisiteEmerald",'7',"gemExquisiteOpal",'8',"gemExquisiteTourmaline",'9',"gemExquisiteJade"));
		
		
		
		
		
	}


}