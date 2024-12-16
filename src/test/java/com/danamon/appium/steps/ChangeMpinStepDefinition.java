package com.danamon.appium.steps;

import com.aventstack.extentreports.ExtentTest;
import com.danamon.appium.pages.common.BasePage;
import com.danamon.appium.pages.common.MPINPage;
import com.danamon.appium.pages.common.SettingPage;
import com.danamon.appium.utils.ExtentReportManager;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ChangeMpinStepDefinition extends BasePage {
    private static final Logger log = LoggerFactory.getLogger(ChangeMpinStepDefinition.class);
    ExtentTest test = ExtentReportManager.getInstance(applicationUtils.getPlatformName()).createTest("Test "+ this.getClass().getName() +" Scenario");

    private final MPINPage mpinPage;
    private final SettingPage settingPage;

    public ChangeMpinStepDefinition(){
        this.mpinPage = new MPINPage();
        this.settingPage = new SettingPage();
    }

    @When("the user click ubah mpin on the setting menu")
    public void theUserClickUbahMpinOnTheSettingMenu() {
        settingPage.clickChangeMpin();
    }

    @Then("User will verify that their mPin has been changed")
    public void userWillVerifyThatTheirMPinHasBeenChanged() {
    }
}

