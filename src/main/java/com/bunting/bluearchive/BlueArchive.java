package com.bunting.bluearchive;

import com.bunting.bluearchive.client.model.entity.HoshinoModel;
import com.bunting.bluearchive.client.model.entity.ShirokoModel;
import com.bunting.bluearchive.client.renderer.HoshinoRenderer;
import com.bunting.bluearchive.client.renderer.ShirokoRenderer;
import com.bunting.bluearchive.registry.EntityRegistry;
import com.bunting.bluearchive.registry.ItemRegistry;
import net.minecraft.client.renderer.entity.EntityRenderers;
import net.minecraft.client.renderer.item.ItemProperties;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(BlueArchive.MODID)
public class BlueArchive
{
    // Define mod id in a common place for everything to reference
    public static final String MODID = "bluearchive";

    public BlueArchive()
    {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ItemRegistry.register(modEventBus);
        EntityRegistry.register(modEventBus);

        modEventBus.addListener(this::commonSetup);

        MinecraftForge.EVENT_BUS.register(this);
    }

    private void commonSetup(final FMLCommonSetupEvent event)
    {

    }

    // You can use SubscribeEvent and let the Event Bus discover methods to call
    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event)
    {
    }

    // You can use EventBusSubscriber to automatically register all static methods in the class annotated with @SubscribeEvent
    @Mod.EventBusSubscriber(modid = MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents
    {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event)
        {
            EntityRenderers.register(EntityRegistry.HOSHINO.get(), HoshinoRenderer::new);
            EntityRenderers.register(EntityRegistry.SHIROKO.get(), ShirokoRenderer::new);
            ItemProperties.register(ItemRegistry.HOSHINO_SHIELD.get(), new ResourceLocation("blocking"), (p_174590_, p_174591_, p_174592_, p_174593_) -> {
                        return p_174592_ != null && p_174592_.isUsingItem() && p_174592_.getUseItem() == p_174590_ ? 1.0F : 0.0F;
                    });
        }

        @SubscribeEvent
        public static void onClientLayersSetup(EntityRenderersEvent.RegisterLayerDefinitions event){
            event.registerLayerDefinition(HoshinoModel.LAYER_LOCATION, HoshinoModel::createBodyLayer);
            event.registerLayerDefinition(ShirokoModel.LAYER_LOCATION, ShirokoModel::createBodyLayer);
        }
    }
}
