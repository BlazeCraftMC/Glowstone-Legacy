package net.glowstone.net.message.play.inv;

import net.glowstone.net.flow.Message;
import lombok.Data;
import org.bukkit.inventory.ItemStack;

@Data
public final class SetWindowSlotMessage implements Message {

    private final int id, slot;
    private final ItemStack item;

}
