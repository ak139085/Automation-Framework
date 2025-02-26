package com.ui.tests;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.ui.pages.Homepage;
import com.ui.pages.Loginpage;
import com.utilities.Browserutility;
public class Logintest2 {

	public static void main(String[] args) {
		WebDriver wd=new ChromeDriver();
		Homepage homepage=new Homepage(wd);
		Loginpage loginpage=homepage.gotologinpage();
		loginpage.doLoginwith("nakerib538@apifan.com", "Sigma@2182");
		
		
		

	}

}
