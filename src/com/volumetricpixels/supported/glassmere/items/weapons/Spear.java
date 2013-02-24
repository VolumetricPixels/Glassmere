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

package com.volumetricpixels.supported.glassmere.items.weapons;

import org.spout.vanilla.plugin.data.tool.ToolLevel;
import org.spout.vanilla.plugin.data.tool.ToolType;
import org.spout.vanilla.plugin.material.item.tool.MiningTool;

public class Spear extends MiningTool {
	
	public Spear(String name, int id, ToolLevel toolLevel) {
		super(name, id, toolLevel, ToolType.SWORD);
		this.setDamage(1 + toolLevel.getDamageBonus());
	}

}
