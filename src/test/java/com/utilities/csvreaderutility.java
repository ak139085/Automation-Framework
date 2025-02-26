package com.utilities;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;
import com.ui.pojo.user;

public class csvreaderutility {

	public static Iterator<user> Readcsvfile(String fileName) {
		File csvfile = new File(System.getProperty("user.dir") + "//Testdata//" + fileName);
		FileReader filereader = null;
		CSVReader csvreader;
		String[] line;
		List<user> userlist = null;
		try {
			filereader = new FileReader(csvfile);
			csvreader = new CSVReader(filereader);
			csvreader.readNext();// reading the row no 1 i.e.
			userlist = new ArrayList<user>();
			user user;
			while ((line = csvreader.readNext()) != null) {
				user = new user(line[0], line[1]);
				userlist.add(user);

			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (CsvValidationException | IOException e) {
			e.printStackTrace();
		}
		return userlist.iterator();

	}
}
