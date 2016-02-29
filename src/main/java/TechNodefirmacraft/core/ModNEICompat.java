package TechNodefirmacraft.core;

import codechicken.nei.api.API;
import com.bioxx.tfc.api.TFCBlocks;
import com.google.common.collect.ImmutableList;
import cpw.mods.fml.common.Loader;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

public class ModNEICompat {

    public static void hideNEIItems() {
        if (ModOptions.enableNEIHiding) {
            //Streams
            ImmutableList<String> hideStreams = ImmutableList.of(
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

            if (Loader.isModLoaded(Streams)) {
                for (String streamFluid : hideStreams) {
                    ItemStack streamBlocks = GameRegistry.findItemStack(Streams, streamFluid, 1);
                    if (streamBlocks != null) {
                        API.hideItem(streamBlocks);
                    }
                }
            }
            // Plant Mega Pack
            ImmutableList<String> hidePMPcrop = ImmutableList.of(
                    "Beet",
                    "BellPepperOrange",
                    "BellPepperRed",
                    "BellPepperYellow",
                    "Broccoli",
                    "Cassava",
                    "Celery",
                    "Corn",
                    "Cucumber",
                    "Eggplant",
                    "GreenBean",
                    "Leek",
                    "Lettuce",
                    "Onion",
                    "Sorrel",
                    "Spinach",
                    "Tomato"
            );
            ImmutableList<String> hidePMPberries = ImmutableList.of(
                    "Beauty",
                    "Black",
                    "Blue",
                    "Elder",
                    "Goose",
                    "Huckle",
                    "Orange",
                    "Snow",
                    "Straw",
                    "HarlequinMistletoe"
            );

            ImmutableList<String> hidePMPFood = ImmutableList.of(
                    "foodGreenBeans",
                    "foodCassavaRoot",
                    "foodCentellaLeaves",
                    "foodLaksaLeaves",
                    "foodMozukuSeaweed",
                    "foodPeanuts",
                    "foodPricklyPearFruit",
                    "foodQuinoaSeeds",
                    "foodRice",
                    "foodSacredLotusRoot",
                    "foodTaroRoot",
                    "foodWasabiStem",
                    "foodWaterChestnut",
                    "foodWatercress",
                    "foodWildRice",
                    "foodCookedRice",
                    "foodCornFlour",
                    "foodCornBread",
                    "foodBeetSoup",
                    "foodBerrybowl",
                    "foodBroccoliSoup",
                    "foodElderberrySorbet",
                    "foodMozukuSoup",
                    "foodSnowberryCustard",
                    "foodQuinoaCereal",
                    "foodTomatoSoup",
                    "foodBeautyberryTurnover",
                    "foodBlackberryDanish",
                    "foodBlueberryMuffin",
                    "foodGooseberryCobbler",
                    "foodHuckleberryTart",
                    "foodOrangeberrySquare",
                    "foodCookiePeanutButter",
                    "foodStrawberryDelight",
                    "foodJelly",
                    "foodPeanutButter",
                    "foodStuffedPepperOrange",
                    "foodStuffedPepperRed",
                    "foodStuffedPepperYellow",
                    "foodSandwichPBJ",
                    "foodSandwichBeef",
                    "foodSandwichChicken",
                    "foodSandwichFish",
                    "foodSandwichMutton",
                    "foodSandwichPork",
                    "foodBeautyberryBlazer",
                    "foodBlackberryTumbler",
                    "foodBlueberrySlushie",
                    "foodElderberrySpritzer",
                    "foodGooseberryShake",
                    "foodHarlequinFizz",
                    "foodHuckleberryBubbler",
                    "foodOrangeberryWhip",
                    "foodPricklyPearTwister",
                    "foodSnowberryCooler",
                    "foodStrawberrySmoothie",
                    "foodWasabiQuencher",
                    "wrapCorn",
                    "wrapSeaweed",
                    "wrapCornBeef",
                    "wrapCornChicken",
                    "wrapCornFish",
                    "wrapCornPork",
                    "wrapCornRice",
                    "wrapBeef",
                    "wrapChicken",
                    "wrapFish",
                    "wrapPork",
                    "wrapRice",
                    "foodStirFry",
                    "powderAloe",
                    "powderBerry",
                    "powderCactus",
                    "powderCoral",
                    "powderFern",
                    "powderLeaf",
                    "powderMoss",
                    "powderMushroom",
                    "powderMushroomPoison",
                    "powderConditioner",
                    "powderDefoliant",
                    "powderFertilizer"
            );

            if (Loader.isModLoaded(PMP)) {
                for (String PMPcrops : hidePMPcrop) {
                    ItemStack cropPMP = GameRegistry.findItemStack(PMP, "crop" + PMPcrops, 1);
                    ItemStack seedPMP = GameRegistry.findItemStack(PMP, "seed" + PMPcrops, 1);
                    ItemStack foodPMP = GameRegistry.findItemStack(PMP, "food" + PMPcrops, 1);
                    if (cropPMP != null) {
                        API.hideItem(cropPMP);
                    }
                    if (seedPMP != null) {
                        API.hideItem(seedPMP);
                    }
                    if (foodPMP != null) {
                        API.hideItem(foodPMP);
                    }
                }
                for (String PMPberries : hidePMPberries) {
                    ItemStack berriesPMP = GameRegistry.findItemStack(PMP, "berries" + PMPberries, 1);
                    ItemStack berryBushPMP = GameRegistry.findItemStack(PMP, "berrybush" + PMPberries, 1);
                    if (berriesPMP != null) {
                        API.hideItem(berriesPMP);
                    }
                    if (berryBushPMP != null) {
                        API.hideItem(berryBushPMP);
                    }
                }
                for (String PMPFood : hidePMPFood) {
                    ItemStack PMPFoods = GameRegistry.findItemStack(PMP, PMPFood, 1);
                    if (PMPFoods != null) {
                        API.hideItem(PMPFoods);
                    }
                }
            }
            // Aroma1997Core
            ImmutableList<String> hideAroma = ImmutableList.of(
                    "wrench",
                    "wrenched"
            );
            if (Loader.isModLoaded(Aroma1997Core)) {
                for (String AromaItems : hideAroma) {
                    ItemStack aromaCore = GameRegistry.findItemStack(Aroma1997Core, AromaItems, 1);
                    if (aromaCore != null) {
                        API.hideItem(aromaCore);
                    }
                }
            }
            // Mekanism
            ImmutableList<String> hideMek = ImmutableList.of(
                    "Sawdust",
                    "SaltBlock"
            );
            if (Loader.isModLoaded(Mek)) {
                Item basicBlock = GameRegistry.findItem(Mek, "BasicBlock");
                if (basicBlock != null) {
                    API.hideItem(new ItemStack(basicBlock, 1, 0));
                    API.hideItem(new ItemStack(basicBlock, 1, 1));
                    API.hideItem(new ItemStack(basicBlock, 1, 3));
                    API.hideItem(new ItemStack(basicBlock, 1, 5));
                    API.hideItem(new ItemStack(basicBlock, 1, 12));
                    API.hideItem(new ItemStack(basicBlock, 1, 13));
                }
                Item ingotMek = GameRegistry.findItem(Mek, "Ingot");
                if (ingotMek != null) {
                    API.hideItem(new ItemStack(ingotMek, 1, 2));
                    API.hideItem(new ItemStack(ingotMek, 1, 4));
                    API.hideItem(new ItemStack(ingotMek, 1, 5));
                    API.hideItem(new ItemStack(ingotMek, 1, 6));
                }
                Item sulfurMek = GameRegistry.findItem(Mek, "OtherDust");
                if (sulfurMek != null) {
                    API.hideItem(new ItemStack(sulfurMek, 1, 3));
                }
                Item balloonMek = GameRegistry.findItem(Mek, "Balloon");
                if (balloonMek != null) {
                    API.hideItem(new ItemStack(balloonMek, 1, OreDictionary.WILDCARD_VALUE));
                }
                for (String MekItems : hideMek) {
                    ItemStack mekItems = GameRegistry.findItemStack(Mek, MekItems, 1);
                    if (mekItems != null) {
                        API.hideItem(mekItems);
                    }
                }
                Item oreMek = GameRegistry.findItem(Mek, "OreBlock");
                if (oreMek != null) {
                    API.hideItem(new ItemStack(oreMek, 1, 0));
                    API.hideItem(new ItemStack(oreMek, 1, 1));
                    API.hideItem(new ItemStack(oreMek, 1, 2));
                }
            }
            //Immersive Engineering
            if (Loader.isModLoaded(IE)) {
                Item oreIE = GameRegistry.findItem(IE, "ore");
                if (oreIE != null) {
                    API.hideItem(new ItemStack(oreIE, 1, OreDictionary.WILDCARD_VALUE));
                }
                Item storageIE = GameRegistry.findItem(IE, "storage");
                if (storageIE != null) {
                    API.hideItem(new ItemStack(storageIE, 1, 0));
                    API.hideItem(new ItemStack(storageIE, 1, 1));
                    API.hideItem(new ItemStack(storageIE, 1, 2));
                    API.hideItem(new ItemStack(storageIE, 1, 3));
                    API.hideItem(new ItemStack(storageIE, 1, 4));
                    API.hideItem(new ItemStack(storageIE, 1, 5));
                    API.hideItem(new ItemStack(storageIE, 1, 6));
                    API.hideItem(new ItemStack(storageIE, 1, 7));
                }
                Item storageSlabIE = GameRegistry.findItem(IE, "storageSlab");
                if (storageSlabIE != null) {
                    API.hideItem(new ItemStack(storageSlabIE, 1, 0));
                    API.hideItem(new ItemStack(storageSlabIE, 1, 1));
                    API.hideItem(new ItemStack(storageSlabIE, 1, 2));
                    API.hideItem(new ItemStack(storageSlabIE, 1, 3));
                    API.hideItem(new ItemStack(storageSlabIE, 1, 4));
                    API.hideItem(new ItemStack(storageSlabIE, 1, 5));
                    API.hideItem(new ItemStack(storageSlabIE, 1, 6));
                }
                Item metalIE = GameRegistry.findItem(IE, "metal");
                if (metalIE != null) {
                    API.hideItem(new ItemStack(metalIE, 1, 0));
                    API.hideItem(new ItemStack(metalIE, 1, 2));
                    API.hideItem(new ItemStack(metalIE, 1, 3));
                    API.hideItem(new ItemStack(metalIE, 1, 4));
                    API.hideItem(new ItemStack(metalIE, 1, 5));
                    API.hideItem(new ItemStack(metalIE, 1, 6));
                    API.hideItem(new ItemStack(metalIE, 1, 7));
                    API.hideItem(new ItemStack(metalIE, 1, 8));
                    API.hideItem(new ItemStack(metalIE, 1, 9));
                    API.hideItem(new ItemStack(metalIE, 1, 10));
                    API.hideItem(new ItemStack(metalIE, 1, 12));
                    API.hideItem(new ItemStack(metalIE, 1, 13));
                    API.hideItem(new ItemStack(metalIE, 1, 14));
                    API.hideItem(new ItemStack(metalIE, 1, 21));
                    API.hideItem(new ItemStack(metalIE, 1, 22));
                    API.hideItem(new ItemStack(metalIE, 1, 23));
                    API.hideItem(new ItemStack(metalIE, 1, 24));
                    API.hideItem(new ItemStack(metalIE, 1, 25));
                    API.hideItem(new ItemStack(metalIE, 1, 26));
                    API.hideItem(new ItemStack(metalIE, 1, 27));
                    API.hideItem(new ItemStack(metalIE, 1, 28));
                    API.hideItem(new ItemStack(metalIE, 1, 30));
                    API.hideItem(new ItemStack(metalIE, 1, 33));
                    API.hideItem(new ItemStack(metalIE, 1, 36));
                    API.hideItem(new ItemStack(metalIE, 1, 38));
                }
            }
            //Forestry
            ImmutableList<String> hideForestry = ImmutableList.of(
                    "saplingGE",
                    "pods",
                    "apatite",
                    "carton",
                    "brokenBronzePickaxe",
                    "brokenBronzeShovel",
                    "bronzePickaxe",
                    "bronzeShovel",
                    "kitShovel",
                    "kitPickaxe",
                    "ingotCopper",
                    "ingotTin",
                    "ingotBronze"
            );
            if (Loader.isModLoaded(Forestry)) {
                for (String forestryStuff : hideForestry) {
                    ItemStack forestryItems = GameRegistry.findItemStack(Forestry, forestryStuff, 1);
                    if (forestryItems != null) {
                        API.hideItem(forestryItems);
                    }
                }
                Item slabsDoubleForestry = GameRegistry.findItem(Forestry, "slabsDouble");
                if (slabsDoubleForestry != null) {
                    API.hideItem(new ItemStack(slabsDoubleForestry, 1, OreDictionary.WILDCARD_VALUE));
                }
                Item slabsDoubleFireproofForestry = GameRegistry.findItem(Forestry, "slabsDoubleFireproof");
                if (slabsDoubleFireproofForestry != null) {
                    API.hideItem(new ItemStack(slabsDoubleFireproofForestry, 1, OreDictionary.WILDCARD_VALUE));
                }
                Item soilForestry = GameRegistry.findItem(Forestry, "soil");
                if (soilForestry != null) {
                    API.hideItem(new ItemStack(soilForestry, 1, OreDictionary.WILDCARD_VALUE));
                }
                Item oreForestry = GameRegistry.findItem(Forestry, "resources");
                if (oreForestry != null) {
                    API.hideItem(new ItemStack(oreForestry, 1, OreDictionary.WILDCARD_VALUE));
                }
                Item storageForestry = GameRegistry.findItem(Forestry, "resourceStorage");
                if (storageForestry != null) {
                    API.hideItem(new ItemStack(storageForestry, 1, OreDictionary.WILDCARD_VALUE));
                }
                Item fungiForestry = GameRegistry.findItem(Forestry, "mushroom");
                if (fungiForestry != null) {
                    API.hideItem(new ItemStack(fungiForestry, 1, OreDictionary.WILDCARD_VALUE));
                }
            }
            //PneumaticCraft
            if (Loader.isModLoaded(PnC)) {
                Item seedsPnC = GameRegistry.findItem(PnC, "plasticPlant");
                if (seedsPnC != null) {
                    API.hideItem(new ItemStack(seedsPnC, 1, OreDictionary.WILDCARD_VALUE));
                }
            }
            //Railcraft
            if (Loader.isModLoaded(RC)) {
                Item cubeRC = GameRegistry.findItem(RC, "cube");
                if (cubeRC != null) {
                    API.hideItem(new ItemStack(cubeRC, 1, 2));
                    API.hideItem(new ItemStack(cubeRC, 1, 9));
                }
                Item plateRC = GameRegistry.findItem(RC, "part.plate");
                if (plateRC != null) {
                    API.hideItem(new ItemStack(plateRC, 1, OreDictionary.WILDCARD_VALUE));
                }
                Item dustRC = GameRegistry.findItem(RC, "dust");
                if (dustRC != null) {
                    API.hideItem(new ItemStack(dustRC, 1, 1));
                    API.hideItem(new ItemStack(dustRC, 1, 2));
                }
            }
            //OpenBlocks
            if (Loader.isModLoaded(OB)) {
                Item pointerOB = GameRegistry.findItem(OB, "genericUnstackable");
                if (pointerOB != null) {
                    API.hideItem(new ItemStack(pointerOB, 1, OreDictionary.WILDCARD_VALUE));
                }
                Item genericOB = GameRegistry.findItem(RC, "generic");
                if (genericOB != null) {
                    API.hideItem(new ItemStack(genericOB, 1, 1));
                    API.hideItem(new ItemStack(genericOB, 1, 2));
                    API.hideItem(new ItemStack(genericOB, 1, 3));
                    API.hideItem(new ItemStack(genericOB, 1, 5));
                    API.hideItem(new ItemStack(genericOB, 1, 6));
                    API.hideItem(new ItemStack(genericOB, 1, 7));
                    API.hideItem(new ItemStack(genericOB, 1, 9));
                    API.hideItem(new ItemStack(genericOB, 1, 10));
                    API.hideItem(new ItemStack(genericOB, 1, 11));

                }
            }
            //Tubestuff
            if (Loader.isModLoaded(TS)) {
                Item machineTS = GameRegistry.findItem(TS, "machine");
                if (machineTS != null) {
                    API.hideItem(new ItemStack(machineTS, 1, 0));
                    API.hideItem(new ItemStack(machineTS, 1, 1));
                    API.hideItem(new ItemStack(machineTS, 1, 2));
                    API.hideItem(new ItemStack(machineTS, 1, 4));
                    API.hideItem(new ItemStack(machineTS, 1, 6));
                    API.hideItem(new ItemStack(machineTS, 1, 8));
                }
                Item uselessTS = GameRegistry.findItem(TS, "uselessItem");
                if (uselessTS != null) {
                    API.hideItem(new ItemStack(uselessTS, 1, OreDictionary.WILDCARD_VALUE));
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
            API.hideItem(new ItemStack(Blocks.web));
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
            API.hideItem(new ItemStack(Blocks.enchanting_table));
            API.hideItem(new ItemStack(Blocks.beacon));
            API.hideItem(new ItemStack(Blocks.command_block));

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
            API.hideItem(new ItemStack(Items.name_tag));
            API.hideItem(new ItemStack(Items.gold_nugget));
            API.hideItem(new ItemStack(Items.enchanted_book));
            API.hideItem(new ItemStack(Items.wooden_door));
            API.hideItem(new ItemStack(Items.command_block_minecart));

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
    }
    public static final String Streams = "streams";
    public static final String PMP = "plantmegapack";
    public static final String Aroma1997Core = "Aroma1997Core";
    public static final String Mek = "Mekanism";
    public static final String IE = "ImmersiveEngineering";
    public static final String Forestry = "Forestry";
    public static final String PnC = "PneumaticCraft";
    public static final String RC = "Railcraft";
    public static final String OB = "OpenBlocks";
    public static final String TS = "Tubestuff";
    public static final String W2 = "weather2";
}
