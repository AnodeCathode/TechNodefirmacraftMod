package TechNodefirmacraft.core;


public class ModDetails 
{
	public static final String ModID = "technodefirmacraft";
	public static final String ModName = "TechNodefirmacraft";

	public static final int VersionMajor = 2;
	public static final int VersionMinor = 5;
	public static final int VersionRevision = 0;

	public static final String ModVersion = VersionMajor + "." + VersionMinor + "." + VersionRevision;
	public static final String ModDependencies = "required-after:terrafirmacraft";
	public static final String ModChannel = "technodefirmacraft";
	public static final String SERVER_PROXY_CLASS = "TechNodefirmacraft.core.ModCommonProxy";
	public static final String CLIENT_PROXY_CLASS = "TechNodefirmacraft.core.ModClientProxy";
	
	public static final String AssetPath = "/assets/" + ModID + "/";
	public static final String AssetPathGui = "textures/gui/";
	
	public static final String ConfigFilePath = "/config/";
	public static final String ConfigFileName = "TechNodefirmacraft.cfg";
	
	public static final int GuiOffset = 10000;
	
	public static final String MODID_NEI = "NotEnoughItems";
	public static final String MODID_TFC = "terrafirmacraft";
	public static final String MODID_WAILA = "Waila";

	public static final String MODNAME_NEI = "Not Enough Items";
	public static final String MODNAME_TFC = "TerraFirmaCraft";
	public static final String MODNAME_WAILA = "Waila";


}
