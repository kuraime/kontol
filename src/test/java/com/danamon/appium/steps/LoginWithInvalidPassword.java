package com.danamon.appium.steps;

import com.aventstack.extentreports.ExtentTest;
import com.danamon.appium.pages.authentication.LoginPage;
import com.danamon.appium.pages.authentication.SplashScreenPage;
import com.danamon.appium.pages.common.BasePage;
import com.danamon.appium.utils.ExtentReportManager;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class LoginWithInvalidPassword extends BasePage {
    private static final Logger log = LoggerFactory.getLogger(LoginWithInvalidPassword.class);
    ExtentTest test = ExtentReportManager.getInstance(applicationUtils.getPlatformName()).createTest("Test "+ this.getClass().getName() +" Scenario");
        private final LoginPage loginpage;
        private final SplashScreenPage splashscreen;


        public LoginWithInvalidPassword() {
            this.loginpage = new LoginPage();
            this.splashscreen = new SplashScreenPage();
        }


        @Given("^The user is on the login page$")
        public void the_user_is_on_the_login_page() throws Throwable {

            loginpage.loadPage();
            splashscreen.loadPage();
            splashscreen.checkingTwoButton();
            splashscreen.clickExistingUserButton();
            test.pass("login success");
        }

        @When("^the user enter invalid \"([^\"]*)\" and \"([^\"]*)\"$")
        public void the_user_enter_invalid(String arg1, String arg2) {
            loginpage.inputCorrectUsernameAndPassword(arg1, arg2);
            loginpage.clickLoginButton();
        }


        @Then("^there will be error popup for invalid credential$")
        public void there_will_be_error() {
            loginpage.assertPopupInvalidLogin();
        }

 }
