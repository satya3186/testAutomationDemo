package com.crm.qa.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class LoginPage extends TestBase {
    
    // Page Factory - OR:
    @FindBy(name = "email")
    WebElement username;

    @FindBy(name = "password")
    WebElement password;

    @FindBy(xpath = "//*[contains(text(),'Login')]")
    WebElement loginBtn;

    @FindBy(xpath = "//*[contains(text(),'Sign Up')]")
    WebElement signUpBtn;

    @FindBy(xpath = "//img[contains(@class,'img-responsive')]")
    WebElement crmLogo;

    // Initializing the Page Objects:
    public LoginPage() {
        PageFactory.initElements(driver, this);
    }

    // Actions:
    public String validateLoginPageTitle() {
        return driver.getTitle();
    }

    public boolean validateCRMImage() {
        return crmLogo.isDisplayed();
    }

    public HomePage login(String un, String pwd) {

        username.sendKeys(un);
        password.sendKeys(pwd);
        //add an implicit wait for 10 seconds here
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        loginBtn.click();

        return new HomePage();
    }

}

