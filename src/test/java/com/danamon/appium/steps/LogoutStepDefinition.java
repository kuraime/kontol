package com.danamon.appium.steps;

import com.aventstack.extentreports.ExtentTest;
import com.danamon.appium.pages.authentication.LoginPage;
import com.danamon.appium.pages.authentication.SplashScreenPage;
import com.danamon.appium.pages.common.MPINPage;
import com.danamon.appium.utils.ExtentReportManager;
import com.danamon.appium.pages.common.BasePage;
import com.danamon.appium.pages.dashboard.DashboardCardPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LogoutStepDefinition extends BasePage {
    private static final Logger log = LoggerFactory.getLogger(LoginPageStepDefinition.class);
    ExtentTest test = ExtentReportManager.getInstance(applicationUtils.getPlatformName()).createTest("Test "+ this.getClass().getName() +" Scenario");

    private final DashboardCardPage dashboardCardPage;

    // No-args constructor
    public LogoutStepDefinition() {
        this.dashboardCardPage = new DashboardCardPage();
        test.pass("User Success At Dashboard");
    }

    @Then("^the user logout with \"([^\"]*)\"$")
    public void the_user_logout_with(String flow) {
        dashboardCardPage.logoutApplication(flow);
        test.pass("User Success Logout");
    }
}
