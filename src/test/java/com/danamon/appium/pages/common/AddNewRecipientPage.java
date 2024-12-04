package com.danamon.appium.pages.common;

import org.testng.Assert;

public class AddNewRecipientPage extends BasePage {

	//PageObject can be moved to DB
	public static final String androidBottomsheetAddNewRecipient = "//android.view.ViewGroup/android.view.View/android.view.View/android.view.View[2]";
	public static final String iosBottomsheetAddNewRecipient = "";

	public static final String androidBankListObjectXPath = "//android.view.ViewGroup/android.view.View/android.view.View/android.view.View[2]/android.view.View[3]";
	public static final String iosBankListObjectXPath = "";

	public static final String androidBankDanamonListXPath = "//android.view.ViewGroup/android.view.View/android.view.View/android.view.View[2]/android.view.View[3]/android.view.View[1]";
	public static final String iosBankDanamonListXPath = "";

	public static final String androidInputAccountNo = "//android.widget.EditText";
	public static final String buttonNextInputAccountNumber = "//android.widget.ScrollView/android.view.View/android.widget.Button";

	public void loadPage() {
		applicationUtils.waitForElementToBePresent(applicationUtils.getXPath(androidBottomsheetAddNewRecipient, iosBottomsheetAddNewRecipient), 50L);
		Assert.assertTrue(applicationUtils.objectExists(applicationUtils.getXPath(androidBankListObjectXPath, iosBankListObjectXPath)));
	}

	public void tapBankDanamonList() {
		applicationUtils.tapElement(applicationUtils.getXPath(androidBankDanamonListXPath, iosBankDanamonListXPath), null);
	}

	public void fillAccountNumberAndTapNext(String acctNo) {
		applicationUtils.enterValueInTextBox(acctNo,applicationUtils.getXPath(androidInputAccountNo, androidInputAccountNo));
		applicationUtils.tapElement(applicationUtils.getXPath(buttonNextInputAccountNumber, buttonNextInputAccountNumber), null);
	}
}
