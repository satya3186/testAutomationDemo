package com.crm.qa.util;

import org.openqa.selenium.WebDriver;

public class  TestUtil {
        
        WebDriver driver;

        public static long PAGE_LOAD_TIMEOUT = 20;
        public static long IMPLICIT_WAIT = 10;
        
        public void switchToFrame() {
            driver.switchTo().frame("mainpanel");
        }
}