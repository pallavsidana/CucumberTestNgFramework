package com.qa.runner;



import org.junit.runner.RunWith;
//import cucumber.api.testng.AbstractTestNGCucumberTests;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "C:\\Users\\pallav.sidana\\eclipse-workspace\\CucumberPOM\\src\\main\\java\\com\\qa\\features\\qaClick.feature",
		glue = {"com/qa/stepDefinitions"},
		format = {"pretty","html:test-outout"},
		monochrome = true,
				strict = true,
				dryRun = false
		)
public class TestRunner{

}
