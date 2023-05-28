package net.jaanai.registry;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.jaanai.StarPromise;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.minecraft.util.registry.Registry;

public class ItemRegistry {
    public static final Item UNKNOWN = new Item(new FabricItemSettings()
            .group(ItemGroupRegistry.STAR_PROMISE).rarity(Rarity.EPIC).fireproof());
    public static final Item APOCALYPSE = new Item(new FabricItemSettings().group(ItemGroupRegistry.STAR_PROMISE));
    public static final Item RISAY_GOLD_COIN = new Item(new FabricItemSettings()
            .group(ItemGroupRegistry.STAR_PROMISE));
    public static final Item RISAY_SILVER_COIN = new Item(new FabricItemSettings()
            .group(ItemGroupRegistry.STAR_PROMISE));
    public static final Item RISAY_COPPER_COIN = new Item(new FabricItemSettings()
            .group(ItemGroupRegistry.STAR_PROMISE));
    public static final Item UNWROUGHT_PROVIDENCE_STEEL = new Item(new FabricItemSettings()
            .group(ItemGroupRegistry.STAR_PROMISE).rarity(Rarity.UNCOMMON).fireproof());
    public static final Item EVIL_PROVIDENCE_STEEL = new Item(new FabricItemSettings()
            .group(ItemGroupRegistry.STAR_PROMISE).rarity(Rarity.EPIC).fireproof());
    public static final Item CORNUCOPIA_PROVIDENCE_STEEL = new Item(new FabricItemSettings()
            .group(ItemGroupRegistry.STAR_PROMISE).rarity(Rarity.EPIC).fireproof());
    public static final Item BROKEN_CRYSTAL_STALWART_SWORD = new Item(new FabricItemSettings()
            .group(ItemGroupRegistry.STAR_PROMISE).fireproof().maxCount(1));
    public static final Item CRYSTAL_CORE_GEM = new Item(new FabricItemSettings()
            .group(ItemGroupRegistry.STAR_PROMISE).rarity(Rarity.RARE).fireproof());
    public static final Item CRYSTAL = new Item(new FabricItemSettings().group(ItemGroupRegistry.STAR_PROMISE));

    public static void register() {
        Registry.register(Registry.ITEM, new Identifier(StarPromise.MOD_ID, "unknown"), UNKNOWN);
        Registry.register(Registry.ITEM, new Identifier(StarPromise.MOD_ID, "apocalypse"), APOCALYPSE);
        Registry.register(Registry.ITEM, new Identifier(StarPromise.MOD_ID, "risay_gold_coin"),
                RISAY_GOLD_COIN);
        Registry.register(Registry.ITEM, new Identifier(StarPromise.MOD_ID, "risay_silver_coin"),
                RISAY_SILVER_COIN);
        Registry.register(Registry.ITEM, new Identifier(StarPromise.MOD_ID, "risay_copper_coin"),
                RISAY_COPPER_COIN);
        Registry.register(Registry.ITEM, new Identifier(StarPromise.MOD_ID, "unwrought_providence_steel"),
                UNWROUGHT_PROVIDENCE_STEEL);
        Registry.register(Registry.ITEM, new Identifier(StarPromise.MOD_ID, "evil_providence_steel"),
                EVIL_PROVIDENCE_STEEL);
        Registry.register(Registry.ITEM, new Identifier(StarPromise.MOD_ID, "cornucopia_providence_steel"),
                CORNUCOPIA_PROVIDENCE_STEEL);
        Registry.register(Registry.ITEM, new Identifier(StarPromise.MOD_ID, "broken_crystal_stalwart_sword"),
                BROKEN_CRYSTAL_STALWART_SWORD);
        Registry.register(Registry.ITEM, new Identifier(StarPromise.MOD_ID, "crystal_core_gem"),
                CRYSTAL_CORE_GEM);
        Registry.register(Registry.ITEM, new Identifier(StarPromise.MOD_ID, "crystal"), CRYSTAL);
    }
}
