package com.danamon.appium.pages.common;

import org.testng.Assert;

import java.util.List;

public class MPINPage extends BasePage {
	//PageObject can be moved to DB
	public static final String androidMpinPageXPath = "//androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View[1]";
	public static final String iosMpinPageXPath = "";

	public static final String androidMPINTitlePageXPath = "//android.widget.TextView[@text=\"Enter mPIN\"]";
	public static final String iosMPINTitlePageXPath = "//android.widget.TextView[@text=\"Enter mPIN\"]";

	public static final String androidNumberOneXPath = "//androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View[1]/android.view.View[1]/android.widget.Button";
	public static final String iosNumberOneXPath = "";

	public static final String androidNumberTwoXPath = "//androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View[1]/android.view.View[2]/android.widget.Button";
	public static final String iosNumberTwoXPath = "";

	public static final String androidNumberThreeXPath = "//androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View[1]/android.view.View[3]/android.widget.Button";
	public static final String iosNumberThreeXPath = "";

	public static final String androidNumberFourXPath = "//androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View[1]/android.view.View[4]/android.widget.Button";
	public static final String iosNumberFourXPath = "";

	public static final String androidNumberFiveXPath = "//androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View[1]/android.view.View[5]/android.widget.Button";
	public static final String iosNumberFiveXPath = "";

	public static final String androidNumberSixXPath = "//androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View[1]/android.view.View[6]/android.widget.Button";
	public static final String iosNumberSixXPath = "";

	public static final String androidNumberSevenXPath = "//androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View[1]/android.view.View[7]/android.widget.Button";
	public static final String iosNumberSevenXPath = "";

	public static final String androidNumberEightXPath = "//androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View[1]/android.view.View[8]/android.widget.Button";
	public static final String iosNumberEightXPath = "";

	public static final String androidNumberNineXPath = "//androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View[1]/android.view.View[9]/android.widget.Button";
	public static final String iosNumberNineXPath = "";

	public void loadPage() {
			applicationUtils.waitForElementToBePresent(applicationUtils.getXPath(androidMpinPageXPath, iosMpinPageXPath), 60L);
			Assert.assertTrue(applicationUtils.objectExists(applicationUtils.getXPath(androidMPINTitlePageXPath, iosMPINTitlePageXPath)));
			Assert.assertTrue(applicationUtils.objectExists(applicationUtils.getXPath(androidNumberOneXPath, iosNumberOneXPath)));
			Assert.assertTrue(applicationUtils.objectExists(applicationUtils.getXPath(androidNumberTwoXPath, iosNumberTwoXPath)));
			Assert.assertTrue(applicationUtils.objectExists(applicationUtils.getXPath(androidNumberThreeXPath, iosNumberThreeXPath)));
			Assert.assertTrue(applicationUtils.objectExists(applicationUtils.getXPath(androidNumberFourXPath, iosNumberFourXPath)));
			Assert.assertTrue(applicationUtils.objectExists(applicationUtils.getXPath(androidNumberFiveXPath, iosNumberFiveXPath)));
			Assert.assertTrue(applicationUtils.objectExists(applicationUtils.getXPath(androidNumberSixXPath, iosNumberSixXPath)));
			Assert.assertTrue(applicationUtils.objectExists(applicationUtils.getXPath(androidNumberSevenXPath, iosNumberSevenXPath)));
			Assert.assertTrue(applicationUtils.objectExists(applicationUtils.getXPath(androidNumberEightXPath, iosNumberEightXPath)));
			Assert.assertTrue(applicationUtils.objectExists(applicationUtils.getXPath(androidNumberNineXPath, iosNumberNineXPath)));

			System.out.println("MPIN Page is loaded successfully");
	}

	public void inputMpin(String pin) {
		// Split the input string into a list of numbers
		List<String> numbers = List.of(pin.split(","));
		// Iterate through each number
		for (String number : numbers) {
			switch (number) {
			case "1" -> applicationUtils.tapElement(applicationUtils.getXPath(androidNumberOneXPath, iosNumberOneXPath), null);
			case "2" -> applicationUtils.tapElement(applicationUtils.getXPath(androidNumberTwoXPath, iosNumberOneXPath), null);
			case "3" -> applicationUtils.tapElement(applicationUtils.getXPath(androidNumberThreeXPath, iosNumberOneXPath), null);
			case "4" -> applicationUtils.tapElement(applicationUtils.getXPath(androidNumberFourXPath, iosNumberOneXPath), null);
			case "5" -> applicationUtils.tapElement(applicationUtils.getXPath(androidNumberFiveXPath, iosNumberOneXPath), null);
			case "6" -> applicationUtils.tapElement(applicationUtils.getXPath(androidNumberSixXPath, iosNumberOneXPath), null);
			case "7" -> applicationUtils.tapElement(applicationUtils.getXPath(androidNumberSevenXPath, iosNumberOneXPath), null);
			case "8" -> applicationUtils.tapElement(applicationUtils.getXPath(androidNumberEightXPath, iosNumberOneXPath), null);
			case "9" -> applicationUtils.tapElement(applicationUtils.getXPath(androidNumberNineXPath, iosNumberOneXPath), null);
			default -> System.out.println("MPIN is out of bounds");
			}
		}
	}
}
