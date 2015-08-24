package TechNodefirmacraft.core;

import java.io.File;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.server.MinecraftServer;
import net.minecraft.world.World;
import net.minecraftforge.fluids.FluidContainerRegistry;
import net.minecraftforge.fluids.FluidRegistry;
import net.minecraftforge.fluids.FluidStack;


import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.network.NetworkRegistry;

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
	//	FMLCommonHandler.instance().bus().register(new ServerTickHandler());
	}
	
	public void registerTileEntities(boolean flag)
	{
		// non TESR registers

		if (flag)
		{
			// TESR registers
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
		ModFluids.OAKMIX = new ModFluids("oakmix").setBaseColor(0x31ad00);
		ModFluids.BIRCHMIX = new ModFluids("birchmix").setBaseColor(0x249300);
		ModFluids.SPRUCEMIX = new ModFluids("sprucemix").setBaseColor(0x258400);
		ModFluids.JUNGLEMIX = new ModFluids("junglemix").setBaseColor(0x287200);
		ModFluids.ACACIAMIX = new ModFluids("acaciamix").setBaseColor(0x00600B);
		ModFluids.DARKOAKMIX = new ModFluids("darkoakmix").setBaseColor(0x004c10);

		FluidRegistry.registerFluid(ModFluids.OAKMIX);
		FluidRegistry.registerFluid(ModFluids.BIRCHMIX);
		FluidRegistry.registerFluid(ModFluids.SPRUCEMIX);
		FluidRegistry.registerFluid(ModFluids.JUNGLEMIX);
		FluidRegistry.registerFluid(ModFluids.ACACIAMIX);
		FluidRegistry.registerFluid(ModFluids.DARKOAKMIX);
	}
	public void setupFluids()
	{
		FluidContainerRegistry.registerFluidContainer(FluidRegistry.getFluid(ModFluids.OAKMIX.getName()), new ItemStack(ModItems.BucketOakMix), new ItemStack(Items.bucket));
		FluidContainerRegistry.registerFluidContainer(FluidRegistry.getFluid(ModFluids.BIRCHMIX.getName()), new ItemStack(ModItems.BucketBirchMix), new ItemStack(Items.bucket));
		FluidContainerRegistry.registerFluidContainer(FluidRegistry.getFluid(ModFluids.SPRUCEMIX.getName()), new ItemStack(ModItems.BucketSpruceMix), new ItemStack(Items.bucket));
		FluidContainerRegistry.registerFluidContainer(FluidRegistry.getFluid(ModFluids.JUNGLEMIX.getName()), new ItemStack(ModItems.BucketJungleMix), new ItemStack(Items.bucket));
		FluidContainerRegistry.registerFluidContainer(FluidRegistry.getFluid(ModFluids.ACACIAMIX.getName()), new ItemStack(ModItems.BucketAcaciaMix), new ItemStack(Items.bucket));
		FluidContainerRegistry.registerFluidContainer(FluidRegistry.getFluid(ModFluids.DARKOAKMIX.getName()), new ItemStack(ModItems.BucketDarkOakMix), new ItemStack(Items.bucket));
	}
	
	public void registerFluidIcons()
	{
		
	}
}
