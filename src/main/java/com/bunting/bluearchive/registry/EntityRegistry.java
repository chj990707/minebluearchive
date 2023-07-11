package com.bunting.bluearchive.registry;

import com.bunting.bluearchive.entity.HoshinoEntity;
import com.bunting.bluearchive.entity.ShirokoEntity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import static com.bunting.bluearchive.BlueArchive.MODID;

public class EntityRegistry
{
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES =
            DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, MODID);

    public static final RegistryObject<EntityType<HoshinoEntity>> HOSHINO =
            ENTITY_TYPES.register("hoshino",
                    () -> EntityType.Builder.of(HoshinoEntity::new, MobCategory.CREATURE)
                            .sized(0.6F, 2.0F)
                            .build(new ResourceLocation(MODID,"hoshino").toString()));
    public static final RegistryObject<EntityType<ShirokoEntity>> SHIROKO =
            ENTITY_TYPES.register("shiroko",
                    () -> EntityType.Builder.of(ShirokoEntity::new, MobCategory.CREATURE)
                            .sized(0.6F, 2.0F)
                            .build(new ResourceLocation(MODID,"shiroko").toString()));

    public static void register(IEventBus eventBus){
        ENTITY_TYPES.register(eventBus);
    }
}
