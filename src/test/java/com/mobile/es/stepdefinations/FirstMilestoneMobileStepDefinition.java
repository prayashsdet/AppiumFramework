package com.mobile.es.stepdefinations;


import java.io.IOException;
import java.net.MalformedURLException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.mobile.es.pages.FibeLoginActions;
import com.mobile.es.pages.FirstMileStonePage;

import io.appium.java_client.android.AndroidDriver;


import io.cucumber.java.en.And;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class FirstMilestoneMobileStepDefinition  {
    public FibeLoginActions fp;
	public  AndroidDriver appdriver;
	FirstMileStonePage fsp;
	
	
	
	
	public Logger log = LogManager.getLogger("FirstMilestoneMobileStepDefinition");
	 
	
	public FirstMilestoneMobileStepDefinition()  {
		  try {
			fsp = new FirstMileStonePage();
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	 
	}
	@When("user taps on setup account and switches to toggle view")
	public void user_taps_on_setup_account_and_switches_to_toggle_view() throws InterruptedException {
		 fsp.tapOnsetupAccount();
		 fsp.tapOnInformativetextCTAButton();
		 fsp.switchToToggleView();
	 }
        
    

    @When("^user enter (.+) and (.+)$")
    public void user_enter_and(String firstName,String lastName) throws Throwable {
       
	   
	    
	   try {
		   fsp.tapOnsetupAccount();
		   fsp.tapOnInformativetextCTAButton();
	   }
	   catch(Exception ex) {
		   
	   }
        fsp.enterFirstName(firstName);
        fsp.enterLastName(lastName);

        
    }

   
   
    
    @And("^tap on cta button$")
    public void tap_on_cta_button() throws Throwable {
     
      fsp.tapOnNameCtaButton();
    }

    @And("^user selects (.+)$")
    public void user_selects_DOB(String DOB) throws Throwable {
    
    fsp.taponDOB();
       fsp.enterDOB(DOB);
    }

    @And("^again taps on cta button$")
    public void again_taps_on_cta_button() throws Throwable {
  
       fsp.tapOnDOBCtaButton();
    }

    @And("^select \"([^\"]*)\"$")
    public void select_something(String employmenttype) throws Throwable {
    fsp.selectEmploymentType();
    }
   
    @And("^user should be asked to enter (.+) or it should be fetched from nsdl$")
    public void user_should_be_asked_to_enter_or_it_should_be_fetched_from_nsdl(String pan) throws Throwable {
    
      fsp.enterPan(pan);  
    }
    

   
    
    @Then("^user should land on complete profile page$")
    public void user_should_land_on_complete_profile_page() throws Throwable {
    	
    	
     fsp.tapondoitlater();
    	}
    	
    	
     
    
    
    @And("^user logs out of the application successfully$")
    public void user_logs_out_of_the_application_successfully() throws Throwable {
    	fsp.logout();
    }
    }


