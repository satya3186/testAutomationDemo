package com.crm.qa;

import org.testng.annotations.Test;


import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;

public class LoginPageTest extends TestBase {

    LoginPage loginPage;
    HomePage homePage;

    public LoginPageTest() {
        super();
        initialization();
    }

    @BeforeMethod
    public void setUp() {
        initialization();
        loginPage = new LoginPage();
    }

   // Write a TestNG test to validate the page title that contains Free CRM Power
   // Use assertTrue() to validate the page title
   @Test
    public void loginPageTitleTest() {
        String title = loginPage.validateLoginPageTitle();
        Assert.assertTrue(title.contains("Free CRM Power"));
    }

   // Write a testng test to login to the appplication
    // Use the login method from LoginPage.java
    // Assert that the home page title is correct
    @Test
    public void loginTest() {
 
        driver.findElement(By.xpath("//*[contains(text(),'Log In')]")).click();

        homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
        String homePageTitle = homePage.verifyHomePageTitle();
        Assert.assertEquals(homePageTitle, "Cogmento CRM", "Home page title not matched");

    }
   
    // add teardown method to close the browser
    // add a line to quit the driver
    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

}