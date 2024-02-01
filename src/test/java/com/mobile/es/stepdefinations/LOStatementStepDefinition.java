package com.mobile.es.stepdefinations;

import java.net.MalformedURLException;

import com.mobile.es.pages.LOStatementPage;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LOStatementStepDefinition {
	
	LOStatementPage lop;
	
	
	public LOStatementStepDefinition() throws MalformedURLException {
		lop = new LOStatementPage();
		
	}
	

	
	
	    @When("^user click on loan statement icon$")
	    public void user_click_on_loan_statement_icon()  {
	    	
	        lop.clickonloanStatementOption();
	    }

	    @Then("^loan details are displayed$")
	    public void loan_details_are_displayed() {
	        lop.printLoandetails();
	    }

	    @Then("^user tap on download and send email$")
	    public void user_tap_on_download_and_send_email()  {
	        lop.downloadandsendemail();
	    }

	    @Then("^user checks if filter is working properly for active,closed and pending loans$")
	    public void user_checks_if_filter_is_working_properly_for_activeclosed_and_pending_loans() throws Throwable {
	        lop.chipsverification();
	    }

	    @Then("^user open the loan card and particular loan details are diplayed to customer$")
	    public void user_open_the_loan_card_and_particular_loan_details_are_diplayed_to_customer() throws Throwable {
	        lop.openLoanCard();
	    }

	    @Then("^user taps on more details and user tap on back button$")
	    public void user_taps_on_more_details_and_user_tap_on_back_button() throws Throwable {
	        lop.tapOnMoreDetails();
	    }

	    @Then("ueser taps on request for cancellation for loan")
	    public void ueser_taps_on_request_for_cancellation_for_loan() throws InterruptedException {
	    	lop.loanCancellation();
	    	lop.forecloseLoan();
	        lop.clickonloanStatementOption();
	        lop.openLoanCard();
	        lop.tapOnMoreDetails();
	        lop.cancelLoan();
	        
	    }
}
