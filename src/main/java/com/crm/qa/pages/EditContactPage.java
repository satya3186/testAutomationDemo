package com.crm.qa.pages;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class EditContactPage extends TestBase {

    // Now that Contact is created, we need to edit the contact
    // Create the EditContactPage class using the PageFactory class to initialize the web elements
    // Find elements on the Edit COntacts Page as mentioned in the EditContacts.html file in the same directory as this file


    public EditContactPage() {
        //initialize the web elements using the PageFactory class
        PageFactory.initElements(driver, this);
    }

    
    
}
