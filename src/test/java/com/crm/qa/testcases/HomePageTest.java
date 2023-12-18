package com.crm.qa.testcases;

import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;

public class HomePageTest extends TestBase{
    
   //Use LoginPage and HomePage objects to access the methods in those classes
     LoginPage loginPage;
     HomePage homePage;

    // constructor  - 1
    public HomePageTest() {
        super();
    }
    
    // Write test cases in TestNG for testing the functionalities on the HomePage
    // Verify that the home page title is correct
    // Verify that the correct user name is displayed on the home page
    // Verify that the home page has the correct menu items
    // Verify that the home page has the correct footer items
    // Verify that the home page has the correct social media links
    // Verify that the home page has the correct footer links
    
    @Test(priority=1)
    public void verifyHomePageTitleTest() {
        // Verify that the home page title is correct
        String homePageTitle = homePage.verifyHomePageTitle();
        Assert.assertEquals(homePageTitle, "Expected Title");
    }

    @Test(priority=2)
    public void verifyCorrectUserNameTest() {
        // Verify that the correct user name is displayed on the home page
        boolean userNameDisplayed = homePage.verifyCorrectUserName();
        Assert.assertTrue(userNameDisplayed);
    }

    @Test(priority=3)
    public void verifyMenuItemsTest() {
        // Verify that the home page has the correct menu items
       // List<String> menuItems = homePage.verifyMenuItems();
    }
    
    @Test(priority=4)
    public void verifyFooterItemsTest() {
        // Verify that the home page has the correct footer items
        
        
    }

}
