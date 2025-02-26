package com.utilities;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class Propertiesutil {

	public static String readproperty() {

		File propfile = new File(System.getProperty("user.dir") + "\\config\\QA.properties");
		FileReader filereader = null;
		Properties properties = new Properties();
		try {
			filereader = new FileReader(propfile);
			properties.load(filereader);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		String value = properties.getProperty("URL");
		return value;

	}
}
