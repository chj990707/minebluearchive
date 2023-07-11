package com.bunting.bluearchive.event;

import com.bunting.bluearchive.BlueArchive;
import com.bunting.bluearchive.entity.HoshinoEntity;
import com.bunting.bluearchive.entity.ShirokoEntity;
import com.bunting.bluearchive.registry.EntityRegistry;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

public class ModEvents
{
    @Mod.EventBusSubscriber(modid = BlueArchive.MODID)
    public static class forgeEvents{

    }

    @Mod.EventBusSubscriber(modid = BlueArchive.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class ModEventBusEvents {
        @SubscribeEvent
        public static void entityAttributeEvent(EntityAttributeCreationEvent event){
            event.put(EntityRegistry.HOSHINO.get(), HoshinoEntity.createAttributes().build());
            event.put(EntityRegistry.SHIROKO.get(), ShirokoEntity.createAttributes().build());
        }

    }
}
