package TechNodefirmacraft.core;

import com.bioxx.tfc.Core.TFCTabs;
import com.bioxx.tfc.Items.Tools.ItemCustomBucket;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
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
		BucketOakMix = new ModItemBucket().setUnlocalizedName("Oak Mixture").setContainerItem(Items.bucket);
		BucketBirchMix = new ModItemBucket().setUnlocalizedName("Birch Mixture").setContainerItem(Items.bucket);
		BucketSpruceMix = new ModItemBucket().setUnlocalizedName("Spruce Mixture").setContainerItem(Items.bucket);
		BucketJungleMix = new ModItemBucket().setUnlocalizedName("Jungle Mixture").setContainerItem(Items.bucket);
		BucketAcaciaMix = new ModItemBucket().setUnlocalizedName("Acacia Mixture").setContainerItem(Items.bucket);
		BucketDarkOakMix = new ModItemBucket().setUnlocalizedName("Dark Oak Mixture").setContainerItem(Items.bucket);
	}
}
