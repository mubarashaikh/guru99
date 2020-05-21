package com.guru99.stepDefinitions;

import com.guru99.pages.BasePage;
import com.guru99.pages.HomePage;
import com.guru99.pages.ManagerHomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.PageFactory;


public class logFunctionalitySteps extends BasePage {
    HomePage homePage = PageFactory.initElements(driver, HomePage.class);
    ManagerHomePage managerHomePage = PageFactory.initElements(driver, ManagerHomePage.class);


    @Given("i navigate to guru{int} HomePage")
    public void i_navigate_to_guru_HomePage(Integer int1) {

        launchUrl();
    }

    @When("I enter vaild user ID as {string}")
    public void i_enter_vaild_user_ID_as(String validUserId) {

        homePage.enterUserId(validUserId);
    }

    @When("i enter valid password as {string}")
    public void i_enter_valid_password_as(String validUserPass) {
        homePage.enterUserPassword(validUserPass);

    }

    @When("i click on login button")
    public void i_click_on_login_button() {
        homePage.clickLoginButton();
    }

    @Then("user is successfully logged in and manger page title is displayed as {string}")
    public void user_is_successfully_logged_in_and_manger_page_title_is_displayed_as(String pageTitle) {
       //managerHomePage.userSuccessfullyLogin(pageTitle);
    }
























//    @Given("i navigate to guru{int} webPage")
//    public void i_navigate_to_guru_webPage(Integer int1) {
//        launchUrl();
//    }
//
//    @When("enter vaild user name")
//    public void enter_vaild_user_name() {
//
//        homePage.enterUserId();
//    }
//
//    @When("enter valid password")
//    public void enter_valid_password() throws InterruptedException {
//
//
//        homePage.enterPassword();
//        Thread.sleep(4000);
//    }
//
//    @When("click on login button")
//    public void click_on_login_button() throws InterruptedException {
//        //Thread.sleep(4000);
//       // homePage.clickOnLoginButton();
//    }
//
//    @Then("user is logged in")
//    public void user_is_logged_in() {
//
//    }
//
//
//
//}
}
