package com.utilities;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.ui.pojo.user;

public class Excelreaderutility {
	public static Iterator<user> readexcelfile(String filename) throws InvalidFormatException, IOException {
		File xlsxfile = new File(System.getProperty("user.dir") + "//Testdata//" + filename);// xlsx file
		XSSFWorkbook xssfWorkbook = new XSSFWorkbook(xlsxfile);
		List<user> userlist = new ArrayList<user>();
		XSSFSheet xssfsheet = xssfWorkbook.getSheet("LoginTestdata");
		Iterator<Row> rowiterator = xssfsheet.iterator();
		rowiterator.next();// Skipping the column Name
		Row row;
		Cell emailAddresscell;
		Cell passwordcell;
		user user;
		while (rowiterator.hasNext()) {
			row = rowiterator.next();
			emailAddresscell = row.getCell(0);
			passwordcell = row.getCell(1);
			user = new user(emailAddresscell.toString(), passwordcell.toString());
			userlist.add(user);

		}
		xssfWorkbook.close();
		return userlist.iterator();
	}

}
