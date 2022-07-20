package com.web.es.stepdefinations;

import java.sql.SQLException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.web.es.databaseCon.DashBoardTestsDB;
import com.web.es.pages.ESWebPortalLoginPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ESWebPortalLoginSteps {

	ESWebPortalLoginPage loginpage = new ESWebPortalLoginPage();

	@Given("user launch application with url as {string}")
	public void user_launch_application_with_url_as(String string) {
		loginpage.launchApplication(string);
	}

	@When("user enters mobile no {string}")
	public void user_enters_mobile_no(String string) {
		loginpage.enterMobile(string);
	}

	@When("user click on GetOTP button")
	public void user_click_on_get_otp_button() throws InterruptedException {
		loginpage.clickSubmitButton();
	}

	@When("Executes {string} and user enters OTP")
	public void executes_and_user_enters_otp(String string) throws SQLException {
		loginpage.enterOTP(string);
	}

	@Then("user login successfully")
	public void user_login_successfully() throws InterruptedException {
		loginpage.clickSubmitButton();
	}

}
