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
		ModFluids.OAKMIX = new ModFluids("oakmix").setBaseColor(0x00b000);
		ModFluids.BIRCHMIX = new ModFluids("birchmix").setBaseColor(0x9fe5a1);
		ModFluids.SPRUCEMIX = new ModFluids("sprucemix").setBaseColor(0x52a267);
		ModFluids.JUNGLEMIX = new ModFluids("junglemix").setBaseColor(0x5a8108);
		ModFluids.ACACIAMIX = new ModFluids("acaciamix").setBaseColor(0x7e8108);
		ModFluids.DARKOAKMIX = new ModFluids("darkoakmix").setBaseColor(0x597a5a);

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
