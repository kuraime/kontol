package com.danamon.appium.steps;

import com.aventstack.extentreports.ExtentTest;
import com.danamon.appium.pages.authentication.LoginPage;
import com.danamon.appium.pages.common.BasePage;
import com.danamon.appium.pages.financial.LoanPage;
import com.danamon.appium.pages.navigations.NavigationPage;
import com.danamon.appium.utils.ExtentReportManager;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoanPageStepDefinition extends BasePage {
    private static final Logger log = LoggerFactory.getLogger(DashboardPageStepDefinition.class);
    ExtentTest test = ExtentReportManager.getInstance(applicationUtils.getPlatformName()).createTest("Test "+ this.getClass().getName() +" Scenario");

    private final NavigationPage navigationPage;
    private final LoanPage loanPage;

    public LoanPageStepDefinition() throws Throwable {
        this.navigationPage = new NavigationPage();
        this.loanPage = new LoanPage();
    }

    @And("i tap the navigation financial")
    public void iTapTheNavigationFinancial() {
        navigationPage.tapNavigationFinancial();
        test.pass("Directed to Account Summary Financial Screen");
    }

    @And("i tap the menu loan")
    public void iTapTheMenuLoan() {
        loanPage.openLoanMenu();
        test.pass("Swipe to Account Summary Loan List Screen");
    }

    @Then("i should be directed to loan list")
    public void iShouldBeDirectedToLoanList() {
        loanPage.verifyLoan();
        test.pass("Success");
    }

    @And("i am verify the default toggle is credit card")
    public void iAmVerifyTheDefaultToggleIsCreditCard() {
        loanPage.verifyDefaultToggleCreditCard();
    }

    @And("have no product credit card")
    public void haveNoProductCreditCard() {
        loanPage.verifyHaveNoCreditCard();
    }

    @When("i tap the toggle loan")
    public void iTapTheToggleLoan() {
        loanPage.setToggleLoan();
    }

    @And("i am verify the toggle is loan")
    public void iAmVerifyTheDefaultToggleIsLoan() {
        loanPage.verifyToggleLoan();
    }

    @And("i am verify the loan list have a product")
    public void iAmVerifyTheLoanListHaveAProduct() {
        loanPage.verifyListCardContent();
    }

    @When("^i tap one of above the loan account \"([^\"]*)\"$")
    public void iTapOneOfAboveTheLoanAccount(String accountNumber) {
        loanPage.tapLoanData(accountNumber);
        test.pass("Success");
    }

    @Then("i should see the loan account detail")
    public void iShouldSeeTheLoanAccountDetail() {
        loanPage.verifyLoanDetail();
        test.pass("Success");
    }

    @And("i tap back from account summary loan detail")
    public void iTapBackFromAccountSummaryLoanDetail() {
        loanPage.setTapBack();
    }
}
