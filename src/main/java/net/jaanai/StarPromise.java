package net.jaanai;

import net.fabricmc.api.ModInitializer;
import net.jaanai.content.item.weapon.sword.CeresToolMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.minecraft.util.registry.Registry;

public class StarPromise implements ModInitializer {
    public static final ToolItem CERES = new SwordItem(CeresToolMaterial.INSTANCE, 3, -2.6F, new Item.Settings().rarity(Rarity.EPIC).fireproof());

    @Override
    public void onInitialize() {
        Registry.register(Registry.ITEM, new Identifier("star_promise", "ceres"), CERES);
    }
}
