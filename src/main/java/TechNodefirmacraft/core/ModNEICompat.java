package TechNodefirmacraft.core;

import codechicken.nei.api.API;
import com.bioxx.tfc.api.TFCBlocks;
import com.google.common.collect.ImmutableList;
import cpw.mods.fml.common.Loader;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

public class ModNEICompat {

    public static void hideNEIItems()
    {
        ImmutableList<String> ItemsTFC = ImmutableList.of(
            "BiblioBismuthBronzeLamp",
            "BiblioBismuthBronzeLantern",
            "BiblioBlackBronzeLamp",
            "BiblioBlackBronzeLantern",
            "BiblioBlackSteelLamp",
            "BiblioBlackSteelLantern",
            "BiblioBlueSteelLamp",
            "BiblioBlueSteelLantern",
            "BiblioBrassLamp",
            "BiblioBrassLantern",
            "BiblioBronzeLamp",
            "BiblioBronzeLantern",
            "BiblioRedSteelLamp",
            "BiblioRedSteelLantern",
            "BiblioWoodBookcase",
            "BiblioWoodshelf",
            "BiblioWoodtable",
            "seatBack1",
            "seatBack2",
            "seatBack3",
            "seatBack4",
            "seatBack5",
            "BiblioWoodcase",
            "BiblioWooddesk",
            "BiblioWoodlabel",
            "BiblioWoodMapFrame",
            "BiblioWoodFancySign",
            "BiblioWoodPaneler",
            "BiblioWoodFancyWorkbench",
            "BiblioWoodPaintingT0",
            "BiblioWoodPaintingT1",
            "BiblioWoodPaintingT2",
            "BiblioWoodPaintingT3",
            "BiblioWoodPaintingT4",
            "BiblioWoodClock",
            "BiblioWoodSeat",
            "BiblioWoodpotshelf"
        );

        ImmutableList<String> streams = ImmutableList.of(
                "river/tile.FreshWaterStationary/-2/-2",
                "river/tile.FreshWaterStationary/-2/-1",
                "river/tile.FreshWaterStationary/-2/0",
                "river/tile.FreshWaterStationary/-2/1",
                "river/tile.FreshWaterStationary/-2/2",
                "river/tile.FreshWaterStationary/-1/-2",
                "river/tile.FreshWaterStationary/-1/2",
                "river/tile.FreshWaterStationary/0/-2",
                "river/tile.FreshWaterStationary/0/0",
                "river/tile.FreshWaterStationary/0/2",
                "river/tile.FreshWaterStationary/1/-2",
                "river/tile.FreshWaterStationary/1/2",
                "river/tile.FreshWaterStationary/2/-2",
                "river/tile.FreshWaterStationary/2/-1",
                "river/tile.FreshWaterStationary/2/0",
                "river/tile.FreshWaterStationary/2/1",
                "river/tile.FreshWaterStationary/2/2",
                "river/tile.LavaStationary/-2/-2",
                "river/tile.LavaStationary/-2/-1",
                "river/tile.LavaStationary/-2/0",
                "river/tile.LavaStationary/-2/1",
                "river/tile.LavaStationary/-2/2",
                "river/tile.LavaStationary/-1/-2",
                "river/tile.LavaStationary/-1/2",
                "river/tile.LavaStationary/0/-2",
                "river/tile.LavaStationary/0/0",
                "river/tile.LavaStationary/0/2",
                "river/tile.LavaStationary/1/-2",
                "river/tile.LavaStationary/1/2",
                "river/tile.LavaStationary/2/-2",
                "river/tile.LavaStationary/2/-1",
                "river/tile.LavaStationary/2/0",
                "river/tile.LavaStationary/2/1",
                "river/tile.LavaStationary/2/2",
                "river/ice/-2/-2",
                "river/ice/-2/-1",
                "river/ice/-2/0",
                "river/ice/-2/1",
                "river/ice/-2/2",
                "river/ice/-1/-2",
                "river/ice/-1/2",
                "river/ice/0/-2",
                "river/ice/0/0",
                "river/ice/0/2",
                "river/ice/1/-2",
                "river/ice/1/2",
                "river/ice/2/-2",
                "river/ice/2/-1",
                "river/ice/2/0",
                "river/ice/2/1",
                "river/ice/2/2"
        );


        if (Loader.isModLoaded("streams")) {
            for (String streamFluid : streams) {
                ItemStack streamBlocks = GameRegistry.findItemStack(Streams, streamFluid, 1);
                if (streamBlocks != null) {
                    API.hideItem(streamBlocks);
                }

            }
        }
//Minecraft Items/blocks
        API.hideItem(new ItemStack(Items.chainmail_boots));
        API.hideItem(new ItemStack(Items.chainmail_chestplate));
        API.hideItem(new ItemStack(Items.chainmail_helmet));
        API.hideItem(new ItemStack(Items.chainmail_leggings));
        API.hideItem(new ItemStack(Items.diamond));
        API.hideItem(new ItemStack(Items.diamond_horse_armor));
        API.hideItem(new ItemStack(Items.diamond_boots));
        API.hideItem(new ItemStack(Items.diamond_chestplate));
        API.hideItem(new ItemStack(Items.diamond_helmet));
        API.hideItem(new ItemStack(Items.diamond_hoe));
        API.hideItem(new ItemStack(Items.diamond_leggings));
        API.hideItem(new ItemStack(Blocks.diamond_ore));
        API.hideItem(new ItemStack(Items.diamond_pickaxe));
        API.hideItem(new ItemStack(Items.diamond_shovel));
        API.hideItem(new ItemStack(Items.diamond_sword));
        API.hideItem(new ItemStack(Items.diamond_axe));
        API.hideItem(new ItemStack(Blocks.dirt, 1, OreDictionary.WILDCARD_VALUE));
        API.hideItem(new ItemStack(Items.emerald));
        API.hideItem(new ItemStack(Blocks.emerald_ore));
        API.hideItem(new ItemStack(Blocks.farmland));
        API.hideItem(new ItemStack(Blocks.fence));
        API.hideItem(new ItemStack(Blocks.fence_gate));
        API.hideItem(new ItemStack(Items.fishing_rod));
        API.hideItem(new ItemStack(Blocks.flowing_lava));
        API.hideItem(new ItemStack(Blocks.flowing_water));
        API.hideItem(new ItemStack(Blocks.water));
        API.hideItem(new ItemStack(Items.golden_axe));
        API.hideItem(new ItemStack(Items.golden_hoe));
        API.hideItem(new ItemStack(Items.golden_boots));
        API.hideItem(new ItemStack(Items.golden_chestplate));
        API.hideItem(new ItemStack(Items.golden_helmet));
        API.hideItem(new ItemStack(Items.gold_ingot));
        API.hideItem(new ItemStack(Items.golden_leggings));
        API.hideItem(new ItemStack(Blocks.gold_ore));
        API.hideItem(new ItemStack(Items.golden_pickaxe));
        API.hideItem(new ItemStack(Items.golden_shovel));
        API.hideItem(new ItemStack(Items.golden_sword));
        API.hideItem(new ItemStack(Blocks.grass));
        API.hideItem(new ItemStack(Blocks.gravel));
        API.hideItem(new ItemStack(Items.iron_axe));
        API.hideItem(new ItemStack(Items.iron_boots));
        API.hideItem(new ItemStack(Items.iron_chestplate));
        API.hideItem(new ItemStack(Items.iron_helmet));
        API.hideItem(new ItemStack(Items.iron_hoe));
        API.hideItem(new ItemStack(Items.iron_ingot));
        API.hideItem(new ItemStack(Items.iron_leggings));
        API.hideItem(new ItemStack(Blocks.iron_ore));
        API.hideItem(new ItemStack(Items.iron_pickaxe));
        API.hideItem(new ItemStack(Items.iron_shovel));
        API.hideItem(new ItemStack(Items.iron_sword));
        API.hideItem(new ItemStack(Blocks.lapis_ore));
        API.hideItem(new ItemStack(Blocks.lava));
        API.hideItem(new ItemStack(Items.leather));
        API.hideItem(new ItemStack(Items.leather_boots));
        API.hideItem(new ItemStack(Items.leather_chestplate));
        API.hideItem(new ItemStack(Items.leather_helmet));
        API.hideItem(new ItemStack(Items.leather_leggings));
        API.hideItem(new ItemStack(Items.wooden_axe));
        API.hideItem(new ItemStack(Items.wooden_hoe));
        API.hideItem(new ItemStack(Items.wooden_pickaxe));
        API.hideItem(new ItemStack(Items.wooden_shovel));
        API.hideItem(new ItemStack(Items.wooden_sword));
        API.hideItem(new ItemStack(Items.wooden_pickaxe));
        API.hideItem(new ItemStack(Blocks.cobblestone));
        API.hideItem(new ItemStack(Blocks.stone));
        API.hideItem(new ItemStack(Blocks.sand, 1, OreDictionary.WILDCARD_VALUE));
        API.hideItem(new ItemStack(Blocks.coal_ore));
        API.hideItem(new ItemStack(Blocks.sponge));
        API.hideItem(new ItemStack(Blocks.sandstone, 1, OreDictionary.WILDCARD_VALUE));
        API.hideItem(new ItemStack(Blocks.sandstone_stairs));
        API.hideItem(new ItemStack(Blocks.stone_slab, 1, 1));
        API.hideItem(new ItemStack(Blocks.stone_slab, 1, 3));
        API.hideItem(new ItemStack(Blocks.stone_slab, 1, 4));
        API.hideItem(new ItemStack(Blocks.stone_slab, 1, 5));
        API.hideItem(new ItemStack(Blocks.tallgrass, 1, OreDictionary.WILDCARD_VALUE));
        API.hideItem(new ItemStack(Blocks.deadbush));
        API.hideItem(new ItemStack(Blocks.yellow_flower));
        API.hideItem(new ItemStack(Blocks.red_flower, 1, OreDictionary.WILDCARD_VALUE));
        API.hideItem(new ItemStack(Blocks.brown_mushroom));
        API.hideItem(new ItemStack(Blocks.red_mushroom));
        API.hideItem(new ItemStack(Blocks.brown_mushroom_block));
        API.hideItem(new ItemStack(Blocks.red_mushroom_block));
        API.hideItem(new ItemStack(Blocks.gold_block));
        API.hideItem(new ItemStack(Blocks.iron_block));
        API.hideItem(new ItemStack(Blocks.brick_block));
        API.hideItem(new ItemStack(Blocks.tnt));
        API.hideItem(new ItemStack(Blocks.mossy_cobblestone));
        API.hideItem(new ItemStack(Blocks.torch));
        API.hideItem(new ItemStack(Blocks.fire));
        API.hideItem(new ItemStack(Blocks.mob_spawner, 1, OreDictionary.WILDCARD_VALUE));
        API.hideItem(new ItemStack(Blocks.chest));
        API.hideItem(new ItemStack(Blocks.trapped_chest));
        API.hideItem(new ItemStack(Blocks.ender_chest));
        API.hideItem(new ItemStack(Blocks.brick_stairs));
        API.hideItem(new ItemStack(Blocks.stone_brick_stairs));
        API.hideItem(new ItemStack(Blocks.stone_stairs));
        API.hideItem(new ItemStack(Blocks.redstone_ore));
        API.hideItem(new ItemStack(Blocks.ice));
        API.hideItem(new ItemStack(Blocks.packed_ice));
        API.hideItem(new ItemStack(Blocks.clay));
        API.hideItem(new ItemStack(Blocks.pumpkin));
        API.hideItem(new ItemStack(Blocks.lit_pumpkin));
        API.hideItem(new ItemStack(Blocks.portal));
        API.hideItem(new ItemStack(Blocks.monster_egg, 1, OreDictionary.WILDCARD_VALUE));
        API.hideItem(new ItemStack(Blocks.stonebrick, 1, OreDictionary.WILDCARD_VALUE));
        API.hideItem(new ItemStack(Blocks.melon_block));
        API.hideItem(new ItemStack(Blocks.vine));
        API.hideItem(new ItemStack(Blocks.mycelium));
        API.hideItem(new ItemStack(Blocks.waterlily));
        API.hideItem(new ItemStack(Blocks.end_portal));
        API.hideItem(new ItemStack(Blocks.end_portal_frame));
        API.hideItem(new ItemStack(Blocks.anvil, 1, OreDictionary.WILDCARD_VALUE));
        API.hideItem(new ItemStack(Blocks.hay_block));
        API.hideItem(new ItemStack(Blocks.double_plant, 1, OreDictionary.WILDCARD_VALUE));
        API.hideItem(new ItemStack(Blocks.leaves, 1, OreDictionary.WILDCARD_VALUE));
        API.hideItem(new ItemStack(Blocks.leaves2, 1, OreDictionary.WILDCARD_VALUE));
        API.hideItem(new ItemStack(Blocks.cobblestone_wall, 1, OreDictionary.WILDCARD_VALUE));

        API.hideItem(new ItemStack(Items.flint_and_steel));
        API.hideItem(new ItemStack(Items.apple));
        API.hideItem(new ItemStack(Items.bow));
        API.hideItem(new ItemStack(Items.arrow));
        API.hideItem(new ItemStack(Items.stone_axe));
        API.hideItem(new ItemStack(Items.stone_hoe));
        API.hideItem(new ItemStack(Items.stone_pickaxe));
        API.hideItem(new ItemStack(Items.stone_shovel));
        API.hideItem(new ItemStack(Items.stone_sword));
        API.hideItem(new ItemStack(Items.bowl));
        API.hideItem(new ItemStack(Items.mushroom_stew));
        API.hideItem(new ItemStack(Items.wheat_seeds));
        API.hideItem(new ItemStack(Items.pumpkin_seeds));
        API.hideItem(new ItemStack(Items.melon_seeds));
        API.hideItem(new ItemStack(Items.bread));
        API.hideItem(new ItemStack(Items.porkchop));
        API.hideItem(new ItemStack(Items.cooked_porkchop));
        API.hideItem(new ItemStack(Items.beef));
        API.hideItem(new ItemStack(Items.cooked_beef));
        API.hideItem(new ItemStack(Items.chicken));
        API.hideItem(new ItemStack(Items.cooked_chicken));
        API.hideItem(new ItemStack(Items.fish, 1, OreDictionary.WILDCARD_VALUE));
        API.hideItem(new ItemStack(Items.cooked_fished, 1, OreDictionary.WILDCARD_VALUE));
        API.hideItem(new ItemStack(Items.golden_apple, 1, OreDictionary.WILDCARD_VALUE));
        API.hideItem(new ItemStack(Items.brick));
        API.hideItem(new ItemStack(Items.clay_ball));
        API.hideItem(new ItemStack(Items.reeds));
        API.hideItem(new ItemStack(Items.egg));
        API.hideItem(new ItemStack(Items.cake));
        API.hideItem(new ItemStack(Items.cookie));
        API.hideItem(new ItemStack(Items.shears));
        API.hideItem(new ItemStack(Items.melon));
        API.hideItem(new ItemStack(Items.ghast_tear));
        API.hideItem(new ItemStack(Items.brewing_stand));
        API.hideItem(new ItemStack(Items.magma_cream));
        API.hideItem(new ItemStack(Items.speckled_melon));
        API.hideItem(new ItemStack(Items.carrot));
        API.hideItem(new ItemStack(Items.carrot_on_a_stick));
        API.hideItem(new ItemStack(Items.golden_carrot));
        API.hideItem(new ItemStack(Items.potato));
        API.hideItem(new ItemStack(Items.baked_potato));
        API.hideItem(new ItemStack(Items.poisonous_potato));
        API.hideItem(new ItemStack(Items.nether_star));
        API.hideItem(new ItemStack(Items.pumpkin_pie));
        API.hideItem(new ItemStack(Items.tnt_minecart));
        API.hideItem(new ItemStack(Items.iron_horse_armor));
        API.hideItem(new ItemStack(Items.golden_horse_armor));
        API.hideItem(new ItemStack(Items.lead));
        API.hideItem(new ItemStack(Items.name_tag));
        API.hideItem(new ItemStack(Items.gold_nugget));
        API.hideItem(new ItemStack(Items.enchanted_book));

        //TFC Items/Blocks
        API.hideItem(new ItemStack(TFCBlocks.freshWater));
        API.hideItem(new ItemStack(TFCBlocks.freshWaterStationary));
        API.hideItem(new ItemStack(TFCBlocks.saltWater));
        API.hideItem(new ItemStack(TFCBlocks.saltWaterStationary));
        API.hideItem(new ItemStack(TFCBlocks.hotWater));
        API.hideItem(new ItemStack(TFCBlocks.hotWaterStationary));
        API.hideItem(new ItemStack(TFCBlocks.lava));
        API.hideItem(new ItemStack(TFCBlocks.lavaStationary));
        API.hideItem(new ItemStack(TFCBlocks.freshWater));

    }
    public static final String BiblioTFC = "BiblioWoodsTFC";
    public static final String Streams = "streams";
}
