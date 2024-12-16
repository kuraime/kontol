package com.danamon.appium.pages.dashboard;

import com.danamon.appium.pages.common.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class DashboardCardPage extends BasePage {

	//PageObject can be moved to DB
	public static final String androidIdrTransferIconXPath = "//androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View[1]/android.view.View[1]/android.view.View/android.view.View[1]/android.view.View/android.view.View[2]/android.widget.Button";
	public static final String iosIdrTransferIconXPath = "";

	public static final String androidIconSaving = "//android.widget.ImageView[@content-desc=\"avatar_icon\"]";
	public static final String iosIconSaving = "";

	public static final String menuChoiceDashboardXPathAndroid = "//android.widget.TextView[@text=\"Menu Pilihan\"]";
	public static final String menuChoiceDashboardXPathIOS = "";

	public static final String androidOtherAccountIconPath = "//androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View[2]";
	public static final String iosOtherAccountIconPath = "";

	public static final String androidTextAccountName = "//hierarchy/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/androidx.compose.ui.platform.ComposeView[1]/android.view.View[1]/android.view.View[1]/android.view.View[1]/android.view.View[1]/android.view.View[1]/android.view.View[1]/android.view.View[1]/android.widget.TextView[1]";
	public static final String iosTextAccountName = "";

	public static final String androidTextAccountNumber = "//hierarchy/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/androidx.compose.ui.platform.ComposeView[1]/android.view.View[1]/android.view.View[1]/android.view.View[1]/android.view.View[1]/android.view.View[1]/android.view.View[1]/android.view.View[1]/android.widget.TextView[2]";
	public static final String iosTextAccountNumber = "";

	public static final String androidTitleAvailableBalance = "//android.widget.TextView[contains(@text, 'Saldo Tersedia')]";
	public static final String iosTitleAvailableBalance = "";

	public static final String androidTextAvailableBalanceValue = "//hierarchy/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/androidx.compose.ui.platform.ComposeView[1]/android.view.View[1]/android.view.View[1]/android.view.View[1]/android.view.View[1]/android.view.View[1]/android.view.View[1]/android.view.View[1]/android.widget.TextView[4]";
	public static final String iosTextAvailableBalanceValue = "";

	public static final String androidTextDashboardAmount = "//hierarchy/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/androidx.compose.ui.platform.ComposeView[1]/android.view.View[1]/android.view.View[1]/android.view.View[1]/android.view.View[1]/android.view.View[1]/android.view.View[1]/android.view.View[1]/android.widget.TextView[4]";
	public static final String iosTextDashboardAmount = "";

	public static final String androidIconCopy = "//hierarchy/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/androidx.compose.ui.platform.ComposeView[1]/android.view.View[1]/android.view.View[1]/android.view.View[1]/android.view.View[1]/android.view.View[1]/android.view.View[1]/android.view.View[1]/android.widget.ImageView[2]";
	public static final String iosIconCopy = "";

	public static final String androidIconViewCurrency = "//android.widget.ImageView[@content-desc='icon_view_balance']";
	public static final String iosIconViewCurrency = "//android.widget.ImageView[@content-desc='icon_view_balance']";

	public static final String androidIconViewDetail = "//hierarchy/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/androidx.compose.ui.platform.ComposeView[1]/android.view.View[1]/android.view.View[1]/android.view.View[1]/android.view.View[1]/android.view.View[1]/android.view.View[1]/android.view.View[1]/android.view.View[1]/android.widget.Button[1]";
	public static final String iosIconIconViewDetail = "";

	public static final String androidDismissFaceId = "//android.widget.TextView[contains(@text, 'Nanti Saja')]";
	public static final String iosDismissFaceId = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.View/android.view.View/android.view.View[2]/android.view.View[3]/android.widget.Button";

	public static final String androidCloseToast = "//android.view.View[@content-desc=\"Close Button\"]";
	public static final String iosCloseToast = "//android.view.View[@content-desc=\"Close Button\"]";

	public static final String androidSuccessIcon = "//hierarchy/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/androidx.compose.ui.platform.ComposeView[1]/android.view.View[1]/android.view.View[1]/android.view.View[2]/android.widget.ImageView[1]";
	public static final String iosSuccessIcon = "";

	public static final String androidToastSuccessCopyAccNumber = "//hierarchy/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/androidx.compose.ui.platform.ComposeView[1]/android.view.View[1]/android.view.View[1]/android.view.View[2]/android.widget.TextView[1]";
	public static final String iosToastSuccessCopyAccNumber = "//hierarchy/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/androidx.compose.ui.platform.ComposeView[1]/android.view.View[1]/android.view.View[1]/android.view.View[2]/android.widget.TextView[1]";

	public static final String androidBackButton = "//android.view.View[@content-desc='Back Icon']";

	public static final String androidTitleAccountSummaryDetail = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View[2]/android.widget.TextView";
	public static final String iosTitleAccountSummaryDetail = "";

	public static final String androidBtnOk = "//*[contains(@text, 'OK')]";
	public static final String iosBtnOk = "//*[contains(@text, 'OK')]";
	public static final String logoutXPathAndroid = "//android.view.View[@content-desc=\"Logout\"]";
	public static final String logoutXPathIOS = "";

	public static final String logoutPopUpXPathAndroid = "//android.widget.TextView[@text=\"Apakah Anda yakin ingin log out dari aplikasi ini?\"]\n";
	public static final String logoutPopUpXPathIOS = "";

	public static final String logoutButtonPopUpXPathAndroid = "((//android.widget.TextView[@text=\"Log Out\"])[2])/../android.widget.Button";
	public static final String logoutButtonPopUpXPathIOS = "";

	public void loadCard() {
		// Waiting elements in dashboard page
		applicationUtils.waitFor(10000);
		applicationUtils.waitForElementToBePresent(applicationUtils.getXPath(menuChoiceDashboardXPathAndroid,menuChoiceDashboardXPathAndroid), 120L);

		Assert.assertTrue(applicationUtils.objectExists(applicationUtils.getXPath(menuChoiceDashboardXPathAndroid, menuChoiceDashboardXPathIOS)));
		System.out.println("Dashboard card is loaded successfully");
	}

	public void tapIconIDRTransfer() {
		applicationUtils.tapElement(applicationUtils.getXPath(androidIdrTransferIconXPath, iosIdrTransferIconXPath), null);
	}

	public void moveToTransferPage() {
		Assert.assertTrue(applicationUtils.objectExists(applicationUtils.getXPath(androidOtherAccountIconPath, androidOtherAccountIconPath)));
	}

	public void tapViewDetail() {
		applicationUtils.tapElement(applicationUtils.getXPath(androidIconViewDetail, iosIconIconViewDetail), 70L);
	}

	public void verifyAccountSummaryDetail() {
		applicationUtils.waitFor(5000);
		applicationUtils.waitForElementToBePresent(applicationUtils.getXPath(androidTitleAccountSummaryDetail,iosTitleAccountSummaryDetail), 50L);
	}

	public void tapCopyingAccNumber() {
		applicationUtils.tapElement(applicationUtils.getXPath(androidIconCopy,iosIconCopy), null);
	}

	public void tapCloseToast() {
		applicationUtils.waitFor(5000);
		applicationUtils.tapElement(applicationUtils.getXPath(androidCloseToast,iosCloseToast), null);
	}

	public void verifyCardAccountSummaryDashboard() {
		applicationUtils.waitFor(5000);
		Assert.assertTrue(applicationUtils.objectExists(applicationUtils.getXPath(androidTextAccountName,iosTextAccountName)));
		Assert.assertTrue(applicationUtils.objectExists(applicationUtils.getXPath(androidTextAccountNumber,iosTextAccountNumber)));
		Assert.assertTrue(applicationUtils.objectExists(applicationUtils.getXPath(androidTitleAvailableBalance,iosTitleAvailableBalance)));
		Assert.assertTrue(applicationUtils.objectExists(applicationUtils.getXPath(androidTextAvailableBalanceValue,androidTextAvailableBalanceValue)));
		Assert.assertTrue(applicationUtils.objectExists(applicationUtils.getXPath(androidTextDashboardAmount,iosTextDashboardAmount)));
	}

	public void verifyToastSuccessfullCopyAccNumber() {
		applicationUtils.waitForElementToBePresent(applicationUtils.getXPath(androidToastSuccessCopyAccNumber,iosToastSuccessCopyAccNumber), 50L);
		Assert.assertTrue(applicationUtils.objectExists(applicationUtils.getXPath(androidToastSuccessCopyAccNumber,iosToastSuccessCopyAccNumber)));
	}

	public void tapUmaskingAmount() {
		Assert.assertTrue(applicationUtils.tapElement(By.xpath(androidIconViewCurrency), null));
	}

	public void tapMaskingAmount() {
		Assert.assertTrue(applicationUtils.tapElement(By.xpath(androidIconViewCurrency), null));
	}

	public void verifyAmountValueMasking() {
		Assert.assertTrue(applicationUtils.objectExists(applicationUtils.getXPath(androidTextAvailableBalanceValue,androidTextAvailableBalanceValue)));
	}

	public void verifyAmountValueUnmasking() {
		Assert.assertTrue(applicationUtils.objectExists(applicationUtils.getXPath(androidTextAvailableBalanceValue,androidTextAvailableBalanceValue)));
	}

	public void tapBackFromPreviousScreen() {
		Assert.assertTrue(applicationUtils.tapElement(By.xpath(androidBackButton), null));
	}

	public void tapOk() {
		Assert.assertTrue(applicationUtils.tapElement(By.xpath(androidBtnOk), null));
	}

	public void logoutApplication(String flow) {
		if (flow.equals("header")) {
			 Assert.assertTrue(applicationUtils.tapElement(By.xpath(logoutXPathAndroid), null));
		} else if (flow.equals("back dashboard")) {
			Assert.assertTrue(applicationUtils.devicesBackButton());

			applicationUtils.waitForElementToBePresent(By.xpath(logoutPopUpXPathAndroid), 120L);

			Assert.assertTrue(applicationUtils.tapElement(By.xpath(logoutButtonPopUpXPathAndroid), 120L));
		}
	}
}
