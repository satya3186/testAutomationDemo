package com.crm.qa;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.ContactsPage;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;
import org.openqa.selenium.By;

public class HomePageTest extends TestBase {

    HomePage homePage;
    LoginPage loginPage;
    ContactsPage contactsPage;

    public HomePageTest() {
        super();
    }
 
    @BeforeMethod
    public void setUp() {
        initialization();
        loginPage = new LoginPage();
    }

    // Write a TestNG test to add a new contact on the home page
    @Test
    public void clickOnContactsMenu() {
       // initialization();
        loginPage = new LoginPage();
        // LoginPageTest loginPageTest = new LoginPageTest();
        // loginPageTest.loginTest();

        driver.findElement(By.xpath("//*[contains(text(),'Log In')]")).click();

        homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
        contactsPage = homePage.clickOnContacts();

    }


    //Write a TestNG test to add a new contact on the home page
    // Click on Create button on the ContactsPage.java
    @Test
    public void clickOnCreateContact() {
        initialization();
        loginPage = new LoginPage();
        driver.findElement(By.xpath("//*[contains(text(),'Log In')]")).click();

        homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
        contactsPage = homePage.clickOnContacts();
        contactsPage.clickOnCreateBtn();
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
