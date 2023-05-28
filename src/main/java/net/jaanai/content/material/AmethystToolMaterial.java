package net.jaanai.content.material;

import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class AmethystToolMaterial implements ToolMaterial {
    public static final AmethystToolMaterial INSTANCE = new AmethystToolMaterial();

    @Override
    public int getDurability() {
        return 2031;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return 9.0F;
    }

    @Override
    public float getAttackDamage() {
        return 5.0F;
    }

    @Override
    public int getMiningLevel() {
        return 4;
    }

    @Override
    public int getEnchantability() {
        return 15;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(Items.DIAMOND);
    }
}
