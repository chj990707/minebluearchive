package com.bunting.bluearchive.client.renderer;

import com.bunting.bluearchive.BlueArchive;
import com.bunting.bluearchive.client.model.entity.HoshinoModel;
import com.bunting.bluearchive.entity.HoshinoEntity;
import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.HumanoidMobRenderer;
import net.minecraft.resources.ResourceLocation;

public class HoshinoRenderer extends HumanoidMobRenderer<HoshinoEntity, HoshinoModel<HoshinoEntity>>
{
    public static final ResourceLocation HOSHINO_LOCATION = new ResourceLocation(BlueArchive.MODID, "textures/entity/hoshino/hoshino.png");

    public HoshinoRenderer(EntityRendererProvider.Context p_173992_) {
        super(p_173992_, new HoshinoModel<>(p_173992_.bakeLayer(HoshinoModel.LAYER_LOCATION)), 0.5F);
    }

    @Override
    public ResourceLocation getTextureLocation(HoshinoEntity p_114482_)
    {
        return HOSHINO_LOCATION;
    }

    @Override
    public void render(HoshinoEntity p_115455_, float p_115456_, float p_115457_, PoseStack p_115458_, MultiBufferSource p_115459_, int p_115460_)
    {
        float scale = p_115455_.getScale();
        p_115458_.pushPose();
        if(!p_115455_.isBaby()) p_115458_.scale(scale, scale, scale);
        super.render(p_115455_, p_115456_, p_115457_, p_115458_, p_115459_, p_115460_);
        p_115458_.popPose();
    }
}
