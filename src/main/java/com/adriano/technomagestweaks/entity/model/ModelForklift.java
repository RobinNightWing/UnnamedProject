package com.adriano.technomagestweaks.entity.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

//Made with Blockbench 3.5.2
//Exported for Minecraft version 1.12
//Paste this class into your mod and generate all required imports



public class ModelForklift extends ModelBase {
	private final ModelRenderer wheel;
	private final ModelRenderer diagonalright;
	private final ModelRenderer diagonalleft;
	private final ModelRenderer wheel2;
	private final ModelRenderer diagonalright2;
	private final ModelRenderer diagonalleft2;
	private final ModelRenderer wheel3;
	private final ModelRenderer diag2;
	private final ModelRenderer diag1;
	private final ModelRenderer wheel4;
	private final ModelRenderer diag3;
	private final ModelRenderer diag4;
	private final ModelRenderer body;
	private final ModelRenderer wheelcovers;
	private final ModelRenderer horwheelcovers;
	private final ModelRenderer diagnolwheelcovers;
	private final ModelRenderer greyparts;
	private final ModelRenderer bone;
	private final ModelRenderer diagcov;
	private final ModelRenderer chair;
	private final ModelRenderer bone2;
	private final ModelRenderer roof;
	private final ModelRenderer bone3;
	private final ModelRenderer bone4;
	private final ModelRenderer steeringwheel;
	private final ModelRenderer wheelitself;
	private final ModelRenderer diag5;
	private final ModelRenderer diag6;
	private final ModelRenderer wheeldiag2;
	private final ModelRenderer wheeldiag;
	private final ModelRenderer forklift;
	private final ModelRenderer reinforcement;
	private final ModelRenderer reinforcement2;

