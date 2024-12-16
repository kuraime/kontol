package com.danamon.appium.pages.authentication;

import com.danamon.appium.pages.common.BasePage;
import org.apache.commons.lang3.StringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import java.time.LocalTime;
import java.util.*;
import java.util.regex.*;
import java.util.stream.*;
import java.time.Duration;

public class LoginPage extends BasePage {

	//Page Object Model (Login Binding & Unbinding)
	public static final String iconDanamonXPathAndroid = "//android.widget.ImageView[@content-desc=\"App Icon\"]";
	public static final String iconDanamonXPathIOS = "";

	public static final String iconChangeLanguageXPathAndroid = "//android.widget.ScrollView/android.view.View[1]";
	public static final String iconChangeLanguageXPathIOS = "";

	public static final String iconFaqXPathAndroid = "//android.widget.ImageView[@content-desc=\"FAQ\"]";
	public static final String iconFaqXPathIOS = "";

	public static final String textInputUsernameXPathAndroid = "//android.widget.TextView[@text=\"Email\"]/..";
	public static final String textInputUsernameXPathIOS = "";

	public static final String usernameBindingXPathAndroid = "//android.widget.TextView[@text=\"RISKY MULYADI\"]";
	public static final String usernameBindingXPathIOS = "";

	public static final String textInputPasswordXPathAndroid = "//android.widget.TextView[@text=\"Password\"]/..";
	public static final String textInputPasswordXPathIOS = "";

	public static final String iconPeekPasswordXPathAndroid = "//android.view.View[@content-desc=\"toggle_password\"]";
	public static final String iconPeekPasswordXPathIOS = "";

	public static final String forgotPasswordXPathAndroid = "//android.widget.TextView[@text=\"Lupa Password?\"]";
	public static final String forgotPasswordXPathIOS = "";

	public static final String textLoginButtonXPathAndroid = "//android.widget.TextView[@text=\"Login\"]";
	public static final String textLoginButtonXPathIOS = "";

	public static final String iconButtonHelloDanamonXPathAndroid = "//android.widget.ScrollView/android.widget.Button";
	public static final String iconButtonHelloDanamonXPathIOS = "";

	public static final String bottomSheetViePromPageXPathAndroid = "//android.view.View[@content-desc=\"Drag Handle\"]";
	public static final String bottomSheetViePromPageXPathIOS = "";

	public static final String titleInformationVerificationXPathAndroid = "//android.widget.TextView[@text=\"Aktivasi D-Bank PRO\"]\n";
	public static final String titleInformationVerificationXPathIOS = "";

	public static final String buttonNextXPathAndroid = "//android.widget.TextView[@text=\"Lanjut\"]";;
	public static final String buttonNextXPathIOS = "";;

	public static final String textEditInputOTPXPathAndroid = "//android.widget.EditText";
	public static final String textEditInputOTPXPathIOS = "";

	public static final String textMessageOTPXPathAndroid = "//android.widget.TextView[@resource-id=\"com.google.android.gms:id/matched_sms\"]";
	public static final String textMessageOTPXPathIOS= "";

	public static final String titleMessageOTPXPathAndroid = "//android.widget.TextView[@resource-id=\"com.google.android.gms:id/consent_description\"]";
	public static final String titleMessageOTPXPathIOS = "";

	public static final String positiveButtonMessageOTPXPathAndroid = "//android.widget.Button[@resource-id=\"com.google.android.gms:id/positive_button\"]";
	public static final String positiveButtonMessageOTPXPathIOS = "";

	public static final String negativeButtonMessageOTPXPathAndroid = "//android.widget.Button[@resource-id=\"com.google.android.gms:id/negative_button\"]";
	public static final String negativeButtonMessageOTPXPathIOS = "";

	public static final String successReactivationXPathAndroid = "//android.widget.TextView[@text=\"Aktivasi Berhasil\"]";
	public static final String successReactivationXPathIOS = "";

	public static final String buttonBackToLoginBindingXPathAndroid = "//android.widget.TextView[@text=\"Kembali ke Beranda\"]";;
	public static final String buttonBackToLoginBindingXPathIOS = "";

	//	Datetime formatter for greetings
	LocalTime currentTime = LocalTime.now();
	int currentHour = currentTime.getHour();

	public static String getGreetingIndonesia(int hour) {
		if (hour >= 0 && hour < 11) {
			return "Selamat Pagi"; // Morning: 00:01 - 11:00
		} else if (hour >= 11 && hour < 15) {
			return "Selamat Siang"; // Afternoon: 11:01 - 15:00
		} else if (hour >= 15 && hour < 18) {
			return "Selamat Sore"; // Evening: 15:01 - 18:00
		} else {
			return "Selamat Malam"; // Night: 18:01 - 00:00
		}
	}

	public static String getLastThreeNumberOTP(String text) {
		// Extract numbers using regex and stream
		List<String> numbers = Pattern.compile("\\d+")
				.matcher(text)
				.results()
				.map(MatchResult::group)
				.collect(Collectors.toList());

		// Get the last 3 digits using substring
		String lastThreeDigits = numbers.get(0).substring(numbers.get(0).length() - 3);

		return lastThreeDigits;
	}

