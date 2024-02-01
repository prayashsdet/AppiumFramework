package com.mobile.es.stepdefinations;

import java.io.IOException;
import java.net.MalformedURLException;

import com.mobile.es.pages.FibeLoginActions;
import com.mobile.es.pages.FirstMileStonePage;
import com.mobile.es.pages.PageValidations;

import cucumber.api.java.en.Given;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class InvalidScenarioStepDefinition {
	
	FirstMileStonePage fsp;
	FibeLoginActions fp;
	PageValidations pv;
	public InvalidScenarioStepDefinition() throws MalformedURLException{
		fsp = new FirstMileStonePage();
		try {
			fp= new  FibeLoginActions();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			pv = new PageValidations();
			}
		
		
		
	}
	@Given("^user launches the app$")
    public void user_launches_the_app() throws Throwable {
		 
    }
	
	@When("^user directly taps on getOTP button without entering mobilenumber$")
    public void user_directly_taps_on_getotp_button_without_entering_mobilenumber() {
		 fp.fetchandenterotp();
		
	}
	 @Then("^the blank mobile number error message should be displayed$")
	    public void the_blank_mobile_number_error_message_should_be_displayed() {
		 pv.validateblankMobileNumber();
	 }

	
//    @When("^users enters invalid \"([^\"]*)\"$")
//    public void users_enters_invalid_something(String mobilenumber) throws Throwable {
//       fp.enterMobileNumber(mobilenumber);
//       
//    }
	 
	
	 

    @When("^user does not tick on checkbox and taps on save CTA$")
    public void user_does_not_tick_on_checkbox_and_taps_on_save_cta() throws Throwable {
       fp.tapOnGetOtpButton1();
     
    }
    
    @Then("^the missing checkbox error message should be displayed$")
    public void the_missing_checkbox_error_message_should_be_displayed() {
    	 pv.validatetermsandconditonsvalidationmessage();
    	
    }
    
    @And("^if user taps on getOtp button without entering OTP$")
    public void if_user_taps_on_getotp_button_without_entering_otp() throws Throwable {
    	fp.tapOnCheckbox();
    	fp.tapOnGetOtpButton1();
    	fp.tapOnLoginButton();
       
    }
    
    


   

    @Then("^the missing OTP error message should be displayed$")
    public void the_missing_otp_error_message_should_be_displayed()throws Throwable {
       pv.validateblankotpvalidationmessage();
    }

    @Then("^user enter valid OTP  and tap on login button$")
    public void user_enter_valid_otp_and_tap_on_login_button() throws InterruptedException {
    	 fp.tapOnCheckbox();
         fp.fetchandenterotp();
    	 fsp.tapOnsetupAccount();
		 fsp.tapOnInformativetextCTAButton();
    	
    }
    
   
    
    
  
    @When("^In form view firstname text field user enter invalid  (.+)  and tap on CTA button$")
    public void in_form_view_firstname_text_field_user_enter_invalid_and_tap_on_cta_button(String firstname) throws Throwable {
    	
		fsp.tapOnToggleviewCTAbutton();
		fsp.enterFirstName(firstname);
		
    }
    
    @Then("^the invalid first name  error message should be displayed$")
    public void the_invalid_first_name_error_message_should_be_displayed() {
    	pv.validatefirstnamevalidationmessage();
    	
    	
    }
    @Then("^user enter valid (.+)  and it should be accepted$")
    public void user_enter_valid_and_it_should_be_accepted(String validfirstname) {
    	try {
			fsp.enterFirstName(validfirstname);
		} catch (IOException | InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
    
    @When("^In form view lastname text field user enter invalid  (.+)  and tap on CTA button$")
    public void in_form_view_lastname_text_field_user_enter_invalid_and_tap_on_cta_button(String lastname) throws IOException, InterruptedException {
    	fsp.enterLastName(lastname);
    	 fsp.tapOnToggleviewCTAbutton();
    }
    
    @Then("^invalid last name  error message should be displayed$")
    public void invalid_last_name_error_message_should_be_displayed() {
    	pv.validatefirstnamevalidationmessage();
    }
    
  
    
    @And("^If user has not selected DOB and taps on CTA$")
    public void if_user_has_not_selected_dob_and_taps_on_cta() throws Throwable {
    	fsp.tapOnToggleviewCTAbutton();
    	
   
       
    }
    
    @Then("^the missing date of birth error message should be displayed$")
    public void the_missing_date_of_birth_error_message_should_be_displayed() {
    	pv.validatedob();
    }
    
    @Then("^user enters valid (.+) and it should be accepted$")
    public void user_enters_valid_and_it_should_be_accepted(String dob) {
    	try {
			fsp.enterDOB(dob);
		} catch (IOException | InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
    
    @Then("^If user has not selected employment type and taps on CTA$")
    public void if_user_has_not_selected_employment_type_and_taps_on_cta() throws Throwable {
        fsp.tapOnToggleviewCTAbutton();
    }



    @Then("^employment type should turn red$")
    public void employment_type_should_turn_red() throws Throwable {
       pv.validateemploymentType();
    }
    
    
    
    @And("^if user enters (.+)$")
    public void if_user_enters(String invalidpan) throws Throwable {
       fsp.enterPan(invalidpan);
    }

    @Then("^button should be disabled$")
    public void button_should_be_disabled() throws Throwable {
       
    }  
}
