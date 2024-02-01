package com.mobile.es.stepdefinations;

import java.net.MalformedURLException;

import com.mobile.es.pages.LoholdPage;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoholdStepDefinition {
	LoholdPage lhp;
	public LoholdStepDefinition() throws MalformedURLException {
		lhp=new LoholdPage();
	}

	    @When("^user is on lohold dashboard and user tap on cta$")
	    public void user_is_on_lohold_dashboard_and_user_tap_on_cta() throws Throwable {
	       lhp.clickOnDashboardCTA();
	       lhp.clickonwelcomeBackCTA();
	    }

	    @Then("^user provide proper and valid  current address again$")
	    public void user_provide_proper_and_valid_current_address_again() throws Throwable {
	       lhp.clickonCTA();
	      
	    }

	    @Then("^user will have to submit proper and valid  kyc document again$")
	    public void user_will_have_to_submit_proper_and_valid_kyc_document_again() throws Throwable {
	    	lhp.clickonCTA();
	    }

	    @Then("^user will have to submit proper and valid  selfie again$")
	    public void user_will_have_to_submit_proper_and_valid_selfie_again() throws Throwable {
	    	lhp.clickonCTA();
	    }
	    
	    @Then("^user provides the current address proof$")
	    public void user_provides_the_current_address_proof() throws Throwable {
	        lhp.clickonCTA();
	        lhp.electricityBill();
	    }

	    @Then("^user will upload passbook again$")
	    public void user_will_upload_passbook_again() throws Throwable {
	       lhp.clickonCTA();
	       lhp.passBook();
	    }

	    @Then("user will provide bank details again")
	    public void user_will_provide_bank_details_again()  throws Throwable {
	    	lhp.clickonCTA();
	    }

	    @Then("^user will have to provide or upload PAN card again$")
	    public void user_will_have_to_provide_or_upload_pan_card_again() throws Throwable {
	       lhp.clickonCTA();
	    }
}
