package com.example.factoriomod.init;

import com.example.factoriomod.FactorioMod;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.material.PushReaction;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import static com.example.factoriomod.init.CreativeTabInit.factorio_block_tab_items;

public class BlockInit {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, FactorioMod.MODID);

    public static final RegistryObject<Block> assembler_1 = BLOCKS.register("assembler_1", () ->
            new Block(BlockBehaviour.Properties.of() // can also copy by doing .copy(Blocks.blockname)
                    .mapColor(MapColor.COLOR_LIGHT_GRAY) // Color on a map
                    .strength(5, 20) // break hardness and explosion hardness
                    .lightLevel(state -> 10)
                    .requiresCorrectToolForDrops()
                    .pushReaction(PushReaction.IGNORE)
            ));

}