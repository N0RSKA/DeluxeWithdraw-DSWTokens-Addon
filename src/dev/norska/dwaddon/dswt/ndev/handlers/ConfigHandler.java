package dev.norska.dwaddon.dswt.ndev.handlers;

import java.io.File;
import java.io.IOException;

import dev.norska.dwaddon.dswt.DSWTAddon;
import dev.norska.dwaddon.dswt.config.CommentedConfiguration;
import lombok.Getter;

public class ConfigHandler {
	
	@Getter private CommentedConfiguration configFile;
	
	private File path = null;
	
	public void generateFiles(DSWTAddon main) throws IOException {
		
		if(path == null) path = new File("plugins/DeluxeWithdraw/addons");
		if(!path.exists()) path.mkdirs();
		
		File file = new File(path, "addon-dswtokens.yml");

        if(!file.exists()) file.createNewFile();

        configFile = CommentedConfiguration.loadConfiguration(file);
        try {
			configFile.syncWithConfig(file, main.getResource("addon-dswtokens.yml"), "no");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
