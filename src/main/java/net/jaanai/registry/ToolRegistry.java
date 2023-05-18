package net.jaanai.registry;

import net.jaanai.StarPromise;
import net.jaanai.content.item.tool.Ares;
import net.jaanai.content.material.CornucopiaToolMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.minecraft.util.registry.Registry;

public class ToolRegistry {
    public static final ToolItem CERES = new SwordItem(CornucopiaToolMaterial.INSTANCE,
            3, -2.2F,new Item.Settings()
            .group(ItemGroupRegistry.STAR_PROMISE).rarity(Rarity.EPIC).fireproof());
    public static final ToolItem ARES = new Ares(CornucopiaToolMaterial.INSTANCE,
            7.5F, -3.2F, new Item.Settings()
            .group(ItemGroupRegistry.STAR_PROMISE).rarity(Rarity.RARE).fireproof());

    public static void register() {
        Registry.register(Registry.ITEM, new Identifier(StarPromise.MOD_ID, "ceres"), CERES);
        Registry.register(Registry.ITEM, new Identifier(StarPromise.MOD_ID, "ares"), ARES);
    }
}
