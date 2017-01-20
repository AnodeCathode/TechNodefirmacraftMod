package TechNodefirmacraft.core;

import java.io.File;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.server.MinecraftServer;
import net.minecraft.world.World;
import net.minecraftforge.fluids.FluidContainerRegistry;
import net.minecraftforge.fluids.FluidRegistry;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import TechNodefirmacraft.TileEntities.TETNFCBeacon;
import net.minecraftforge.fluids.FluidStack;


public class ModCommonProxy
{
	public String getCurrentLanguage()
	{
		return null;
	}

	public World getCurrentWorld()
	{
		return MinecraftServer.getServer().getEntityWorld();
	}

	public boolean getGraphicsLevel()
	{
		return false;
	}
	
	public File getMinecraftDirectory()
	{
		return FMLCommonHandler.instance().getMinecraftServerInstance().getFile("");
	}

	public void hideNEIItems()
	{
	}
	
	public boolean isRemote()
	{
		return false;
	}

	public void loadOptions()
	{
		//Load our settings from the Options file
		ModOptions.loadSettings();
	}
	
	public void onClientLogin()
	{
	}


	public void registerGuiHandler()
	{
		NetworkRegistry.INSTANCE.registerGuiHandler(TechNodefirmacraft.TechNodefirmacraft.instance, new TechNodefirmacraft.handlers.GuiHandler());
	}

	public void registerHandlers()
	{
	}

	public void registerKeys()
	{
	}

	public void registerKeyBindingHandler()
	{
	}

	public void registerRenderInformation()
	{
		// NOOP on server
	}

	public void registerSoundHandler()
	{
	}

	public void registerTickHandler()
	{
		//FMLCommonHandler.instance().bus().register(new STickHandler());
	}
	
	public void registerTileEntities(boolean flag)
	{
		// non TESR registers
		
		if (flag)
		{
			// TESR registers
			GameRegistry.registerTileEntity(TETNFCBeacon.class, "TETFCBeacon");
		}
	}

	public void registerToolClasses()
	{
	}

	public void registerWailaClasses()
	{
	}

	public void uploadKeyBindingsToGame()
	{
	}

	public void registerMenuItems() {

		
	}

	public void registerFluids()
	{
		FluidRegistry.registerFluid(ModFluids.OAKMIX);
		FluidRegistry.registerFluid(ModFluids.BIRCHMIX);
		FluidRegistry.registerFluid(ModFluids.SPRUCEMIX);
		FluidRegistry.registerFluid(ModFluids.JUNGLEMIX);
		FluidRegistry.registerFluid(ModFluids.ACACIAMIX);
		FluidRegistry.registerFluid(ModFluids.DARKOAKMIX);

		FluidRegistry.registerFluid(ModFluids.REGENPOT);
		FluidRegistry.registerFluid(ModFluids.SWIFTPOT);
		FluidRegistry.registerFluid(ModFluids.FIRERESPOT);
		FluidRegistry.registerFluid(ModFluids.POISONPOT);
		FluidRegistry.registerFluid(ModFluids.HEALTHPOT);
		FluidRegistry.registerFluid(ModFluids.NIGHTVISIONPOT);
		FluidRegistry.registerFluid(ModFluids.WEAKNESSPOT);
		FluidRegistry.registerFluid(ModFluids.STRPOT);
		FluidRegistry.registerFluid(ModFluids.SLOWPOT);
		FluidRegistry.registerFluid(ModFluids.HARMPOT);
		FluidRegistry.registerFluid(ModFluids.WATERBREATHINGPOT);
		FluidRegistry.registerFluid(ModFluids.INVISIBILITYPOT);


	}
	public void setupFluids()
	{
		FluidContainerRegistry.registerFluidContainer(new FluidStack(ModFluids.OAKMIX, 250), new ItemStack(ModItems.BottleOakMix), new ItemStack(Items.glass_bottle));
		FluidContainerRegistry.registerFluidContainer(new FluidStack(ModFluids.BIRCHMIX, 250), new ItemStack(ModItems.BottleBirchMix), new ItemStack(Items.glass_bottle));
		FluidContainerRegistry.registerFluidContainer(new FluidStack(ModFluids.SPRUCEMIX, 250), new ItemStack(ModItems.BottleSpruceMix), new ItemStack(Items.glass_bottle));
		FluidContainerRegistry.registerFluidContainer(new FluidStack(ModFluids.JUNGLEMIX, 250), new ItemStack(ModItems.BottleJungleMix), new ItemStack(Items.glass_bottle));
		FluidContainerRegistry.registerFluidContainer(new FluidStack(ModFluids.ACACIAMIX, 250), new ItemStack(ModItems.BottleAcaciaMix), new ItemStack(Items.glass_bottle));
		FluidContainerRegistry.registerFluidContainer(new FluidStack(ModFluids.DARKOAKMIX, 250), new ItemStack(ModItems.BottleDarkOakMix), new ItemStack(Items.glass_bottle));


		FluidContainerRegistry.registerFluidContainer(new FluidStack(ModFluids.REGENPOT, 250), new ItemStack(ModItems.BottleRegenPot), new ItemStack(Items.glass_bottle));
		FluidContainerRegistry.registerFluidContainer(new FluidStack(ModFluids.SWIFTPOT, 250), new ItemStack(ModItems.BottleSwiftPot), new ItemStack(Items.glass_bottle));
		FluidContainerRegistry.registerFluidContainer(new FluidStack(ModFluids.FIRERESPOT, 250), new ItemStack(ModItems.BottleFireResPot), new ItemStack(Items.glass_bottle));
		FluidContainerRegistry.registerFluidContainer(new FluidStack(ModFluids.POISONPOT, 250), new ItemStack(ModItems.BottlePoisonPot), new ItemStack(Items.glass_bottle));
		FluidContainerRegistry.registerFluidContainer(new FluidStack(ModFluids.HEALTHPOT, 250), new ItemStack(ModItems.BottleHealthPot), new ItemStack(Items.glass_bottle));
		FluidContainerRegistry.registerFluidContainer(new FluidStack(ModFluids.NIGHTVISIONPOT, 250), new ItemStack(ModItems.BottleNightVisionPot), new ItemStack(Items.glass_bottle));
		FluidContainerRegistry.registerFluidContainer(new FluidStack(ModFluids.WEAKNESSPOT, 250), new ItemStack(ModItems.BottleWeaknessPot), new ItemStack(Items.glass_bottle));
		FluidContainerRegistry.registerFluidContainer(new FluidStack(ModFluids.STRPOT, 250), new ItemStack(ModItems.BottleStrPot), new ItemStack(Items.glass_bottle));
		FluidContainerRegistry.registerFluidContainer(new FluidStack(ModFluids.SLOWPOT, 250), new ItemStack(ModItems.BottleSlowPot), new ItemStack(Items.glass_bottle));
		FluidContainerRegistry.registerFluidContainer(new FluidStack(ModFluids.HARMPOT, 250), new ItemStack(ModItems.BottleHarmPot), new ItemStack(Items.glass_bottle));
		FluidContainerRegistry.registerFluidContainer(new FluidStack(ModFluids.WATERBREATHINGPOT, 250), new ItemStack(ModItems.BottleWaterBreathingPot), new ItemStack(Items.glass_bottle));
		FluidContainerRegistry.registerFluidContainer(new FluidStack(ModFluids.INVISIBILITYPOT, 250), new ItemStack(ModItems.BottleInvisibilityPot), new ItemStack(Items.glass_bottle));
	}
	
	public void registerFluidIcons()
	{
		
	}
}
