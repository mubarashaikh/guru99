package com.guru99.pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;

public class ManagerHomePage extends BasePage {
   public ManagerHomePage (WebDriver driver) {
       this.driver = driver;

   }
@FindBy(css = "body > div:nth-child(6) > h2")
    private WebElement pageTitle;

   public void userSuccessfullyLogin (){
        String pageTit = "Guru99 Bank";
       Assert.assertTrue(pageTitle.getText().equals(pageTit));
   }




}
