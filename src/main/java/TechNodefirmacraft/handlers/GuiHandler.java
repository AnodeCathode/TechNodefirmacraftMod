package TechNodefirmacraft.handlers;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

import com.bioxx.tfc.Containers.ContainerTFC;

import TechNodefirmacraft.Containers.ContainerTNFCBeacon;
import TechNodefirmacraft.TileEntities.TETNFCBeacon;
import TechNodefirmacraft.core.ModDetails;
import TechNodefirmacraft.gui.GuiTNFCBeacon;
import cpw.mods.fml.common.network.IGuiHandler;

public class GuiHandler implements IGuiHandler
{
	public static final int GuiIdCustom = ModDetails.GuiOffset + 1;
	
	@Override
	public Object getServerGuiElement(int Id, EntityPlayer player, World world, int x, int y, int z) 
	{
		TileEntity tileEntity;
		
		try
		{
			tileEntity = world.getTileEntity(x, y, z);
		}
		catch(Exception e)
		{
			return null;
		}
		
		switch (Id)
		{
			case 0:
				return new ContainerTNFCBeacon(player.inventory, (TETNFCBeacon) tileEntity);
				
			default:
				return null;
		}
	}

	@Override
	public Object getClientGuiElement(int Id, EntityPlayer player, World world, int x, int y, int z)
	{
		TileEntity tileEntity;
		try
		{
			tileEntity = world.getTileEntity(x, y, z);
		}
		catch(Exception e)
		{
			return null;
		}
		System.out.println("Opening: " + Id);
		if (Id == 0)
		{
			return new GuiTNFCBeacon(player.inventory, (TETNFCBeacon) tileEntity);
		}
		return null;
	}
}
