package net.jaanai.registry;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.jaanai.StarPromise;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class ItemGroupRegistry {
    public static final ItemGroup STAR_PROMISE = FabricItemGroupBuilder.create(
                    new Identifier(StarPromise.MOD_ID, "star_promise"))
            .icon(() -> new ItemStack(ToolRegistry.CERES))
            .appendItems(stacks -> {
                stacks.add(new ItemStack(ItemRegistry.APOCALYPSE));
                stacks.add(new ItemStack(ItemRegistry.UNWROUGHT_PROVIDENCE_STEEL));
                stacks.add(new ItemStack(ItemRegistry.EVIL_PROVIDENCE_STEEL));
                stacks.add(new ItemStack(ItemRegistry.CORNUCOPIA_PROVIDENCE_STEEL));
                stacks.add(new ItemStack(ToolRegistry.CERES));
                stacks.add(new ItemStack(ToolRegistry.ARES));
                stacks.add(new ItemStack(ArmorRegistry.CORNUCOPIA_HELMET));
                stacks.add(new ItemStack(ArmorRegistry.CORNUCOPIA_CHESTPLATE));
                stacks.add(new ItemStack(ArmorRegistry.CORNUCOPIA_LEGGINGS));
                stacks.add(new ItemStack(ArmorRegistry.CORNUCOPIA_BOOTS));
            }).build();
}
