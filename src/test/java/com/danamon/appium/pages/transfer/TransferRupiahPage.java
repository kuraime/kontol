package com.danamon.appium.pages.transfer;

import com.danamon.appium.pages.common.BasePage;
import com.danamon.appium.utils.AppiumDriverFactory;
import com.danamon.appium.utils.ApplicationUtils;
import io.appium.java_client.AppiumDriver;
import org.testng.Assert;

public class TransferRupiahPage extends BasePage {

	//PageObject can be moved to DB
	public static final String androidOtherAccountXPath = "//androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View[2]";
	public static final String iosOtherAccountXPath = "";

	public static final String androidBottomsheetDestinationAccountXPath = "//android.view.ViewGroup/android.view.View/android.view.View/android.view.View[2]";
	public static final String iosBottomsheetDestinationAccountXPath = "";

	public static final String androidBottomsheetAddNewRecipientXPath = "//android.widget.ScrollView/android.view.View[5]";
	public static final String iosBottomsheetAddNewRecipientXPath = "";

	public static final String androidInputAmountTransferAmountXPath = "//android.widget.ScrollView/android.widget.EditText[1]";
	public static final String iosInputAmountTransferAmountXPath = "";

	public static final String androidInputNotesTransferAmountXPath = "//android.widget.ScrollView/android.widget.EditText[2]";
	public static final String iosInputNotesTransferAmountXPath = "";

	public static final String androidNextButtonInputAmountXPath = "//android.widget.ScrollView/android.view.View/android.widget.Button";
	public static final String iosNextButtonInputAmountXPath = "";

	public static final String androidNextButtonSourceOfFundXPath = "//android.widget.ScrollView/android.view.View[2]/android.widget.Button";
	public static final String iosNextButtonSourceOfFundXPath = "";

	public static final String androidConfirmationBottomsheetXPath = "//android.view.ViewGroup/android.view.View/android.view.View/android.view.View[2]";
	public static final String iosConfirmationBottomsheetXPath = "";

	public static final String androidConfirmationButtonConfirmationBottomsheetXPath = "//android.widget.ScrollView/android.view.View[2]/android.widget.Button";
	public static final String iosConfirmationButtonConfirmationBottomsheetXPath = "";

	public static final String androidMPINPageXPath = "//android.widget.TextView[@text=\"Enter mPIN\"]";
	public static final String iosMPINPageXPath = "//android.widget.TextView[@text=\"Enter mPIN\"]";

	public void loadPage() {
		if (applicationUtils.waitForElementToBePresent(applicationUtils.getXPath(androidOtherAccountXPath, iosOtherAccountXPath), 30L)) {
			Assert.assertTrue(applicationUtils.objectExists(applicationUtils.getXPath(androidOtherAccountXPath, iosOtherAccountXPath)));
			System.out.println("Transfer Page is loaded successfully");
		} else {
			System.out.println("Transfer Page is failed to load");
		}
	}

	public void tapOtherAccount() {
		applicationUtils.tapElement(applicationUtils.getXPath(androidOtherAccountXPath, androidOtherAccountXPath), null);
	}

	public void loadBottomSheetDestinationAccountPage() {
		applicationUtils.waitForElementToBePresent(applicationUtils.getXPath(androidBottomsheetDestinationAccountXPath, iosBottomsheetDestinationAccountXPath), 30L);
		Assert.assertTrue(applicationUtils.objectExists(applicationUtils.getXPath(androidBottomsheetDestinationAccountXPath, iosBottomsheetDestinationAccountXPath)));
	}

	public void tapAddNewRecipientButtonInBottomSheetDestinationAccountPage() {
		applicationUtils.tapElement(applicationUtils.getXPath(androidBottomsheetAddNewRecipientXPath, iosBottomsheetAddNewRecipientXPath), null);
	}

	public void tapNextOnSourceOfFundPage() {
		applicationUtils.tapElement(applicationUtils.getXPath(androidNextButtonSourceOfFundXPath, iosNextButtonSourceOfFundXPath), null);
	}

	public void inputAmountAndNotesInTransferAmountBottomsheet(String amount, String notes) {
		applicationUtils.enterValueInTextBox(amount,applicationUtils.getXPath(androidInputAmountTransferAmountXPath, iosInputAmountTransferAmountXPath));
		applicationUtils.enterValueInTextBox(notes,applicationUtils.getXPath(androidInputNotesTransferAmountXPath, iosInputNotesTransferAmountXPath));
		applicationUtils.tapElement(applicationUtils.getXPath(androidNextButtonInputAmountXPath, iosNextButtonInputAmountXPath), null);
	}

	public void loadConfirmationPageBottomsheet() {
		applicationUtils.waitForElementToBePresent(applicationUtils.getXPath(androidConfirmationBottomsheetXPath, iosConfirmationBottomsheetXPath), 50L);
		Assert.assertTrue(applicationUtils.objectExists(applicationUtils.getXPath(androidConfirmationBottomsheetXPath, iosConfirmationBottomsheetXPath)));
		System.out.println("Bottomsheet confirmation is loaded successfully");
	}

	public void tapConfirmInConfirmationBottomsheet() {
		applicationUtils.tapElement(applicationUtils.getXPath(androidConfirmationButtonConfirmationBottomsheetXPath, iosConfirmationButtonConfirmationBottomsheetXPath), null);
	}
}
