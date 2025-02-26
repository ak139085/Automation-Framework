package com.ui.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.utilities.Browserutility;

public class Loginpage extends Browserutility {

	private static final By ENTEREMAILLOCATOR = By.xpath("//input[@id='email']");
	private static final By ENTERPASSWORDLOCATOR = By.xpath("//input[@id='passwd']");
	private static final By SIGNINBUTTONLOCATOR = By.xpath("//span[normalize-space()='Sign in']");

	public Loginpage(WebDriver driver) {
		super(driver);

	}

	public MyAccountPage doLoginwith(String emailaddress, String password) {
		Entertext(ENTEREMAILLOCATOR, emailaddress);
		Entertext(ENTERPASSWORDLOCATOR, password);
		ClickOn(SIGNINBUTTONLOCATOR);
		MyAccountPage myacc = new MyAccountPage(getDriver());
		return myacc;

	}

}
