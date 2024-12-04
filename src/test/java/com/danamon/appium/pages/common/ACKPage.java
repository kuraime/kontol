package com.danamon.appium.pages.common;

import org.testng.Assert;

public class ACKPage extends BasePage{

	//PageObject can be moved to DB
	public static final String androidAckTransferDetailsXPath = "//android.widget.ScrollView/android.view.View[1]";
	public static final String iosAckTransferDetailsXPath = "";

	public static final String androidBackToHomePageXPath = "//android.widget.ScrollView/android.view.View[4]/android.widget.Button";
	public static final String iosBackToHomePageXPath = "//android.widget.ScrollView/android.view.View[4]/android.widget.Button";

	public void loadPage() {
		applicationUtils.waitForElementToBePresent(applicationUtils.getXPath(androidAckTransferDetailsXPath, iosAckTransferDetailsXPath), 60L);
		Assert.assertTrue(applicationUtils.objectExists(applicationUtils.getXPath(androidAckTransferDetailsXPath, iosAckTransferDetailsXPath)));
		System.out.println("ACK Page is loaded successfully");
	}

	public void tapBackToHomepage() {
		applicationUtils.tapElement(applicationUtils.getXPath(androidBackToHomePageXPath, iosBackToHomePageXPath), null);
	}
}
