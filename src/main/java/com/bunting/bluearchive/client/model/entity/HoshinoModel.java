package com.bunting.bluearchive.client.model.entity;
// Made with Blockbench 4.7.4
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


import com.bunting.bluearchive.BlueArchive;
import com.bunting.bluearchive.entity.HoshinoEntity;
import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.model.HumanoidModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.HumanoidArm;

public class HoshinoModel<T extends HoshinoEntity> extends HumanoidModel<T>
{
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation(BlueArchive.MODID, "hoshino"), "main");

	public HoshinoModel(ModelPart root) {
		super(root);
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		partdefinition.addOrReplaceChild("hat", CubeListBuilder.create().texOffs(0, 16).addBox(-0, -0, -0, 0, 0, 0, new CubeDeformation(0.0F)), PartPose.offset(0.0F,0.0F,0.0F));

		PartDefinition head = partdefinition.addOrReplaceChild("head", CubeListBuilder.create().texOffs(0, 0).addBox(-4.0F, -7.0F, -4.0F, 8.0F, 7.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition hair = head.addOrReplaceChild("hair", CubeListBuilder.create().texOffs(32, 0).addBox(-4.5F, -7.5F, -4.5F, 9.0F, 2.0F, 9.0F, new CubeDeformation(0.0F))
		.texOffs(68, 10).addBox(-3.5F, -8.5F, -3.5F, 7.0F, 1.0F, 7.0F, new CubeDeformation(0.0F))
		.texOffs(68, 0).addBox(-2.5F, -8.5F, -4.5F, 5.0F, 1.0F, 9.0F, new CubeDeformation(0.0F))
		.texOffs(68, 18).addBox(-4.5F, -8.5F, -2.5F, 9.0F, 1.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(96, 8).addBox(-3.5F, -9.5F, -2.5F, 7.0F, 1.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(96, 0).addBox(-2.5F, -9.5F, -3.5F, 5.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.25F, 0.0F));

		PartDefinition F = hair.addOrReplaceChild("F", CubeListBuilder.create(), PartPose.offset(0.0F, -6.75F, -4.5F));

		PartDefinition D_r1 = F.addOrReplaceChild("D_r1", CubeListBuilder.create().texOffs(12, 15).addBox(-1.0F, 0.0F, -0.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(8, 15).addBox(0.0F, -1.0F, -0.1F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 0.25F, -0.25F, 0.0F, 0.0F, -0.0873F));

		PartDefinition B_r1 = F.addOrReplaceChild("B_r1", CubeListBuilder.create().texOffs(4, 15).addBox(-1.0F, -1.5F, -0.2F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 15).addBox(0.0F, -0.5F, -0.2F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.25F, -0.25F, 0.0F, 0.0F, 0.0873F));

		PartDefinition L1 = hair.addOrReplaceChild("L1", CubeListBuilder.create().texOffs(32, 11).mirror().addBox(-1.75F, 0.0F, -1.25F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(3.5F, -6.5F, -3.5F, 0.0F, 0.0F, -0.0873F));

		PartDefinition B_r2 = L1.addOrReplaceChild("B_r2", CubeListBuilder.create().texOffs(32, 18).mirror().addBox(-3.0F, 0.0F, 0.0F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.25F, 3.0F, -1.25F, 0.2182F, 0.0F, 0.1745F));

		PartDefinition L2 = hair.addOrReplaceChild("L2", CubeListBuilder.create().texOffs(44, 11).mirror().addBox(-1.75F, 0.0F, -0.75F, 2.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(4.5F, -6.5F, -0.75F, 0.0F, 0.0F, -0.3927F));

		PartDefinition B_r3 = L2.addOrReplaceChild("B_r3", CubeListBuilder.create().texOffs(44, 17).mirror().addBox(0.0F, 0.0F, -0.75F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.75F, 3.0F, 0.0F, 0.0F, 0.0F, -0.3491F));

		PartDefinition L3 = hair.addOrReplaceChild("L3", CubeListBuilder.create().texOffs(54, 11).mirror().addBox(0.25F, 0.0F, -1.75F, 1.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(3.5F, -6.5F, 3.5F, 0.0436F, 0.0F, -0.0873F));

		PartDefinition L3B = L3.addOrReplaceChild("L3B", CubeListBuilder.create().texOffs(54, 20).mirror().addBox(-1.0F, 0.0F, 0.0F, 1.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.25F, 6.0F, -1.75F, 0.0873F, 0.0F, -0.0873F));

		PartDefinition L3C = L3B.addOrReplaceChild("L3C", CubeListBuilder.create().texOffs(54, 29).mirror().addBox(-1.0F, 0.0F, 0.0F, 1.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 6.0F, 0.0F, 0.0873F, 0.0F, -0.0873F));

		PartDefinition R1 = hair.addOrReplaceChild("R1", CubeListBuilder.create().texOffs(32, 11).addBox(-1.25F, 0.0F, -1.25F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.5F, -6.5F, -3.5F, 0.0F, 0.0F, 0.0873F));

		PartDefinition B_r4 = R1.addOrReplaceChild("B_r4", CubeListBuilder.create().texOffs(32, 18).addBox(0.0F, 0.0F, 0.0F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.25F, 3.0F, -1.25F, 0.2182F, 0.0F, -0.1745F));

		PartDefinition R2 = hair.addOrReplaceChild("R2", CubeListBuilder.create().texOffs(44, 11).addBox(-0.25F, 0.0F, -0.75F, 2.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.5F, -6.5F, -0.75F, 0.0F, 0.0F, 0.3927F));

		PartDefinition B_r5 = R2.addOrReplaceChild("B_r5", CubeListBuilder.create().texOffs(44, 17).addBox(-2.0F, 0.0F, -0.75F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.75F, 3.0F, 0.0F, 0.0F, 0.0F, 0.3491F));

		PartDefinition R3 = hair.addOrReplaceChild("R3", CubeListBuilder.create().texOffs(54, 11).addBox(-1.25F, 0.0F, -1.75F, 1.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.5F, -6.5F, 3.5F, 0.0436F, 0.0F, 0.0873F));

		PartDefinition R3B = R3.addOrReplaceChild("R3B", CubeListBuilder.create().texOffs(54, 20).addBox(0.0F, 0.0F, 0.0F, 1.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.25F, 6.0F, -1.75F, 0.0873F, 0.0F, 0.0873F));

		PartDefinition R3C = R3B.addOrReplaceChild("R3C", CubeListBuilder.create().texOffs(54, 29).addBox(0.0F, 0.0F, 0.0F, 1.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 6.0F, 0.0F, 0.0873F, 0.0F, 0.0873F));

		PartDefinition B1 = hair.addOrReplaceChild("B1", CubeListBuilder.create().texOffs(62, 24).addBox(-2.25F, 0.0F, 0.25F, 3.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.5F, -6.5F, 3.5F, 0.0873F, 0.0F, 0.0436F));

		PartDefinition B1B = B1.addOrReplaceChild("B1B", CubeListBuilder.create().texOffs(62, 31).addBox(-3.0F, 0.0F, -1.0F, 3.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.75F, 6.0F, 1.25F, 0.0873F, 0.0F, 0.0436F));

		PartDefinition B1C = B1B.addOrReplaceChild("B1C", CubeListBuilder.create().texOffs(62, 38).addBox(-3.0F, 0.0F, -1.0F, 3.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 6.0F, 0.0F, 0.0873F, 0.0F, 0.0436F));

		PartDefinition B2 = hair.addOrReplaceChild("B2", CubeListBuilder.create().texOffs(70, 24).addBox(-2.0F, 0.0F, 0.35F, 4.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -6.5F, 3.5F, 0.1309F, 0.0F, 0.0F));

		PartDefinition B2B = B2.addOrReplaceChild("B2B", CubeListBuilder.create().texOffs(70, 31).addBox(-2.0F, 0.0F, -1.0F, 4.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 6.0F, 1.35F, 0.0873F, 0.0F, 0.0F));

		PartDefinition B2C = B2B.addOrReplaceChild("B2C", CubeListBuilder.create().texOffs(70, 38).addBox(-2.0F, 0.0F, -1.0F, 4.0F, 10.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 6.0F, 0.0F, 0.0873F, 0.0F, 0.0F));

		PartDefinition B3 = hair.addOrReplaceChild("B3", CubeListBuilder.create().texOffs(62, 24).mirror().addBox(-0.75F, 0.0F, 0.25F, 3.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(2.5F, -6.5F, 3.5F, 0.0873F, 0.0F, -0.0436F));

		PartDefinition B3B = B3.addOrReplaceChild("B3B", CubeListBuilder.create().texOffs(62, 31).mirror().addBox(0.0F, 0.0F, -1.0F, 3.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.75F, 6.0F, 1.25F, 0.0873F, 0.0F, -0.0436F));

		PartDefinition B3C = B3B.addOrReplaceChild("B3C", CubeListBuilder.create().texOffs(62, 38).mirror().addBox(0.0F, 0.0F, -1.0F, 3.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 6.0F, 0.0F, 0.0873F, 0.0F, -0.0436F));

		PartDefinition A = hair.addOrReplaceChild("A", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -9.5F, 0.0F, 0.0F, 0.7854F, 0.0F));

		PartDefinition A_r1 = A.addOrReplaceChild("A_r1", CubeListBuilder.create().texOffs(0, 21).addBox(0.0F, -4.0F, -1.0F, 4.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.2618F));

		PartDefinition halo = head.addOrReplaceChild("halo", CubeListBuilder.create().texOffs(-10, 39).addBox(-5.0F, -7.5F, -4.5F, 10.0F, 0.0F, 10.0F, new CubeDeformation(0.0F))
		.texOffs(-10, 49).addBox(-5.0F, -8.0F, -4.5F, 10.0F, 0.0F, 10.0F, new CubeDeformation(0.0F))
		.texOffs(-10, 59).addBox(-8.0F, -8.5F, -4.5F, 16.0F, 0.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -5.5F, 0.0F, -1.1781F, 0.0F, 0.0F));

		PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create().texOffs(0, 69).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition skirt = body.addOrReplaceChild("skirt", CubeListBuilder.create(), PartPose.offset(0.0F, 10.0F, 0.0F));

		PartDefinition BR_r1 = skirt.addOrReplaceChild("BR_r1", CubeListBuilder.create().texOffs(56, 69).addBox(-1.0F, 0.0F, -2.0F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.0F, 1.0F, 2.0F, 0.3927F, -0.7854F, 0.0F));

		PartDefinition BL_r1 = skirt.addOrReplaceChild("BL_r1", CubeListBuilder.create().texOffs(56, 69).mirror().addBox(-1.0F, 0.0F, -2.0F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(4.0F, 1.0F, 2.0F, 0.3927F, 0.7854F, 0.0F));

		PartDefinition FR_r1 = skirt.addOrReplaceChild("FR_r1", CubeListBuilder.create().texOffs(56, 69).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.0F, 1.0F, -2.0F, -0.3927F, 0.7854F, 0.0F));

		PartDefinition FL_r1 = skirt.addOrReplaceChild("FL_r1", CubeListBuilder.create().texOffs(56, 69).mirror().addBox(-1.0F, 0.0F, 0.0F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(4.0F, 1.0F, -2.0F, -0.3927F, -0.7854F, 0.0F));

		PartDefinition R_r1 = skirt.addOrReplaceChild("R_r1", CubeListBuilder.create().texOffs(44, 80).mirror().addBox(0.0F, 0.0F, -2.0F, 2.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.3927F));

		PartDefinition L_r1 = skirt.addOrReplaceChild("L_r1", CubeListBuilder.create().texOffs(44, 69).addBox(-2.0F, 0.0F, -2.0F, 2.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.0F, -1.0F, 0.0F, 0.0F, 0.0F, -0.3927F));

		PartDefinition B_r6 = skirt.addOrReplaceChild("B_r6", CubeListBuilder.create().texOffs(24, 78).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0F, 2.0F, 0.3927F, 0.0F, 0.0F));

		PartDefinition F_r1 = skirt.addOrReplaceChild("F_r1", CubeListBuilder.create().texOffs(24, 69).addBox(-4.0F, 0.0F, 0.0F, 8.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0F, -2.0F, -0.3927F, 0.0F, 0.0F));

		PartDefinition Arm_L = partdefinition.addOrReplaceChild("left_arm", CubeListBuilder.create().texOffs(14, 108).mirror().addBox(-1.0F, -2.0F, -2.0F, 3.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(5.0F, 2.0F, 0.0F));

		PartDefinition Arm_L_lower = Arm_L.addOrReplaceChild("Arm_L_lower", CubeListBuilder.create().texOffs(14, 118).mirror().addBox(-1.5F, 0.0F, -3.0F, 3.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.5F, 4.0F, 1.0F));

		PartDefinition Arm_R = partdefinition.addOrReplaceChild("right_arm", CubeListBuilder.create().texOffs(0, 108).addBox(-2.0F, -2.0F, -2.0F, 3.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(-5.0F, 2.0F, 0.0F));

		PartDefinition Arm_R_lower = Arm_R.addOrReplaceChild("Arm_R_lower", CubeListBuilder.create().texOffs(0, 118).addBox(-1.5F, 0.0F, -3.0F, 3.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(-0.5F, 4.0F, 1.0F));

		PartDefinition Leg_L = partdefinition.addOrReplaceChild("left_leg", CubeListBuilder.create().texOffs(16, 88).mirror().addBox(-1.9F, 0.0F, -2.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(1.9F, 12.0F, 0.0F));

		PartDefinition Leg_L_lower = Leg_L.addOrReplaceChild("Leg_L_lower", CubeListBuilder.create().texOffs(16, 98).mirror().addBox(-2.0F, 0.0F, -1.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.1F, 6.0F, -1.0F));

		PartDefinition Leg_R = partdefinition.addOrReplaceChild("right_leg", CubeListBuilder.create().texOffs(0, 88).addBox(-2.1F, 0.0F, -2.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(-1.9F, 12.0F, 0.0F));

		PartDefinition Leg_R_lower = Leg_R.addOrReplaceChild("Leg_R_lower", CubeListBuilder.create().texOffs(0, 98).addBox(-2.0F, 0.0F, -1.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(-0.1F, 6.0F, -1.0F));

		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	public void translateToHand(HumanoidArm p_103392_, PoseStack p_103393_) {
		ModelPart modelpart = this.getArm(p_103392_);
		float f = 0.5F * (float)(p_103392_ == HumanoidArm.RIGHT ? 1 : -1);
		modelpart.x += f;
		modelpart.translateAndRotate(p_103393_);
		modelpart.x -= f;

	}
}