package com.utilities;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

import com.constants.Environment;
import com.google.gson.Gson;
import com.ui.pojo.Environ;
import com.ui.pojo.configenv;

public class jsonutility {
	public static String readJSON(Environment en) {

		Gson gson = new Gson();
		File jsonFile = new File(System.getProperty("user.dir") + "\\config\\config.json");
		FileReader filereader = null;
		try {
			filereader = new FileReader(jsonFile);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		configenv config=gson.fromJson(filereader, configenv.class);
		Environ env=config.getEnvironments().get("QA");
		return env.getUrl();
		
		

	}

}
