package net.jaanai;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.screenhandler.v1.ScreenHandlerRegistry;
import net.jaanai.content.screen.EvilSmithingTableScreenHandler;
import net.jaanai.registry.*;
import net.minecraft.screen.ScreenHandlerType;

public class StarPromise implements ModInitializer {
    public static final String MOD_ID = "star_promise";

    public static final ScreenHandlerType<EvilSmithingTableScreenHandler> EVIL_SMITHING_TABLE_SCREEN_HANDLER = ScreenHandlerRegistry.registerSimple(BlockRegistry.CRAFTING, EvilSmithingTableScreenHandler::new);

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
