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
                stacks.add(new ItemStack(BlockRegistry.CORNUCOPIA_GRASS_BLOCK));
                stacks.add(new ItemStack(BlockRegistry.CORNUCOPIA_FOREST_LOG));
                stacks.add(new ItemStack(BlockRegistry.CORNUCOPIA_FOREST_PLANKS));
                stacks.add(new ItemStack(BlockRegistry.PROVIDENCE_ORE));
                stacks.add(new ItemStack(BlockRegistry.CRYSTAL_ORE));
                stacks.add(new ItemStack(BlockRegistry.DUSTY_EVIL_SMITHING_TABLE));
                stacks.add(new ItemStack(BlockRegistry.EVIL_SMITHING_TABLE));
                stacks.add(new ItemStack(ItemRegistry.UNKNOWN));
                stacks.add(new ItemStack(ItemRegistry.APOCALYPSE));
                stacks.add(new ItemStack(ItemRegistry.RISAY_GOLD_COIN));
                stacks.add(new ItemStack(ItemRegistry.RISAY_SILVER_COIN));
                stacks.add(new ItemStack(ItemRegistry.RISAY_COPPER_COIN));
                stacks.add(new ItemStack(ItemRegistry.UNWROUGHT_PROVIDENCE_STEEL));
                stacks.add(new ItemStack(ItemRegistry.EVIL_PROVIDENCE_STEEL));
                stacks.add(new ItemStack(ItemRegistry.CORNUCOPIA_PROVIDENCE_STEEL));
                stacks.add(new ItemStack(ItemRegistry.BROKEN_CRYSTAL_STALWART_SWORD));
                stacks.add(new ItemStack(ItemRegistry.CRYSTAL_CORE_GEM));
                stacks.add(new ItemStack(ToolRegistry.AMETHYST_SWORD));
                stacks.add(new ItemStack(ToolRegistry.CERES));
                stacks.add(new ItemStack(ToolRegistry.ARES));
                stacks.add(new ItemStack(ToolRegistry.CERES_DAGGER));
                stacks.add(new ItemStack(ToolRegistry.EVIL_DAGGER));
                stacks.add(new ItemStack(ToolRegistry.DEACTIVATED_CRYSTAL_STALWART_SWORD));
                stacks.add(new ItemStack(ToolRegistry.CRYSTAL_STALWART_SWORD));
                stacks.add(new ItemStack(ToolRegistry.CRYSTAL_SWORD));
                stacks.add(new ItemStack(ToolRegistry.CRYSTAL_SHOVEL));
                stacks.add(new ItemStack(ToolRegistry.CRYSTAL_PICKAXE));
                stacks.add(new ItemStack(ToolRegistry.CRYSTAL_AXE));
                stacks.add(new ItemStack(ToolRegistry.CRYSTAL_HOE));
                stacks.add(new ItemStack(ArmorRegistry.SOLID_GOLD_CHESTPLATE));
                stacks.add(new ItemStack(ArmorRegistry.CORNUCOPIA_HELMET));
                stacks.add(new ItemStack(ArmorRegistry.CORNUCOPIA_CHESTPLATE));
                stacks.add(new ItemStack(ArmorRegistry.CORNUCOPIA_LEGGINGS));
                stacks.add(new ItemStack(ArmorRegistry.CORNUCOPIA_BOOTS));
            }).build();
}
