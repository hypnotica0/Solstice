package net.hypnotica_.solstice.items;

import net.hypnotica_.solstice.Solstice;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeTab {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Solstice.MOD_ID);
    public static final RegistryObject<CreativeModeTab> SOLSTICE_TAB = CREATIVE_MODE_TABS.register("solstice_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.SOLARGEM.get()))
                    .title(Component.translatable("creativetab.solstice_tab"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.SOLARGEM.get());
                        output.accept(ModItems.GLASSCELL.get());
                    })
                    .build());
    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }

}
