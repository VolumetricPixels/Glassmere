/*
 *
 * This file is part of Glassmere.
 *
 * Copyright 2013 Kohle F. <http://mrkohle.com>
 * Glassmere is licensed under the CC Attribution-ShareAlike 3.0 Unported.
 *
 * The Creative Commons Attribution-ShareAlike 3.0 Unported license
 * allows for modification of this work and to share the modifications as
 * long as the modified work is shared under the same license. In addition,
 * credit must be given to the original author.
 *
 * You should have received a copy of the CC Attribution-ShareAlike 3.0 Unported
 * license along with this program.
 * If not, see <http://creativecommons.org/licenses/by-sa/3.0/deed.en_US> for the
 * simplified version of the license.
 *
*/

package com.volumetricpixels.supported.glassmere.materials.blocks.glass;

import org.spout.api.inventory.ItemStack;
import org.spout.vanilla.api.material.TimedCraftable;
import org.spout.vanilla.plugin.data.tool.ToolLevel;
import org.spout.vanilla.plugin.data.tool.ToolType;
import org.spout.vanilla.plugin.material.VanillaMaterials;
import org.spout.vanilla.plugin.material.block.Solid;
import org.spout.vanilla.plugin.material.block.component.FurnaceBlock;
import org.spout.vanilla.plugin.resources.VanillaMaterialModels;

public class GlassStone extends Solid implements TimedCraftable {
	
	public GlassStone(String name, int id) {
		super(name, id, VanillaMaterialModels.BRICK);
		this.setHardness(1.5F).setResistance(7.0F).addMiningType(ToolType.PICKAXE).setMiningLevel(ToolLevel.WOOD);
	}
	
	@Override
	public float getCraftTime() {
		return FurnaceBlock.SMELT_TIME;
	}

	@Override
	public ItemStack getResult() {
		return new ItemStack(VanillaMaterials.ANVIL, 10);
	}

}
