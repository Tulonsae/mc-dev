package net.minecraft.server;

import java.io.DataInputStream;
import java.io.DataOutputStream;

public class Packet107SetCreativeSlot extends Packet {

    public int slot;
    public ItemStack b;

    public Packet107SetCreativeSlot() {}

    public void handle(NetHandler nethandler) {
        nethandler.a(this);
    }

    public void a(DataInputStream datainputstream) {
        this.slot = datainputstream.readShort();
        this.b = this.b(datainputstream);
    }

    public void a(DataOutputStream dataoutputstream) {
        dataoutputstream.writeShort(this.slot);
        this.a(this.b, dataoutputstream);
    }

    public int a() {
        return 8;
    }
}
