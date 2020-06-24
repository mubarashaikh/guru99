package com.guru99.stepDefinitions;

import com.guru99.pages.BasePage;
import com.guru99.pages.HomePage;
import com.guru99.pages.ManagerHomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.PageFactory;


public class loginFunctionalitySteps extends BasePage {
    HomePage homePage = PageFactory.initElements(driver, HomePage.class);
    ManagerHomePage managerHomePage = PageFactory.initElements(driver, ManagerHomePage.class);


    @Given("i navigate to guru HomePage")
    public void i_navigate_to_guru_HomePage() {
        launchUrl();
    }

    @When("I enter vaild user ID as {string}")
    public void i_enter_vaild_user_ID_as(String validUserId) {

        homePage.enterValidUserId(validUserId);
    }

    @When("i enter valid password as {string}")
    public void i_enter_valid_password_as(String validUserPass) {
        homePage.enterValidUserPassword(validUserPass);

    }

    @When("i click on login button")
    public void i_click_on_login_button() throws InterruptedException {
        homePage.clickLoginButton();
    }

    @Then("user is successfully logged in and manger page title is displayed as {string}")
    public void user_is_successfully_logged_in_and_manger_page_title_is_displayed_as(String pageTitle) {
       managerHomePage.userSuccessfullyLogin(pageTitle);
    }

        /*
          / ss2
        */

    @When("I enter invaild user ID as {string}")
    public void i_enter_invaild_user_ID_as(String invalidUID) {

        homePage.enterInvalidUserId(invalidUID);
    }
    @Then("accesss is not garnted and error message is displayed as {string}")
    public void accesss_is_not_garnted_and_error_message_is_displayed_as(String errorMessage) {

        homePage.pupUpHandling(errorMessage);
    }

        /*
          / ss3
        */

    @When("i enter invalid password as {string}")
    public void i_enter_invalid_password_as(String invalidP) {
        homePage.enterValidUserPassword(invalidP);
    }

    @When("i click on login button on homePage")
    public void i_click_on_login_button_on_homePage() {
        homePage.clickButton();
    }


            /*
            ss5
             */

    @Then("user is successfully logged in and manger ID should be dispalyed as {string}")
    public void user_is_successfully_logged_in_and_manger_ID_should_be_dispalyed_as(String mgrId) {
        managerHomePage.verfiyMngrID(mgrId);
    }


















}
