package me.mitfox.nojumpdelay.commands;

import me.mitfox.nojumpdelay.NoJumpDelayMod;
import net.minecraft.client.Minecraft;
import net.minecraft.command.CommandBase;
import net.minecraft.command.ICommandSender;
import net.minecraft.util.ChatComponentText;

public class NoJumpDelayCommand extends CommandBase {
   public String getCommandName() {
      return "nojumpdelay";
   }

   public void processCommand(ICommandSender sender, String[] args) {
      NoJumpDelayMod.enabled = !NoJumpDelayMod.enabled;
      Minecraft.getMinecraft().thePlayer.addChatMessage(new ChatComponentText("No Jump Delay is "+(NoJumpDelayMod.enabled ? "§aEnabled" : "§cDisabled")));
   }

   public String getCommandUsage(ICommandSender sender) {
      return "/nojumpdelay";
   }

   public int getRequiredPermissionLevel() {
      return 0;
   }

   public boolean canCommandSenderUseCommand(ICommandSender sender) {
      return true;
   }
}
