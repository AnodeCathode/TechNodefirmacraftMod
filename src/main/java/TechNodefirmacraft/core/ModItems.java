package TechNodefirmacraft.core;

import net.minecraft.item.Item;

public class ModItems 
{
	// Items
	public static Item CustomItem;
	
	public static void initialise()
	{
		System.out.println("[" + ModDetails.ModName + "] Registering Items");
		
		registerItems();
		
		System.out.println("[" + ModDetails.ModName + "] Done Registering Items");
	}
	
	private static void registerItems()
	{
	}
}
