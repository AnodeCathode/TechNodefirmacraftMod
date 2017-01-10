package TechNodefirmacraft.core;


import TechNodefirmacraft.items.ItemBase;
import TechNodefirmacraft.items.ItemTNFCShears;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import TechNodefirmacraft.items.ModItemBucket;
import TechNodefirmacraft.items.TFCRecord;

public class ModItems 
{
	// Items
	public static Item BucketOakMix;
	public static Item BucketBirchMix;
	public static Item BucketSpruceMix;
	public static Item BucketJungleMix;
	public static Item BucketAcaciaMix;
	public static Item BucketDarkOakMix;
	public static Item record_TfcMusic;
	public static Item record_CigBeer;
	public static Item blackSteelShears;
	public static Item mulch;
	public static Item mold;
	public static Item amalgam;
	public static Item diamonddust;
	
	public static void initialise()
	{
		System.out.println("[" + ModDetails.ModName + "] Registering Items");
		BucketOakMix = new ModItemBucket(Blocks.air).setUnlocalizedName("Oak Mixture").setContainerItem(Items.bucket).setTextureName(ModDetails.ModID + ":" + "fluidContainers_bucketOakMix");
		BucketBirchMix = new ModItemBucket(Blocks.air).setUnlocalizedName("Birch Mixture").setContainerItem(Items.bucket).setTextureName(ModDetails.ModID + ":" + "fluidContainers_bucketBirchMix");
		BucketSpruceMix = new ModItemBucket(Blocks.air).setUnlocalizedName("Spruce Mixture").setContainerItem(Items.bucket).setTextureName(ModDetails.ModID + ":" + "fluidContainers_bucketSpruceMix");
		BucketJungleMix = new ModItemBucket(Blocks.air).setUnlocalizedName("Jungle Mixture").setContainerItem(Items.bucket).setTextureName(ModDetails.ModID + ":" + "fluidContainers_bucketJungleMix");
		BucketAcaciaMix = new ModItemBucket(Blocks.air).setUnlocalizedName("Acacia Mixture").setContainerItem(Items.bucket).setTextureName(ModDetails.ModID + ":" + "fluidContainers_bucketAcaciaMix");
		BucketDarkOakMix = new ModItemBucket(Blocks.air).setUnlocalizedName("Dark Oak Mixture").setContainerItem(Items.bucket).setTextureName(ModDetails.ModID + ":" + "fluidContainers_bucketDarkOakMix");
		record_TfcMusic = new TFCRecord("record_TfcMusic").setUnlocalizedName("record_TfcMusic").setTextureName(ModDetails.ModID + ":" + "record_TfcMusic");
		record_CigBeer = new TFCRecord("record_CigBeer").setUnlocalizedName("record_CigBeer").setTextureName(ModDetails.ModID + ":" + "record_CigBeer");
		blackSteelShears = new ItemTNFCShears().setUnlocalizedName("shearsBlackSteel");
		mulch = new ItemBase().setMetaNames(ModReferences.MULCH).setUnlocalizedName("mulch");
		mold = new ItemBase().setMetaNames(ModReferences.MOLD).setUnlocalizedName("mold");
		amalgam = new ItemBase().setMetaNames(ModReferences.AMALGAM).setUnlocalizedName("amalgam");
		diamonddust = new ItemBase().setUnlocalizedName("tinyDiamondDust");
		registerItems();
		
		System.out.println("[" + ModDetails.ModName + "] Done Registering Items");
	}
	
	private static void registerItems()
	{

		GameRegistry.registerItem(BucketOakMix, BucketOakMix.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(BucketBirchMix, BucketBirchMix.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(BucketSpruceMix, BucketSpruceMix.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(BucketJungleMix, BucketJungleMix.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(BucketAcaciaMix, BucketAcaciaMix.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(BucketDarkOakMix, BucketDarkOakMix.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(record_TfcMusic, record_TfcMusic.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(record_CigBeer, record_CigBeer.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(blackSteelShears, blackSteelShears.getUnlocalizedName());
		GameRegistry.registerItem(mulch, mulch.getUnlocalizedName());
		GameRegistry.registerItem(mold, mold.getUnlocalizedName());
		GameRegistry.registerItem(amalgam, amalgam.getUnlocalizedName());
		GameRegistry.registerItem(diamonddust, diamonddust.getUnlocalizedName());

	}
}
