package com.mobile.es.stepdefinations;

import java.io.IOException;
import java.net.MalformedURLException;

import com.mobile.es.pages.RepaymentPage;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RepaymentStepDefinition {
RepaymentPage rpa ;
	
	public RepaymentStepDefinition() throws MalformedURLException {
		rpa = new RepaymentPage();
	}
	 @When("^user is on Repayment Dashboard$")
	    public void user_is_on_repayment_dashboard() throws Throwable {
	        rpa.taponbothrepaybutton();
	    }

	    @Then("^user will tap on CTA in the repayment dashboard$")
	    public void user_will_tap_on_cta_in_the_repayment_dashboard() throws Throwable {
	        
	    }

	    @Then("^number of active loan and active loans are displayed$")
	    public void number_of_active_loan_and_active_loans_are_displayed() throws Throwable {
	        rpa.printautodebitstatus();
	        
	        
	    }

	    @Then("user tap on view auto debit details")
	    public void user_tap_on_view_auto_debit_details()throws Throwable {
	    	rpa.autoDebitViewDetails();
	    }

	    @Then("^user tap on okaygotit CTA to close the drawer$")
	    public void user_tap_on_okaygotit_cta_to_close_the_drawer() throws Throwable {
	        
	    }

	    @Then("^user tap on pay now$")
	    public void user_tap_on_pay_now() throws Throwable {
	        rpa.payNow();
	    }

	    @Then("user select pay EMI due option and tap on	pay now")
	    public void user_select_pay_emi_due_option_and_tap_on_pay_now() throws Throwable {
	        rpa.payEMIdueoption();
	    }

	    @Then("^user comes back again and select close loan option$")
	    public void user_comes_back_again_and_select_close_loan_option() throws Throwable {
	        rpa.closeloan();
	    }

	    @Then("user select pay another amount option")
	    public void user_select_pay_another_amount_option()  {
	       
	    }
	    
	    @Then("^user enter a (.+)$")
	    public void user_enter_a(String amount) throws IOException, InterruptedException {
	    	 rpa.payanotheramount(amount);
	    }

	    @Then("^user will pay through saved UPI ID$")
	    public void user_will_pay_through_saved_upi_id() throws Throwable {
	        rpa.savedUPIid();
	    }

	    @Then("^user will pay through UPI apps$")
	    public void user_will_pay_through_upi_apps() throws Throwable {
	        rpa.UPIapps();
	    }

	    @Then("^user will pay by entering UPI ID$")
	    public void user_will_pay_by_entering_upi_id() throws Throwable {
	        rpa.UPIId();
	    }

	    @Then("^user will pay through internet banking$")
	    public void user_will_pay_through_internet_banking() throws Throwable {
	        rpa.internetBanking("state");
	    }

	    @Then("user will tap on success option")
	    public void user_will_tap_on_success_option() {
	    		rpa.success();  
	    }
	        
	  

	    @Then("^user has completed repayment journey successfully$")
	    public void user_has_completed_repayment_journey_successfully() throws Throwable {
	        
	    }

	}