	public ModelForklift() {
		textureWidth = 256;
		textureHeight = 256;

		wheel = new ModelRenderer(this);
		wheel.setRotationPoint(-9.0F, 25.0F, -6.0F);
		wheel.cubeList.add(new ModelBox(wheel, 0, 9, -1.0F, -2.8787F, -10.1213F, 2, 2, 3, 0.0F, false));
		wheel.cubeList.add(new ModelBox(wheel, 0, 9, -1.0F, -8.1213F, -10.1213F, 2, 2, 3, 0.0F, false));
		wheel.cubeList.add(new ModelBox(wheel, 0, 0, -0.25F, -6.1213F, -11.1213F, 1, 4, 5, 0.0F, false));
		wheel.cubeList.add(new ModelBox(wheel, 0, 9, -1.0F, -6.0F, -7.0F, 2, 3, 2, 0.0F, false));
		wheel.cubeList.add(new ModelBox(wheel, 0, 9, -1.0F, -6.0F, -12.2426F, 2, 3, 2, 0.0F, false));

		diagonalright = new ModelRenderer(this);
		diagonalright.setRotationPoint(-0.5F, -1.5F, 1.5F);
		wheel.addChild(diagonalright);
		setRotationAngle(diagonalright, -0.7854F, 0.0F, 0.0F);
		diagonalright.cubeList.add(new ModelBox(diagonalright, 0, 9, -0.5F, 3.5356F, -7.6568F, 2, 3, 2, 0.0F, false));
		diagonalright.cubeList.add(new ModelBox(diagonalright, 0, 9, -0.5F, 3.5356F, -12.8994F, 2, 3, 2, 0.0F, false));

		diagonalleft = new ModelRenderer(this);
		diagonalleft.setRotationPoint(-0.5F, -3.5F, 4.5F);
		wheel.addChild(diagonalleft);
		setRotationAngle(diagonalleft, -0.7854F, 0.0F, 0.0F);
		diagonalleft.cubeList.add(new ModelBox(diagonalleft, 0, 9, -0.5F, 4.9498F, -11.4852F, 2, 2, 3, 0.0F, false));
		diagonalleft.cubeList.add(new ModelBox(diagonalleft, 0, 9, -0.5F, 10.1924F, -11.4852F, 2, 2, 3, 0.0F, false));

		wheel2 = new ModelRenderer(this);
		wheel2.setRotationPoint(-5.0F, 23.0F, -6.0F);
		wheel2.cubeList.add(new ModelBox(wheel2, 0, 0, 13.25F, -4.1213F, -11.1213F, 1, 4, 5, 0.0F, false));
		wheel2.cubeList.add(new ModelBox(wheel2, 0, 9, 13.0F, -0.8787F, -10.1213F, 2, 2, 3, 0.0F, false));
		wheel2.cubeList.add(new ModelBox(wheel2, 0, 9, 13.0F, -6.1213F, -10.1213F, 2, 2, 3, 0.0F, false));
		wheel2.cubeList.add(new ModelBox(wheel2, 0, 9, 13.0F, -4.0F, -7.0F, 2, 3, 2, 0.0F, false));
		wheel2.cubeList.add(new ModelBox(wheel2, 0, 9, 13.0F, -4.0F, -12.2426F, 2, 3, 2, 0.0F, false));

		diagonalright2 = new ModelRenderer(this);
		diagonalright2.setRotationPoint(-0.5F, -1.5F, 1.5F);
		wheel2.addChild(diagonalright2);
		setRotationAngle(diagonalright2, -0.7854F, 0.0F, 0.0F);
		diagonalright2.cubeList.add(new ModelBox(diagonalright2, 0, 9, 13.5F, 4.9498F, -6.2426F, 2, 3, 2, 0.0F, false));
		diagonalright2.cubeList.add(new ModelBox(diagonalright2, 0, 9, 13.5F, 4.9498F, -11.4852F, 2, 3, 2, 0.0F, false));

		diagonalleft2 = new ModelRenderer(this);
		diagonalleft2.setRotationPoint(-0.5F, -3.5F, 4.5F);
		wheel2.addChild(diagonalleft2);
		setRotationAngle(diagonalleft2, -0.7854F, 0.0F, 0.0F);
		diagonalleft2.cubeList.add(new ModelBox(diagonalleft2, 0, 9, 13.5F, 6.364F, -10.071F, 2, 2, 3, 0.0F, false));
		diagonalleft2.cubeList.add(new ModelBox(diagonalleft2, 0, 9, 13.5F, 11.6066F, -10.071F, 2, 2, 3, 0.0F, false));

		wheel3 = new ModelRenderer(this);
		wheel3.setRotationPoint(-9.0F, 24.0F, 7.0F);
		wheel3.cubeList.add(new ModelBox(wheel3, 0, 9, -1.0F, -1.0F, -3.0F, 2, 1, 2, 0.0F, false));
		wheel3.cubeList.add(new ModelBox(wheel3, 0, 9, -1.0F, -3.4142F, -4.4142F, 2, 2, 1, 0.0F, false));
		wheel3.cubeList.add(new ModelBox(wheel3, 0, 9, -1.0F, -3.4142F, -0.5858F, 2, 2, 1, 0.0F, false));
		wheel3.cubeList.add(new ModelBox(wheel3, 0, 9, -1.0F, -4.8284F, -3.0F, 2, 1, 2, 0.0F, false));
		wheel3.cubeList.add(new ModelBox(wheel3, 0, 0, -0.25F, -3.4142F, -3.5858F, 1, 2, 3, 0.0F, false));
		wheel3.cubeList.add(new ModelBox(wheel3, 0, 0, -0.25F, -3.8284F, -3.0F, 1, 3, 2, 0.0F, false));

		diag2 = new ModelRenderer(this);
		diag2.setRotationPoint(0.0F, -3.0F, 0.0F);
		wheel3.addChild(diag2);
		setRotationAngle(diag2, 0.7854F, 0.0F, 0.0F);
		diag2.cubeList.add(new ModelBox(diag2, 0, 9, -1.0F, 0.4142F, -2.8284F, 2, 1, 2, 0.0F, false));
		diag2.cubeList.add(new ModelBox(diag2, 0, 9, -1.0F, -3.4143F, -2.8284F, 2, 1, 2, 0.0F, false));

		diag1 = new ModelRenderer(this);
		diag1.setRotationPoint(0.0F, 0.0F, -3.0F);
		wheel3.addChild(diag1);
		setRotationAngle(diag1, -0.7854F, 0.0F, 0.0F);
		diag1.cubeList.add(new ModelBox(diag1, 0, 9, -1.0F, -1.0F, -1.9999F, 2, 1, 2, 0.0F, false));
		diag1.cubeList.add(new ModelBox(diag1, 0, 9, -1.0F, -4.8284F, -1.9999F, 2, 1, 2, 0.0F, false));

		wheel4 = new ModelRenderer(this);
		wheel4.setRotationPoint(9.0F, 24.0F, 7.0F);
		wheel4.cubeList.add(new ModelBox(wheel4, 0, 9, -1.0F, -1.0F, -3.0F, 2, 1, 2, 0.0F, false));
		wheel4.cubeList.add(new ModelBox(wheel4, 0, 9, -1.0F, -3.4142F, -4.4142F, 2, 2, 1, 0.0F, false));
		wheel4.cubeList.add(new ModelBox(wheel4, 0, 9, -1.0F, -3.4142F, -0.5858F, 2, 2, 1, 0.0F, false));
		wheel4.cubeList.add(new ModelBox(wheel4, 0, 0, -0.75F, -3.4142F, -3.5858F, 1, 2, 3, 0.0F, false));
		wheel4.cubeList.add(new ModelBox(wheel4, 0, 9, -1.0F, -4.8284F, -3.0F, 2, 1, 2, 0.0F, false));
		wheel4.cubeList.add(new ModelBox(wheel4, 0, 0, -0.75F, -3.8284F, -3.0F, 1, 3, 2, 0.0F, false));

		diag3 = new ModelRenderer(this);
		diag3.setRotationPoint(0.0F, -3.0F, 0.0F);
		wheel4.addChild(diag3);
		setRotationAngle(diag3, 0.7854F, 0.0F, 0.0F);
		diag3.cubeList.add(new ModelBox(diag3, 0, 9, -1.0F, 0.4142F, -2.8284F, 2, 1, 2, 0.0F, false));
		diag3.cubeList.add(new ModelBox(diag3, 0, 9, -1.0F, -3.4143F, -2.8284F, 2, 1, 2, 0.0F, false));

		diag4 = new ModelRenderer(this);
		diag4.setRotationPoint(0.0F, 0.0F, -3.0F);
		wheel4.addChild(diag4);
		setRotationAngle(diag4, -0.7854F, 0.0F, 0.0F);
		diag4.cubeList.add(new ModelBox(diag4, 0, 9, -1.0F, -1.0F, -1.9999F, 2, 1, 2, 0.0F, false));
		diag4.cubeList.add(new ModelBox(diag4, 0, 9, -1.0F, -4.8284F, -1.9999F, 2, 1, 2, 0.0F, false));

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, 24.0F, 0.0F);
		body.cubeList.add(new ModelBox(body, 0, 15, -10.0F, -6.25F, -10.75F, 20, 4, 12, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 0, 15, -6.0F, -6.5F, -16.75F, 12, 1, 18, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 0, 15, -10.0F, -9.6213F, 1.9142F, 20, 4, 6, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 0, 15, -10.0F, -11.3713F, 5.9142F, 20, 4, 2, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 0, 15, -6.0F, -8.5819F, -16.5515F, 12, 3, 1, 0.0F, false));

