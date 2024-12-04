package com.danamon.appium.pages.dashboard;

import com.danamon.appium.pages.common.BasePage;
import org.testng.Assert;

public class DashboardCardPage extends BasePage {

	//PageObject can be moved to DB
	public static final String androidIdrTransferIconXPath = "//androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View[1]/android.view.View[1]/android.view.View/android.view.View[1]/android.view.View/android.view.View[2]/android.widget.Button";
	public static final String iosIdrTransferIconXPath = "";

	public static final String androidIconSaving = "//android.widget.ImageView[@content-desc=\"avatar_icon\"]";
	public static final String iosIconSaving = "";

	public static final String androidOtherAccountIconPath = "//androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View[2]";
	public static final String iosOtherAccountIconPath = "";

	public void loadCard() {
		applicationUtils.waitFor(5000);
		Assert.assertTrue(applicationUtils.objectExists(applicationUtils.getXPath(androidIconSaving, iosIconSaving)));
		System.out.println("Dashboard card is loaded successfully");
	}

	public void tapIconIDRTransfer() {
		applicationUtils.tapElement(applicationUtils.getXPath(androidIdrTransferIconXPath, iosIdrTransferIconXPath), null);
	}

	public void moveToTransferPage() {
		Assert.assertTrue(applicationUtils.objectExists(applicationUtils.getXPath(androidOtherAccountIconPath, androidOtherAccountIconPath)));
	}
}
