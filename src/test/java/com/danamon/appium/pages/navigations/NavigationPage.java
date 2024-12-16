package com.danamon.appium.pages.navigations;

import com.danamon.appium.pages.common.BasePage;

public class NavigationPage extends BasePage {
    public static final String androidIconHome = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View[1]";
    public static final String iosIconHome = "//*[contains(@value, 'Beranda')]";

    public static final String androidIconFinancial = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View[2]";
    public static final String iosIconFinancial = "//*[contains(@value, 'Financial')]";

    public static final String androidIconSetting = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View[5]";
    public static final String iosIconSetting = "//*[contains(@value, 'Pengaturan')]";

    public static final String androidIconScanQR = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View[3]";
    public static final String iosIconScanQR = "//*[contains(@value, 'Scan')]";

    public static final String androidIconApplication = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View[4]";
    public static final String iosIconApplication = "//*[contains(@value, 'Pengajuan')]";

    public static final String titleFinancialXPathAndroid = "//android.widget.TextView[@text=\"Finansial\"]";
    public static final String titleFinancialXPathIOS = "";

    public void tapNavigationHome () {
        applicationUtils.tapElement(applicationUtils.getXPath(androidIconHome, iosIconHome), 5L);
    }

    public void tapNavigationFinancial () {
        applicationUtils.waitFor(10000);
        applicationUtils.clickByXPathContainingText("Portofolio");
        applicationUtils.waitForElementToBePresent(applicationUtils.getXPath(titleFinancialXPathAndroid, titleFinancialXPathIOS), 120L);
    }

    public void tapNavigationScanQR () {
        applicationUtils.tapElement(applicationUtils.getXPath(androidIconScanQR, iosIconScanQR), 5L);
    }

    public void tapNavigationPengajuan () {
        applicationUtils.tapElement(applicationUtils.getXPath(androidIconApplication, iosIconApplication), 5L);
    }

    public void tapNavigationSettings () {
        applicationUtils.tapElement(applicationUtils.getXPath(androidIconSetting, iosIconSetting), 5L);
    }

}