	public void loadPage(String binding) {
		// Waiting elements in binding/unbinding login page
		applicationUtils.waitForElementToBePresent(By.xpath(iconFaqXPathAndroid), 60L);

		if (binding.equals("not binding")) {
			// Assert UI Element Login Unbinding Page
			Assert.assertTrue(applicationUtils.objectExists(By.xpath(iconDanamonXPathAndroid)));
			Assert.assertTrue(applicationUtils.getElementIsDisplayed(By.xpath(iconChangeLanguageXPathAndroid)));
			Assert.assertTrue(applicationUtils.getElementIsDisplayed(By.xpath(iconFaqXPathAndroid)));
			Assert.assertTrue(applicationUtils.objectExists(By.xpath(textInputPasswordXPathAndroid)));
			Assert.assertTrue(applicationUtils.objectExists(By.xpath(iconPeekPasswordXPathAndroid)));
			Assert.assertTrue(applicationUtils.objectExists(By.xpath(forgotPasswordXPathAndroid)));
			Assert.assertTrue(applicationUtils.objectExists(By.xpath(textLoginButtonXPathAndroid)));
			Assert.assertTrue(applicationUtils.objectExists(By.xpath(iconButtonHelloDanamonXPathAndroid)));
			Assert.assertTrue(applicationUtils.objectExists(By.xpath(bottomSheetViePromPageXPathAndroid)));
		} else {
			// Assert UI Element Login Binding Page
			Assert.assertTrue(applicationUtils.objectExists(By.xpath(iconChangeLanguageXPathAndroid)));
			Assert.assertTrue(applicationUtils.objectExists(By.xpath(iconFaqXPathAndroid)));
			Assert.assertTrue(applicationUtils.objectExists(By.xpath(textInputPasswordXPathAndroid)));
			Assert.assertTrue(applicationUtils.objectExists(By.xpath(iconPeekPasswordXPathAndroid)));
			Assert.assertTrue(applicationUtils.objectExists(By.xpath(forgotPasswordXPathAndroid)));
			Assert.assertTrue(applicationUtils.objectExists(By.xpath(textLoginButtonXPathAndroid)));

			// Assert Greetings Element
			String indonesia = getGreetingIndonesia(currentHour);
			String greetingsIndonesiaBindingXPath = String.format("//android.widget.TextView[@text=\"%s\"]", indonesia);
			Assert.assertTrue(applicationUtils.objectExists(By.xpath(greetingsIndonesiaBindingXPath)));
		}
	}

	public void inputCorrectUsernameAndPassword(String username, String password) {
		if (StringUtils.isNotBlank(username)) {
			applicationUtils.enterValueInTextBox(username, applicationUtils.getXPath(textInputUsernameXPathAndroid, textInputUsernameXPathIOS));
			applicationUtils.enterValueInTextBox(password, applicationUtils.getXPath(textInputPasswordXPathAndroid, textInputPasswordXPathIOS));
		} else {
			applicationUtils.enterValueInTextBox(password, applicationUtils.getXPath(textInputPasswordXPathAndroid, textInputPasswordXPathIOS));
		}
	}

	public void clickLoginButton() {
		Assert.assertTrue(applicationUtils.tapElement(By.xpath(textLoginButtonXPathAndroid), null));
	}

	public void informationVerification() {
		// Waiting elements in binding/unbinding login page
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(titleInformationVerificationXPathAndroid)));

		Assert.assertTrue(applicationUtils.objectExists(By.xpath(titleInformationVerificationXPathAndroid)));
		Assert.assertTrue(applicationUtils.objectExists(By.xpath(buttonNextXPathAndroid)));
	}

	public void nextButton() {
		Assert.assertTrue(applicationUtils.tapElement(By.xpath(buttonNextXPathAndroid), null));
	}

	public void inputMobileOTP() {
		// Waiting Element Message & Verify UI
		Assert.assertTrue(applicationUtils.waitForElementToBePresent(By.xpath(titleMessageOTPXPathAndroid), 120L));
		Assert.assertTrue(applicationUtils.objectExists(By.xpath(negativeButtonMessageOTPXPathAndroid)));
		Assert.assertTrue(applicationUtils.objectExists(By.xpath(positiveButtonMessageOTPXPathAndroid)));
		applicationUtils.waitFor(3000);

		// Get OTP Number & Click Allow & Input OTP
		String dataText = applicationUtils.getElementText(By.xpath(textMessageOTPXPathAndroid));
		String dataThreeDigitsOTP = getLastThreeNumberOTP(dataText);
		Assert.assertTrue(applicationUtils.tapElement(By.xpath(positiveButtonMessageOTPXPathAndroid), null));
		Assert.assertTrue(applicationUtils.enterValueInTextBox(dataThreeDigitsOTP, By.xpath(textEditInputOTPXPathAndroid)));
	}

	public void reactivationSuccessPage() {
		// Assert UI Element Success Reactivation Page
		Assert.assertTrue(applicationUtils.waitForElementToBePresent(By.xpath(successReactivationXPathAndroid), 120L));
		Assert.assertTrue(applicationUtils.objectExists(By.xpath(successReactivationXPathAndroid)));
		Assert.assertTrue(applicationUtils.objectExists(By.xpath(buttonBackToLoginBindingXPathAndroid)));

		// Tap Button
		Assert.assertTrue(applicationUtils.tapElement(By.xpath(buttonBackToLoginBindingXPathAndroid), null));
	}
}
