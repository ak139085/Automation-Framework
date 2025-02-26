package com.ui.DataProvider;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.DataProvider;

import com.google.gson.Gson;
import com.ui.pojo.Testdatas;
import com.ui.pojo.user;
import com.utilities.Excelreaderutility;
import com.utilities.csvreaderutility;

public class Logindataprovider {

	@DataProvider(name = "LoginTestdataproviders")
	public Iterator<Object[]> loginDataProvider() {
		Gson gson = new Gson();
		File testDataFile = new File(System.getProperty("user.dir") + "//Testdata/Logindata.json");
		FileReader fileReader = null;
		try {
			fileReader = new FileReader(testDataFile);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		Testdatas data = gson.fromJson(fileReader, Testdatas.class);// deserialization

		List<Object[]> dataToReturn = new ArrayList<Object[]>();
		for (user user : data.getData()) {

			dataToReturn.add(new Object[] { user });
		}

		return dataToReturn.iterator();

	}

	@DataProvider(name = "LoginTestCSVdataproviders")
	public Iterator<user> Logincsvdataprovider() {
		return csvreaderutility.Readcsvfile("logindata.csv");

	}

	@DataProvider(name = "LoginTestExceldataproviders")
	public Iterator<user> Loginexceldataprovider() {
		try {
			return Excelreaderutility.readexcelfile("LoginData.xlsx");
		} catch (InvalidFormatException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;

	}

}