		wheelcovers = new ModelRenderer(this);
		wheelcovers.setRotationPoint(-7.0F, -6.0F, 8.0F);
		body.addChild(wheelcovers);
		

		horwheelcovers = new ModelRenderer(this);
		horwheelcovers.setRotationPoint(0.0F, 0.0F, 0.0F);
		wheelcovers.addChild(horwheelcovers);
		horwheelcovers.cubeList.add(new ModelBox(horwheelcovers, 0, 15, 14.0F, -2.7855F, -25.8713F, 3, 1, 5, 0.0F, false));
		horwheelcovers.cubeList.add(new ModelBox(horwheelcovers, 0, 15, 13.0F, -2.7855F, -25.8713F, 1, 3, 5, 0.0F, false));
		horwheelcovers.cubeList.add(new ModelBox(horwheelcovers, 0, 15, -3.0F, -2.7855F, -25.8713F, 3, 1, 5, 0.0F, false));
		horwheelcovers.cubeList.add(new ModelBox(horwheelcovers, 0, 15, 0.0F, -2.7855F, -25.8713F, 1, 3, 5, 0.0F, false));

		diagnolwheelcovers = new ModelRenderer(this);
		diagnolwheelcovers.setRotationPoint(1.0F, -2.5F, -9.5F);
		wheelcovers.addChild(diagnolwheelcovers);
		setRotationAngle(diagnolwheelcovers, 0.7854F, 0.0F, 0.0F);
		diagnolwheelcovers.cubeList.add(new ModelBox(diagnolwheelcovers, 0, 15, 13.0F, -8.2427F, -8.8388F, 3, 4, 1, 0.0F, false));
		diagnolwheelcovers.cubeList.add(new ModelBox(diagnolwheelcovers, 0, 15, -4.0F, -8.2427F, -8.8388F, 3, 4, 1, 0.0F, false));
		diagnolwheelcovers.cubeList.add(new ModelBox(diagnolwheelcovers, 0, 15, 12.0F, -8.2427F, -10.8388F, 1, 4, 3, 0.0F, false));
		diagnolwheelcovers.cubeList.add(new ModelBox(diagnolwheelcovers, 0, 15, -1.0F, -8.2427F, -10.8388F, 1, 4, 3, 0.0F, false));

