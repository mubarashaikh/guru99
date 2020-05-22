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


    @Given("i navigate to guru homePage")
    public void i_navigate_to_guru_homePage() {
       launchUrl();
    }

    @When("i enter valid user id as {string}")
    public void i_enter_valid_user_id_as(String validUID) {
        homePage.enterValidUserId(validUID);
    }

    @When("i enter valid password as {string}")
    public void i_enter_valid_password_as(String validUPassword) {
     homePage.enterValidUserPassword(validUPassword);
    }

    @When("I click on login button")
    public void i_click_on_login_button() throws InterruptedException {

        homePage.clickLoginButton();
    }

    @Then("Application access is granted and MANAGER PAGE Title message is displayed as {string}")
    public void application_access_is_granted_and_MANAGER_PAGE_Title_message_is_displayed_as(String pageTitle) {
        managerHomePage.userAccessStatus(pageTitle);
    }



    @When("i enter invalid user id as {string}")
    public void i_enter_invalid_user_id_as(String string) {

    }
//
//    @Then("Application access is not granted and pop-up error correct message is displayed as {string}")
//    public void application_access_is_not_granted_and_pop_up_error_correct_message_is_displayed_as(String string) {
//
//    }
//
//    @When("i enter invalid password as {string}")
//    public void i_enter_invalid_password_as(String string) {
//
//    }
//
//    @Then("Application access is not granted and correct message is displayed as {string}")
//    public void application_access_is_not_granted_and_correct_message_is_displayed_as(String string) {
//
//    }



//
//    @Given("i navigate to guru{int} webPage")
//    public void i_navigate_to_guru_webPage(Integer int1) {
//        launchUrl();
//    }
//
//    @When("enter vaild user name")
//    public void enter_vaild_user_name() {
//        String  uId = "mngr261507";
//        homePage.enterUserID(uId);
//    }
//
//    @When("enter valid password")
//    public void enter_valid_password() {
//        String  password = "jAjEmEd";
//
//        homePage.enterPassword(password);
//    }
//
//    @When("click on login button")
//    public void click_on_login_button() throws InterruptedException {
//        Thread.sleep(4000);
//        homePage.clickOnLoginButton();
//    }
//
//    @Then("user is logged in")
//    public void user_is_logged_in() {
//
//    }
//// Now implementing SS2 and SS3 and SS4
//
//
//
//    @When("i enter invalid user id as {string}")
//    public void i_enter_invalid_user_id_as(String string) {
//
//    }
//
//    @When("i enter valid password as {string}")
//    public void i_enter_valid_password_as(String string) {
//
//    }
//
//    @When("I click on loginbutton")
//    public void i_click_on_loginbutton() {
//
//    }
//
//    @Then("Application access is not granted and correct message is displayed as {string}")
//    public void application_access_is_not_granted_and_correct_message_is_displayed_as(String string) {
//
//    }
//
//    @When("i enter valid user id as {string}")
//    public void i_enter_valid_user_id_as(String string) {
//
//    }
//
//    @When("i enter invalid password as {string}")
//    public void i_enter_invalid_password_as(String string) {
//
//    }
//


}
