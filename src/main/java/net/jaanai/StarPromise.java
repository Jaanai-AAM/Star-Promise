package net.jaanai;

import net.fabricmc.api.ModInitializer;
import net.jaanai.registry.*;

public class StarPromise implements ModInitializer {
    public static final String MOD_ID = "star_promise";

    @Override
    public void onInitialize() {
        ItemRegistry.register();
        ToolRegistry.register();
        ArmorRegistry.register();
        BlockRegistry.register();
        EnchantmentRegistry.register();
        ParticleRegistry.register();
    }
}
