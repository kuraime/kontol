package com.danamon.appium.steps;

import com.aventstack.extentreports.ExtentTest;
import com.danamon.appium.pages.authentication.LoginPage;
import com.danamon.appium.pages.common.ACKPage;
import com.danamon.appium.pages.common.AddNewRecipientPage;
import com.danamon.appium.pages.common.BasePage;
import com.danamon.appium.pages.common.MPINPage;
import com.danamon.appium.pages.dashboard.DashboardCardPage;
import com.danamon.appium.pages.transfer.TransferRupiahPage;
import com.danamon.appium.utils.ExtentReportManager;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TransferOverbookingNewBeneficiaryStepDefinition extends BasePage {
	private static final Logger log = LoggerFactory.getLogger(TransferOverbookingNewBeneficiaryStepDefinition.class);
	ExtentTest test = ExtentReportManager.getInstance(applicationUtils.getPlatformName()).createTest("Test "+ this.getClass().getName() +" Scenario");

	private final DashboardCardPage dashboardCardPage;
	private final TransferRupiahPage transferRupiahPage;
	private final AddNewRecipientPage addNewRecipientPage;
	private final MPINPage mpinPage;
	private final ACKPage ackPage;
	private final LoginPage loginPage;

	// No-args constructor
	public TransferOverbookingNewBeneficiaryStepDefinition() {
		this.dashboardCardPage = new DashboardCardPage();
		this.transferRupiahPage = new TransferRupiahPage();
		this.addNewRecipientPage = new AddNewRecipientPage();
		this.mpinPage = new MPINPage();
		this.ackPage = new ACKPage();
		this.loginPage = new LoginPage();
	}

	//User is in the login page with binded device
	@When("the user enters the {string} and tap login button")
	public void the_user_enters_the_and_tap_login_button(String string) {

		loginPage.inputCorrectUsernameAndPassword(null, string);
		loginPage.clickLoginButton();
		test.pass("Clik and input success");
	}

	//User is in the dashboard
	@Given("the user is on the Dashboard page")
	public void the_user_is_on_the_dashboard_page() {
		dashboardCardPage.loadCard();
	}
	@When("the users tap on Transfer Rupiah")
	public void the_users_tap_on_transfer_rupiah() {
		dashboardCardPage.tapIconIDRTransfer();
	}
	@Then("the user should see the choose Transfer Rupiah page")
	public void the_user_should_see_the_choose_transfer_rupiah_page() {
		dashboardCardPage.moveToTransferPage();
	}

	//User move to Transfer Page
	@Given("the user is on the IDR Transfer page")
	public void the_user_is_on_the_idr_transfer_page() {
		transferRupiahPage.loadPage();
	}
	@When("the users tap on Other Account")
	public void the_users_tap_on_other_account() {
		transferRupiahPage.tapOtherAccount();
	}
	@Then("the user should see Select Destination Account Bottomsheet")
	public void the_user_should_see_select_destination_account_bottomsheet() {
		transferRupiahPage.loadBottomSheetDestinationAccountPage();
	}

	//User move to select destination account Page
	@Given("the user is on the Select Destination Account Bottomsheet")
	public void the_user_is_on_the_select_destination_account_bottomsheet() {
		transferRupiahPage.loadBottomSheetDestinationAccountPage();
	}
	@When("the users tap Add New Recipient")
	public void the_users_tap_add_new_recipient() {
		transferRupiahPage.tapAddNewRecipientButtonInBottomSheetDestinationAccountPage();

	}
	@Then("the user should see list of available Bank")
	public void the_user_should_see_list_of_available_bank() {
		addNewRecipientPage.loadPage();
	}

	//User select new beneficiary Page
	@Given("the user is on the Add New Recipient Bottomsheet")
	public void the_user_is_on_the_add_new_recipient_bottomsheet() {
		addNewRecipientPage.loadPage();
	}
	@When("the users tap Bank DANAMON")
	public void the_users_tap_bank_danamon() {
		addNewRecipientPage.tapBankDanamonList();
	}
	@Then("the user should move to next page to input account number")
	public void the_user_should_move_to_next_page_to_input_account_number() {
	}

	//User input the beneficiary account page
	@Given("the user is on Add New Danamon Recipient Bottomsheet")
	public void the_user_is_on_add_new_danamon_recipient_bottomsheet() {
		transferRupiahPage.loadBottomSheetDestinationAccountPage();
	}

	@When("the user input correct account number {string} and tap next")
	public void the_user_input_correct_account_number_and_tap_next(String string) {
		addNewRecipientPage.fillAccountNumberAndTapNext(string);
	}

	@Then("the user should move to next page to input amount")
	public void the_user_should_move_to_next_page_to_input_amount() {
	}

	//User input transfer amount page
	@Given("the user is on Transfer Amount Bottomsheet")
	public void the_user_is_on_transfer_amount_bottomsheet() {
	}
	@When("the user input amount {string}, input notes {string} and tap Next")
	public void the_user_input_amount_input_notes_and_tap_next(String string, String string2) {
		transferRupiahPage.inputAmountAndNotesInTransferAmountBottomsheet(string, string2);
	}
	@Then("the user should move to source of fund page")
	public void the_user_should_move_to_source_of_fund_page() {
	}

	//User is in the source of fund page
	@Given("the user is on Source of fund Bottomsheet")
	public void the_user_is_on_source_of_fund_bottomsheet() {
	}
	@When("the user choose the product and tap next")
	public void the_user_choose_the_product_and_tap_next() {
	}
	@Then("the user should move to Confirmation Page")
	public void the_user_should_move_to_confirmation_page() {
		transferRupiahPage.tapNextOnSourceOfFundPage();
	}

	// User is on the confirmation page
	@Given("the user is on the Confirmation Page")
	public void the_user_is_on_the_confirmation_page() {
		transferRupiahPage.loadConfirmationPageBottomsheet();
	}
	@When("the user tap Confirm")
	public void the_user_tap_confirm() {
		transferRupiahPage.tapConfirmInConfirmationBottomsheet();
	}
	@Then("the user should move to MPIN Page")
	public void the_user_should_move_to_mpin_page() {
	}

	// User is on the MPIN page
	@Given("the user is on the MPIN Page")
	public void the_user_is_on_the_mpin_page() {
		mpinPage.loadPage();
	}
	@When("the user input pin {string}")
	public void the_user_input_pin(String string) {
		mpinPage.inputMpin(string);
	}
	@Then("the user should move to ACK Page")
	public void the_user_should_move_to_ack_page() {
	}

	// User is move to ACK page
	@Given("the user is on the ACK Page")
	public void the_user_is_on_the_ack_page() {
		ackPage.loadPage();
	}
	@When("the user tap Back to Homepage")
	public void the_user_tap_back_to_homepage() {
		ackPage.tapBackToHomepage();
	}
	@Then("the user should move to Dashboard Page")
	public void the_user_should_move_to_dashboard_page() {
	}
}
