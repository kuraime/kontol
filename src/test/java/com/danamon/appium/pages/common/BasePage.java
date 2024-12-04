package com.danamon.appium.pages.common;

import com.danamon.appium.utils.AppiumDriverFactory;
import com.danamon.appium.utils.ApplicationUtils;
import io.appium.java_client.AppiumDriver;

public class BasePage {
	public AppiumDriverFactory appiumDriverFactory = AppiumDriverFactory.getInstanceOfAppiumDriverFactory();
	public AppiumDriver driver = appiumDriverFactory.getDriver();
	public ApplicationUtils applicationUtils = new ApplicationUtils(driver);
}
