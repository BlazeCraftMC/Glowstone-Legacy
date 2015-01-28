package net.glowstone.net.codec.status;

import net.glowstone.net.flow.Codec;
import net.glowstone.net.flow.ByteBufUtils;
import io.netty.buffer.ByteBuf;
import net.glowstone.net.message.status.StatusResponseMessage;
import org.json.simple.JSONObject;
import org.json.simple.JSONValue;

import java.io.IOException;

public final class StatusResponseCodec implements Codec<StatusResponseMessage> {
    @Override
    public StatusResponseMessage decode(ByteBuf buf) throws IOException {
        String json = ByteBufUtils.readUTF8(buf);
        return new StatusResponseMessage((JSONObject) JSONValue.parse(json));
    }

    @Override
    public ByteBuf encode(ByteBuf buf, StatusResponseMessage message) throws IOException {
        ByteBufUtils.writeUTF8(buf, message.getJson());
        return buf;
    }
}
