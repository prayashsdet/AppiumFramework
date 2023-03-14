package com.mobile.es.stepdefinations;



import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.net.MalformedURLException;
import java.sql.SQLException;
import java.time.Duration;
import java.util.Arrays;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.testng.Assert;

import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter;
import com.mobile.es.pages.BaseClass;
import com.mobile.es.pages.FibeLoginActions;

import io.appium.java_client.AppiumBy;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class FibeLoginMobileStepDefinition extends BaseClass{
	
	
	
	
	public  static FibeLoginActions fp ;
	public FibeLoginMobileStepDefinition() throws MalformedURLException  {
		try {
			fp =new FibeLoginActions ();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Given("user launches the app")
	public void user_launches_the_app() {
	   System.out.println("launching app");
	  
	}
	@Given("user is on login screen")
	public void user_is_on_login_screen() throws InterruptedException {
		
		
		fp.scrollleft();
		fp.scrollleft();
		Thread.sleep(1000);
		fp.scrollright();
		fp.scrollright();
		System.out.println("scrolled successfully");
		
		
	    
	}


	@When("users enters {string}")
	public void users_enters(String string) {
		try {
  fp.enterMobileNumber(string);
//  ExtentCucumberAdapter.getCurrentScenario().createNode("Assertions").pass("pass message").log(Status.PASS,"Pass").info("actual meets expected").info("djfksdf"); 
		}
		catch(Exception e) {
			
			e.printStackTrace();
		}
	
	  
		
	  
	   
	}
	@When("taps on T&C checkbox")
	public void taps_on_t_c_checkbox() throws InterruptedException {
		
	  fp.tapOnCheckbox();
	   
	}
	@When("taps on getOtp button")
	public void taps_on_get_otp_button() throws InterruptedException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException, ClassNotFoundException, SQLException {
	    // Write code here that turns the phrase above into concrete actions
		
	    fp.tapOnGetOtpButton1();
	    fp.fetchandenterotp();
	}
	  @And("^taps on login button$")
	    public void taps_on_login_button() throws Throwable {
		
	   fp.tapOnLoginButton();
		   try {
			   
		   
		   fp.skipPermissions();
		   }
		   catch(Exception e) {
			   
		   }
	    }
	  @Then("user should be landed on social login screen")
	  public void user_should_be_landed_on_social_login_screen() {
		  try {
			  fp.taponsocialLogin();
	    fp.selectEmail();
		  }
		  catch(Exception e) {
			  
		  }
		  fp.skipPermissions();
	    
	}


	}


