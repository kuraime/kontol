package com.danamon.appium.pages.financial;

import com.danamon.appium.pages.common.BasePage;
import org.apache.commons.lang3.StringUtils;
import org.openqa.selenium.By;
import org.testng.Assert;

public class LoanPage extends BasePage {
    /**
     * Define page objects for financial list loan
     */
    public static final String androidTitleFinancial = "//*[contains(@text, 'Finansial')]";
    public static final String iosTitleFinancial = "//*[contains(@value, 'Finansial')]";

    public static final String androidTabsNavigationSavings = "//*[contains(@text, 'Simpanan')]";
    public static final String iosTabsNavigationSavings = "//*[contains(@value, 'Simpanan')]";

    public static final String androidTabsNavigationLoan = "//*[contains(@text, 'Pinjaman')]";
    public static final String iosTabsNavigationLan = "//*[contains(@value, 'Pinjaman')]";

    public static final String androidSubtitleLoan = "//*[contains(@text, 'Pinjaman')]";
    public static final String iosSubtitleLoan = "//*[contains(@value, 'Pinjaman')]";

    public static final String androidSubtitleCreditCard = "//*[contains(@text, 'Kartu Kredit')]";
    public static final String iosSubtitleCreditCard = "//*[contains(@value, 'Kartu Kredit')]";

    /**
     * define page objects for toggle loan & credit card
     */
    public static final String androidToggleCreditCard = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View[3]/android.view.View/android.view.View/android.widget.TextView";
    public static final String iosToggleCreditCard = "//*[contains(@value, 'Kartu Kredit')]";

    public static final String androidToggleLoan = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View[3]/android.view.View/android.view.View[1]/android.widget.TextView";
    public static final String iosToggleLoan = "//*[contains(@value, 'Pinjaman')]";

    /**
     * icon empty content & title
     */
    public static final String androidIconEmpty = "//android.widget.ImageView[@content-desc='avatar_icon']";
    public static final String iosIconEmpty = "";


    public static final String androidTextInfoEmpty = "//*[contains(@text, 'Anda belum memiliki kartu kredit')]";
    public static final String iosTextInfoEmpty = "//*[contains(@value, 'Anda belum memiliki kartu kredit')]";

    public static final String emptyLoanInfoXPathAndroid = "//android.widget.TextView[@text=\"Anda belum memiliki pinjaman\"]";
    public static final String emptyLoanInfoXPathIOS = "";

    /**
     * define page objects for bottomsheet toggle choose account
     */
    public static final String androidMenuCreditCard = "//*[contains(@text, 'Kartu Kredit')]";
    public static final String iosMenuCreditCard = "//*[contains(@value, 'Kartu Kredit')]')]";

    public static final String androidMenuLoan = "//android.widget.TextView[@text=\"Pinjaman\"]/..";
    public static final String iosMenuLoan = "";

    public static final String androidDropdownLoan = "(//android.widget.TextView[@text=\"Pinjaman\"])[2]/..";
    public static final String iosDropdownLoan = "";

    public static final String androidLoanTitleXPath = "(//android.widget.TextView[@text=\"Pinjaman\"])[3]/..";
    public static final String iosLoanTitleXPath = "";

    public static final String androidLoanFirstDataXPath = "(//android.widget.TextView[@text=\"Pinjaman\"])[3]/../android.view.View[2]";
    public static final String iosLoanFirstDataXPath = "";

    public static final String androidIconClose = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.View/android.view.View/android.view.View[2]/android.widget.Button";
    public static final String iosIconClose = "";

    public static final String androidBottomsheetTitle = "//*[contains(@text, 'Pilih Rekening')]";
    public static final String iosBottomsheetTitle = "//*[contains(@value, 'Pilih Rekening')]";

    public static final String androidCardSectionTitle = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View[3]/android.view.View/android.view.View[2]/android.widget.TextView[1]";
    public static final String iosCardSectionTitle = "";

    public static final String androidCardSectionAccNumber = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View[3]/android.view.View/android.view.View[2]/android.widget.TextView[2]";
    public static final String iosCardSectionAccNumber = "";

    public static final String androidCardSectionPayPerMonth = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View[3]/android.view.View/android.view.View[2]/android.widget.TextView[3]";
    public static final String iosCardSectionPayPerMonth = "";

    public static final String androidCardSectionPayPerMonthValue = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View[3]/android.view.View/android.view.View[2]/android.widget.TextView[4]";
    public static final String iosCardSectionPayPerMonthValue = "";

    public static final String androidCardSectionRemainOutstanding = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View[3]/android.view.View/android.view.View[2]/android.widget.TextView[5]";
    public static final String iosCardSectionRemainOutstanding = "";

