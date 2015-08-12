package TechNodefirmacraft;

import java.io.File;

import net.minecraftforge.common.MinecraftForge;
import TechNodefirmacraft.core.ModBlocks;
import TechNodefirmacraft.core.ModCommonProxy;
import TechNodefirmacraft.core.ModDetails;
import TechNodefirmacraft.core.ModItems;
import TechNodefirmacraft.core.ModRecipes;
import TechNodefirmacraft.core.player.ModPlayerTracker;
import TechNodefirmacraft.handlers.ChunkEventHandler;
import TechNodefirmacraft.handlers.CraftingHandler;
import TechNodefirmacraft.handlers.PlayerInteractHandler;
import TechNodefirmacraft.handlers.network.InitClientWorldPacket;

import com.bioxx.tfc.TerraFirmaCraft;


import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = ModDetails.ModID, name = ModDetails.ModName, version = ModDetails.ModVersion, dependencies = ModDetails.ModDependencies)
public class TechNodefirmacraft
{
	@Instance(ModDetails.ModID)
	public static TechNodefirmacraft instance;
	public static final String AssetPath = "/assets/" + ModDetails.ModID + "/";
	public static final String AssetPathGui = "textures/gui/";
	public static final String AssetPathMenu = "textures/menu/";
	
	@SidedProxy(clientSide = ModDetails.CLIENT_PROXY_CLASS, serverSide = ModDetails.SERVER_PROXY_CLASS)
	public static ModCommonProxy proxy;
	
	public File getMinecraftDirectory()
	{
		return proxy.getMinecraftDirectory();
	}
	
	@EventHandler
	public void preInitialize(FMLPreInitializationEvent e)
	{
		instance = this;		
		
		// Load our settings
		proxy.loadOptions();
		
		proxy.registerTickHandler();
		
		ModBlocks.initialise();	

		// Register Key Bindings(Client only)
		proxy.registerKeys();
		// Register KeyBinding Handler (Client only)
		proxy.registerKeyBindingHandler();
		// Register Handler (Client only)
		proxy.registerHandlers();
		// Register Tile Entities
		proxy.registerTileEntities(true);
		// Register Sound Handler (Client only)
		proxy.registerSoundHandler();
		// Register Menu Items (Client only)
		proxy.registerMenuItems();
		
		ModItems.initialise();
		
		// Register Gui Handler
		proxy.registerGuiHandler();		
	}

	@EventHandler
	public void initialize(FMLInitializationEvent e)
	{
		// Register packets in the TFC PacketPipeline
		TerraFirmaCraft.packetPipeline.registerPacket(InitClientWorldPacket.class);
		
		// Register the player tracker
		FMLCommonHandler.instance().bus().register(new ModPlayerTracker());
		
		// Register the tool classes
		proxy.registerToolClasses();
		
		// Register Player Interact Handler - for drinking water & item pickups.
		MinecraftForge.EVENT_BUS.register(new PlayerInteractHandler());


		// Register Crafting Handler
		FMLCommonHandler.instance().bus().register(new CraftingHandler());

		// Register the Chunk Load/Save Handler
		MinecraftForge.EVENT_BUS.register(new ChunkEventHandler());
		
		// Register all the render stuff for the client
		proxy.registerRenderInformation();

		ModRecipes.initialise();
		
		// Register WAILA classes
		proxy.registerWailaClasses();
		proxy.hideNEIItems();		
	}

	@EventHandler
	public void postInitialize(FMLPostInitializationEvent e)
	{
	}
}
