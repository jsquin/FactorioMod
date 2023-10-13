package com.example.factoriomod.init;

import com.example.factoriomod.FactorioMod;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import static com.example.factoriomod.init.CreativeTabInit.factorio_block_tab_items;
import static com.example.factoriomod.init.CreativeTabInit.factorio_item_tab_items;

public class ItemInit {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, FactorioMod.MODID);

    // Why can I not just write addAndCreate("item"); -> throws an error for some reason
    // ITEMS
    public static final RegistryObject<Item> copper_cable = addAndCreate("copper_cable");
    public static final RegistryObject<Item> electronic_circuit = addAndCreate("electronic_circuit");
    public static final RegistryObject<Item> iron_gear = addAndCreate("iron_gear");

    // BLOCK ITEMS
    public static final  RegistryObject<BlockItem> assembler_1_item = addAndCreate("assembler_1", BlockInit.assembler_1);


    public static RegistryObject<Item> addAndCreate(String s) {
        // Initializes simple item and adds to factorio_item_tab (creative tab)
        // Currently doesn't accept any fancy item properties

        RegistryObject<Item> obj = ITEMS.register(s, () -> new Item(new Item.Properties()));
        factorio_item_tab_items.add(obj);
        return obj;
    }

    public static RegistryObject<BlockItem> addAndCreate(String s, RegistryObject<Block> blockobj) {
        RegistryObject<BlockItem> obj = ITEMS.register(s, () -> new BlockItem(blockobj.get(), new Item.Properties()));
        factorio_block_tab_items.add(obj);
        return obj;
    }
}