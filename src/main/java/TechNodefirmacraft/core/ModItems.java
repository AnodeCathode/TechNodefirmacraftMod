package TechNodefirmacraft.core;

import com.bioxx.tfc.Core.TFCTabs;
import com.bioxx.tfc.Items.Tools.ItemCustomBucket;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import TechNodefirmacraft.items.ModItemBucket;

public class ModItems 
{
	public static ResourceLocation bucketMix = new ResourceLocation(ModDetails.ModID, TechNodefirmacraft.TechNodefirmacraft.AssetPath + "items/fluidContainers_bucketMix.png");
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
		BucketOakMix = new ModItemBucket(Blocks.air).setUnlocalizedName("Oak Mixture").setContainerItem(Items.bucket).setTextureName(ModDetails.ModID + ":" + "fluidContainers_bucketMix");
		BucketBirchMix = new ModItemBucket(Blocks.air).setUnlocalizedName("Birch Mixture").setContainerItem(Items.bucket).setTextureName(ModDetails.ModID + ":" + "fluidContainers_bucketMix");
		BucketSpruceMix = new ModItemBucket(Blocks.air).setUnlocalizedName("Spruce Mixture").setContainerItem(Items.bucket).setTextureName(ModDetails.ModID + ":" + "fluidContainers_bucketMix");
		BucketJungleMix = new ModItemBucket(Blocks.air).setUnlocalizedName("Jungle Mixture").setContainerItem(Items.bucket).setTextureName(ModDetails.ModID + ":" + "fluidContainers_bucketMix");
		BucketAcaciaMix = new ModItemBucket(Blocks.air).setUnlocalizedName("Acacia Mixture").setContainerItem(Items.bucket).setTextureName(ModDetails.ModID + ":" + "fluidContainers_bucketMix");
		BucketDarkOakMix = new ModItemBucket(Blocks.air).setUnlocalizedName("Dark Oak Mixture").setContainerItem(Items.bucket).setTextureName(ModDetails.ModID + ":" + "fluidContainers_bucketMix");
		GameRegistry.registerItem(BucketOakMix, BucketOakMix.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(BucketBirchMix, BucketBirchMix.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(BucketSpruceMix, BucketSpruceMix.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(BucketJungleMix, BucketJungleMix.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(BucketAcaciaMix, BucketAcaciaMix.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(BucketDarkOakMix, BucketDarkOakMix.getUnlocalizedName().substring(5));
		
	}
}
