package com.danamon.appium.steps;

import com.danamon.appium.pages.authentication.SplashScreenPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SplashPageStepDefinition {
	private final SplashScreenPage splashScreenPage;
	// No-args constructor
	public SplashPageStepDefinition() {
		this.splashScreenPage = new SplashScreenPage();
	}

	@When("^the splash page is displayed$")
	public void the_splash_page_is_displayed() throws Throwable {
		splashScreenPage.loadPage();
	}

	@Then("^there should be two buttons on the splash page$")
	public void there_should_be_two_buttons_on_the_splash_page() throws Throwable {
		splashScreenPage.checkingTwoButton();
	}

	@Then("^the user clicks on the registered user button and navigate to login page$")
	public void the_user_clicks_on_the_registered_user_button() throws Throwable {
		splashScreenPage.clickExistingUserButton();
	}

}