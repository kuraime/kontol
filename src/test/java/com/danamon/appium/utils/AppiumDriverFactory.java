package com.danamon.appium.utils;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class AppiumDriverFactory {

	private static AppiumDriverFactory instanceOfAppiumDriverFactory = null;
	private AppiumDriver driver;

	private static String appiumPlatformName = System.getProperty("platformName",
			System.getenv("PLATFORM_NAME") != null ? System.getenv("PLATFORM_NAME") :
					"android");
	private static String appiumDeviceName = ConfigFileReader.getConfigPropertyVal("deviceName");
	private static String appiumAppPackage = ConfigFileReader.getConfigPropertyVal("appPackage");
	private static String appiumAppActivity = ConfigFileReader.getConfigPropertyVal("appActivity");
	private static String appiumServerHost = ConfigFileReader.getConfigPropertyVal("appiumServerHost");
	private static String appiumDeviceUdid = ConfigFileReader.getConfigPropertyVal("deviceUdid");
	// iOS-specific configurations
	private static String appiumBundleId = ConfigFileReader.getConfigPropertyVal("bundleId");
	private static String unicodeKeyboard = ConfigFileReader.getConfigPropertyVal("unicodeKeyboard");

	// Declaring constructor as private to restrict object creation outside of class
	private AppiumDriverFactory() {
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("udid", appiumDeviceUdid );
		capabilities.setCapability("platformName", appiumPlatformName);
		capabilities.setCapability("deviceName", appiumDeviceName);
		capabilities.setCapability("noReset", "true");
		capabilities.setCapability("unicodeKeyboard", unicodeKeyboard);

		if ("android".equalsIgnoreCase(appiumPlatformName)) {
			capabilities.setCapability("appPackage", appiumAppPackage);
			capabilities.setCapability("appActivity", appiumAppActivity);
			capabilities.setCapability("automationName", "UIAutomator2");
			try {
				driver = new AndroidDriver(new URL(appiumServerHost), capabilities);
			} catch (MalformedURLException e) {
				e.printStackTrace();
			}
		} else if ("ios".equalsIgnoreCase(appiumPlatformName)) {
			capabilities.setCapability("bundleId", appiumBundleId);
			capabilities.setCapability("automationName", "XCUITest");
			try {
				driver = new IOSDriver(new URL(appiumServerHost), capabilities);
			} catch (MalformedURLException e) {
				e.printStackTrace();
			}
		}
		driver.manage().timeouts().implicitlyWait(6000, TimeUnit.MILLISECONDS);
	}

	public static AppiumDriverFactory getInstanceOfAppiumDriverFactory() {
		if (instanceOfAppiumDriverFactory == null)
			instanceOfAppiumDriverFactory = new AppiumDriverFactory();

		return instanceOfAppiumDriverFactory;
	}

	// To get driver
	public AppiumDriver getDriver() {
		return driver;
	}
}
