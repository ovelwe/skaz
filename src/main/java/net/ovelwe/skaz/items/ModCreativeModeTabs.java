package net.ovelwe.skaz.items;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.ovelwe.skaz.Skaz;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS
            = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Skaz.MODID);

    public static final RegistryObject<CreativeModeTab> CREATIVE_MODE_TAB = CREATIVE_MODE_TABS.register("skaz_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.KSENTARIT.get()))
                    .title(Component.translatable("creativetab.skaz_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.KSENTARIT.get());
                        pOutput.accept(ModItems.GOLD_COIN.get());
                        pOutput.accept(ModItems.FLORIT.get());
                        pOutput.accept(ModItems.OKEANIT.get());
                        pOutput.accept(ModItems.VULKANIT.get());
                        pOutput.accept(ModItems.MOON_CRYSTAL.get());
                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
