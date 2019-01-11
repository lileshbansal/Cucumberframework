package com.TestRunners;

import java.io.File;
import java.io.IOException;

import org.junit.runner.RunWith;
import org.testng.annotations.AfterClass;
import com.cucumber.listener.Reporter;
import com.utils.utilities;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;



@RunWith(Cucumber.class)

@CucumberOptions(
		features = {"src/test/java/com/Features"}, 
		glue = {"com.StepDefinitions", "com.utils"},
		monochrome = true, 
		tags = {}, 
		plugin = { "pretty", "html:target/cucumber", "json:target/cucumber.json",
				"com.cucumber.listener.ExtentCucumberFormatter:output/report.html" }
		)

public class TestRunner extends AbstractTestNGCucumberTests {
	@AfterClass
	public static void writeExtentReport() throws IOException {
		Reporter.loadXMLConfig(new File(System.getProperty("user.dir") + "\\src\\main\\java\\com\\utils\\ReportsConfig.xml"));
		utilities.copyLatestExtentReport();
	}
}