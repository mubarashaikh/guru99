package com.guru99.pages;

import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage {

    public HomePage(WebDriver driver){

        this.driver = driver;

        PageFactory.initElements(driver,this);

    }

    // this implements WebElement user Id on homepage

    @FindBy (name = "uid")
    public WebElement userId;

    // this implements WebElement user password on homepage

     @FindBy (name = "password")
     public WebElement userPassword;

    // this implements WebElement login Botton on homepage
    @FindBy (name = "btnLogin")
    public WebElement loginButton;


    public void  enterValidUserId (String uId){
        //userId.clear();
        userId.sendKeys(uId);

    }
    public void  enterValidUserPassword (String uPass){
        //userPassword.clear();
        userPassword.sendKeys(uPass);

    }

    public ManagerHomePage login (String userName, String password) throws InterruptedException {

        enterValidUserId(userName);
        enterValidUserPassword(password);
        return clickLoginButton();
    }

    public ManagerHomePage  clickLoginButton () throws InterruptedException {
        Thread.sleep(4000);
        loginButton.click();
        return new ManagerHomePage(driver);
    }


    /*
    / SS2 Methods
     */

    public void enterInvalidUserId(String invalidUID){
        userId.clear();
        userId.sendKeys(invalidUID);
    }


    public void pupUpHandling (String errorMessage){
        Alert alert = driver.switchTo().alert();
        String alertText = alert.getText();
        Assert.assertTrue(alertText.equals(errorMessage));
        alert.accept();

    }


    /*
    / SS3 Methods
     */

    public void enterInvalidPassword(String invalidPID){
        userPassword.clear();
        userPassword.sendKeys(invalidPID);
    }

    public void clickButton ()  {
        //Thread.sleep(4000);
        loginButton.click();
    }



    //    public String  uId = "mngr261507";
//
//    public String  password = "jAjEmEd";

}
