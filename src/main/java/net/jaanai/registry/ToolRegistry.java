package net.jaanai.registry;

import net.jaanai.StarPromise;
import net.jaanai.content.item.tool.Axes;
import net.jaanai.content.material.CornucopiaToolMaterial;
import net.jaanai.content.material.CrystalToolMaterial;
import net.jaanai.content.material.DeactivatedCrystalToolMaterial;
import net.jaanai.content.material.EvilToolMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.minecraft.util.registry.Registry;

public class ToolRegistry {
    public static final ToolItem CERES = new SwordItem(CornucopiaToolMaterial.INSTANCE,
            3, -2.2F, new Item.Settings()
            .group(ItemGroupRegistry.STAR_PROMISE).rarity(Rarity.EPIC).fireproof());
    public static final ToolItem ARES = new Axes(CornucopiaToolMaterial.INSTANCE,
            8.0F, -3.2F, new Item.Settings()
            .group(ItemGroupRegistry.STAR_PROMISE).rarity(Rarity.RARE).fireproof());
    public static final ToolItem CERES_DAGGER = new SwordItem(CornucopiaToolMaterial.INSTANCE,
            1, -2.0F, new Item.Settings()
            .group(ItemGroupRegistry.STAR_PROMISE).rarity(Rarity.EPIC).fireproof());
    public static final ToolItem EVIL_DAGGER = new SwordItem(EvilToolMaterial.INSTANCE,
            1, -2.0F, new Item.Settings()
            .group(ItemGroupRegistry.STAR_PROMISE).rarity(Rarity.EPIC).fireproof());
    public static final ToolItem DEACTIVATED_CRYSTAL_STALWART_SWORD = new SwordItem(
            DeactivatedCrystalToolMaterial.INSTANCE, 3, -3.0F, new Item.Settings()
            .group(ItemGroupRegistry.STAR_PROMISE).fireproof());
    public static final ToolItem CRYSTAL_STALWART_SWORD = new SwordItem(CrystalToolMaterial.INSTANCE,
            3, -3.0F, new Item.Settings()
            .group(ItemGroupRegistry.STAR_PROMISE).rarity(Rarity.RARE).fireproof());

    public static void register() {
        Registry.register(Registry.ITEM, new Identifier(StarPromise.MOD_ID, "ceres"), CERES);
        Registry.register(Registry.ITEM, new Identifier(StarPromise.MOD_ID, "ares"), ARES);
        Registry.register(Registry.ITEM, new Identifier(StarPromise.MOD_ID, "ceres_dagger"), CERES_DAGGER);
        Registry.register(Registry.ITEM, new Identifier(StarPromise.MOD_ID, "evil_dagger"), EVIL_DAGGER);
        Registry.register(Registry.ITEM, new Identifier(StarPromise.MOD_ID, "deactivated_crystal_stalwart_sword"),
                DEACTIVATED_CRYSTAL_STALWART_SWORD);
        Registry.register(Registry.ITEM, new Identifier(StarPromise.MOD_ID, "crystal_stalwart_sword"),
                CRYSTAL_STALWART_SWORD);
    }
}
