package fr.celyanrbx.pedestalrealms.item;

import fr.celyanrbx.pedestalrealms.PedestalRealms;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(PedestalRealms.MODID);



    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
