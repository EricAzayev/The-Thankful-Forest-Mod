package net.daedalians.thethankfulmod.worldgen.tree;

import net.daedalians.thethankfulmod.worldgen.ModConfiguredFeatures;
import net.minecraft.resources.ResourceKey;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.block.grower.TreeGrower;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import org.jetbrains.annotations.Nullable;
public class FallTreeGrower{
    //private final TreeGrower treeGrower = new TreeGrower();
    @Nullable
    //@Override
    protected ResourceKey<ConfiguredFeature<?, ?>> getConfiguredFeature(RandomSource pRandom, boolean pHasFlowers) {
        return ModConfiguredFeatures.FALL_KEY;
    }

}
