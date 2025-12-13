package me.mitfox.nojumpdelay;

import me.mitfox.nojumpdelay.commands.NoJumpDelayCommand;
import net.minecraft.client.Minecraft;
import net.minecraftforge.client.ClientCommandHandler;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;


@Mod(
        modid = "nojumpdelay",
        name = "NoJumpDelay Mod",
        version = "1.0",
        acceptedMinecraftVersions = "[1.8.9]",
        clientSideOnly = true
)
public class NoJumpDelayMod {

    /*

    Have fun ;>

     */

    public static boolean enabled = true;

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        ClientCommandHandler.instance.registerCommand(new NoJumpDelayCommand());
        MinecraftForge.EVENT_BUS.register(this);
    }
}
