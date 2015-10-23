//=======================================================
//Mod Client File
//=======================================================
package TechNodefirmacraft;

import java.util.Arrays;

import TechNodefirmacraft.core.ModCommonProxy;
import TechNodefirmacraft.core.ModDetails;
import cpw.mods.fml.common.DummyModContainer;
import cpw.mods.fml.common.LoadController;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.ModMetadata;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.event.FMLServerStartingEvent;
import cpw.mods.fml.relauncher.IFMLLoadingPlugin.MCVersion;

import com.google.common.eventbus.EventBus;

@MCVersion(value = "1.7.10")
public class TechNodefirmacraftCore extends DummyModContainer
{
	@Instance("tnfc_coremod")
	public static TechNodefirmacraftCore instance;

	@SidedProxy(clientSide = ModDetails.CLIENT_PROXY_CLASS, serverSide = ModDetails.SERVER_PROXY_CLASS)
	public static ModCommonProxy proxy;


	public TechNodefirmacraftCore()
	{
		super(new ModMetadata());
		ModMetadata meta = getMetadata();
		meta.modId = "tnfc_coremod";
		meta.name = "TNFC[coremod]";
		meta.version = ModDetails.ModVersion;
		meta.credits = "";
		meta.authorList = Arrays.asList("AnodeCathode");
		meta.description = "";
		meta.url = "github.com/AnodeCathode/TechNodefirmacraftMod";
		meta.updateUrl = "";
		meta.screenshots = new String[0];
		meta.logoFile = "";
	}

	@Override
	public boolean registerBus(EventBus bus, LoadController controller) {
		bus.register(this);
		return true;
	}

	@EventHandler
	public void preInit(FMLPreInitializationEvent event) 
	{
		instance = this;

	}

	@EventHandler
	public void initialize(FMLInitializationEvent evt)
	{

	}

	@EventHandler
	public void modsLoaded(FMLPostInitializationEvent evt) 
	{

	}

	@EventHandler
	public void serverStarting(FMLServerStartingEvent evt)
	{

	}	

}
