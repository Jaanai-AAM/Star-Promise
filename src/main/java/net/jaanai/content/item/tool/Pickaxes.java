package net.jaanai.content.item.tool;

import net.minecraft.item.Item;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ToolMaterial;

public class Pickaxes extends PickaxeItem {
    public Pickaxes(ToolMaterial material, int attackDamage, float attackSpeed, Item.Settings settings) {
        super(material, attackDamage, attackSpeed, settings);
    }
}
