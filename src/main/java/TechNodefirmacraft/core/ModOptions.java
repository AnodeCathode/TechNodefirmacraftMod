package TechNodefirmacraft.core;

import java.io.File;

import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.common.config.Property;

public class ModOptions
{
		public static Configuration config;
	// Configuration Headers -- Must be entirely lowercase!
		public static final String GENERAL_HEADER = "general";

	// General options
		public static int dropChance; //Chance of player head dropping when killed by bear.
	
	public static void loadSettings()
	{	
		System.out.println("[" + ModDetails.ModName + "] Loading options.");


		try
		{
			config = new Configuration(new File(TechNodefirmacraft.TechNodefirmacraft.instance.getMinecraftDirectory(), ModDetails.ConfigFilePath+ModDetails.ConfigFileName));
			config.load();
		} 
		catch (Exception ex) 
		{
			System.out.println("["+ModDetails.ModName+"] Error while trying to access settings configuration!");
			config = null;
		}
		
		ModOptions.dropChance= config.getInt("dropchance", GENERAL_HEADER , 50, 1, 100, "Percentage chance a players head will drop when killed by a bear.");
		ModOptions.enableNEIHiding= config.getBoolean("NEI hiding", GENERAL_HEADER, enableNEIHiding, "Set to false to show all the hidden Items in NEI.");

		if (config != null)
			config.save();

		System.out.println("[" + ModDetails.ModName + "] Done loading options.");
	}
	
	public static boolean getBooleanFor(Configuration config,String heading, String item, boolean value)
	{
		if (config == null)
			return value;
		try
		{
			Property prop = config.get(heading, item, value);
			return prop.getBoolean(value);
		}
		catch (Exception e)
		{
			System.out.println("[" + ModDetails.ModName + "] Error while trying to add Integer, config wasn't loaded properly!");
		}
		return value;
	}

	public static boolean getBooleanFor(Configuration config,String heading, String item, boolean value, String comment)
	{
		if (config == null)
			return value;
		try
		{
			Property prop = config.get(heading, item, value);
			prop.comment = comment;
			return prop.getBoolean(value);
		}
		catch (Exception e)
		{
			System.out.println("[" + ModDetails.ModName + "] Error while trying to add Integer, config wasn't loaded properly!");
		}
		return value;
	}

	public static int getIntFor(Configuration config, String heading, String item, int value)
	{
		if (config == null)
			return value;
		try
		{
			Property prop = config.get(heading, item, value);
			return prop.getInt(value);
		}
		catch (Exception e)
		{
			System.out.println("[" + ModDetails.ModName + "] Error while trying to add Integer, config wasn't loaded properly!");
		}
		return value;
	}

	public static int getIntFor(Configuration config,String heading, String item, int value, String comment)
	{
		if (config == null)
			return value;
		try
		{
			Property prop = config.get(heading, item, value);
			prop.comment = comment;
			return prop.getInt(value);
		}
		catch (Exception e)
		{
			System.out.println("[" + ModDetails.ModName + "] Error while trying to add Integer, config wasn't loaded properly!");
		}
		return value;
	}

	public static double getDoubleFor(Configuration config,String heading, String item, double value)
	{
		if (config == null)
			return value;
		try
		{
			Property prop = config.get(heading, item, value);
			return prop.getDouble(value);
		}
		catch (Exception e)
		{
			System.out.println("[" + ModDetails.ModName + "] Error while trying to add Double, config wasn't loaded properly!");
		}
		return value;
	}

	public static double getDoubleFor(Configuration config,String heading, String item, double value, String comment)
	{
		if (config == null)
			return value;
		try
		{
			Property prop = config.get(heading, item, value);
			prop.comment = comment;
			return prop.getDouble(value);
		}
		catch (Exception e)
		{
			System.out.println("[" + ModDetails.ModName + "] Error while trying to add Double, config wasn't loaded properly!");
		}
		return value;
	}

	public static String getStringFor(Configuration config, String heading, String item, String value)
	{
		if (config == null)
			return value;
		try
		{
			Property prop = config.get(heading, item, value);
			return prop.getString();
		} catch (Exception e)
		{
			System.out.println("[" + ModDetails.ModName + "] Error while trying to add String, config wasn't loaded properly!");
		}
		return value;
	}

	public static String getStringFor(Configuration config, String heading, String item, String value, String comment)
	{
		if (config == null)
			return value;
		try
		{
			Property prop = config.get(heading, item, value);
			prop.comment = comment;
			return prop.getString();
		} catch (Exception e)
		{
			System.out.println("[" + ModDetails.ModName + "] Error while trying to add String, config wasn't loaded properly!");
		}
		return value;
	}
	public static boolean enableNEIHiding = true;
}