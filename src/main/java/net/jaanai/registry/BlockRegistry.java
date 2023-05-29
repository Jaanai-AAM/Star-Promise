package net.jaanai.registry;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.jaanai.StarPromise;
import net.jaanai.content.block.EvilSmithingTable;
import net.jaanai.content.block.EvilSmithingTableEntity;
import net.jaanai.content.block.Ore;
import net.minecraft.block.*;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class BlockRegistry {
    public static final Block CORNUCOPIA_GRASS_BLOCK = new GrassBlock(FabricBlockSettings.of(Material.SOLID_ORGANIC).ticksRandomly().strength(0.6F).sounds(BlockSoundGroup.GRASS));
    public static final BlockItem CORNUCOPIA_GRASS_BLOCK_ITEM = new BlockItem(CORNUCOPIA_GRASS_BLOCK, new FabricItemSettings().group(ItemGroupRegistry.STAR_PROMISE));
    public static final Block CORNUCOPIA_FOREST_LOG = new PillarBlock(FabricBlockSettings.of(Material.WOOD).strength(2.0F).sounds(BlockSoundGroup.WOOD));
    public static final BlockItem CORNUCOPIA_FOREST_LOG_ITEM = new BlockItem(CORNUCOPIA_FOREST_LOG, new FabricItemSettings().group(ItemGroupRegistry.STAR_PROMISE));
    public static final Block CORNUCOPIA_FOREST_PLANKS = new Block(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final BlockItem CORNUCOPIA_FOREST_PLANKS_ITEM = new BlockItem(CORNUCOPIA_FOREST_PLANKS, new FabricItemSettings().group(ItemGroupRegistry.STAR_PROMISE));
    public static final Block PROVIDENCE_ORE = new OreBlock(FabricBlockSettings.of(Material.STONE).requiresTool().strength(50.0F, 1200.0F));
    public static final BlockItem PROVIDENCE_ORE_ITEM = new BlockItem(PROVIDENCE_ORE, new FabricItemSettings().group(ItemGroupRegistry.STAR_PROMISE).fireproof());
    public static final Block CRYSTAL_ORE = new Ore(FabricBlockSettings.of(Material.STONE).requiresTool().strength(3.0F, 3.0F));
    public static final BlockItem CRYSTAL_ORE_ITEM = new BlockItem(CRYSTAL_ORE, new FabricItemSettings().group(ItemGroupRegistry.STAR_PROMISE));
    public static final Block DUSTY_EVIL_SMITHING_TABLE = new EvilSmithingTable(FabricBlockSettings.of(Material.WOOD).strength(-1.0F, 3600000.0F).dropsNothing().sounds(BlockSoundGroup.WOOD));
    public static final BlockItem DUSTY_EVIL_SMITHING_TABLE_ITEM = new BlockItem(DUSTY_EVIL_SMITHING_TABLE, new FabricItemSettings().group(ItemGroupRegistry.STAR_PROMISE));
    public static final Block EVIL_SMITHING_TABLE = new EvilSmithingTable(FabricBlockSettings.of(Material.WOOD).strength(2.5F).sounds(BlockSoundGroup.WOOD));
    public static final BlockItem EVIL_SMITHING_TABLE_ITEM = new BlockItem(EVIL_SMITHING_TABLE, new FabricItemSettings().group(ItemGroupRegistry.STAR_PROMISE));
    public static final BlockEntityType<EvilSmithingTableEntity> EVIL_SMITHING_TABLE_ENTITY = BlockEntityType.Builder.create(EvilSmithingTableEntity::new, DUSTY_EVIL_SMITHING_TABLE, EVIL_SMITHING_TABLE).build(null);
    public static final Identifier CRAFTING = new Identifier(StarPromise.MOD_ID, "crafting");

    public static void register() {
        Registry.register(Registry.BLOCK, new Identifier(StarPromise.MOD_ID, "cornucopia_grass_block"), CORNUCOPIA_GRASS_BLOCK);
        Registry.register(Registry.ITEM, new Identifier(StarPromise.MOD_ID, "cornucopia_grass_block"), CORNUCOPIA_GRASS_BLOCK_ITEM);
        Registry.register(Registry.BLOCK, new Identifier(StarPromise.MOD_ID, "cornucopia_forest_log"), CORNUCOPIA_FOREST_LOG);
        Registry.register(Registry.ITEM, new Identifier(StarPromise.MOD_ID, "cornucopia_forest_log"), CORNUCOPIA_FOREST_LOG_ITEM);
        Registry.register(Registry.BLOCK, new Identifier(StarPromise.MOD_ID, "cornucopia_forest_planks"), CORNUCOPIA_FOREST_PLANKS);
        Registry.register(Registry.ITEM, new Identifier(StarPromise.MOD_ID, "cornucopia_forest_planks"), CORNUCOPIA_FOREST_PLANKS_ITEM);
        Registry.register(Registry.BLOCK, new Identifier(StarPromise.MOD_ID, "providence_ore"), PROVIDENCE_ORE);
        Registry.register(Registry.ITEM, new Identifier(StarPromise.MOD_ID, "providence_ore"), PROVIDENCE_ORE_ITEM);
        Registry.register(Registry.BLOCK, new Identifier(StarPromise.MOD_ID, "crystal_ore"), CRYSTAL_ORE);
        Registry.register(Registry.ITEM, new Identifier(StarPromise.MOD_ID, "crystal_ore"), CRYSTAL_ORE_ITEM);
        Registry.register(Registry.BLOCK, new Identifier(StarPromise.MOD_ID, "dusty_evil_smithing_table"), DUSTY_EVIL_SMITHING_TABLE);
        Registry.register(Registry.ITEM, new Identifier(StarPromise.MOD_ID, "dusty_evil_smithing_table"), DUSTY_EVIL_SMITHING_TABLE_ITEM);
        Registry.register(Registry.BLOCK, new Identifier(StarPromise.MOD_ID, "evil_smithing_table"), EVIL_SMITHING_TABLE);
        Registry.register(Registry.ITEM, new Identifier(StarPromise.MOD_ID, "evil_smithing_table"), EVIL_SMITHING_TABLE_ITEM);
        Registry.register(Registry.BLOCK_ENTITY_TYPE, CRAFTING, EVIL_SMITHING_TABLE_ENTITY);
    }
}
