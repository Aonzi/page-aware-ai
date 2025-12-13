package me.mitfox.nojumpdelay.mixins;

import me.mitfox.nojumpdelay.NoJumpDelayMod;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(priority = 995, value = EntityLivingBase.class)
public abstract class MixinEntityLivingBase extends Entity{

    @Shadow private int jumpTicks;

    public MixinEntityLivingBase(World worldIn) {
        super(worldIn);
    }


    /**
     * @author me
     * @reason nojumpdelay
     */
    @Inject(method = "onLivingUpdate", at = @At("HEAD"))
    public void onLivingUpdate(CallbackInfo ci) {
        if (NoJumpDelayMod.enabled) {
            this.jumpTicks = 0;
        }
    }

}
