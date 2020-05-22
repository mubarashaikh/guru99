package com.guru99.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage {

    public HomePage(WebDriver driver){

        this.driver = driver;

        PageFactory.initElements(driver,this);

    }

    // Scenario SS1 SS2, SS3, ss4 Implementation


    // this implements WebElement user id  on homePage

    @FindBy (css = "body > form:nth-child(21) > table:nth-child(2) > tbody:nth-child(1) > tr:nth-child(1) > td:nth-child(2) > input:nth-child(1)")
    public WebElement userId;

    // Here implementing WebElement User password on homePage
    @FindBy (css = "body > form > table > tbody > tr:nth-child(2) > td:nth-child(2) > input[type=password]")
    public WebElement userPassword;

    // Here implementing WebElement loginButton click on homePage
    @FindBy (css = "body > form > table > tbody > tr:nth-child(3) > td:nth-child(2) > input[type=submit]:nth-child(1)")
    public WebElement loginButton;

    ////////////////////////////////////

//    // here implementing Use entering useId method on HomePage
//    public void enterUserID (String uId){
//
//        userId.clear();
//        userId.sendKeys(uId);
//    }
//
//    // here implementing Use entering userPassword method on HomePage
//    public void enterPassword (String password){
//        userPassword.clear();
//        userPassword.sendKeys(password);
//    }
//
//    // here implementing User click on Login Button method on HomePage
//    public ManagerHomePage clickOnLoginButton (){
//       // Thread.sleep(3000);
//        loginButton.click();
//        return new ManagerHomePage(driver);
//    }
//////////////////////////////////////////////////

// Here implementing Scenario # SS1 , SS2, SS3, SS4

    public void enterValidUserId (String uId){
        userId.click();
        userId.sendKeys(uId);
    }

    public void enterInvalidUserId (String uId){
        userId.click();
        userId.sendKeys(uId);
    }

    public void enterValidUserPassword (String uPassword){
        userPassword.click();
        userPassword.sendKeys(uPassword);
    }

    public void enterInvalidUserPassword (String uPassword){
        userPassword.click();
        userPassword.sendKeys(uPassword);
    }

    public ManagerHomePage clickLoginButton () throws InterruptedException {
        loginButton.click();
        Thread.sleep(5000);
        return new ManagerHomePage(driver);
    }

}
