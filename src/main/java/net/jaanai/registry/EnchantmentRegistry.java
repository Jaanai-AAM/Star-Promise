package net.jaanai.registry;

import net.jaanai.StarPromise;
import net.jaanai.content.enchantment.CornucopiaOmenEnchantment;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class EnchantmentRegistry {
    public static final Enchantment CORNUCOPIA_OMEN = new CornucopiaOmenEnchantment();

    public static void register() {
        Registry.register(Registry.ENCHANTMENT, new Identifier(StarPromise.MOD_ID, "cornucopia_omen"), CORNUCOPIA_OMEN);
    }
}
