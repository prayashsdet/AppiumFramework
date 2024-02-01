package com.mobile.es.stepdefinations;

import java.net.MalformedURLException;

import com.mobile.es.pages.ITRPage;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ITRStepdefitnition {
ITRPage itr;
	
	 public ITRStepdefitnition() throws MalformedURLException {
		 itr = new ITRPage() ;
	 }
	 
	 @When("^user is in  ITR journey dashboard$")
	    public void user_is_in_itr_journey_dashboard() throws Throwable {
	        itr.dashboardandwelcomebackCTA();
	    }

	    @Then("^user will be  redirected to ITR journey upload screen$")
	    public void user_will_be_redirected_to_itr_journey_upload_screen() throws Throwable {
	        itr.updatePAN();
	        
	       
	    }

	    @Then("^user has to then  upload (.+)$")
	    public void user_has_to_then_upload(String itrr)throws Throwable {
	    	itr.uploadITR(itrr);
	    }

	   

	   
	}
