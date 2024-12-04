package com.danamon.appium.pages.authentication;

import com.danamon.appium.pages.common.BasePage;
import org.openqa.selenium.By;
import org.testng.Assert;

public class SplashScreenPage extends BasePage {
	//PageObject
	public static final String existingUserButtonXPath = "//androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.view.View[3]/android.widget.Button\n";
	public static final String newUserButtonXPath = "//androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.view.View[4]/android.widget.Button";

	public static final String subTitleScreenPageXPath = "//android.widget.TextView[@text=\"Sudah punya akun D-Bank PRO?\"]";
	public static final String existingUserButtonTextXPath = "//android.widget.TextView[@text=\"Sudah, Login Sekarang.\"]";
	public static final String newUserButtonTextXPath = "//android.widget.TextView[@text=\"Belum, Buat Akun.\"]";

	public void loadPage() {;
		System.out.println("Splash Screen Launch!");
	}

	public void checkingTwoButton() {
		Assert.assertTrue(applicationUtils.getElementIsDisplayed(By.xpath(newUserButtonXPath)));
		Assert.assertTrue(applicationUtils.getElementIsDisplayed(By.xpath(existingUserButtonXPath)));
		Assert.assertEquals(applicationUtils.getElementText(By.xpath(subTitleScreenPageXPath)), "Sudah punya akun D-Bank PRO?");
		Assert.assertEquals(applicationUtils.getElementText(By.xpath(existingUserButtonTextXPath)), "Sudah, Login Sekarang.");
		Assert.assertEquals(applicationUtils.getElementText(By.xpath(newUserButtonTextXPath)), "Belum, Buat Akun.");
	}

	public void clickExistingUserButton() {
		Assert.assertTrue(applicationUtils.tapElement(By.xpath(existingUserButtonXPath), null));
	}
}
