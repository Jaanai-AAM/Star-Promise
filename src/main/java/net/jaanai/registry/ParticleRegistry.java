package net.jaanai.registry;

import net.fabricmc.fabric.api.particle.v1.FabricParticleTypes;
import net.jaanai.StarPromise;
import net.minecraft.particle.DefaultParticleType;
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
}
