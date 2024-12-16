package com.danamon.appium.steps;

import com.aventstack.extentreports.ExtentTest;
import com.danamon.appium.utils.ExtentReportManager;
import com.danamon.appium.pages.common.BasePage;
import com.danamon.appium.pages.authentication.LoginPage;
import com.danamon.appium.pages.dashboard.DashboardCardPage;
import com.danamon.appium.pages.common.MPINPage;
import com.danamon.appium.pages.authentication.SplashScreenPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoginPageStepDefinition extends BasePage {
	private static final Logger log = LoggerFactory.getLogger(LoginPageStepDefinition.class);
    ExtentTest test = ExtentReportManager.getInstance(applicationUtils.getPlatformName()).createTest("Test "+ this.getClass().getName() +" Scenario");

    private final LoginPage loginPage;
    private final DashboardCardPage dashboardCardPage;
	private final MPINPage mpinPage;
	private final SplashScreenPage splashScreenPage;


    // No-args constructor
	public LoginPageStepDefinition() {
		this.loginPage = new LoginPage();
        this.dashboardCardPage = new DashboardCardPage();
		this.mpinPage = new MPINPage();
		this.splashScreenPage = new SplashScreenPage();
	}

	@Given("^the user is on the Login page \"([^\"]*)\"$")
	public void the_user_is_on_the_Login_page(String arg1) throws Throwable {
		if (arg1.equals("true")){
			loginPage.loadPage("binding");
		} else {
			splashScreenPage.loadPage();
			splashScreenPage.checkingTwoButton();
			splashScreenPage.clickExistingUserButton();
			loginPage.loadPage("not binding");
		}

        test.pass("Success Assert Login Page Binding/Unbinding")
			.addScreenCaptureFromBase64String(
				applicationUtils.screenshot("Login", "C:\\Automation\\AutomationScreenshoots\\Login\\"),
				"Success Assert Login Page Binding/Unbinding"
			);
	}

	@When("^the user enters \"([^\"]*)\" and \"([^\"]*)\"$")
	public void the_user_enters_and(String arg1, String arg2)  {
		loginPage.inputCorrectUsernameAndPassword(arg1, arg2);
	    test.pass("Success Input Username & Password");
    }

	@Then("^clicks the login button$")
	public void clicks_the_login_button() {
		loginPage.clickLoginButton();
        test.pass("Success Click Button Login");
	}

	@Then("^the user should see the dashboard or home page$")
	public void the_user_should_see_the_dashboard_or_home_page() throws Throwable {
        dashboardCardPage.loadCard();
        test.pass("Success To Dashboard Page");
    }

	@Then("^the user should see information verification page$")
	public void the_user_should_see_activation_page() throws Throwable {
		loginPage.informationVerification();
		test.pass("Success To Information Verification Page");
	}

	@Then("^the user click next button$")
	public void the_user_click_next_button() throws Throwable {
		loginPage.nextButton();
		test.pass("Clicked Next Button");
	}

	@Then("^the user should see verification mobile phone page$")
	public void the_user_should_see_verification_mobile_phone_page() throws Throwable {
		loginPage.informationVerification();
		test.pass("Verification OTP Mobile Phone Page");
	}

	@Then("^the user input otp activation$")
	public void the_user_input_otp_activation() throws Throwable {
		loginPage.informationVerification();
		loginPage.inputMobileOTP();
		test.pass("Verification OTP Mobile Phone Page");
	}

	@Then("^the user should see success activation account$")
	public void the_user_should_be_see_success_activation_account() throws Throwable {
		loginPage.reactivationSuccessPage();
		test.pass("Success Reactivation Account");
	}
}