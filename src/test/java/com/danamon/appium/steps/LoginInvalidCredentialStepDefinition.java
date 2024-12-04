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

public class LoginInvalidCredentialStepDefinition extends BasePage {
    private static final Logger log = LoggerFactory.getLogger(LoginInvalidCredentialStepDefinition.class);
    ExtentTest test = ExtentReportManager.getInstance(applicationUtils.getPlatformName()).createTest("Test "+ this.getClass().getName() +" Scenario");


    private final SplashScreenPage splashScreenPage;
    private final LoginPage loginPage;

    // No-args constructor
    public LoginInvalidCredentialStepDefinition(){
        this.splashScreenPage = new SplashScreenPage();
        this.loginPage = new LoginPage();
    }
    @When("user open dbankpro app")
    public void userOpenDbankproApp() {
        splashScreenPage.loadPage();

    }

    @Then("User will go to the splash screen")
    public void userWillGoToTheSplashScreen() {
        splashScreenPage.checkingTwoButton();
    }

    @Then("User will go to the login page")
    public void userWillGoToTheLoginPage() {
        splashScreenPage.clickExistingUserButton();
        test.pass("mantap");
    }

    @Given("user is in login page")
    public void userIsInLoginPage() {

    }

    @When("User input {string} and {string}")
    public void userInputAnd(String arg0, String arg1) {
        loginPage.inputCorrectUsernameAndPassword(arg0,arg1);
    }

    @Then("User click login button")
    public void userClickLoginButton() {
        loginPage.clickLoginButton();
    }

    @Then("User will see popup for invalide credential")
    public void userWillSeePopupForInvalideCredential() {
        loginPage.clickPopupErrorButton();
        loginPage.loadPage();
        test.pass("yay");
    }
}
