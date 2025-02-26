package com.ui.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.utilities.Browserutility;

public final class MyAccountPage extends Browserutility {

	private static final By USERNAMELOCATOR = By.xpath("//a[@title=\"View my customer account\"]/span");

	public MyAccountPage(WebDriver driver) {
		super(driver);

	}
	public String getusername()
	{
		return getvisibleletter(USERNAMELOCATOR);
		
	}
}