    public static final String androidCardSectionRemainOutstandingValue = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View[3]/android.view.View/android.view.View[2]/android.widget.TextView[6]";
    public static final String iosCardSectionRemainOutstandingValue = "";

    public static final String androidCardTap = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View[3]/android.view.View/android.view.View[2]";
    public static final String iosCardTap = "";

    public static final String androidTitleLoanOrCreditCard = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View[2]/android.widget.TextView";
    public static final String iosTitleLoanOrCreditCard = "";

    public static final String androidIconBack = "//android.view.View[@content-desc='Back Icon']";
    public static final String iosIconBack = "";

    public static final String androidLoanList = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View[3]/android.view.View";
    public static final String iosLoanList = "";

    public static final String loanMortgageDetailStatementAndroidXPath = "//android.widget.TextView[@text=\"Tagihan\"]";
    public static final String loanMortgageDetailStatementIOSXPath = "";

    public static final String loanMortgageDetailDueAmountAndroidXPath = "//android.widget.TextView[@text=\"Sisa Terhutang\"]";
    public static final String loanMortgageDetailDueAmountIOSXPath = "";

    public static final String loanMortgageDetailNameAndroidXPath = "//android.widget.TextView[@text=\"Nama Pemilik Rekening\"]";
    public static final String loanMortgageDetailNameIOSXPath = "";

    public static final String loanMortgageDetailDateAndroidXPath = "//android.widget.TextView[@text=\"Tanggal Pencairan Pinjaman\"]";
    public static final String loanMortgageDetailDateIOSXPath = "";

    public static final String loanMortgageDetailAmountDisburseAndroidXPath = "//android.widget.TextView[@text=\"Jumlah Pencairan Pinjaman\"]";
    public static final String loanMortgageDetailAmountDisburseIOSXPath = "";

    public static final String loanMortgageDetailAmountInstallmentAndroidXPath = "//android.widget.TextView[@text=\"Nominal Tagihan Bulanan\"]";
    public static final String loanMortgageDetailAmountInstallmentIOSXPath = "";

    public static final String buttonPayNowAndroidXPath = "//android.widget.TextView[@text=\"Bayar Sekarang\"]/../android.widget.Button";
    public static final String buttonPayNowIOSXPath = "";

    // Variable default if loan list has data or not
    public static boolean dataLoan = false;

    public void setTabsNavigationLoan() {
        applicationUtils.tapElement(applicationUtils.getXPath(androidTabsNavigationLoan, androidTabsNavigationLoan), 5L);
    }

    public void verifyLoan() {
        applicationUtils.waitForElementToBePresent(By.xpath(androidDropdownLoan), 120L);

        // Logic if has any data or not
        if (applicationUtils.objectExists(applicationUtils.getXPath(emptyLoanInfoXPathAndroid, emptyLoanInfoXPathIOS))) {
            Assert.assertTrue(applicationUtils.objectExists(applicationUtils.getXPath(emptyLoanInfoXPathAndroid, emptyLoanInfoXPathIOS)));
            dataLoan = false;

            System.out.println("Not Have Data Loan");
        } else {
            Assert.assertTrue(applicationUtils.objectExists(applicationUtils.getXPath(androidLoanTitleXPath, iosLoanTitleXPath)));
            Assert.assertTrue(applicationUtils.objectExists(applicationUtils.getXPath(androidLoanFirstDataXPath, iosLoanFirstDataXPath)));
            dataLoan = true;

            System.out.println("Have Data Loan");
        }
    }

    public void verifyToggleLoan() {
        Assert.assertTrue(applicationUtils.objectExists(applicationUtils.getXPath(androidToggleLoan,iosToggleLoan)));
    }

    public void verifyDefaultToggleCreditCard() {
        Assert.assertTrue(applicationUtils.objectExists(applicationUtils.getXPath(androidToggleCreditCard,androidToggleCreditCard)));
    }

    public void verifyHaveNoCreditCard() {
        Assert.assertTrue(applicationUtils.objectExists(applicationUtils.getXPath(androidIconEmpty,iosIconEmpty)));
        Assert.assertTrue(applicationUtils.objectExists(applicationUtils.getXPath(androidTextInfoEmpty,iosTextInfoEmpty)));
    }

    public void setToggleLoan() {
        Assert.assertTrue(applicationUtils.objectExists(applicationUtils.getXPath(androidToggleCreditCard,iosToggleCreditCard)));
        Assert.assertTrue(applicationUtils.tapElement(By.xpath(androidToggleCreditCard), 50L));
        Assert.assertTrue(applicationUtils.objectExists(applicationUtils.getXPath(androidMenuLoan,iosMenuLoan)));
        Assert.assertTrue(applicationUtils.tapElement(By.xpath(androidMenuLoan), 50L));
    }

