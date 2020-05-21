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

    // this implements WebElement user Id on homepage

    @FindBy (name = "uid")
    public WebElement userId;

    // this implements WebElement user password on homepage

     @FindBy (name = "password")
     public WebElement userPassword;

    // this implements WebElement login Botton on homepage
    @FindBy (name = "btnLogin")
    public WebElement loginButton;


    public void  enterUserId (String uId){
        //userId.clear();
        userId.sendKeys(uId);
        System.out.println(uId);
    }
    public void  enterUserPassword (String uPass){
        //userPassword.clear();
        userPassword.sendKeys(uPass);
        System.out.println(uPass);
    }

    public ManagerHomePage  clickLoginButton (){
        loginButton.click();
        return new ManagerHomePage(driver);
    }



    //    public String  uId = "mngr261507";
//
//    public String  password = "jAjEmEd";

}
