package com.crm.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;

public class LoginPageTest1Test extends TestBase{
    
	LoginPage loginPage;
	HomePage homePage;

	public LoginPageTest1Test() {
		super();
	}

	@BeforeMethod
	public void setUp() {
		initialization();
		loginPage = new LoginPage();
	}

	@Test(priority=1)
	public void test1() {
		// Navigate to url in config.properties
		// Ensure web site is opened
		// Verify the title of the page using Assertions
		String title = loginPage.validateLoginPageTitle();
		Assert.assertTrue(title.contains("Free CRM Power Up"));
	}

	@Test(priority=2)
	public void test2() {
		// Login to the application using username and password from the config.properties file
		// Ensure that login is successful
		// Verify the user lands on Home page and Home page title using Assertions
		// Verify the correct user name is displayed on the home page
		homePage = loginPage.login("satya.prasad.3186@gmail.com", "test@123");
		String title = homePage.verifyHomePageTitle();
		Assert.assertEquals(title, "Home Page");
		// Add assertion to verify the correct user name is displayed on the home page
	}


	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}