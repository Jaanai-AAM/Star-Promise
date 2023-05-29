package net.jaanai.registry;

import net.jaanai.StarPromise;
import net.jaanai.content.item.tool.Axe;
import net.jaanai.content.item.tool.Hoe;
import net.jaanai.content.item.tool.Pickaxe;
import net.jaanai.content.material.*;
import net.minecraft.item.Item;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.minecraft.util.registry.Registry;

public class ToolRegistry {
    public static final ToolItem AMETHYST_SWORD = new SwordItem(AmethystToolMaterial.INSTANCE, 3, -2.4F, new Item.Settings().group(ItemGroupRegistry.STAR_PROMISE).rarity(Rarity.EPIC).fireproof());
    public static final ToolItem CERES = new SwordItem(CornucopiaToolMaterial.INSTANCE, 3, -2.2F, new Item.Settings().group(ItemGroupRegistry.STAR_PROMISE).rarity(Rarity.EPIC).fireproof());
    public static final ToolItem ARES = new Axe(CornucopiaToolMaterial.INSTANCE, 8.0F, -3.2F, new Item.Settings().group(ItemGroupRegistry.STAR_PROMISE).rarity(Rarity.RARE).fireproof());
    public static final ToolItem CERES_DAGGER = new SwordItem(CornucopiaToolMaterial.INSTANCE, 1, -2.0F, new Item.Settings().group(ItemGroupRegistry.STAR_PROMISE).rarity(Rarity.EPIC).fireproof());
    public static final ToolItem EVIL_DAGGER = new SwordItem(EvilToolMaterial.INSTANCE, 1, -2.0F, new Item.Settings().group(ItemGroupRegistry.STAR_PROMISE).rarity(Rarity.EPIC).fireproof());
    public static final ToolItem DEACTIVATED_CRYSTAL_STALWART_SWORD = new SwordItem(DeactivatedCrystalToolMaterial.INSTANCE, 3, -3.0F, new Item.Settings().group(ItemGroupRegistry.STAR_PROMISE).fireproof());
    public static final ToolItem CRYSTAL_STALWART_SWORD = new SwordItem(CrystalToolMaterial.INSTANCE, 12, -3.0F, new Item.Settings().group(ItemGroupRegistry.STAR_PROMISE).rarity(Rarity.RARE).fireproof());
    public static final ToolItem CRYSTAL_SWORD = new SwordItem(CrystalToolMaterial.INSTANCE, 3, -2.4F, new Item.Settings().group(ItemGroupRegistry.STAR_PROMISE));
    public static final ToolItem CRYSTAL_SHOVEL = new ShovelItem(CrystalToolMaterial.INSTANCE, 1.5F, -3.0F, new Item.Settings().group(ItemGroupRegistry.STAR_PROMISE));
    public static final ToolItem CRYSTAL_PICKAXE = new Pickaxe(CrystalToolMaterial.INSTANCE, 1, -2.8F, new Item.Settings().group(ItemGroupRegistry.STAR_PROMISE));
    public static final ToolItem CRYSTAL_AXE = new Axe(CrystalToolMaterial.INSTANCE, 6.0F, -3.1F, new Item.Settings().group(ItemGroupRegistry.STAR_PROMISE));
    public static final ToolItem CRYSTAL_HOE = new Hoe(CrystalToolMaterial.INSTANCE, -2, -1.0F, new Item.Settings().group(ItemGroupRegistry.STAR_PROMISE));

    public static void register() {
        Registry.register(Registry.ITEM, new Identifier(StarPromise.MOD_ID, "amethyst_sword"), AMETHYST_SWORD);
        Registry.register(Registry.ITEM, new Identifier(StarPromise.MOD_ID, "ceres"), CERES);
        Registry.register(Registry.ITEM, new Identifier(StarPromise.MOD_ID, "ares"), ARES);
        Registry.register(Registry.ITEM, new Identifier(StarPromise.MOD_ID, "ceres_dagger"), CERES_DAGGER);
        Registry.register(Registry.ITEM, new Identifier(StarPromise.MOD_ID, "evil_dagger"), EVIL_DAGGER);
        Registry.register(Registry.ITEM, new Identifier(StarPromise.MOD_ID, "deactivated_crystal_stalwart_sword"), DEACTIVATED_CRYSTAL_STALWART_SWORD);
        Registry.register(Registry.ITEM, new Identifier(StarPromise.MOD_ID, "crystal_stalwart_sword"), CRYSTAL_STALWART_SWORD);
        Registry.register(Registry.ITEM, new Identifier(StarPromise.MOD_ID, "crystal_sword"), CRYSTAL_SWORD);
        Registry.register(Registry.ITEM, new Identifier(StarPromise.MOD_ID, "crystal_shovel"), CRYSTAL_SHOVEL);
        Registry.register(Registry.ITEM, new Identifier(StarPromise.MOD_ID, "crystal_pickaxe"), CRYSTAL_PICKAXE);
        Registry.register(Registry.ITEM, new Identifier(StarPromise.MOD_ID, "crystal_axe"), CRYSTAL_AXE);
        Registry.register(Registry.ITEM, new Identifier(StarPromise.MOD_ID, "crystal_hoe"), CRYSTAL_HOE);
    }
}
