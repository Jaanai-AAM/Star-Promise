package net.jaanai;

import net.fabricmc.api.ModInitializer;
import net.jaanai.registry.ToolRegistry;

public class StarPromise implements ModInitializer {
    public static final String MOD_ID = "star_promise";

    @Override
    public void onInitialize() {
        ToolRegistry.register();
    }
}
