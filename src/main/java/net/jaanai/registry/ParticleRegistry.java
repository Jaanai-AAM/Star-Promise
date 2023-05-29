package net.jaanai.registry;

import net.fabricmc.fabric.api.client.particle.v1.ParticleFactoryRegistry;
import net.fabricmc.fabric.api.event.client.ClientSpriteRegistryCallback;
import net.fabricmc.fabric.api.particle.v1.FabricParticleTypes;
import net.jaanai.StarPromise;
import net.minecraft.client.particle.FlameParticle;
import net.minecraft.particle.DefaultParticleType;
import net.minecraft.screen.PlayerScreenHandler;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ParticleRegistry {
    public static final DefaultParticleType HUNGER = FabricParticleTypes.simple();
    public static final DefaultParticleType SLOWNESS = FabricParticleTypes.simple();
    public static final DefaultParticleType POISON = FabricParticleTypes.simple();
    public static final DefaultParticleType ABSORPTION = FabricParticleTypes.simple();
    public static final DefaultParticleType HEALTH_BOOST = FabricParticleTypes.simple();

    public static void register() {
        Registry.register(Registry.PARTICLE_TYPE, new Identifier(StarPromise.MOD_ID, "hunger"), HUNGER);
        Registry.register(Registry.PARTICLE_TYPE, new Identifier(StarPromise.MOD_ID, "slowness"), SLOWNESS);
        Registry.register(Registry.PARTICLE_TYPE, new Identifier(StarPromise.MOD_ID, "poison"), POISON);
        Registry.register(Registry.PARTICLE_TYPE, new Identifier(StarPromise.MOD_ID, "absorption"), ABSORPTION);
        Registry.register(Registry.PARTICLE_TYPE, new Identifier(StarPromise.MOD_ID, "health_boost"), HEALTH_BOOST);
    }

    public static void registerClient() {
        ClientSpriteRegistryCallback.event(PlayerScreenHandler.BLOCK_ATLAS_TEXTURE).register((atlasTexture, registry) -> {
            registry.register(new Identifier(StarPromise.MOD_ID, "particle/hunger"));
        });
        ClientSpriteRegistryCallback.event(PlayerScreenHandler.BLOCK_ATLAS_TEXTURE).register((atlasTexture, registry) -> {
            registry.register(new Identifier(StarPromise.MOD_ID, "particle/slowness"));
        });
        ClientSpriteRegistryCallback.event(PlayerScreenHandler.BLOCK_ATLAS_TEXTURE).register((atlasTexture, registry) -> {
            registry.register(new Identifier(StarPromise.MOD_ID, "particle/poison"));
        });
        ClientSpriteRegistryCallback.event(PlayerScreenHandler.BLOCK_ATLAS_TEXTURE).register((atlasTexture, registry) -> {
            registry.register(new Identifier(StarPromise.MOD_ID, "particle/absorption"));
        });
        ClientSpriteRegistryCallback.event(PlayerScreenHandler.BLOCK_ATLAS_TEXTURE).register((atlasTexture, registry) -> {
            registry.register(new Identifier(StarPromise.MOD_ID, "particle/health_boost"));
        });

        ParticleFactoryRegistry.getInstance().register(ParticleRegistry.HUNGER, FlameParticle.Factory::new);
        ParticleFactoryRegistry.getInstance().register(ParticleRegistry.SLOWNESS, FlameParticle.Factory::new);
        ParticleFactoryRegistry.getInstance().register(ParticleRegistry.POISON, FlameParticle.Factory::new);
        ParticleFactoryRegistry.getInstance().register(ParticleRegistry.ABSORPTION, FlameParticle.Factory::new);
        ParticleFactoryRegistry.getInstance().register(ParticleRegistry.HEALTH_BOOST, FlameParticle.Factory::new);
    }
}
