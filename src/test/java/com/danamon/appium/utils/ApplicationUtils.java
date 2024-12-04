package com.danamon.appium.utils;

import com.danamon.appium.constant.GeneralConstant;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;

public class ApplicationUtils {
	private static final Logger log = LoggerFactory.getLogger(ApplicationUtils.class);
	private static String baseUrl = ConfigFileReader.getConfigPropertyVal("baseUrl");
	private static Long globalTimeOut = Long.valueOf(ConfigFileReader.getConfigPropertyVal("globalTimeout"));

	private AppiumDriver driver;

	public ApplicationUtils(AppiumDriver driver) {
		this.driver = driver;
	}

	public void waitFor(long milliSeconds) {
		try {
			Thread.sleep(milliSeconds);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public Boolean waitForElementToBePresent(By by, Long second) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(second));
		WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(by));
		if (element.isDisplayed()) {
			return true;
		} else {
			return false;
		}
	}

	public boolean tapElement(By currentPage, Long second) {
		try {
			 if (waitForElementToBePresent(currentPage, second == null ? globalTimeOut : second)) {
				 driver.findElement(currentPage).click();
				 return true;
			 } else {
				 return false;
			 }
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	public Boolean objectExists(By by) {
		try {
			if (driver.findElements(by).size() == 0) {
				return false;
			} else {
				return true;
			}
		}catch (Exception ex){
			ex.printStackTrace();
			return false;
		}
	}

	public boolean enterValueInTextBox(String text, By by) {
		boolean flag = false;
		if (waitForElementToBePresent(by, globalTimeOut)) {
			try {
				if (driver.findElement(by).isDisplayed()) {
					driver.findElement(by).click();
					driver.findElement(by).clear();
					driver.findElement(by).sendKeys(text);
					flag = true;
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return flag;
	}

	public String getElementText(By by) {
		return driver.findElement(by).getText();
	}

	public Boolean getElementIsDisplayed(By by) {
		return driver.findElement(by).isDisplayed();
	}

	public int getResponseCode(String endpointUrl) {
		try {
			URL url = new URL(baseUrl + endpointUrl);
			HttpURLConnection connection = (HttpURLConnection) url.openConnection();
			connection.setRequestMethod("POST");
			connection.connect();
			return connection.getResponseCode();
		} catch (Exception e) {
			e.printStackTrace();
			return -1; // or handle the error as needed
		}
	}

	public By getXPath(String androidPath, String iosPath) {
		 if (getPlatformName().equalsIgnoreCase(GeneralConstant.PLATFORM_ANDROID)) {
			return By.xpath(androidPath);
		} else {
			return By.xpath(iosPath);
		 }
	}

	public String getPlatformName() {
		return driver.getCapabilities().getPlatformName().toString();
	}

//	public String getLocatorValue(String pageName, String fieldName) {
//		PathConfigMasterEntity pathConfigMasterEntity = pathConfigMasterRepository.findByPageNameAndFieldNameAndPlatform(pageName, fieldName, this.getPlatformName().toLowerCase());
//		return pathConfigMasterEntity.getLocatorValue();
//	}

}