		greyparts = new ModelRenderer(this);
		greyparts.setRotationPoint(-7.0F, -5.25F, 18.0F);
		body.addChild(greyparts);
		greyparts.cubeList.add(new ModelBox(greyparts, 0, 35, 0.0F, -0.75F, -36.0F, 14, 5, 25, 0.0F, false));
		greyparts.cubeList.add(new ModelBox(greyparts, 0, 35, -2.0F, -4.9072F, -24.5858F, 18, 5, 2, 0.0F, false));
		greyparts.cubeList.add(new ModelBox(greyparts, 0, 35, -2.0F, -8.3713F, -22.5858F, 18, 8, 12, 0.0F, false));

		bone = new ModelRenderer(this);
		bone.setRotationPoint(7.0F, -11.75F, -14.0F);
		greyparts.addChild(bone);
		setRotationAngle(bone, -0.5236F, 0.0F, 0.0F);
		bone.cubeList.add(new ModelBox(bone, 0, 35, -9.0F, 7.2189F, -5.7462F, 18, 4, 2, 0.0F, false));

		diagcov = new ModelRenderer(this);
		diagcov.setRotationPoint(0.0F, -5.5F, 9.0F);
		body.addChild(diagcov);
		setRotationAngle(diagcov, 0.7854F, 0.0F, 0.0F);
		diagcov.cubeList.add(new ModelBox(diagcov, 0, 15, -10.0F, -7.9247F, -7.0961F, 20, 4, 5, 0.0F, false));
		diagcov.cubeList.add(new ModelBox(diagcov, 0, 15, -10.0F, -6.3337F, -1.0303F, 20, 2, 3, 0.0F, false));

		chair = new ModelRenderer(this);
		chair.setRotationPoint(0.0F, 24.0F, 0.0F);
		chair.cubeList.add(new ModelBox(chair, 0, 65, -4.0F, -15.0F, -4.0F, 8, 2, 9, 0.0F, false));

		bone2 = new ModelRenderer(this);
		bone2.setRotationPoint(0.0F, -24.0F, 9.5F);
		chair.addChild(bone2);
		setRotationAngle(bone2, -0.1745F, 0.0F, 0.0F);
		bone2.cubeList.add(new ModelBox(bone2, 0, 65, -4.0F, 1.3889F, -4.8785F, 8, 9, 2, 0.0F, false));
		bone2.cubeList.add(new ModelBox(bone2, 0, 65, -3.0F, 0.3889F, -4.8785F, 6, 1, 2, 0.0F, false));

		roof = new ModelRenderer(this);
		roof.setRotationPoint(9.5F, 10.0F, 12.5F);
		roof.cubeList.add(new ModelBox(roof, 0, 78, -18.0F, -16.6213F, -6.5858F, 2, 17, 1, 0.0F, false));
		roof.cubeList.add(new ModelBox(roof, 0, 78, -19.5F, -18.6213F, -22.5858F, 20, 2, 17, 0.0F, false));
		roof.cubeList.add(new ModelBox(roof, 0, 78, -3.0F, -16.6213F, -6.5858F, 2, 17, 1, 0.0F, false));

