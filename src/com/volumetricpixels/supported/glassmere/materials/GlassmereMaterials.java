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

package com.volumetricpixels.supported.glassmere.materials;

import org.spout.vanilla.plugin.data.tool.ToolLevel;
import com.volumetricpixels.supported.glassmere.items.weapons.spears.DiamondSpear;
import com.volumetricpixels.supported.glassmere.items.weapons.spears.IronSpear;
import com.volumetricpixels.supported.glassmere.items.weapons.spears.StoneSpear;
import com.volumetricpixels.supported.glassmere.items.weapons.spears.WoodenSpear;
import com.volumetricpixels.supported.glassmere.materials.blocks.glass.GlassCobble;
import com.volumetricpixels.supported.glassmere.materials.blocks.glass.GlassDirt;
import com.volumetricpixels.supported.glassmere.materials.blocks.glass.GlassLeaf;
import com.volumetricpixels.supported.glassmere.materials.blocks.glass.GlassLog;
import com.volumetricpixels.supported.glassmere.materials.blocks.glass.GlassPlank;
import com.volumetricpixels.supported.glassmere.materials.blocks.glass.GlassStone;

public class GlassmereMaterials {
	
	private GlassmereMaterials() {
		
	}
	
	// * Glass materials *
	public static final GlassCobble GLASS_COBBLESTONE = new GlassCobble("Glass Cobblestone", 200);
	public static final GlassDirt GLASS_DIRT = new GlassDirt("Glass Dirt", 201);
	public static final GlassLeaf GLASS_LEAF = new GlassLeaf("Glass Cobblestone", 202);
	public static final GlassLog GLASS_LOG = new GlassLog("Glass Cobblestone", 203);
	public static final GlassPlank GLASS_PLANK = new GlassPlank("Glass Cobblestone", 204);
	public static final GlassStone GLASS_STONE = new GlassStone("Glass Cobblestone", 205);
	// * End Glass materials *
	
	// * Spears *
	public static final WoodenSpear WOODEN_SPEAR = new WoodenSpear("Wooden Spear", 268, ToolLevel.WOOD);
	public static final StoneSpear STONE_SPEAR = new StoneSpear("Stone Spear", 268, ToolLevel.STONE);
	public static final IronSpear IRON_SPEAR = new IronSpear("Iron Spear", 268, ToolLevel.IRON);
	public static final DiamondSpear DIAMOND_SPEAR = new DiamondSpear("Diamond Spear", 268, ToolLevel.DIAMOND);
	// * End spears *

}