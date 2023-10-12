package com.example.factoriomod.init;

import com.example.factoriomod.FactorioMod;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import static com.example.factoriomod.init.CreativeTabInit.factorio_item_tab_items;

public class ItemInit {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, FactorioMod.MODID);

    public static final RegistryObject<Item> copper_cable = addAndCreate("copper_cable");
    public static final RegistryObject<Item> electronic_circuit = addAndCreate("electronic_circuit");


    public static RegistryObject<Item> addAndCreate(String s) {
        // Initializes simple item and adds to factorio_item_tab (creative tab)
        // Currently doesn't accept any fancy item properties

        RegistryObject<Item> obj = ITEMS.register(s, () -> new Item(new Item.Properties()));
        factorio_item_tab_items.add(obj);
        return obj;
    }
}