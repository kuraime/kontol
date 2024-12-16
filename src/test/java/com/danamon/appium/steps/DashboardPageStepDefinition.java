package com.danamon.appium.steps;

import com.aventstack.extentreports.ExtentTest;
import com.danamon.appium.pages.authentication.LoginPage;
import com.danamon.appium.pages.common.BasePage;
import com.danamon.appium.pages.dashboard.DashboardCardPage;
import com.danamon.appium.utils.ExtentReportManager;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DashboardPageStepDefinition extends BasePage {
    private static final Logger log = LoggerFactory.getLogger(DashboardPageStepDefinition.class);
    ExtentTest test = ExtentReportManager.getInstance(applicationUtils.getPlatformName()).createTest("Test "+ this.getClass().getName() +" Scenario");

    private final DashboardCardPage dashboardCardPage;
    private final LoginPage loginPage;

    public DashboardPageStepDefinition() throws Throwable {
        this.dashboardCardPage = new DashboardCardPage();
        this.loginPage = new LoginPage();
    }

    @Given("the user already logged in with valid {string} on dbank pro")
    public void the_user_already_logged_in_on_dbank_pro(String string) {
        loginPage.loadPage("binding");
        loginPage.inputCorrectUsernameAndPassword(null, string);
        loginPage.clickLoginButton();
        test.pass("Logged in Successfull");
    }

    @When("the user tap copy account number")
    public void theUserTapCopyAccountNumber() {
        dashboardCardPage.tapCopyingAccNumber();
        test.pass("Copying Successfully");
    }

    @Then("the user should be successfully copy account card number & verify the toast message")
    public void theUserShouldBeSuccessfullyCopyAccountCardNumberVerifyTheToastMessage() {
        dashboardCardPage.verifyToastSuccessfullCopyAccNumber();
        test.pass("Toast Successfully Verify");
    }

    @When("the user tap button view detail")
    public void theUserTapButtonViewDetail() {
        dashboardCardPage.tapViewDetail();
        test.pass("Icon View Detail Success Tap");
    }

    @Then("the user should be directed to account summary card detail")
    public void theUserShouldBeDirectedToAccountSummaryCardDetail() {
        dashboardCardPage.verifyAccountSummaryDetail();
        test.pass("Directed to Account Summary Detail");
    }

    @And("User Verify Content on Account Summary Card Dashboard")
    public void userVerifyContentOnAccountSummaryCardDashboard() {
        dashboardCardPage.verifyCardAccountSummaryDashboard();
        test.pass("Account Summary Dashboard Verified");
    }

    @When("I tap the icon eye for see the amount value on Account Summary Dashboard")
    public void iTapTheIconEyeForSeeTheAmountValueOnAccountSummaryDashboard() {
        dashboardCardPage.tapMaskingAmount();
        test.pass("Amount is Tapping");
    }

    @Then("I should see the amount value on Account Summary Dashboard")
    public void iShouldSeeTheAmountValueOnAccountSummaryDashboard() {
        test.pass("Amount value is Unmasking");
        dashboardCardPage.verifyAmountValueUnmasking();
        dashboardCardPage.tapUmaskingAmount();
        test.pass("Amount is Tapping");
        dashboardCardPage.verifyAmountValueMasking();
        test.pass("Amount value is Masking");
    }

    @When("I tap the icon transfer rupiah")
    public void iTapTheIconTransferRupiah() {
        dashboardCardPage.tapIconIDRTransfer();
        test.pass("Icon IDR Transfer is Tapping");
    }

    @Then("I should be direct to screen transfer")
    public void iShouldBeDirectToScreenTransfer() {
        dashboardCardPage.moveToTransferPage();
        test.pass("Move to Transfer Screen");
    }

    @And("I tap back from screen transfer")
    public void iTapBackFromScreenTransfer() {
        dashboardCardPage.tapBackFromPreviousScreen();
        test.pass("Successfull Back From Previous Page");
    }

    @Then("I should be back to screen account summary dashboard")
    public void iShouldBeBackToScreenAccountSummaryDashboard() {
    }

    @When("I swipe to right for choose the card multiple currency account")
    public void iSwipeToRightForChooseTheCardMultipleCurrencyAccount() {
    }

    @And("I tap the dropdown list multiple currency account")
    public void iTapTheDropdownListMultipleCurrencyAccount() {
    }

    @Then("I should see the list of currency")
    public void iShouldSeeTheListOfCurrency() {
    }

    @And("I choose the one of above currency")
    public void iChooseTheOneOfAboveCurrency() {
    }

    @Then("I should see the card with multiple currency account")
    public void iShouldSeeTheCardWithMultipleCurrencyAccount() {
    }

    @And("I tap back from screen account summary card detail")
    public void iTapBackFromScreenAccountSummaryCardDetail() {
        dashboardCardPage.tapBackFromPreviousScreen();
    }
}
