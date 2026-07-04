package me.rogerwindberg.dupeplayerblock.mixin;

import net.minecraft.network.chat.Component;
import net.minecraft.server.players.NameAndId;
import net.minecraft.server.players.PlayerList;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import java.net.SocketAddress;

@Mixin(PlayerList.class)
public abstract class PlayerManagerMixin {
    @Inject(method = "canPlayerLogin", at = @At("HEAD"), cancellable = true)
    private void blockDuplicateLogin(SocketAddress address, NameAndId profile, CallbackInfoReturnable<Component> cir) {
        if (profile == null || profile.name() == null || profile.name().isBlank()) {
            return;
        }

        PlayerList playerList = (PlayerList) (Object) this;
        if (playerList.getPlayerByName(profile.name()) != null) {
            System.out.println("[DupePlayerBlock] Blocked duplicate login for " + profile.name());
            cir.setReturnValue(Component.literal("This account is already connected to the server."));
        }
    }
}