		bone3 = new ModelRenderer(this);
		bone3.setRotationPoint(-14.5F, 0.0F, -21.5F);
		roof.addChild(bone3);
		setRotationAngle(bone3, -0.1745F, 0.0F, 0.0F);
		bone3.cubeList.add(new ModelBox(bone3, 0, 78, 12.5F, -11.3966F, -7.2498F, 2, 18, 2, 0.0F, false));
		bone3.cubeList.add(new ModelBox(bone3, 0, 78, -2.5F, -3.3532F, -6.496F, 15, 10, 1, 0.0F, false));
		bone3.cubeList.add(new ModelBox(bone3, 0, 78, -4.5F, -11.3966F, -7.2498F, 2, 18, 2, 0.0F, false));

		bone4 = new ModelRenderer(this);
		bone4.setRotationPoint(-14.5F, -18.0F, -21.5F);
		roof.addChild(bone4);
		setRotationAngle(bone4, -0.6981F, 0.0F, 0.0F);
		bone4.cubeList.add(new ModelBox(bone4, 0, 78, 12.5F, 0.544F, -0.4066F, 2, 7, 2, 0.0F, false));
		bone4.cubeList.add(new ModelBox(bone4, 0, 78, -4.5F, 0.544F, -0.4066F, 2, 7, 2, 0.0F, false));

		steeringwheel = new ModelRenderer(this);
		steeringwheel.setRotationPoint(-12.0F, 16.5F, -2.54F);
		setRotationAngle(steeringwheel, -0.4363F, 0.0F, 0.0F);
		steeringwheel.cubeList.add(new ModelBox(steeringwheel, 10, 98, 11.0F, -10.4515F, -9.9397F, 2, 17, 2, 0.0F, false));

		wheelitself = new ModelRenderer(this);
		wheelitself.setRotationPoint(-8.0F, -15.5F, -3.46F);
		steeringwheel.addChild(wheelitself);
		wheelitself.cubeList.add(new ModelBox(wheelitself, 0, 98, 18.5F, 5.3807F, -9.2506F, 3, 1, 1, 0.0F, false));
		wheelitself.cubeList.add(new ModelBox(wheelitself, 0, 98, 18.5F, 5.3807F, -3.008F, 3, 1, 1, 0.0F, false));
		wheelitself.cubeList.add(new ModelBox(wheelitself, 0, 98, 22.6213F, 5.3807F, -7.1293F, 1, 1, 3, 0.0F, false));
		wheelitself.cubeList.add(new ModelBox(wheelitself, 0, 98, 16.3787F, 5.3807F, -7.1293F, 1, 1, 3, 0.0F, false));
		wheelitself.cubeList.add(new ModelBox(wheelitself, 0, 98, 19.5F, 5.3807F, -4.6006F, 1, 1, 2, 0.0F, false));

		diag5 = new ModelRenderer(this);
		diag5.setRotationPoint(23.0F, 2.5F, -1.5F);
		wheelitself.addChild(diag5);
		setRotationAngle(diag5, 0.0F, -0.7854F, 0.0F);
		diag5.cubeList.add(new ModelBox(diag5, 0, 98, -6.5411F, 2.8807F, -4.4198F, 3, 1, 1, 0.0F, false));
		diag5.cubeList.add(new ModelBox(diag5, 0, 98, -6.5411F, 2.8807F, 1.8228F, 3, 1, 1, 0.0F, false));

		diag6 = new ModelRenderer(this);
		diag6.setRotationPoint(20.0F, 2.5F, 1.5F);
		wheelitself.addChild(diag6);
		setRotationAngle(diag6, 0.0F, 0.7854F, 0.0F);
		diag6.cubeList.add(new ModelBox(diag6, 0, 98, 3.5411F, 2.8807F, -8.6624F, 3, 1, 1, 0.0F, false));
		diag6.cubeList.add(new ModelBox(diag6, 0, 98, 3.5411F, 2.8807F, -2.4198F, 3, 1, 1, 0.0F, false));

