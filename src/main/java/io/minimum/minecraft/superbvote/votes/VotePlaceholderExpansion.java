package io.minimum.minecraft.superbvote.votes;

import io.minimum.minecraft.superbvote.SuperbVote;
import me.clip.placeholderapi.expansion.PlaceholderExpansion;
import org.bukkit.OfflinePlayer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class VotePlaceholderExpansion extends PlaceholderExpansion {
    private final SuperbVote plugin;

    public VotePlaceholderExpansion(SuperbVote plugin) {
        this.plugin = plugin;
    }

    @Override
    public @NotNull String getIdentifier() {
        return "superbvote";
    }

    @Override
    public @NotNull String getAuthor() {
        return String.join(", ", plugin.getPluginMeta().getAuthors());
    }

    @Override
    public @NotNull String getVersion() {
        return plugin.getPluginMeta().getVersion();
    }

    @Override
    public @Nullable String onRequest(OfflinePlayer player, @NotNull String params) {
        return switch (params) {
            case "voteparty_current_votes" -> String.valueOf(plugin.getVoteParty().getCurrentVotes());
            case "voteparty_needed_votes" -> String.valueOf(plugin.getVoteParty().votesNeeded());
            default -> null;
        };
    }
}
