package com.danamon.appium.pages.common;

import org.testng.Assert;

public class SettingPage extends BasePage {

    public static final String androidSettingUserFullnameXpath ="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.widget.ScrollView/android.view.View[1]/android.widget.TextView[2]";
    public static final String iosSettingUSerFullnameXpath = "";

    public static final String androidSettingKeuntunganHeaderXpath = "//android.widget.TextView[@text='Keuntungan']";
    public static final String iosSettingKeuntunganHeaderXpath = "";

    public static final String androidSettingTransaksiHeaderXpath = "//android.widget.TextView[@text='Transaksi']";
    public static final String iosSettingTransaksiHeaderXpath = "";

    public static final String androidSettingManajemenKartuHeaderXpath = "//android.widget.TextView[@text='Manajemen Kartu']";
    public static final String iosSettingManajemenKartuHeaderXpath = "";

    public static final String androidSettingTampilanHeaderXpath ="";
    public static final String iosSettingTampilanHeaderXpath="";

    public static final String androidSettingNotifikasiHeaderXpath="";
    public static final String iosSettingNotifikasiHeaderXpath="";


    public static final String androidSettingKeamananHeaderXpath = "//android.widget.TextView[@text='Keamanan']";
    public static final String iosSettingKeamananHeaderXpath = "";

    public static final String androidSettingUbahMpinXpath = "//android.widget.TextView[@text='Ubah Mpin']";
    public static final String iosSettingUbahMpinXpath ="";

    public static final String androidSettingUbahMpinButtonXpath="(//android.widget.TextView[@text='Ubah mPIN']/../android.widget.Button)[1]";
    public static final String iosSettingUbahMpinButtonXpath="";


    public static final String androidSettingMyDocumentXpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.widget.ScrollView/android.widget.TextView[3]";
    public static final String iosSettingMyDocumentXpath ="";

    public static final String androidSettingSupportCenterXpath= "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.widget.ScrollView/android.widget.TextView[4]";
    public static final String iosSettingSupportCenterXpath = "";

    public void loadSettingPage (){
        applicationUtils.waitForElementToBePresent(applicationUtils.getXPath(androidSettingUserFullnameXpath, iosSettingUSerFullnameXpath), 100L);
        Assert.assertTrue(applicationUtils.objectExists(applicationUtils.getXPath(androidSettingUserFullnameXpath , iosSettingUSerFullnameXpath)));
        System.out.println("Setting page loaded");

    }

    public void clickChangeMpin (){
        applicationUtils.swipeUntilFoundElement("down",10,applicationUtils.getXPath(androidSettingUbahMpinButtonXpath, iosSettingUbahMpinButtonXpath));
        applicationUtils.tapElement(applicationUtils.getXPath(androidSettingUbahMpinButtonXpath,iosSettingUbahMpinButtonXpath), 5L);
    }





}
