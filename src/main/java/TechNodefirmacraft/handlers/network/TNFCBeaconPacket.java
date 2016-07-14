package TechNodefirmacraft.handlers.network;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.bioxx.tfc.TerraFirmaCraft;
import com.bioxx.tfc.Handlers.Network.AbstractPacket;
import com.bioxx.tfc.TileEntities.NetworkTileEntity;

import TechNodefirmacraft.Containers.ContainerTNFCBeacon;
import TechNodefirmacraft.TileEntities.TETNFCBeacon;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.ContainerBeacon;
import net.minecraft.inventory.Slot;
import net.minecraft.network.PacketBuffer;
import net.minecraft.tileentity.TileEntityBeacon;

public class TNFCBeaconPacket extends AbstractPacket{
	
	private int x;
	private int y;
	private int z;
	private int secondary;
	private int primary;
	
	private static final Logger logger = LogManager.getLogger();
	
	public TNFCBeaconPacket() {}
	
	public TNFCBeaconPacket(int x, int y, int z, int primaryEffect, int secondaryEffect) {
		//bytebuf is: First is x,y,z Coord then two integer for primary and secondary effects
		this.x = x;
		this.y = y;
		this.z = z;
		this.primary = primaryEffect;
		this.secondary = secondaryEffect;
		
		
	}
	
	@Override
	public void encodeInto(ChannelHandlerContext ctx, ByteBuf buffer) {
		
		PacketBuffer pb = new PacketBuffer(buffer);
		pb.writeInt(this.x);
		pb.writeInt(this.y);
		pb.writeInt(this.z);
		pb.writeInt(this.primary);
		pb.writeInt(this.secondary);
		
	}
	@Override
	public void decodeInto(ChannelHandlerContext ctx, ByteBuf buffer) {
		PacketBuffer pb = new PacketBuffer(buffer);
		this.x = pb.readInt();
		this.y = pb.readInt();
		this.z = pb.readInt();
		this.primary = pb.readInt();
		this.secondary = pb.readInt();
		
	}
	@Override
	public void handleClientSide(EntityPlayer player) {
		
		TETNFCBeacon te = (TETNFCBeacon) player.worldObj.getTileEntity(x, y, z);
		if (te != null)
		{
			te.handleDataPacket(this.primary, this.secondary);
		}
	}
	@Override
	public void handleServerSide(EntityPlayer player) {
		TETNFCBeacon te = (TETNFCBeacon) player.worldObj.getTileEntity(x, y, z);
		if (te != null)
		{
			if (player.openContainer instanceof ContainerTNFCBeacon)
			{
				try
				{
					ContainerTNFCBeacon containerbeacon = (ContainerTNFCBeacon)player.openContainer;
                    Slot slot = containerbeacon.getSlot(0);

                    if (slot.getHasStack())
                    {
                        slot.decrStackSize(1);
                        TETNFCBeacon tileentitybeacon = containerbeacon.func_148327_e();
                        tileentitybeacon.setPrimaryEffect(this.primary);
                        tileentitybeacon.setSecondaryEffect(this.secondary);
                        tileentitybeacon.markDirty();
                    }
                }
                catch (Exception exception)
                {
                    logger.error("Couldn\'t set beacon", exception);
                }
            }
		}
		
	}

}
