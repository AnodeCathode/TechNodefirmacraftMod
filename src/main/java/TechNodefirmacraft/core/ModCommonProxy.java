package TechNodefirmacraft.core;

import java.io.File;

import net.minecraft.server.MinecraftServer;
import net.minecraft.world.World;

import com.bioxx.tfc.Handlers.ServerTickHandler;

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

	public void registerFluidIcons()
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
		FMLCommonHandler.instance().bus().register(new ServerTickHandler());
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
}
