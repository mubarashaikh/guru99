package com.guru99.pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class ManagerHomePage extends BasePage {
   public ManagerHomePage (WebDriver driver) {
       this.driver = driver;
       PageFactory.initElements(driver, this);
   }

   public void userAccessStatus (String pageTile){
       Assert.assertTrue(driver.getTitle().equals(pageTile));
   }
}
