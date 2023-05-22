package net.jaanai;

import net.fabricmc.api.ClientModInitializer;
import net.jaanai.registry.ModelPredicateProviderRegistry;
import net.jaanai.registry.ParticleRegistry;

public class StarPromiseClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        ModelPredicateProviderRegistry.registerClient();
        ParticleRegistry.registerClient();
    }
}
