package com.mobile.es.stepdefinations;

import java.net.MalformedURLException;
import java.time.Duration;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.mobile.es.pages.BankStatementPage;
import com.mobile.es.pages.BaseClass;

import cucumber.api.java.en.Given;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class BankStatementStepDefinition{
	
	BankStatementPage bsp;
	
	public BankStatementStepDefinition() throws MalformedURLException {
		bsp = new BankStatementPage();
	}
	
	
	 @And("^User is on Dashboard$")
	    public void user_is_on_dashboard() {
//	       try {
			try {
				bsp.tapOnwelcomebackCTAincomeproof();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
	 }

	   

	  @Then("^user pick one (.+)$")
	    public void user_pick_one(String bankname)  throws Throwable {
		  try {
		  bsp.taponinformativetextCTA();
		  }
		  catch(Exception e) {
			  
		  }
	       bsp.selectbank(bankname);
	    }

	    @Then("^user will choose offline/online option to upload bank statement$")
	    public void user_will_choose_offlineonline_option_to_upload_bank_statement() throws Throwable {
	       bsp.selectofflinemethod();
	    }

	    @Then("^user will select the option to upload 3 month bank statement in one file$")
	    public void user_will_select_the_option_to_upload_3_month_bank_statement_in_one_file() throws Throwable {
	       bsp.selectthreemonthbankstatementinonefile();
	    }

	    @Then("^user will upload (.+) and click on submit button$")
	    public void user_will_upload_and_click_on_submit_button(String bankstatementpdf) throws Throwable {
	       bsp.tapOndialoguebox();
	       bsp.selectpdffromlist(bankstatementpdf);
	       bsp.submitbankstatement();
//	       Thread.sleep(60000);
	       try {
	    	   
	       bsp.continueKYC();
	       }
	       catch(Exception e) {
	    	   bsp.dismiss();
	       }
	      
	      
	    }

	  
	       
	    }

