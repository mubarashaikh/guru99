package com.guru99.pages;

import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ManagerHomePage extends BasePage {

    public ManagerHomePage (WebDriver driver) {
       this.driver = driver;
        PageFactory.initElements(driver, this);

   }

   @FindBy(css = "body > div:nth-child(6) > h2")
    private WebElement pageTitle;

   public void userSuccessfullyLogin (String pTitle){
        //String pageTit = "Guru99 Bank";
       Assert.assertTrue(pageTitle.getText().equals(pTitle));
   }

/*
ss5
 */

    @FindBy(css = "body > table > tbody > tr > td > table > tbody > tr.heading3 > td")
    private WebElement mngrId;

    public void verfiyMngrID (String mgrId){
        //String pageTit = "Guru99 Bank";
        //System.out.println(mngrId.getText());
        Assert.assertTrue(mngrId.getText().equals(mgrId));

    }

             /*
             * customise statement scenario
             * */

    @FindBy(css = "body > div:nth-child(7) > div > ul > li:nth-child(14) > a")
    private WebElement customiseStatment;

    /*
    * click customised statement
    * */
    public CustomisedStatementInput clickOnCustomiseStatement() throws Exception {

        // scroll
        ScrollByPixel ();
        Thread.sleep(4000);
        customiseStatment.click();
        return new CustomisedStatementInput(driver);



    }

    /*
    * logout
    * */

    @FindBy(css = "body > div:nth-child(7) > div > ul > li:nth-child(15) > a")
    private WebElement logoutButton;

    public void clickLogout (){

        ScrollByPixel();
        logoutButton.click();

        // close the popUp message after logout

        Alert alert = driver.switchTo().alert();
        alert.accept();



    }

            /*
            * deposit scenario
            * */

    @FindBy(css ="body > div:nth-child(7) > div > ul > li:nth-child(8) > a")
    private WebElement depositLink;

    public DepositInputPage clickDeposit () throws Exception {

       //ScrollByPixel();
        //Thread.sleep(5000);
        /*
        * tried the below but none worked
        * will try the javaScript executor to click
        * there must be a bug
        * */
       // depositLink.click();
        //clickOnElement(depositLink);

        javaScriptClick(depositLink);

        return new DepositInputPage(driver);

    }































}
