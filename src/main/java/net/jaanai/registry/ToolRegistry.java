package net.jaanai.registry;

import net.jaanai.StarPromise;
import net.jaanai.content.material.CeresToolMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.minecraft.util.registry.Registry;

public class ToolRegistry {
    public static final ToolItem CERES = new SwordItem(CeresToolMaterial.INSTANCE, 3, -2.6F,
            new Item.Settings().rarity(Rarity.EPIC).fireproof());

    public static void register() {
        Registry.register(Registry.ITEM, new Identifier(StarPromise.MOD_ID, "ceres"), CERES);
    }
}
