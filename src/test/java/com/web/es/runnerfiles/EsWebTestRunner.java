package com.web.es.runnerfiles;

import org.junit.After;
import org.junit.Before;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.web.es.pages.BaseClass;

import io.cucumber.java.AfterAll;
import io.cucumber.java.BeforeAll;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(plugin = { "pretty", "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
		"timeline:test-output-thread/" }, features = "src/test/resources/features/sample.feature", // tags = "@tag1 or
																									// @tag2 or @tag3 or
																									// @tag4 or @tag5",
		glue = { "com.web.es.stepdefinations" }, monochrome = true, publish = true, dryRun = false)
public class EsWebTestRunner extends AbstractTestNGCucumberTests {

}
