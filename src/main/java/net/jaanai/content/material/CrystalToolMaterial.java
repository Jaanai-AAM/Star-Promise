package net.jaanai.content.material;

import net.jaanai.registry.ItemRegistry;
import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class CrystalToolMaterial implements ToolMaterial {
    public static final CrystalToolMaterial INSTANCE = new CrystalToolMaterial();

    @Override
    public int getDurability() {
        return 250;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return 12.0F;
    }

    @Override
    public float getAttackDamage() {
        return 2.0F;
    }

    @Override
    public int getMiningLevel() {
        return 2;
    }

    @Override
    public int getEnchantability() {
        return 22;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(ItemRegistry.CRYSTAL);
    }
}
