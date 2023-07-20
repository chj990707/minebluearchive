package com.bunting.bluearchive.entity;

import net.minecraft.world.entity.EntityType;
import net.minecraft.world.level.Level;

public class HoshinoEntity extends AbstractStudentEntity
{
    public HoshinoEntity(EntityType<? extends HoshinoEntity> p_21683_, Level p_21684_)
    {
        super(p_21683_, p_21684_);
    }

    @Override
    public float getScale()
    {
        return 0.725F;
    }
}
