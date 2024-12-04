package com.danamon.appium.utils;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.model.Report;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportManager {
	private static ExtentReports extent;
	private static ExtentTest test;

	public static ExtentReports getInstance(String platform) {
		if (extent == null) {
			// Initialize the ExtentSparkReporter
			ExtentSparkReporter sparkReporter = new ExtentSparkReporter(ConfigFileReader.getConfigPropertyVal("reportConfigPath"));
			sparkReporter.config().setDocumentTitle("Appium DBankPro Test Report");
			sparkReporter.config().setReportName("Test Execution Report");

			extent = new ExtentReports();
			extent.attachReporter(sparkReporter);
			extent.setSystemInfo("Environment", ConfigFileReader.getConfigPropertyVal("env"));
			extent.setSystemInfo("Platform", platform);
		} else {
			System.out.println("Time taken for run this particular steps is: " + extent.getReport().timeTaken());
		}
		return extent;
	}

	public static ExtentTest createTest(String testName) {
		test = extent.createTest(testName);
		return test;
	}

	public static void endTest() {
		extent.flush();
	}
}
