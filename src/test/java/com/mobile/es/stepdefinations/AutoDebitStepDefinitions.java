package com.mobile.es.stepdefinations;

import java.net.MalformedURLException;

import com.mobile.es.pages.AutoDebitPage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AutoDebitStepDefinitions {
	AutoDebitPage adp;
	
	public AutoDebitStepDefinitions() throws MalformedURLException {
		adp = new AutoDebitPage();
	}
	
	
	
	 @When("^user is on auto-debit dashboard$")
	 public void user_is_on_autodebit_dashboard() throws Throwable {
	        adp.taponCTAinDashboard();
	    }

	    @Then("^user is shown welcome screen$")
	    public void user_is_shown_welcome_screen() throws Throwable {
	        
	    }

	    @Then("^he tap on CTA again$")
	    public void he_tap_on_cta_again() throws Throwable {
	    	adp.welcomeBackCTA();
	        
	    }

	    @Then("^user select online/offline option$")
	    public void user_select_onlineoffline_option() throws Throwable {
	        adp.uploadofflineNACHform();
	    }

	    @Then("^user tap on print and upload NACH  form$")
	    public void user_tap_on_print_and_upload_nach_form() throws Throwable {
	        
	    }

	    @Then("^user click NACH form photo$")
	    public void user_click_nach_form_photo() throws Throwable {
	        adp.clickNACHphoto();
	    }

	    @Then("^user upload NACH form$")
	    public void user_upload_nach_form() throws Throwable {
	        adp.submitNACH();
	    }

	    @Then("^user should be landed on acknowledgement screen$")
	    public void user_should_be_landed_on_acknowledgement_screen() throws Throwable {
	        
	    }

	    @And("^user tap on CTA on fibe card$")
	    public void user_tap_on_cta_on_fibe_card() throws Throwable {
	        
	    }
}
