package com.crm.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;

public class LoginPageTest extends TestBase{

	LoginPage loginPage;
	HomePage homePage;

	public LoginPageTest() {
		super();
	}

	@BeforeMethod
	public void setUp() {
		initialization();
		loginPage = new LoginPage();
	}

	@Test(priority=1)
	public void loginPageTitleTest() {
		String title = loginPage.validateLoginPageTitle();
		Assert.assertTrue(title.contains("Free CRM Power Up"));
	}


	@Test(priority=2)
	public void loginTest() {
		homePage = loginPage.login("username", "password");
		// Verify that the home page title is correct
		String homePageTitle = homePage.verifyHomePageTitle();
		Assert.assertEquals(homePageTitle, "Expected Title");
		// Verify that the correct user name is displayed on the home page
		boolean userNameDisplayed = homePage.verifyCorrectUserName();
		Assert.assertTrue(userNameDisplayed);
	
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
