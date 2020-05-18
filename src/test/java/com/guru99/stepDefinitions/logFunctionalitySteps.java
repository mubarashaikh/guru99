package com.guru99.stepDefinitions;

import com.guru99.pages.BasePage;
import com.guru99.pages.HomePage;
import com.guru99.pages.ManagerHomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.PageFactory;
import sun.jvm.hotspot.debugger.Page;

public class logFunctionalitySteps extends BasePage {
    HomePage homePage = PageFactory.initElements(driver, HomePage.class);
    ManagerHomePage managerHomePage = PageFactory.initElements(driver, ManagerHomePage.class);


    @Given("i navigate to guru{int} webPage")
    public void i_navigate_to_guru_webPage(Integer int1) {
        launchUrl();
    }

    @When("enter vaild user name")
    public void enter_vaild_user_name() {
        String  uId = "mngr261507";
        homePage.enterUserID(uId);
    }

    @When("enter valid password")
    public void enter_valid_password() {
        String  password = "jAjEmEd";

        homePage.enterPassword(password);
    }

    @When("click on login button")
    public void click_on_login_button() {
        homePage.clickOnLoginButton();
    }

    @Then("user is logged in")
    public void user_is_logged_in() {

    }



}