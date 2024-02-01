package com.mobile.es.stepdefinations;

import java.net.MalformedURLException;

import com.mobile.es.pages.FirstJobberPage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FirstJobberStepDefiniton {
	FirstJobberPage fpj;
	public FirstJobberStepDefiniton () throws MalformedURLException {
		fpj=new FirstJobberPage();
	}
	
	@When("^user is on firstjobber journey dashboard$")
    public void user_is_on_firstjobber_journey_dashboard() throws Throwable {
       fpj.dashboardandwelcomeforfirstjobber();
    }

    @Then("^user redirected to offer letter upload screen$")
    public void user_redirected_to_offer_letter_upload_screen() throws Throwable {
       
    }

    @Then("^user will upload (.+)$")
    public void user_will_upload(String offerletter)throws Throwable {
       fpj.uploadOfferLetter(offerletter);
    }

    @Then("^user will verify the (.+)$")
    public void user_will_verify_the(String workemailid) throws Throwable {
       fpj.verifyEmail(workemailid);
       fpj.enterOTPforworkemail();
    
       
    }

    @And("^user taps on CTA$")
    public void user_taps_on_cta() throws Throwable {
    	   fpj.submitOTPandGoToDashboard();
    }

    @And("^after completing firstJobber journey and go to dashboard$")
    public void after_completing_firstjobber_journey_and_go_to_dashboard() throws Throwable {
       
    }

}
