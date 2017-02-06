package TechNodefirmacraft.core;


import TechNodefirmacraft.items.ItemBase;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;
import TechNodefirmacraft.items.ModItemBottle;
import TechNodefirmacraft.items.TFCRecord;

public class ModItems 
{
	// Items
	public static Item BottleOakMix;
	public static Item BottleBirchMix;
	public static Item BottleSpruceMix;
	public static Item BottleJungleMix;
	public static Item BottleAcaciaMix;
	public static Item BottleDarkOakMix;
	public static Item BottleRegenPot;
	public static Item BottleSwiftPot;
	public static Item BottleFireResPot;
	public static Item BottlePoisonPot;
	public static Item BottleHealthPot;
	public static Item BottleNightVisionPot;
	public static Item BottleWeaknessPot;
	public static Item BottleStrPot;
	public static Item BottleSlowPot;
	public static Item BottleHarmPot;
	public static Item BottleWaterBreathingPot;
	public static Item BottleInvisibilityPot;
	public static Item BottleEnergizingFluid;
	public static Item BottleExtendingFluid;
	public static Item record_TfcMusic;
	public static Item record_CigBeer;
	public static Item mulch;
	public static Item mold;
	public static Item amalgam;
	public static Item diamonddust;
	
	public static void initialise()
	{
		System.out.println("[" + ModDetails.ModName + "] Registering Items");
		BottleOakMix = new ModItemBottle().setUnlocalizedName("Oak Mixture").setCreativeTab(CreativeTab.TNFC_TAB);
		BottleBirchMix = new ModItemBottle().setUnlocalizedName("Birch Mixture").setCreativeTab(CreativeTab.TNFC_TAB);
		BottleSpruceMix = new ModItemBottle().setUnlocalizedName("Spruce Mixture").setCreativeTab(CreativeTab.TNFC_TAB);
		BottleJungleMix = new ModItemBottle().setUnlocalizedName("Jungle Mixture").setCreativeTab(CreativeTab.TNFC_TAB);
		BottleAcaciaMix = new ModItemBottle().setUnlocalizedName("Acacia Mixture").setCreativeTab(CreativeTab.TNFC_TAB);
		BottleDarkOakMix = new ModItemBottle().setUnlocalizedName("Dark Oak Mixture").setCreativeTab(CreativeTab.TNFC_TAB);
		BottleRegenPot = new ModItemBottle().setUnlocalizedName("Regeneration Potion").setCreativeTab(CreativeTab.TNFC_TAB);
		BottleSwiftPot = new ModItemBottle().setUnlocalizedName("Speed Potion").setCreativeTab(CreativeTab.TNFC_TAB);
		BottleFireResPot = new ModItemBottle().setUnlocalizedName("Fire Resistance Potion").setCreativeTab(CreativeTab.TNFC_TAB);
		BottlePoisonPot = new ModItemBottle().setUnlocalizedName("Poison Potion").setCreativeTab(CreativeTab.TNFC_TAB);
		BottleHealthPot = new ModItemBottle().setUnlocalizedName("Health Potion").setCreativeTab(CreativeTab.TNFC_TAB);
		BottleNightVisionPot = new ModItemBottle().setUnlocalizedName("Night Vision Potion").setCreativeTab(CreativeTab.TNFC_TAB);
		BottleWeaknessPot = new ModItemBottle().setUnlocalizedName("Weakness Potion").setCreativeTab(CreativeTab.TNFC_TAB);
		BottleStrPot = new ModItemBottle().setUnlocalizedName("Strength Potion").setCreativeTab(CreativeTab.TNFC_TAB);
		BottleSlowPot = new ModItemBottle().setUnlocalizedName("Slowness Potion").setCreativeTab(CreativeTab.TNFC_TAB);
		BottleHarmPot = new ModItemBottle().setUnlocalizedName("Potion of Harming").setCreativeTab(CreativeTab.TNFC_TAB);
		BottleWaterBreathingPot = new ModItemBottle().setUnlocalizedName("Water Breathing Potion").setCreativeTab(CreativeTab.TNFC_TAB);
		BottleInvisibilityPot = new ModItemBottle().setUnlocalizedName("Potion of Invisibility").setCreativeTab(CreativeTab.TNFC_TAB);
		BottleEnergizingFluid = new ModItemBottle().setUnlocalizedName("Energizing Fluid").setCreativeTab(CreativeTab.TNFC_TAB);
		BottleExtendingFluid = new ModItemBottle().setUnlocalizedName("ExtendingFluid").setCreativeTab(CreativeTab.TNFC_TAB);
		record_TfcMusic = new TFCRecord("record_TfcMusic").setUnlocalizedName("record_TfcMusic").setTextureName(ModDetails.ModID + ":" + "record_TfcMusic");
		record_CigBeer = new TFCRecord("record_CigBeer").setUnlocalizedName("record_CigBeer").setTextureName(ModDetails.ModID + ":" + "record_CigBeer");
		mulch = new ItemBase().setMetaNames(ModReferences.MULCH).setUnlocalizedName("mulch");
		mold = new ItemBase().setMetaNames(ModReferences.MOLD).setUnlocalizedName("mold");
		amalgam = new ItemBase().setMetaNames(ModReferences.AMALGAM).setUnlocalizedName("amalgam");
		diamonddust = new ItemBase().setUnlocalizedName("tinyDiamondDust");
		registerItems();
		
		System.out.println("[" + ModDetails.ModName + "] Done Registering Items");
	}
	
