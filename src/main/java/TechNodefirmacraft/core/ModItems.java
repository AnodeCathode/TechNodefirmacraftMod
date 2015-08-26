package TechNodefirmacraft.core;


import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import TechNodefirmacraft.items.ModItemBucket;

public class ModItems 
{
	// Items
	public static Item BucketOakMix;
	public static Item BucketBirchMix;
	public static Item BucketSpruceMix;
	public static Item BucketJungleMix;
	public static Item BucketAcaciaMix;
	public static Item BucketDarkOakMix;
	
	public static void initialise()
	{
		System.out.println("[" + ModDetails.ModName + "] Registering Items");
		
		registerItems();
		
		System.out.println("[" + ModDetails.ModName + "] Done Registering Items");
	}
	
	private static void registerItems()
	{
		BucketOakMix = new ModItemBucket(Blocks.air).setUnlocalizedName("Oak Mixture").setContainerItem(Items.bucket).setTextureName(ModDetails.ModID + ":" + "fluidContainers_bucketOakMix");
		BucketBirchMix = new ModItemBucket(Blocks.air).setUnlocalizedName("Birch Mixture").setContainerItem(Items.bucket).setTextureName(ModDetails.ModID + ":" + "fluidContainers_bucketBirchMix");
		BucketSpruceMix = new ModItemBucket(Blocks.air).setUnlocalizedName("Spruce Mixture").setContainerItem(Items.bucket).setTextureName(ModDetails.ModID + ":" + "fluidContainers_bucketSpruceMix");
		BucketJungleMix = new ModItemBucket(Blocks.air).setUnlocalizedName("Jungle Mixture").setContainerItem(Items.bucket).setTextureName(ModDetails.ModID + ":" + "fluidContainers_bucketJungleMix");
		BucketAcaciaMix = new ModItemBucket(Blocks.air).setUnlocalizedName("Acacia Mixture").setContainerItem(Items.bucket).setTextureName(ModDetails.ModID + ":" + "fluidContainers_bucketAcaciaMix");
		BucketDarkOakMix = new ModItemBucket(Blocks.air).setUnlocalizedName("Dark Oak Mixture").setContainerItem(Items.bucket).setTextureName(ModDetails.ModID + ":" + "fluidContainers_bucketDarkOakMix");
		GameRegistry.registerItem(BucketOakMix, BucketOakMix.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(BucketBirchMix, BucketBirchMix.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(BucketSpruceMix, BucketSpruceMix.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(BucketJungleMix, BucketJungleMix.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(BucketAcaciaMix, BucketAcaciaMix.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(BucketDarkOakMix, BucketDarkOakMix.getUnlocalizedName().substring(5));
		
	}
}
