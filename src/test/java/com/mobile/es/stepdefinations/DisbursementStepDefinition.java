package com.mobile.es.stepdefinations;

import java.net.MalformedURLException;

import com.mobile.es.pages.DisbursementPage;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DisbursementStepDefinition {
	DisbursementPage dsp;
	
	public DisbursementStepDefinition() throws MalformedURLException {
		dsp=new DisbursementPage();
	}
	
	  @When("^user is on disbursement dashboard$")
	    public void user_is_on_disbursement_dashboard() throws Throwable {
	        
	    }

	    @Then("^user tap on CTA in UW  dashboard$")
	    public void user_tap_on_cta_in_uw_dashboard() throws Throwable {
	    	dsp.tapOnCTAinDashboard();
	    }

	    @Then("^user enter (.+) in the text field$")
	    public void user_enter_in_the_text_field(String loanamount) throws Throwable {
	        dsp.enterLoanAmount(loanamount);
	        
	    }

	    @Then("^user tap on CTA after entering loan amount$")
	    public void user_tap_on_cta_after_entering_loan_amount() throws Throwable {
	        
	    }

	    @Then("^chooses tenure$")
	    public void chooses_tenure() throws Throwable {
	        
	    }

	    @Then("^user tap on the promo code hyperlink$")
	    public void user_tap_on_the_promo_code_hyperlink() throws Throwable {
	        dsp.applyPromoCode();
	    }

	    @Then("^user select one promo code$")
	    public void user_select_one_promo_code() throws Throwable {
	        
	    }

	    @Then("^user taps on apply button$")
	    public void user_taps_on_apply_button() throws Throwable {
	        
	    }

	    @Then("^user removes promo code$")
	    public void user_removes_promo_code() throws Throwable {
	        dsp.removePromoCode();
	    }

	    @Then("^user continues to loan information$")
	    public void user_continues_to_loan_information() throws Throwable {
	        dsp.chooseTenureCTA();
	    }

	    @Then("^user taps on view details$")
	    public void user_taps_on_view_details() throws Throwable {
	        dsp.taponviewdetails();
	    }

	    @Then("^user taps on disbursement amount info$")
	    public void user_taps_on_disbursement_amount_info() throws Throwable {
	        dsp.taponinfobutton();
	    }

	    @Then("^user  taps on okaygotitCTA$")
	    public void user_taps_on_okaygotitcta() throws Throwable {
	        
	    }

	    @Then("^user tap on know more text$")
	    public void user_tap_on_know_more_text() throws Throwable {
	        dsp.tapOnknowmore();
	    }

	    @Then("^tap on fibeEnsure hyperlink$")
	    public void tap_on_fibeensure_hyperlink() throws Throwable {
	        
	    }

	    @Then("^user tap on policy T&C hyperlink$")
	    public void user_tap_on_policy_tc_hyperlink() throws Throwable {
	        
	    }

	    @Then("^user tap on assignemnt declaration$")
	    public void user_tap_on_assignemnt_declaration() throws Throwable {
	        
	    }

	    @Then("^user tap on loan agreement hyperlink$")
	    public void user_tap_on_loan_agreement_hyperlink() throws Throwable {
	        
	    }

	    @Then("^user tap on another T&C hyperlink$")
	    public void user_tap_on_another_tc_hyperlink() throws Throwable {
	        
	    }
	    
	    @Then("^user tap on checkbox$")
	    public void user_tap_on_checkbox() throws Throwable {
	       dsp.taponcheckbox1();
	       dsp.taponcheckbox2();
	    }

	    @Then("^user tap on confirms button and enter OTP$")
	    public void user_tap_on_confirms_button_and_enter_otp() throws Throwable {
	    	dsp.confirm();
	       dsp.enterOTP();
	    }



}
