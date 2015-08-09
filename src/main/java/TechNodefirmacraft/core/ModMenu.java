package TechNodefirmacraft.core;

import net.minecraft.util.ResourceLocation;

public class ModMenu {

	public static ResourceLocation butATLauncher = new ResourceLocation(ModDetails.ModID, TechNodefirmacraft.TechNodefirmacraft.AssetPathMenu + "atlauncher.png");
	public static ResourceLocation butGithub = new ResourceLocation(ModDetails.ModID, TechNodefirmacraft.TechNodefirmacraft.AssetPathMenu + "github.png");
	public static ResourceLocation butReddit = new ResourceLocation(ModDetails.ModID, TechNodefirmacraft.TechNodefirmacraft.AssetPathMenu+ "reddit2.png");
	public static ResourceLocation butModTitle = new ResourceLocation(ModDetails.ModID, TechNodefirmacraft.TechNodefirmacraft.AssetPathMenu + "technodefirmacraft.png");
	public static ResourceLocation butTFCPower = new ResourceLocation(ModDetails.ModID, TechNodefirmacraft.TechNodefirmacraft.AssetPathMenu + "tfcpower.png");
	public static ResourceLocation menuBackground = new ResourceLocation(ModDetails.ModID, TechNodefirmacraft.TechNodefirmacraft.AssetPathMenu + "background.png");

	
	public static void initialise()
	{
		System.out.println("[" + ModDetails.ModName + "] Registering Menu Items");
		
		registerTextures();
		
		System.out.println("[" + ModDetails.ModName + "] Done Registering Menu Items");
	}

	private static void registerTextures()
	{
		
	}


}
