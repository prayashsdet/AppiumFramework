package com.mobile.es.runnerfiles;



import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(plugin= {"pretty", "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:","timeline:test-output-thread/"},features ={"src/test/resources/features/LimitEnhancement.feature"},glue = {"com.mobile.es.stepdefinations","com.mobile.es.hooks" },monochrome = true, publish = true, dryRun = false)

public class FibeMobileTestNGRunner extends AbstractTestNGCucumberTests {

	
  }



		