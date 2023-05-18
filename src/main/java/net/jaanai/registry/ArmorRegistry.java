package net.jaanai.registry;

import net.jaanai.StarPromise;
import net.jaanai.content.material.CornucopiaArmorMaterial;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.minecraft.util.registry.Registry;

public class ArmorRegistry {
    public static final Item CORNUCOPIA_HELMET = new ArmorItem(new CornucopiaArmorMaterial(), EquipmentSlot.HEAD,
            new Item.Settings().rarity(Rarity.RARE).fireproof());
    public static final Item CORNUCOPIA_CHESTPLATE = new ArmorItem(new CornucopiaArmorMaterial(), EquipmentSlot.CHEST,
            new Item.Settings().rarity(Rarity.RARE).fireproof());
    public static final Item CORNUCOPIA_LEGGINGS = new ArmorItem(new CornucopiaArmorMaterial(), EquipmentSlot.LEGS,
            new Item.Settings().rarity(Rarity.RARE).fireproof());
    public static final Item CORNUCOPIA_BOOTS = new ArmorItem(new CornucopiaArmorMaterial(), EquipmentSlot.FEET,
            new Item.Settings().rarity(Rarity.RARE).fireproof());

    public static void register() {
        Registry.register(Registry.ITEM, new Identifier(StarPromise.MOD_ID, "cornucopia_helmet"),
                CORNUCOPIA_HELMET);
        Registry.register(Registry.ITEM, new Identifier(StarPromise.MOD_ID, "cornucopia_chestplate"),
                CORNUCOPIA_CHESTPLATE);
        Registry.register(Registry.ITEM, new Identifier(StarPromise.MOD_ID, "cornucopia_leggings"),
                CORNUCOPIA_LEGGINGS);
        Registry.register(Registry.ITEM, new Identifier(StarPromise.MOD_ID, "cornucopia_boots"),
                CORNUCOPIA_BOOTS);
    }
}
