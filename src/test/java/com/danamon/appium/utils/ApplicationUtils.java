package com.danamon.appium.utils;

import com.danamon.appium.constant.GeneralConstant;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;

import org.openqa.selenium.Dimension;
import io.appium.java_client.TouchAction;
import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.touch.offset.PointOption;
import io.appium.java_client.touch.WaitOptions;

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

	public void swipe(int actionType) {
		/*
		code actionType
		0 = left
		1 = right
		*/
		int screenHeight = driver.manage().window().getSize().height;
		int screenWidth = driver.manage().window().getSize().width;

		Double startRatio = actionType == 0 ? 0.8 : 0.2;
		Double endRatio = actionType == 0 ? 0.2 : 0.8;

		int startX = (int) (screenWidth * startRatio);
		int endX = (int) (screenWidth * endRatio);
		int y = screenHeight / 2;

		HashMap<String, Object> params = new HashMap<>();
		params.put("startX", startX);
		params.put("startY", y);
		params.put("endX", endX);
		params.put("endY", y);
		params.put("duration", 1000); // Duration in milliseconds
		driver.executeScript("mobile: swipe", params);
	}

	/**
	 * Clicks an item from the list that matches the specified account number.
	 *
	 * @param listLocator   The locator of the list items.
	 * @param value The account number to match.
	 * @return boolean true if the account number is found and clicked, false otherwise.
	 */
	public boolean clickItemByAccountNumber(By listLocator, String value) {
		try {
			List<WebElement> items = driver.findElements(listLocator);
			for (WebElement item : items) {
				if (item.isDisplayed() && item.getText().contains(value)) {
					log.info("Clicking item with account number: " + value);
					item.click();
					return true;
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
			log.error("Error while trying to click item with account number: " + value, e);
		}
		log.warn("value not found: " + value);
		return false;
	}

	/**
	 * Finds a list of mobile elements by their XPath and clicks the first one.
	 *
	 * @param xpath The XPath of the mobile elements.
	 * @return true if the first element was found and clicked, false otherwise.
	 */
	public boolean findAndClickFirstInList(String xpath) {
		try {
			WebElement element = driver.findElements(By.xpath(xpath)).get(0);
			element.click();
			System.out.println("Clicked on the first element in list: " + xpath);
			return true;
		} catch (IndexOutOfBoundsException | NoSuchElementException e) {
			System.err.println("No elements found for XPath: " + xpath);
			return false;
		}
	}

	/**
	 * Clicks an element using XPath containing the given text.
	 *
	 * @param text  The text to be used in the XPath expression.
	 */
	public void clickByXPathContainingText(String text) {
		try {
			// Construct XPath and find the element
			String xpath = String.format("//*[contains(@text, '%s') or contains(@label, '%s')]", text, text);
			WebElement element = driver.findElement(By.xpath(xpath));
			element.click();
			System.out.println("Clicked element with text: " + text);
		} catch (Exception e) {
			System.err.println("Failed to click element with text: " + text);
			e.printStackTrace();
		}
	}

	public boolean devicesBackButton() {
		driver.navigate().back();
		return true;
	}

	public void swipeUpAndDown(String direction) {
		Dimension screenSize = driver.manage().window().getSize();
		int screenHeight = screenSize.height;
		int screenWidth = screenSize.width;

		if (direction.toLowerCase().equals("up")) {
			new TouchAction((PerformsTouchActions) driver)
					.press(PointOption.point(screenWidth / 2, screenHeight / 2))
					.waitAction(WaitOptions.waitOptions(Duration.ofMillis(500)))
					.moveTo(PointOption.point(screenWidth / 2, (screenHeight / 2) + (screenHeight / 4)))
					.release()
					.perform();
		} else if (direction.toLowerCase().equals("down")) {
			new TouchAction((PerformsTouchActions) driver)
					.press(PointOption.point(screenWidth / 2, screenHeight / 2))
					.waitAction(WaitOptions.waitOptions(Duration.ofMillis(500)))
					.moveTo(PointOption.point(screenWidth / 2, screenHeight / 4)) // 532,75
					.release()
					.perform();
		} else {
			System.out.println("Incorrect Parsing Value Direction");
		}
	}

	public boolean swipeUntilFoundElement(String direction, int maxSwipe, By elementLocator) {
		int swipeAttempt = 0;
		boolean elementFound = false;

		while (!elementFound && (swipeAttempt < maxSwipe)) {
			try {
				List<WebElement> elements = driver.findElements(elementLocator);
				if (!elements.isEmpty() && elements.get(0).isDisplayed()) {
					elementFound = true;
				} else {
					swipeAttempt++;
					this.swipeUpAndDown(direction);
				}
			} catch (NoSuchElementException e) {
				e.printStackTrace();
			}
		}

		if (elementFound) {
			return true;
		} else {
			return false;
		}
	}

	public String screenshot(String feature, String path_screenshot) {
		String base64Screenshot = null;

		try {
			LocalDateTime now = LocalDateTime.now();
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd_HH-mm-ss");
			String formattedDateTime = now.format(formatter);

			File srcFile = driver.getScreenshotAs(OutputType.FILE);
			String filename = feature + " - " + formattedDateTime;
			File targetFile = new File(path_screenshot + filename +".jpg");

			FileUtils.copyFile(srcFile, targetFile);

			byte[] fileContent = Files.readAllBytes(srcFile.toPath());
			base64Screenshot = Base64.getEncoder().encodeToString(fileContent);
		} catch (IOException e) {
			e.printStackTrace();
		}

		return base64Screenshot;
	}
}