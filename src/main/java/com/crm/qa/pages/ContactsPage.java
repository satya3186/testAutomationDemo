package com.crm.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class ContactsPage extends TestBase  {

    CreateNewContactPage createNewContactPage;
    LoginPage loginPage;
    HomePage homePage;
    ContactsPage contactsPage;

    // Create the ContactsPage class using the PageFactory class to initialize the web elements
    @FindBy(xpath = "//div[@class='ui header item mb5 light-black']")
    WebElement contactsLabel;
    
    //Find the Create button and add a locator
    // Find the Show Filters button and add a locator
    @FindBy(xpath = "//button[contains(text(),'Create')]")
    WebElement createBtn;

    @FindBy(xpath = "//button[contains(text(),'Show Filters')]")
    WebElement showFiltersBtn;
   
    //Find locators for View dropdown
    @FindBy(xpath = "//div[@name='view']")
    WebElement viewDropdown;

    //Find locators for Actions dropdown
    @FindBy(xpath = "//div[@name='action']")
    WebElement actionsDropdown;




    //create a constructor for the ContactsPage class
    public ContactsPage() {
        //initialize the web elements using the PageFactory class
        PageFactory.initElements(driver, this);
    }
    
    //create a method to validate the Contacts label
    public boolean validateContactsLabel() {
        //return true if the Contacts label is displayed
        return contactsLabel.isDisplayed();
    }

    //create a method to click on the Create button
    public CreateNewContactPage clickOnCreateBtn() {
        //click on the Create button
        createBtn.click();
        return new CreateNewContactPage();
    }   

    //create a method to click on the Show Filters button
    public void clickOnShowFiltersBtn() {
        //click on the Show Filters button
        showFiltersBtn.click();
    }

    //create a method to check the Create button is displayed
    public boolean isCreateNewContactButtonDisplayed() {
        //return true if the Create button is displayed
        return createBtn.isDisplayed();
    }

    //create a method to check the Actions dropdown is displayed
    public boolean isActionsDropdownDisplayed() {
        //return true if the Actions dropdown is displayed
        return actionsDropdown.isDisplayed();
    }

    // crreate a method to check if the contact is present in the contacts table
    public boolean isContactPresent(String firstName, String lastName) {
        homePage = new HomePage();
        // move to Contacts menu
        homePage.clickOnContacts();
        //create a boolean variable to store the result
        boolean isContactPresent = false;
        //create a string variable to store the xpath of the contact
        String contactXpath = "//*[text()='" + firstName + " " + lastName + "']";
        //create a web element to store the contact
        WebElement contact = driver.findElement(By.xpath(contactXpath));
        //check if the contact is displayed
        if (contact.isDisplayed()) {
            //set the boolean variable to true
            isContactPresent = true;
        }
        //return the boolean variable
        return isContactPresent;
    }

}
