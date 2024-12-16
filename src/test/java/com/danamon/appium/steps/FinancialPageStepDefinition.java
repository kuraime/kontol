package com.danamon.appium.steps;

import com.aventstack.extentreports.ExtentTest;
import com.danamon.appium.pages.authentication.LoginPage;
import com.danamon.appium.pages.common.BasePage;
import com.danamon.appium.pages.financial.FinancialPage;
import com.danamon.appium.pages.navigations.NavigationPage;
import com.danamon.appium.utils.ExtentReportManager;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FinancialPageStepDefinition extends BasePage {
    //private static final Logger log = LoggerFactory.getLogger(DashboardPageStepDefinition.class);
    ExtentTest test = ExtentReportManager.getInstance(applicationUtils.getPlatformName()).createTest("Test "+ this.getClass().getName() +" Scenario");

    private final NavigationPage navigationPage;
    private final FinancialPage financialPage;
    private final LoginPage loginPage;

    public FinancialPageStepDefinition () throws Throwable {
        this.navigationPage = new NavigationPage();
        this.financialPage = new FinancialPage();
        this.loginPage = new LoginPage();
    }
    @Given("i tap the navigation financial {string}")
    public void iTapTheNavigationFinancial(String string) {
        loginPage.loadPage("binding");
        loginPage.inputCorrectUsernameAndPassword(null, string);
        loginPage.clickLoginButton();
        test.pass("Logged in Successful");
        navigationPage.tapNavigationFinancial();
        test.pass("Directed to Financial Account Summary");
    }

    @And("i tap the toggle choose account or rekening")
    public void iTapTheToggleChooseAccountOrRekening() {
    }

    @Then("i should see the financial account summary")
    public void iShouldSeeTheFinancialAccountSummary() {
        financialPage.verifyTitleFinancial();
    }

    @And("i choose the goal savings options")
    public void iChooseTheGoalSavingsOptions() {
    }

    @Then("i should be switch to goal savings section")
    public void iShouldBeSwitchToGoalSavingsSection() {
    }

    @And("i scroll to bottom for view all account")
    public void iScrollToBottomForViewAllAccount() {
        financialPage.iScrollToBottomForViewAllAccount();
    }

    @And("i scroll to top for back to top")
    public void iScrollToTopForBackToTop() {
        financialPage.iScrollToTopForBackToTop();
    }

    @When("i tap one of above the casa account {string}")
    public void iTapOneOfAboveTheCasaAccount(String arg0) {
        financialPage.tapCasaAccNumber(arg0);
    }

    @Then("i should see the account summary casa detail")
    public void iShouldSeeTheAccountSummaryCasaDetail() {
    }

    @And("i am verify the section time deposit detail")
    public void iAmVerifyTheSectionTimeDepositDetail() {
    }

    @And("i am verify the section time deposit transaction history in {int} data sort as descending")
    public void iAmVerifyTheSectionTimeDepositTransactionHistoryInDataSortAsDescending() {
    }

    @And("i tap view all")
    public void iTapViewAll() {
    }

    @Then("i should see the all transaction history")
    public void iShouldSeeTheAllTransactionHistory() {
    }

    @And("i tap back from transaction history")
    public void iTapBackFromTransactionHistory() {
    }

    @Then("i should be back to account summary detail")
    public void iShouldBeBackToAccountSummaryDetail() {
    }

    @Then("i should see the account summary goal savings detail")
    public void iShouldSeeTheAccountSummaryGoalSavingsDetail() {
    }

    @And("i am verify the section goal savings detail")
    public void iAmVerifyTheSectionGoalSavingsDetail() {
    }

    @And("i am verify the section goal savings transaction history in five data sort as descending")
    public void iAmVerifyTheSectionGoalSavingsTransactionHistoryInDataSortAsDescending() {
    }

    @And("i tap back from account summary detail")
    public void iTapBackFromAccountSummaryDetail() {
        financialPage.setTapBack();
    }

    @Then("i should be back to account summary financial list")
    public void iShouldBeBackToAccountSummaryFinancialList() {
    }

    @And("i choose the time deposit options")
    public void iChooseTheTimeDepositOptions() {
    }

    @Then("i should be switch to time deposit section")
    public void iShouldBeSwitchToTimeDepositSection() {
    }

    @When("i tap one of above the time deposit account {string}")
    public void iTapOneOfAboveTheTimeDepositAccount(String arg0) {
        financialPage.tapTimeDepositAccNumber(arg0);
    }

    @Then("i should see the time deposit detail")
    public void iShouldSeeTheTimeDepositDetail() {
    }

    @And("i am verify the section casa detail")
    public void iAmVerifyTheSectionCasaDetail() {

    }

    @And("i am verify the section casa detail transaction history in five data sort as descending")
    public void iAmVerifyTheSectionCasaDetailTransactionHistoryInDataSortAsDescending() {
    }

    @Then("i should see the account summary goal savings")
    public void iShouldSeeTheAccountSummaryGoalSavings() {

    }

    @Then("i should see the account summary time deposit")
    public void iShouldSeeTheAccountSummaryTimeDeposit() {

    }

    @When("i tap one of above the goal savings account {string}")
    public void iTapOneOfAboveTheGoalSavingsAccount(String arg0) {
        financialPage.tapGoalSavingsAccNumber(arg0);
    }
}
