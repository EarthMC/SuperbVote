package io.minimum.minecraft.superbvote.configuration.message;

import net.kyori.adventure.text.minimessage.MiniMessage;
import org.bukkit.entity.Player;

public class ComponentVoteMessage extends MessageBase implements VoteMessage  {
    private final MiniMessage miniMessage = MiniMessage.miniMessage();
    private final String message;

    public ComponentVoteMessage(String message) {
        this.message = message;
    }

    @Override
    public void sendAsBroadcast(Player player, MessageContext context) {
        player.sendMessage(miniMessage.deserialize(replace(message, context)));
    }

    @Override
    public void sendAsReminder(Player player, MessageContext context) {
        player.sendMessage(miniMessage.deserialize(replace(message, context)));
    }
}
