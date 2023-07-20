package com.bunting.bluearchive.entity;

import net.minecraft.world.entity.EntityType;
import net.minecraft.world.level.Level;

public class ShirokoEntity extends AbstractStudentEntity
{
    public ShirokoEntity(EntityType<? extends ShirokoEntity> p_34271_, Level p_34272_)
    {
        super(p_34271_, p_34272_);
    }

    @Override
    public float getScale()
    {
        return 0.78F;
    }
}
