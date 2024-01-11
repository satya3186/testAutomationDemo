package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class CreateNewContactPage extends TestBase {
    
    // Create the CreateNewContactPage class using the PageFactory class to initialize the web elements
    // Find the First Name, Last Name, Email, and Company fields and add locators
    // Find the Save button and add a locator
    // Find the Cancel button and add a locator
    // add a separate method to enter the First Name, Last Name, Email, and Company fields 
    // add a separate method to click on the Save button
    // add a separate method to click on the Cancel button


    public CreateNewContactPage() {
        //initialize the web elements using the PageFactory class
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//input[@name='first_name']")
    WebElement firstNameField;

    @FindBy(xpath = "//input[@name='last_name']")
    WebElement lastNameField;

    @FindBy(xpath = "//input[contains(@placeholder,'Email address')]")
    WebElement emailField;

    @FindBy(xpath = "//input[@class='search']")
    WebElement companyField;

    @FindBy(xpath = "//*[contains(text(),'Save')]")
    WebElement saveButton;

    @FindBy(xpath = "//button[@type='button' and text()='Cancel']")
    WebElement cancelButton;

    public boolean isSaveButtonEnabledAndDisplayed() {
        return saveButton.isEnabled() && saveButton.isDisplayed();
    }

    public boolean isCancelButtonEnabledAndDisplayed() {
        return cancelButton.isEnabled() && cancelButton.isDisplayed();
    }

    public void enterContactDetails(String firstName, String lastName, String email, String company) {
        firstNameField.sendKeys(firstName);
        lastNameField.sendKeys(lastName);
        emailField.sendKeys(email);
        companyField.sendKeys(company);
    }

    public void clickSaveButton() {
        saveButton.click();
    }

    public void clickCancelButton() {
        cancelButton.click();
    }
    
}
