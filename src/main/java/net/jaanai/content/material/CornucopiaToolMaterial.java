package net.jaanai.content.material;

import net.jaanai.registry.ItemRegistry;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class CornucopiaToolMaterial implements ToolMaterial {
    public static final CornucopiaToolMaterial INSTANCE = new CornucopiaToolMaterial();

    @Override
    public int getDurability() {
        return 5000;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return 12.0F;
    }

    @Override
    public float getAttackDamage() {
        return 8.5F;
    }

    @Override
    public int getMiningLevel() {
        return 3;
    }

    @Override
    public int getEnchantability() {
        return 25;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(ItemRegistry.CORNUCOPIA_PROVIDENCE_STEEL);
    }
}
