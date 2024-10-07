package net.hypnotica_.solstice.items;

import net.hypnotica_.solstice.Solstice;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> items =
            DeferredRegister.create(ForgeRegistries.ITEMS, Solstice.MOD_ID);
    public static final RegistryObject<Item> SOLARGEM = items.register("solar_gem",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> GLASSCELL = items.register("glass_cell",
            () -> new Item(new Item.Properties()));
    public static void register(IEventBus eventBus) {
        items.register(eventBus);
    }
}
