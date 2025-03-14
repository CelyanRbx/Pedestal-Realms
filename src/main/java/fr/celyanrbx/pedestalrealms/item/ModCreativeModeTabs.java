package fr.celyanrbx.pedestalrealms.item;

import fr.celyanrbx.pedestalrealms.PedestalRealms;
import fr.celyanrbx.pedestalrealms.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, PedestalRealms.MODID);

    public static final Supplier<CreativeModeTab> PEDESTAL_REALMS_TAB = CREATIVE_MODE_TAB.register("pedestal_realms_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModBlocks.PEDESTAL))
                    .title(Component.translatable("creativetab.pedestalrealms.pedestal_realms"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModBlocks.PEDESTAL.get());
                    }).build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }
}
