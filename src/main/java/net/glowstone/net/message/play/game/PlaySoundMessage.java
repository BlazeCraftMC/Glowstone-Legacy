package net.glowstone.net.message.play.game;

import net.glowstone.net.flow.Message;
import lombok.Data;

@Data
public final class PlaySoundMessage implements Message {

    private final String sound;
    private final double x, y, z;
    private final float volume, pitch;

}

