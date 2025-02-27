package com.ui.tests;

import static com.constants.browser.*;

import static org.testng.Assert.*;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ui.pages.Homepage;
import com.ui.pojo.user;

public class Logintest3 {

	Homepage homepage;

	@BeforeMethod(description = "Load the Homepage of the Website")
	public void setup() {
		homepage = new Homepage(CHROME);

	}

	@Test(description = "Verifies with the valid user is able to login into the application", groups = { "e2e",
			"sanity" }, dataProviderClass = com.ui.DataProvider.Logindataprovider.class, dataProvider = "LoginTestdataproviders")
	public void LoginTest(user user)

	{

		assertEquals(homepage.gotologinpage().doLoginwith(user.getEmailAddress(), user.getPassword()).getusername(),
				"Ankit K");

	}

	@Test(description = "Verifies with the valid user is able to login into the application", groups = { "e2e",
			"sanity" }, dataProviderClass = com.ui.DataProvider.Logindataprovider.class, dataProvider = "LoginTestCSVdataproviders", retryAnalyzer=com.ui.listeners.MyRetryAnalyser.class)
	public void LoginCSVTest(user user)

	{

		assertEquals(homepage.gotologinpage().doLoginwith(user.getEmailAddress(), user.getPassword()).getusername(),
				"Ankit K");

	}

	@Test(description = "Verifies with the valid user is able to login into the application", groups = { "e2e",
			"sanity" }, dataProviderClass = com.ui.DataProvider.Logindataprovider.class, dataProvider = "LoginTestExceldataproviders", retryAnalyzer=com.ui.listeners.MyRetryAnalyser.class)
	public void LoginExcelTest(user user)

	{

		assertEquals(homepage.gotologinpage().doLoginwith(user.getEmailAddress(), user.getPassword()).getusername(),
				"Ankit K");

	}

}
