package com.volumetricpixels.supported.glassmere.config;

import java.io.File;

import org.spout.api.util.config.ConfigurationHolder;
import org.spout.api.util.config.ConfigurationHolderConfiguration;
import org.spout.api.util.config.yaml.YamlConfiguration;

public class GlassmereConfiguration extends ConfigurationHolderConfiguration {
	
	public static final ConfigurationHolder ENABLE_GLASS_BLOCKS = new ConfigurationHolder(true, "Enable", "Blocks", "Glass");
	public static final ConfigurationHolder ENABLE_PALE_BLOCKS = new ConfigurationHolder(true, "Enable", "Blocks", "Pale");
	public static final ConfigurationHolder ENABLE_SPEARS = new ConfigurationHolder(true, "Enable", "Weapons", "Spears");
	
	public GlassmereConfiguration(File dataFolder) {
		super(new YamlConfiguration(new File(dataFolder, "config.yml")));
	}

}
