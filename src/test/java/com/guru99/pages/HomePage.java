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

    // this method implements user name

    @FindBy (css = "body > form:nth-child(21) > table:nth-child(2) > tbody:nth-child(1) > tr:nth-child(1) > td:nth-child(2) > input:nth-child(1)")
    public WebElement userId;

    public String  uId = "mngr261507";



    public String  password = "jAjEmEd";


    public void enterUserID (){

        userId.clear();
        userId.sendKeys(uId);
    }

 @FindBy (css = "body > form > table > tbody > tr:nth-child(2) > td:nth-child(2) > input[type=password]")
 public WebElement userPassword;

    public void enterPassword (){

        userPassword.clear();
        userPassword.sendKeys(password);
    }

    @FindBy (css = "body > form > table > tbody > tr:nth-child(3) > td:nth-child(2) > input[type=submit]:nth-child(1)")
    public WebElement loginButton;
    public ManagerHomePage clickOnLoginButton () {
        //Thread.sleep(3000);
        loginButton.click();
        return new ManagerHomePage(driver);
    }

}
