package com.danamon.appium.pages.financial;

import com.danamon.appium.pages.common.BasePage;
import org.openqa.selenium.By;
import org.testng.Assert;

public class FinancialPage extends BasePage {

    /**
     * Define page objects financial title
     */
    public static final String androidTitleFinancial = "//*[contains(@text, 'Finansial')]";
    public static final String iosTitleFinancial = "//*[contains(@value, 'Finansial')]";

    /**
     * Define page object financial list CASA
     */
    public static final String androidListTitleCard = "//android.view.View/android.view.View[3]/android.view.View/android.view.View[3]/android.widget.TextView[1][contains(@text, 'TABUNGAN FLEXIMAX')]";
    public static final String iosListTitleCard = "//android.view.View/android.view.View[3]/android.view.View/android.view.View[3]/android.widget.TextView[1][contains(@text, 'TABUNGAN FLEXIMAX')]";

    public static final String androidListCardNo = "//android.view.View[3]/android.view.View/android.view.View[3]/android.widget.TextView[2][contains(@text, '903601036977')]";
    public static final String iosListCardNo = "//android.view.View[3]/android.view.View/android.view.View[3]/android.widget.TextView[2][contains(@text, '903601036977')]";

    public static final String androidIconBack = "//android.view.View[@content-desc='Back Icon']";
    public static final String iosIconBack = "";

    public static final String fleximax = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View[3]/android.view.View/android.view.View[3]/android.widget.TextView[2]";

    public static final String dl_pro = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View[3]/android.view.View/android.view.View[2]/android.widget.TextView[2]";

    public void verifyTitleFinancial() {
        applicationUtils.waitFor(5000);
        Assert.assertTrue(applicationUtils.objectExists(applicationUtils.getXPath(androidTitleFinancial,iosTitleFinancial)));
    }

    public void iScrollToBottomForViewAllAccount() {
        applicationUtils.swipeUntilFoundElement("down",10,By.xpath(dl_pro));
        // applicationUtils.scrollToElement(applicationUtils.getXPath("//*[contains(@text, '90360103697')]","//*[contains(@value, '90360103697')]"));
    }

    public void iScrollToTopForBackToTop() {
        applicationUtils.swipeUntilFoundElement("down",10,By.xpath(fleximax));
    }

    public void setTapBack() {
        applicationUtils.waitFor(5000);
        Assert.assertTrue(applicationUtils.objectExists(applicationUtils.getXPath(androidIconBack,iosIconBack)));
        Assert.assertTrue(applicationUtils.tapElement(By.xpath(androidIconBack), 5L));
    }

    public void tapCasaAccNumber(String account_number) {
        applicationUtils.clickByXPathContainingText(account_number);
    }

    public void tapTimeDepositAccNumber(String account_number) {
        applicationUtils.clickByXPathContainingText(account_number);
    }

    public void tapGoalSavingsAccNumber(String account_number) {
        applicationUtils.clickByXPathContainingText(account_number);
    }

}
