package com.crm.qa;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.ContactsPage;
import com.crm.qa.pages.CreateNewContactPage;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.util.TestUtil;


public class ContactsPageTest extends TestBase {

    HomePage homePage;
    LoginPage loginPage;
    ContactsPage contactsPage;
    CreateNewContactPage createNewContactPage;

    public ContactsPageTest() {
        super();
    }
 
    @BeforeMethod
    public void setUp() {
        initialization();
        loginPage = new LoginPage();
    }

    //Write a testng method to create a new contact
    //enter the fields First Name,  Last Name, Email, and Company, 
    //use the CreateNewContactPage.java class method to enter the fields
    @Test
    public void createNewContactTest() {
        initialization();
        loginPage = new LoginPage();
        driver.findElement(By.xpath("//*[contains(text(),'Log In')]")).click();

        homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
        contactsPage = homePage.clickOnContacts();
        createNewContactPage= contactsPage.clickOnCreateBtn();

        createNewContactPage.enterContactDetails("f1", "l1" , "123@gmail.com" , "EPAM");
        createNewContactPage.clickSaveButton();

        // verify if the contact is created in the Contacts page
        // User Assert.assertTrue() to validate if the contact is created
        // Use the isContactPresent() method from ContactsPage.java
        Assert.assertTrue(contactsPage.isContactPresent("f1", "l1" ));

    }

    

    //Create test data for the above test case using TestNG DataProvider
    // sameple data is: 
    // First Name: first1, Last Name: last1, Email: first1.last1@gmail.com, Company: EPAM
    // First Name: first2, Last Name: last2, Email: first2.last2@gmail, Company: EPAM

   
   
}