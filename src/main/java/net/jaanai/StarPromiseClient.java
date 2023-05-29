package net.jaanai;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.screenhandler.v1.ScreenRegistry;
import net.jaanai.content.screen.EvilSmithingTableScreen;
import net.jaanai.content.screen.EvilSmithingTableScreenHandler;
import net.jaanai.registry.ModelPredicateProviderRegistry;
import net.jaanai.registry.ParticleRegistry;

@Environment(EnvType.CLIENT)
public class StarPromiseClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        ModelPredicateProviderRegistry.registerClient();
        ParticleRegistry.registerClient();
        ScreenRegistry.register(StarPromise.EVIL_SMITHING_TABLE_SCREEN_HANDLER, EvilSmithingTableScreen::new);
    }
}
