package com.bunting.bluearchive.registry;

import com.bunting.bluearchive.item.HoshinoGunItem;
import com.bunting.bluearchive.item.HoshinoShieldItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import static com.bunting.bluearchive.BlueArchive.MODID;

@Mod.EventBusSubscriber(modid = MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public final class ItemRegistry
{
    public static final DeferredRegister ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MODID);

    public static final RegistryObject<Item> HOSHINO_GUN = ITEMS.register("hoshino_gun", () -> new HoshinoGunItem(new Item.Properties().stacksTo(1).durability(0).tab(CreativeModeTab.TAB_COMBAT)));
    public static final RegistryObject<Item> HOSHINO_SHIELD = ITEMS.register("hoshino_shield", () -> new HoshinoShieldItem(new Item.Properties().durability(336).tab(CreativeModeTab.TAB_COMBAT)));

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
