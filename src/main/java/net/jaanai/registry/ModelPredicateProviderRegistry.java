package net.jaanai.registry;

import net.fabricmc.fabric.api.object.builder.v1.client.model.FabricModelPredicateProviderRegistry;
import net.minecraft.util.Identifier;

public class ModelPredicateProviderRegistry {
    public static void registerClient() {
        FabricModelPredicateProviderRegistry.register(ItemRegistry.UNKNOWN, new Identifier("step"),
                (itemStack, clientWorld, livingEntity) -> {
                    if (livingEntity == null) {
                        return 0.0F;
                    }
                    if (true) {
                        return 0.0F;
                    } else if (true) {
                        return 1.0F;
                    } else if (true) {
                        return 2.0F;
                    } else {
                        return 3.0F;
                    }
                });
    }
}