    public void setToggleCreditCard() {
        Assert.assertTrue(applicationUtils.objectExists(applicationUtils.getXPath(androidToggleCreditCard,androidToggleCreditCard)));
        Assert.assertTrue(applicationUtils.tapElement(By.xpath(androidToggleCreditCard), null));
    }

    public void verifyCreditCardListScreen() {
        applicationUtils.waitFor(5000);
        Assert.assertTrue(applicationUtils.objectExists(applicationUtils.getXPath(androidLoanList,iosLoanList)));
    }

    public void setTapBack() {
        applicationUtils.waitFor(5000);
        Assert.assertTrue(applicationUtils.objectExists(applicationUtils.getXPath(androidIconBack, iosIconBack)));
        Assert.assertTrue(applicationUtils.tapElement(By.xpath(androidIconBack), 10L));
    }

    public void verifyLoanDetail() {
        applicationUtils.waitFor(5000);
        Assert.assertTrue(applicationUtils.objectExists(applicationUtils.getXPath(androidTitleLoanOrCreditCard, iosTitleLoanOrCreditCard)));
        Assert.assertTrue(applicationUtils.objectExists(applicationUtils.getXPath(loanMortgageDetailStatementAndroidXPath, loanMortgageDetailStatementIOSXPath)));
        Assert.assertTrue(applicationUtils.objectExists(applicationUtils.getXPath(loanMortgageDetailDueAmountAndroidXPath, loanMortgageDetailDueAmountIOSXPath)));
        Assert.assertTrue(applicationUtils.objectExists(applicationUtils.getXPath(loanMortgageDetailNameAndroidXPath, loanMortgageDetailNameIOSXPath)));
        Assert.assertTrue(applicationUtils.objectExists(applicationUtils.getXPath(loanMortgageDetailDateAndroidXPath, loanMortgageDetailDateIOSXPath)));
        Assert.assertTrue(applicationUtils.objectExists(applicationUtils.getXPath(loanMortgageDetailAmountDisburseAndroidXPath, loanMortgageDetailAmountDisburseIOSXPath)));
        Assert.assertTrue(applicationUtils.objectExists(applicationUtils.getXPath(loanMortgageDetailAmountInstallmentAndroidXPath, loanMortgageDetailAmountInstallmentIOSXPath)));
        Assert.assertTrue(applicationUtils.objectExists(applicationUtils.getXPath(buttonPayNowAndroidXPath, buttonPayNowIOSXPath)));
    }

    public void tapLoanData(String accountNumber) {
        System.out.println(dataLoan);
        if ((StringUtils.isNotBlank(accountNumber)) && (dataLoan)) {
            // If has data is true & set params for account number
             applicationUtils.clickByXPathContainingText(accountNumber);
        } else {
            // Click first data
            Assert.assertTrue(applicationUtils.tapElement(applicationUtils.getXPath(androidLoanFirstDataXPath, iosLoanFirstDataXPath), 60L));
        }
    }

    public void verifyListCardContent() {
        applicationUtils.waitFor(5000);
        Assert.assertTrue(applicationUtils.objectExists(applicationUtils.getXPath(androidCardSectionTitle,androidCardSectionTitle)));
        Assert.assertTrue(applicationUtils.objectExists(applicationUtils.getXPath(androidCardSectionAccNumber,iosCardSectionAccNumber)));
        Assert.assertTrue(applicationUtils.objectExists(applicationUtils.getXPath(androidCardSectionPayPerMonth,iosCardSectionPayPerMonthValue)));
        Assert.assertTrue(applicationUtils.objectExists(applicationUtils.getXPath(androidCardSectionPayPerMonthValue,iosCardSectionPayPerMonthValue)));
        Assert.assertTrue(applicationUtils.objectExists(applicationUtils.getXPath(androidCardSectionRemainOutstanding,iosCardSectionRemainOutstanding)));
        Assert.assertTrue(applicationUtils.objectExists(applicationUtils.getXPath(androidCardSectionRemainOutstandingValue,iosCardSectionPayPerMonthValue)));
        Assert.assertTrue(applicationUtils.objectExists(applicationUtils.getXPath(androidCardSectionPayPerMonthValue,iosCardSectionPayPerMonthValue)));
    }

    public void openLoanMenu() {
        applicationUtils.waitForElementToBePresent(applicationUtils.getXPath(androidMenuLoan, iosMenuLoan), 120L);
        applicationUtils.clickByXPathContainingText("Pinjaman");
    }
}
