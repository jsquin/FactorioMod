package com.example.factoriomod;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class Registration {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, FactorioMod.MODID);

    public static final RegistryObject<Item> copper_cable = ITEMS.register("copper_cable",
            () -> new Item(new Item.Properties()
            ));

    public static final RegistryObject<Item> electronic_circuit = ITEMS.register("electronic_circuit",
            () -> new Item(new Item.Properties()
            ));



    public static void init(IEventBus modEventBus) {
        // BLOCKS.register(modEventBus);
        ITEMS.register(modEventBus);
        // BLOCK_ENTITIES.register(modEventBus);
    }

    static void addCreative(BuildCreativeModeTabContentsEvent event) {
        if (event.getTabKey() == CreativeModeTabs.BUILDING_BLOCKS) {
            event.accept(copper_cable);
            event.accept(electronic_circuit);
        }
    }
}