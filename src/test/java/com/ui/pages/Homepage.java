package com.ui.pages;

import org.openqa.selenium.By;

import com.constants.Environment;
import com.constants.browser;
import com.utilities.Browserutility;
import com.utilities.jsonutility;

import static com.utilities.Propertiesutil.*;

public class Homepage extends Browserutility {

	private static final By SIGN_IN_LOCATOR = By.xpath("//a[@class=\"login\"]");

	public Homepage(browser browserName) {
		super(browserName);
		Maximizewindow();
		gotowebsite(jsonutility.readJSON(Environment.QA));

	}

	public Loginpage gotologinpage() {// Page Function we can't use void return type...
		ClickOn(SIGN_IN_LOCATOR);
		Loginpage loginpage = new Loginpage(getDriver());
		return loginpage;
	}

}
