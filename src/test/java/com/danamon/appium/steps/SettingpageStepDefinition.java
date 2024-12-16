package com.danamon.appium.steps;

import com.aventstack.extentreports.ExtentTest;
import com.danamon.appium.pages.common.BasePage;
import com.danamon.appium.pages.navigations.NavigationPage;
import com.danamon.appium.pages.common.SettingPage;
import com.danamon.appium.utils.ExtentReportManager;
import io.cucumber.java.en.Then;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SettingpageStepDefinition extends BasePage {
    private static final Logger log = LoggerFactory.getLogger(SettingPage.class);
    ExtentTest test = ExtentReportManager.getInstance(applicationUtils.getPlatformName()).createTest("Test " + this.getClass().getName() + " Scenario");

    private final NavigationPage navigationPage;
    private final SettingPage settingPage;

    public SettingpageStepDefinition() {
        this.navigationPage = new NavigationPage();
        this.settingPage = new SettingPage();
    }


    @Then("the user click the setting button on the navigation")
    public void theUserClickTheSettingButtonOnTheNavigation() {
        navigationPage.tapNavigationSettings();
    }

    @Then("the user will redirected to the setting page")
    public void theUserWillRedirectedToTheSettingPage() {
        settingPage.loadSettingPage();
        test.pass("Succesfully go into setting page").addScreenCaptureFromBase64String(applicationUtils.screenshot("Setting Page Loaded","D:\\Screenshoot automation"));
    }
}
