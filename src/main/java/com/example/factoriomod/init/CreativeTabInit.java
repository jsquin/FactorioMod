package com.example.factoriomod.init;

import com.example.factoriomod.FactorioMod;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.ItemLike;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.minecraft.world.item.CreativeModeTab;

import java.awt.event.ItemListener;
import java.util.List;
import java.util.ArrayList;
import java.util.function.Supplier;

public class CreativeTabInit {
    public static final DeferredRegister<CreativeModeTab> TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, FactorioMod.MODID);

    public static final List<Supplier<? extends ItemLike>> factorio_item_tab_items = new ArrayList<>();

    public static final RegistryObject<CreativeModeTab> TAB = TABS.register("factorio_item_tab",
            () -> CreativeModeTab.builder()
                    .title(Component.literal("Factorio Items"))
                    .icon(ItemInit.copper_cable.get()::getDefaultInstance)
                    .displayItems((displayParams, output) ->
                        factorio_item_tab_items.forEach(itemLike -> output.accept(itemLike.get())))
                    .build()
    );

}
