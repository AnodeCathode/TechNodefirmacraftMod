package TechNodefirmacraft.core;

import com.bioxx.tfc.api.TFCBlocks;
import com.bioxx.tfc.api.TFCItems;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.oredict.ShapedOreRecipe;


public class ModRecipes
{	
	public static final int WILDCARD_VALUE = OreDictionary.WILDCARD_VALUE;
	public static boolean ScriptsReloaded = false;
	private static int tickcount = 0;
	
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
	}


}