	private static void registerItems()
	{

		GameRegistry.registerItem(BottleOakMix, BottleOakMix.getUnlocalizedName());
		GameRegistry.registerItem(BottleBirchMix, BottleBirchMix.getUnlocalizedName());
		GameRegistry.registerItem(BottleSpruceMix, BottleSpruceMix.getUnlocalizedName());
		GameRegistry.registerItem(BottleJungleMix, BottleJungleMix.getUnlocalizedName());
		GameRegistry.registerItem(BottleAcaciaMix, BottleAcaciaMix.getUnlocalizedName());
		GameRegistry.registerItem(BottleDarkOakMix, BottleDarkOakMix.getUnlocalizedName());
		GameRegistry.registerItem(BottleRegenPot, BottleRegenPot.getUnlocalizedName());
		GameRegistry.registerItem(BottleSwiftPot, BottleSwiftPot.getUnlocalizedName());
		GameRegistry.registerItem(BottleFireResPot, BottleFireResPot.getUnlocalizedName());
		GameRegistry.registerItem(BottlePoisonPot, BottlePoisonPot.getUnlocalizedName());
		GameRegistry.registerItem(BottleHealthPot, BottleHealthPot.getUnlocalizedName());
		GameRegistry.registerItem(BottleNightVisionPot, BottleNightVisionPot.getUnlocalizedName());
		GameRegistry.registerItem(BottleWeaknessPot, BottleWeaknessPot.getUnlocalizedName());
		GameRegistry.registerItem(BottleStrPot, BottleStrPot.getUnlocalizedName());
		GameRegistry.registerItem(BottleSlowPot, BottleSlowPot.getUnlocalizedName());
		GameRegistry.registerItem(BottleHarmPot, BottleHarmPot.getUnlocalizedName());
		GameRegistry.registerItem(BottleWaterBreathingPot, BottleWaterBreathingPot.getUnlocalizedName());
		GameRegistry.registerItem(BottleInvisibilityPot, BottleInvisibilityPot.getUnlocalizedName());
		GameRegistry.registerItem(BottleEnergizingFluid, BottleEnergizingFluid.getUnlocalizedName());
		GameRegistry.registerItem(BottleExtendingFluid, BottleExtendingFluid.getUnlocalizedName());
		GameRegistry.registerItem(record_TfcMusic, record_TfcMusic.getUnlocalizedName());
		GameRegistry.registerItem(record_CigBeer, record_CigBeer.getUnlocalizedName());
		GameRegistry.registerItem(mulch, mulch.getUnlocalizedName());
		GameRegistry.registerItem(mold, mold.getUnlocalizedName());
		GameRegistry.registerItem(amalgam, amalgam.getUnlocalizedName());
		GameRegistry.registerItem(diamonddust, diamonddust.getUnlocalizedName());

	}
}
