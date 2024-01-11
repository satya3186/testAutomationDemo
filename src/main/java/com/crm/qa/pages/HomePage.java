package com.crm.qa.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class HomePage extends TestBase{

    //create a constructor for the HomePage class
    public HomePage() {
        //initialize the web elements using the PageFactory class
        PageFactory.initElements(driver, this);
    }

    //Find the Elements such as Home, Contacts, Companies , Deals, Tasks, Cases, Calls, Documents, Email, Campaigns, Forms, Reports, Analytics, and Projects
    @FindBy(xpath = "//span[contains(text(),'Home')]")
    WebElement homeBtn;
    
    //find the contacts icon using i tag with class name 'users icon'
    @FindBy(xpath = "//i[@class='users icon']")
    WebElement contactsIcon;

    @FindBy(xpath = "//span[contains(text(),'Contacts')]")
    WebElement contactsBtn;

    @FindBy(xpath = "//span[contains(text(),'Companies')]")
    WebElement companiesBtn;

    @FindBy(xpath = "//span[contains(text(),'Deals')]")
    WebElement dealsBtn;

    //create contact button '+'
    @FindBy(xpath = "//button[@class='ui mini basic icon button'][2]")
    WebElement addContactBtnFromMenu;


    //create a method to click on the Home button
    public void clickOnHome() {
        //click on the Home button
        homeBtn.click();
    }

    //create a method to click on the Contacts button
    public ContactsPage clickOnContacts() {
        //click on the Contacts button
        //move mouse to the Contacts icon
        Actions action = new Actions(driver);
        action.moveToElement(contactsIcon).build().perform();
        //wait for 2 seconds implicitly
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

        // then click on the Contacts button
        contactsBtn.click();

        return new ContactsPage();
        
    }
    
    //create a method to click on the Companies button
    public void clickOnCompanies() {
        //click on the Companies button
        companiesBtn.click();
    }

    //create a method to click on the Deals button
    public void clickOnDeals() {
        //click on the Deals button
        dealsBtn.click();
    }

    //crteate a method to click on + button to add a new contact
    public void clickOnNewContact() {
        //click on the + button to add a new contact
        driver.findElement(By.xpath("//button[contains(text(),'New')]")).click();
    }




    public String verifyHomePageTitle() {
        return driver.getTitle();
    }



}
