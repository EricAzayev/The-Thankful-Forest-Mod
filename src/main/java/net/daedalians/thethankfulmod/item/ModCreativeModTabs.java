package net.daedalians.thethankfulmod.item;

import net.daedalians.thethankfulmod.TheThankfulMod;
import net.daedalians.thethankfulmod.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModTabs {

    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, TheThankfulMod.MOD_ID);

    public static final RegistryObject<CreativeModeTab> THE_THANKFUL_MOD_TAB = CREATIVE_MODE_TABS.register("autumn_tab", //name of tab
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.FALL_SAPLING.get())) //set icon to Sapling
                    .title(Component.translatable("creativetab.autumn_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.FALL_SAPLING.get());
                        pOutput.accept(ModBlocks.FALL_LEAVES.get());
                        //pOutput.accept(ModItems.SAPPHIRE.get());
                    })
                    .build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }

}