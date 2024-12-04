package com.danamon.appium.steps;

import com.danamon.appium.pages.authentication.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoginPageStepDefinition {
	private static final Logger log = LoggerFactory.getLogger(LoginPageStepDefinition.class);
	private final LoginPage loginPage;

	// No-args constructor
	public LoginPageStepDefinition() {
		this.loginPage = new LoginPage();
	}

	@Given("^the user is on the Login page$")
	public void the_user_is_on_the_Login_page() throws Throwable {
		loginPage.loadPage();
	}

	@When("^the user enters \"([^\"]*)\" and \"([^\"]*)\"$")
	public void the_user_enters_and(String arg1, String arg2)  {
		loginPage.inputCorrectUsernameAndPassword(arg1, arg2);
	}

	@Then("^clicks the login button$")
	public void clicks_the_login_button() {
		loginPage.clickLoginButton();
	}

	@Then("^the user should see the dashboard or home page$")
	public void the_user_should_see_the_dashboard_or_home_page() throws Throwable {
	}
}