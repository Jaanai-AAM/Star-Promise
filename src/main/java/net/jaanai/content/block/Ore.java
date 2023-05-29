package net.jaanai.content.block;

import net.jaanai.registry.BlockRegistry;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.OreBlock;
import net.minecraft.util.math.MathHelper;

import java.util.Random;

public class Ore extends OreBlock {
    public Ore(AbstractBlock.Settings settings) {
        super(settings);
    }

    @Override
    protected int getExperienceWhenMined(Random random) {
        if (this == BlockRegistry.CRYSTAL_ORE) {
            return MathHelper.nextInt(random, 3, 7);
        }
        return 0;
    }
}
