package net.jaanai.registry;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.jaanai.StarPromise;
import net.jaanai.content.block.Ores;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class BlockRegistry {
    public static final Block CORNUCOPIA_GRASS_BLOCK = new GrassBlock(FabricBlockSettings
            .of(Material.SOLID_ORGANIC).ticksRandomly().strength(0.6F).sounds(BlockSoundGroup.GRASS));
    public static final Block CORNUCOPIA_FOREST_LOG = new PillarBlock(FabricBlockSettings
            .of(Material.WOOD).strength(2.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block CORNUCOPIA_FOREST_PLANKS = new Block(FabricBlockSettings
            .of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block PROVIDENCE_ORE = new OreBlock(FabricBlockSettings
            .of(Material.STONE).requiresTool().strength(50.0F, 1200.0F));
    public static final Block CRYSTAL_ORE = new Ores(FabricBlockSettings
            .of(Material.STONE).requiresTool().strength(3.0F, 3.0F));

    public static void register() {
        Registry.register(Registry.BLOCK, new Identifier(StarPromise.MOD_ID, "cornucopia_grass_block"),
                CORNUCOPIA_GRASS_BLOCK);
        Registry.register(Registry.ITEM, new Identifier(StarPromise.MOD_ID, "cornucopia_grass_block"),
                new BlockItem(CORNUCOPIA_GRASS_BLOCK, new FabricItemSettings().group(ItemGroupRegistry.STAR_PROMISE)));
        Registry.register(Registry.BLOCK, new Identifier(StarPromise.MOD_ID, "cornucopia_forest_log"),
                CORNUCOPIA_FOREST_LOG);
        Registry.register(Registry.ITEM, new Identifier(StarPromise.MOD_ID, "cornucopia_forest_log"),
                new BlockItem(CORNUCOPIA_FOREST_LOG, new FabricItemSettings().group(ItemGroupRegistry.STAR_PROMISE)));
        Registry.register(Registry.BLOCK, new Identifier(StarPromise.MOD_ID, "cornucopia_forest_planks"),
                CORNUCOPIA_FOREST_PLANKS);
        Registry.register(Registry.ITEM, new Identifier(StarPromise.MOD_ID, "cornucopia_forest_planks"),
                new BlockItem(CORNUCOPIA_FOREST_PLANKS, new FabricItemSettings()
                        .group(ItemGroupRegistry.STAR_PROMISE)));
        Registry.register(Registry.BLOCK, new Identifier(StarPromise.MOD_ID, "providence_ore"), PROVIDENCE_ORE);
        Registry.register(Registry.ITEM, new Identifier(StarPromise.MOD_ID, "providence_ore"),
                new BlockItem(PROVIDENCE_ORE, new FabricItemSettings().group(ItemGroupRegistry.STAR_PROMISE)
                        .fireproof()));
        Registry.register(Registry.BLOCK, new Identifier(StarPromise.MOD_ID, "crystal_ore"), CRYSTAL_ORE);
        Registry.register(Registry.ITEM, new Identifier(StarPromise.MOD_ID, "crystal_ore"),
                new BlockItem(CRYSTAL_ORE, new FabricItemSettings().group(ItemGroupRegistry.STAR_PROMISE)));
    }
}
