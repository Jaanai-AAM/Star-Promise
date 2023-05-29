package net.jaanai.content.item.tool;

import net.minecraft.item.HoeItem;
import net.minecraft.item.Item;
import net.minecraft.item.ToolMaterial;

public class Hoe extends HoeItem {
    public Hoe(ToolMaterial material, int attackDamage, float attackSpeed, Item.Settings settings) {
        super(material, attackDamage, attackSpeed, settings);
    }
}
