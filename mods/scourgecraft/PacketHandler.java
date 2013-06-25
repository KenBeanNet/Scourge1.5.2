package mods.scourgecraft;

import com.google.common.io.ByteArrayDataInput;
import com.google.common.io.ByteStreams;

import cpw.mods.fml.common.network.IPacketHandler;
import cpw.mods.fml.common.network.Player;
import net.minecraft.network.INetworkManager;
import net.minecraft.network.packet.Packet250CustomPayload;

public class PacketHandler implements IPacketHandler
{ 
    @Override
    public void onPacketData(INetworkManager network, Packet250CustomPayload packet, Player player)
    {
        ByteArrayDataInput dat = ByteStreams.newDataInput(packet.data);
        int x = dat.readInt();
        int y = dat.readInt();
        int z = dat.readInt();
        int typDat = dat.readByte();
        byte typ = (byte)(typDat & 0xf);
        byte facing = (byte)((typDat >> 4) & 0xf);
        boolean hasStacks = dat.readByte() != 0;
        int[] items = new int[0];
        if (hasStacks)
        {
            items = new int[24];
            for (int i = 0; i < items.length; i++)
            {
                items[i] = dat.readInt();
            }
        }
    }
}