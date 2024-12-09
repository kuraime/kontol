package com.danamon.appium.pages.authentication;

import com.danamon.appium.pages.common.BasePage;
import com.danamon.appium.utils.ApplicationUtils;
import org.apache.commons.lang3.StringUtils;
import org.openqa.selenium.By;
import org.testng.Assert;

public class LoginPage extends BasePage {

	//PageObject
	public static final String iconDanamonXPath = "//android.widget.ImageView[@content-desc=\"App Icon\"]";
	public static final String iconChangeLanguageXPath = "//android.widget.ScrollView/android.view.View[1]";
	public static final String iconFaqXPath = "//android.widget.ImageView[@content-desc=\"FAQ\"]";
	public static final String androidTextInputUsernameXPath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.widget.ScrollView/android.widget.EditText[1]";
	public static final String iosTextInputUsernameXPath = "//android.view.View[@content-desc=\"EmailContentDescription\"]/android.widget.EditText";
	public static final String androidUsernameXPath = "//android.widget.TextView[@text=\"tiara cantik\"]";
	public static final String textInputPasswordXPath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.widget.ScrollView/android.widget.EditText[2]";
	public static final String iconPeekPasswordXPath = "//android.view.View[@content-desc=\"toggle_password\"]";
	public static final String forgotPasswordXPath = "//android.widget.TextView[@text=\"Lupa Password?\"]";
	public static final String textLoginButtonIdXPath = "//android.widget.TextView[@text=\"Login\"]";
	public static final String LoginButtonIdXPath = "//android.widget.ScrollView/android.view.View[2]/android.widget.Button";
	public static final String iconButtonHelloDanmonXPath = "//android.widget.ScrollView/android.widget.Button";
	public static final String bottomSheetViePromPageXPath = "//android.view.View[@content-desc=\"Drag Handle\"]";
	public static final String popupErrorInvalidCredential = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.View/android.view.View/android.view.View[2]";
	public static final String popupErrorHeader = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.View/android.view.View/android.view.View[2]/android.widget.TextView[1]";
	public static final String popupErrorButton = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.View/android.view.View/android.view.View[2]/android.view.View[2]/android.widget.Button";

	public void loadPage() {
		if (applicationUtils.objectExists(applicationUtils.getXPath(androidTextInputUsernameXPath, iosTextInputUsernameXPath))) {
			Assert.assertTrue(applicationUtils.getElementIsDisplayed(applicationUtils.getXPath(iconDanamonXPath, iconDanamonXPath)));
			Assert.assertTrue(applicationUtils.getElementIsDisplayed(By.xpath(iconChangeLanguageXPath)));
			Assert.assertTrue(applicationUtils.getElementIsDisplayed(By.xpath(iconFaqXPath)));
			Assert.assertTrue(applicationUtils.objectExists(By.xpath(textInputPasswordXPath)));
			Assert.assertTrue(applicationUtils.objectExists(By.xpath(iconPeekPasswordXPath)));
			Assert.assertTrue(applicationUtils.objectExists(By.xpath(forgotPasswordXPath)));
			Assert.assertTrue(applicationUtils.objectExists(By.xpath(textLoginButtonIdXPath)));
			Assert.assertTrue(applicationUtils.objectExists(By.xpath(iconButtonHelloDanmonXPath)));
			Assert.assertTrue(applicationUtils.objectExists(By.xpath(bottomSheetViePromPageXPath)));
			System.out.println("Login Page Device Not Binded Launched!");
		} else {
			Assert.assertTrue(applicationUtils.objectExists(By.xpath(textInputPasswordXPath)));
			System.out.println("Login Page Device Binded Launched!");
		}
	}

	public void inputCorrectUsernameAndPassword(String username, String password) {
		if (StringUtils.isNotBlank(username)) {
			applicationUtils.enterValueInTextBox(username,  applicationUtils.getXPath(androidTextInputUsernameXPath,iosTextInputUsernameXPath));
			applicationUtils.enterValueInTextBox(password,  applicationUtils.getXPath(textInputPasswordXPath,textInputPasswordXPath));
		} else {
			applicationUtils.enterValueInTextBox(password,  applicationUtils.getXPath(textInputPasswordXPath,textInputPasswordXPath));
		}
	}

	public void clickLoginButton() {
		Assert.assertTrue(applicationUtils.tapElement(By.xpath(LoginButtonIdXPath), null));
	}

	public void clickPopupErrorButton(){
		Assert.assertTrue(applicationUtils.getElementIsDisplayed(By.xpath(popupErrorInvalidCredential)));
		Assert.assertTrue(applicationUtils.getElementIsDisplayed(By.xpath(popupErrorHeader)));
		Assert.assertTrue(applicationUtils.tapElement(By.xpath(popupErrorButton),null));
	}
}
