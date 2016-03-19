package com.bluewolf279.acpos.items.GaussRifle;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.IProjectile;
import net.minecraft.entity.projectile.EntityThrowable;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;

/**
 * Created by Matt on 17/03/2016.
 */
public class GaussShot extends EntityThrowable {

	public GaussShot(World worldIn) {
		super(worldIn);
	}

	public GaussShot(World worldIn, EntityLivingBase shooter){
		super(worldIn, shooter);
		this.setSize(0.5f,0.5f);
//		this.setThrowableHeading(x,y,z,100f,0f);
	}
	public GaussShot(World worldIn, double x, double y, double z)
	{
		super(worldIn, x, y, z);
	}

	@Override
	protected void onImpact(MovingObjectPosition ObjectPos) {
		float f = 5.0F;
		/*float damage = 20f;
		ObjectPos.entityHit.attackEntityFrom(DamageSource.causeThrownDamage(this, this.getThrower()), damage);*/
		this.worldObj.createExplosion(this, this.posX, this.posY + (double)(this.height / 2.0F), this.posZ, f, true);
		this.setDead();

	}

}
