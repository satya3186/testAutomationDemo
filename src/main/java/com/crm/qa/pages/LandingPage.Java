package com.crm.qa.pages;

public class LandingPage  extends TestBase{

    //create a Landing page class and use the PageFactory class to initialize the web elements
    // use the locators as a reference from the file landing.html in the same directory as this file
    // use the PageFactory class to initialize the web elements

    @FindBy(xpath = "//a[contains(text(),'Sign Up')]")
    WebElement signUpBtn;

    @FindBy(xpath = "//a[contains(text(),'Login')]")
    WebElement loginBtn;

    //locator for the image on the landing page using text 'free crm publisher logo'
    @FindBy(xpath = "//*[contains(@alt,'free crm publisher logo')]")
    WebElement crmLogo;

    //create a constructor for the LandingPage class
    public LandingPage() {
        //initialize the web elements using the PageFactory class
        PageFactory.initElements(driver, this);
    }

    //create a method to validate the title of the landing page
    public String validateLandingPageTitle() {
        //return the title of the landing page
        return driver.getTitle();
    }

    //create a method to validate the image on the landing page
    public boolean validateCRMImage() {
        //return true if the image is displayed
        return crmLogo.isDisplayed();
    }

    //create a method to click on the login button
    public LoginPage clickOnLogin() {
        //click on the login button
        loginBtn.click();
        //return the LoginPage class
        return new LoginPage();
    }

    //create a method to click on the sign up button
    public SignUpPage clickOnSignUp() {
        //click on the sign up button
        signUpBtn.click();
        //return the SignUpPage class
        return new SignUpPage();
    }

}
