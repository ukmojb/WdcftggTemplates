package com.wdcftgg.wdcftggTemplates.network;

import io.netty.buffer.ByteBuf;
import net.minecraftforge.fml.common.network.ByteBufUtils;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;

public class MessageCustomInstructionKey implements IMessageHandler<MessageCustomInstructionKey, IMessage>, IMessage  {

    public String animationName;
    public String instructions;


    public MessageCustomInstructionKey() {
    }

    public MessageCustomInstructionKey(String animationName, String instructions) {
        this.animationName = animationName;
        this.instructions = instructions;
    }

    public void fromBytes(ByteBuf buf) {
        this.animationName = ByteBufUtils.readUTF8String(buf);
        this.instructions = ByteBufUtils.readUTF8String(buf);
    }

    public void toBytes(ByteBuf buf) {
        ByteBufUtils.writeUTF8String(buf, animationName);
        ByteBufUtils.writeUTF8String(buf, instructions);
    }


    public IMessage onMessage(MessageCustomInstructionKey message, MessageContext ctx) {

        return null;
    }
}