		wheeldiag2 = new ModelRenderer(this);
		wheeldiag2.setRotationPoint(21.25F, 2.5F, 0.65F);
		wheelitself.addChild(wheeldiag2);
		setRotationAngle(wheeldiag2, 0.0F, -1.0472F, 0.0F);
		wheeldiag2.cubeList.add(new ModelBox(wheeldiag2, 0, 98, -6.7917F, 2.8807F, -5.6036F, 1, 1, 4, 0.0F, false));

		wheeldiag = new ModelRenderer(this);
		wheeldiag.setRotationPoint(18.7358F, 2.5F, 0.4214F);
		wheelitself.addChild(wheeldiag);
		setRotationAngle(wheeldiag, 0.0F, 1.0472F, 0.0F);
		wheeldiag.cubeList.add(new ModelBox(wheeldiag, 0, 98, 5.5627F, 2.8807F, -5.5003F, 1, 1, 4, 0.0F, false));

		forklift = new ModelRenderer(this);
		forklift.setRotationPoint(8.0F, 19.775F, -10.7F);
		forklift.cubeList.add(new ModelBox(forklift, 0, 121, -13.0F, -3.7855F, -8.8713F, 3, 2, 3, 0.0F, false));
		forklift.cubeList.add(new ModelBox(forklift, 0, 121, -13.0F, -28.7855F, -10.8713F, 3, 33, 2, 0.0F, false));
		forklift.cubeList.add(new ModelBox(forklift, 0, 121, -13.0F, -31.7855F, -10.8713F, 10, 3, 2, 0.0F, false));
		forklift.cubeList.add(new ModelBox(forklift, 0, 121, -17.0F, 0.2145F, -11.8713F, 18, 3, 1, 0.0F, false));
		forklift.cubeList.add(new ModelBox(forklift, 0, 121, -17.0F, -5.7855F, -11.8713F, 18, 3, 1, 0.0F, false));
		forklift.cubeList.add(new ModelBox(forklift, 0, 121, -17.0F, -2.7855F, -11.8713F, 3, 3, 1, 0.0F, false));
		forklift.cubeList.add(new ModelBox(forklift, 0, 121, -2.0F, -2.7855F, -11.8713F, 3, 3, 1, 0.0F, false));
		forklift.cubeList.add(new ModelBox(forklift, 0, 121, -6.0F, -28.7855F, -10.8713F, 3, 33, 2, 0.0F, false));
		forklift.cubeList.add(new ModelBox(forklift, 0, 121, -6.0F, -7.7855F, -12.8713F, 3, 11, 1, 0.0F, false));
		forklift.cubeList.add(new ModelBox(forklift, 0, 121, -13.0F, -7.7855F, -12.8713F, 3, 11, 1, 0.0F, false));
		forklift.cubeList.add(new ModelBox(forklift, 0, 121, -13.0F, 2.2145F, -25.8713F, 3, 1, 13, 0.0F, false));
		forklift.cubeList.add(new ModelBox(forklift, 0, 121, -6.0F, 2.2145F, -25.8713F, 3, 1, 13, 0.0F, false));
		forklift.cubeList.add(new ModelBox(forklift, 0, 121, -6.0F, -3.7855F, -8.8713F, 3, 2, 3, 0.0F, false));

		reinforcement = new ModelRenderer(this);
		reinforcement.setRotationPoint(-11.0F, -3.7855F, 0.2787F);
		forklift.addChild(reinforcement);
		setRotationAngle(reinforcement, -1.0472F, 0.0F, 0.0F);
		reinforcement.cubeList.add(new ModelBox(reinforcement, 0, 121, -1.5F, 5.9282F, -8.5F, 2, 2, 6, 0.0F, false));

		reinforcement2 = new ModelRenderer(this);
		reinforcement2.setRotationPoint(-4.0F, -3.7855F, 0.2787F);
		forklift.addChild(reinforcement2);
		setRotationAngle(reinforcement2, -1.0472F, 0.0F, 0.0F);
		reinforcement2.cubeList.add(new ModelBox(reinforcement2, 0, 121, -1.5F, 5.9282F, -8.5F, 2, 2, 6, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		wheel.render(f5);
		wheel2.render(f5);
		wheel3.render(f5);
		wheel4.render(f5);
		body.render(f5);
		chair.render(f5);
		roof.render(f5);
		steeringwheel.render(f5);
		forklift.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}