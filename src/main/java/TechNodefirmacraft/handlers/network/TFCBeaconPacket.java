package TechNodefirmacraft.handlers.network;

import com.bioxx.tfc.TerraFirmaCraft;
import com.bioxx.tfc.Handlers.Network.AbstractPacket;
import com.bioxx.tfc.TileEntities.NetworkTileEntity;

import TechNodefirmacraft.TileEntities.TETFCBeacon;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.network.PacketBuffer;

public class TFCBeaconPacket extends AbstractPacket{
	
	private int x;
	private int y;
	private int z;
	private int secondary;
	private int primary;
	public TFCBeaconPacket() {}
	
	public TFCBeaconPacket(int x, int y, int z, int primaryEffect, int secondaryEffect) {
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
		
		TETFCBeacon te = (TETFCBeacon) player.worldObj.getTileEntity(x, y, z);
		if (te != null)
		{
			te.handleDataPacket(this.primary, this.secondary);
		}
	}
	@Override
	public void handleServerSide(EntityPlayer player) {
		TETFCBeacon te = (TETFCBeacon) player.worldObj.getTileEntity(x, y, z);
		if (te != null)
		{
			te.handleDataPacket(this.primary, this.secondary);
		}
		
	}

}
