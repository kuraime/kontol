package com.danamon.appium.runners;

import com.aventstack.extentreports.ExtentReports;
import com.danamon.appium.utils.ExtentReportManager;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.FeatureWrapper;
import io.cucumber.testng.PickleWrapper;
import io.cucumber.testng.TestNGCucumberRunner;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

@CucumberOptions(
		features = "src/test/resources/features",
		glue = {"com.danamon.appium.steps"},
		tags = "(@LoginInvalidCredential)",
		plugin = {"pretty",
				"html:target/cucumber-reports/dpro-appium-cucumber.html"})
public class TestNGRunner {
	private TestNGCucumberRunner testNGCucumberRunner;

	@BeforeClass(alwaysRun = true)
	public void setUpClass() {
		testNGCucumberRunner = new TestNGCucumberRunner(this.getClass());
	}

	@Test(groups = "cucumber", description = "Runs Cucumber Scenarios", dataProvider = "scenarios")
	public void scenario(PickleWrapper pickle, FeatureWrapper cucumberFeature) {
		testNGCucumberRunner.runScenario(pickle.getPickle());
	}

	@DataProvider(name = "scenarios", parallel = false)
	public Object[][] parallelScenarios() {
		if (testNGCucumberRunner == null) {
			testNGCucumberRunner = new TestNGCucumberRunner(this.getClass());
		}
		return testNGCucumberRunner.provideScenarios();
	}

	@AfterClass(alwaysRun = true)
	public void tearDownClass() {
		ExtentReportManager.endTest();
		testNGCucumberRunner.finish();
	}
}