package net.jaanai;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.particle.v1.ParticleFactoryRegistry;
import net.fabricmc.fabric.api.event.client.ClientSpriteRegistryCallback;
import net.jaanai.registry.ParticleRegistry;
import net.minecraft.client.particle.FlameParticle;
import net.minecraft.screen.PlayerScreenHandler;
import net.minecraft.util.Identifier;

public class StarPromiseClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        ClientSpriteRegistryCallback.event(PlayerScreenHandler.BLOCK_ATLAS_TEXTURE)
                .register((atlasTexture, registry) -> {
                    registry.register(new Identifier(StarPromise.MOD_ID, "particle/hunger"));
                });
        ClientSpriteRegistryCallback.event(PlayerScreenHandler.BLOCK_ATLAS_TEXTURE)
                .register((atlasTexture, registry) -> {
                    registry.register(new Identifier(StarPromise.MOD_ID, "particle/slowness"));
                });
        ClientSpriteRegistryCallback.event(PlayerScreenHandler.BLOCK_ATLAS_TEXTURE)
                .register((atlasTexture, registry) -> {
                    registry.register(new Identifier(StarPromise.MOD_ID, "particle/poison"));
                });
        ClientSpriteRegistryCallback.event(PlayerScreenHandler.BLOCK_ATLAS_TEXTURE)
                .register((atlasTexture, registry) -> {
                    registry.register(new Identifier(StarPromise.MOD_ID, "particle/absorption"));
                });
        ClientSpriteRegistryCallback.event(PlayerScreenHandler.BLOCK_ATLAS_TEXTURE)
                .register((atlasTexture, registry) -> {
                    registry.register(new Identifier(StarPromise.MOD_ID, "particle/health_boost"));
                });

        ParticleFactoryRegistry.getInstance().register(ParticleRegistry.HUNGER, FlameParticle.Factory::new);
        ParticleFactoryRegistry.getInstance().register(ParticleRegistry.SLOWNESS, FlameParticle.Factory::new);
        ParticleFactoryRegistry.getInstance().register(ParticleRegistry.POISON, FlameParticle.Factory::new);
        ParticleFactoryRegistry.getInstance().register(ParticleRegistry.ABSORPTION, FlameParticle.Factory::new);
        ParticleFactoryRegistry.getInstance().register(ParticleRegistry.HEALTH_BOOST, FlameParticle.Factory::new);
    }
}
