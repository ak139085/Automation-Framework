package com.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.constants.browser;

public abstract class Browserutility {

	private WebDriver driver;

	public WebDriver getDriver() {
		return driver;
	}

	public Browserutility(WebDriver driver) {
		super();
		this.driver = driver;
	}

	public Browserutility(String browserName) {
		if (browserName.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		} else if (browserName.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();
		} else if (browserName.equalsIgnoreCase("Firefox")) {
			driver = new FirefoxDriver();
		} else {
			System.err.print("Invalid browsername");
		}
	}
	
	public Browserutility(browser browserName) {
		if (browserName==browser.CHROME) {
			driver = new ChromeDriver();
		} else if (browserName==browser.EDGE) {
			driver = new EdgeDriver();
		} else if (browserName==browser.FIREFOX) {
			driver = new FirefoxDriver();
		} 
	}

	public void gotowebsite(String url) {
		driver.get(url);
	}

	public void Maximizewindow() {
		driver.manage().window().maximize();
	}

	public void ClickOn(By locator) {
		WebElement element = driver.findElement(locator);
		element.click();
	}

	public void Entertext(By locator, String entertext) {
		WebElement element = driver.findElement(locator);
		element.sendKeys(entertext);

	}

	public String getvisibleletter(By locator) {
		WebElement element = driver.findElement(locator);
		return element.getText();

	}

}
