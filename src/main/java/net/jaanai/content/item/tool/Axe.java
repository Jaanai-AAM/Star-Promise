package net.jaanai.content.item.tool;

import net.minecraft.item.AxeItem;
import net.minecraft.item.Item;
import net.minecraft.item.ToolMaterial;

public class Axe extends AxeItem {
    public Axe(ToolMaterial material, float attackDamage, float attackSpeed, Item.Settings settings) {
        super(material, attackDamage, attackSpeed, settings);
    }
}
