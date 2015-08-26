package TechNodefirmacraft.core;

import net.minecraftforge.oredict.OreDictionary;
import minetweaker.MineTweakerImplementationAPI;

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
	}

	public static void initMTScripts() {
		//Force a reload of MT scripts at world start to fix Meks late recipe registration
		if (!ScriptsReloaded)
		{
			tickcount++;
			//Wait for mekanism to finish screwing up all the recipes.
			if (tickcount > 10)
			{
			MineTweakerImplementationAPI.reload();
			System.out.println("[" + ModDetails.ModName + "] Forced MineTweaker Script reload. *shakes fist at Mekanism*");
			ScriptsReloaded = true;
			}
		}
			
	}
}