package net.jaanai.content.material;

import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class CeresToolMaterial implements ToolMaterial {
    public static final CeresToolMaterial INSTANCE = new CeresToolMaterial();

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
        return 8.0F;
    }

    @Override
    public int getMiningLevel() {
        return 3;
    }

    @Override
    public int getEnchantability() {
        return 50;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(Items.DIAMOND);
    }
}
