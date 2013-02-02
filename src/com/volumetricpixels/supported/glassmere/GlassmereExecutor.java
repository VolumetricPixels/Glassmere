package com.volumetricpixels.supported.glassmere;

import org.spout.api.command.Command;
import org.spout.api.command.CommandContext;
import org.spout.api.command.CommandExecutor;
import org.spout.api.command.CommandSource;
import org.spout.api.component.impl.HitBlockComponent;
import org.spout.api.entity.Player;
import org.spout.api.exception.CommandException;
import org.spout.api.geo.cuboid.Block;
import org.spout.api.material.BlockMaterial;

import com.volumetricpixels.supported.glassmere.materials.GlassmereMaterials;

public class GlassmereExecutor implements CommandExecutor {

    @Override
    public void processCommand(CommandSource source, Command command, CommandContext args) throws CommandException {
        String name = command.getPreferredName();
        if (source instanceof Player) {
            Player p = (Player) source;
            BlockMaterial mat;
            if (name.equalsIgnoreCase("+gcobble")) {
                p.sendMessage("Glass cobblestone command has been executed");
                mat = GlassmereMaterials.GLASS_COBBLESTONE;
            } else {
                mat = BlockMaterial.AIR;
            }
            HitBlockComponent hit = p.get(HitBlockComponent.class);
            if (hit != null) {
                Block b = hit.getTargetBlock();
                b.setMaterial(mat);
                p.sendMessage("Block at ", b.getPosition(), " has been set to " + mat.getDisplayName());
            }
        }
    }
}