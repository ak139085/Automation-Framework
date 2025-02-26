package com.ui.tests;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.utilities.Browserutility;
public class Logintest {

	public static void main(String[] args) {
		WebDriver wd=new ChromeDriver();
		
		Browserutility browserutility=new Browserutility(wd);
		
		browserutility.gotowebsite("http://www.automationpractice.pl/index.php");
		browserutility.Maximizewindow();
		
		By Signinlocator =By.xpath("//a[@class=\"login\"]");
		browserutility.ClickOn(Signinlocator);
		
		By Enteremaillocator =By.xpath("//input[@id='email']");
		browserutility.Entertext(Enteremaillocator, "nakerib538@apifan.com");
		
		By Enterpasswordlocator =By.xpath("//input[@id='passwd']");
		browserutility.Entertext(Enterpasswordlocator, "Sigma@2182");
		
		By Signinbuttonlocator =By.xpath("//span[normalize-space()='Sign in']");
		browserutility.ClickOn(Signinbuttonlocator);
		
		

	}

}
