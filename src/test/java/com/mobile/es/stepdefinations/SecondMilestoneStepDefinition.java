package com.mobile.es.stepdefinations;

import java.io.IOException;
import java.net.MalformedURLException;

import org.springframework.beans.factory.config.SmartInstantiationAwareBeanPostProcessor;

import com.mobile.es.pages.SecondMilestonePage;

import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SecondMilestoneStepDefinition {
	public  AndroidDriver appdriver;
	SecondMilestonePage smp;
	
	public SecondMilestoneStepDefinition() throws MalformedURLException {
		 smp = new SecondMilestonePage();
		 
	}
	 @Given("^user launch the app again$")
	    public void user_launches_the_app_again() throws Throwable {
		 appdriver.activateApp("RZ8M316LQAL");
	 }
	 
	 @Given("^User is on Post-PAN screen$")
	    public void user_is_on_postpan_screen() throws Throwable {
		 smp.completeapplication();
//		 smp.tapOnwelcomebackCTA();
		
	    }
	  @When("^user has selected  relationship status$")
	    public void user_has_selected_relationship_status() throws Throwable {
	    
	        smp.selectRelationshipStatus();
	    }
	  
	  @Then("^user has entered \"([^\"]*)\"$")
	    public void user_has_entered_something(String monthlysalary) throws Throwable {	  
	        smp.entermonthlysalary(monthlysalary);
	        smp.taponsalaryCTA();
//	        smp.tickfamilyIncomeConsentcheckBox();
	        smp.taponsalaryconfirmCTA();
	    }

	   

	  @And("^user select (.+) from google search$")
	    public void user_select_from_google_search(String workaddress) throws Throwable  {
	        smp.enterworkaddress(workaddress);
	        
	    }

	
	  
	  @Then("^user  type the   (.+)$")
	    public void user_will_type_the(String companyname) throws Throwable {
	        smp.enterCompanyName(companyname);
	    }


	    @Then("^user   put the (.+)$")
	    public void user_will_put_the(String completeofficeaddress) throws Throwable {
	    	smp.enterOfficeAddress(completeofficeaddress);
	       
	    }
	    
	    @Then("^user enter  (.+) field$")
	    public void user_enter_field(String officelocality) throws IOException, InterruptedException {
	    	smp.enterofficeLocality(officelocality);
	    }
	    
	    @Then("^after providing  \"([^\"]*)\" and user taps on saveofficeaddressCTA$")
	    public void after_providing_something_and_user_taps_on_saveofficeaddresscta(String officepincode) throws IOException, InterruptedException {
            smp.enterofficePincode(officepincode);
            smp.saveCTA();
	    }
	    
	   
	    
	    @And("^user picks the  (.+) from google search bar$")
	    public void user_picks_the_from_google_search_bar(String homeaddress) throws InterruptedException, IOException {
	        smp.enterhomeaddress(homeaddress);
	    }
	    
	    @Then("^user will provide   (.+) field$")
	    public void user_will_provide_field(String homelocality) throws IOException, InterruptedException {
	    	smp.enterHomeLocality(homelocality);
	    }
	    
	    @Then("^after user provides  \"([^\"]*)\" and taps on saveCTA$")
	    public void after_user_provides_something_and_taps_on_savecta(String homepincode) throws IOException, InterruptedException {
	    	smp.enterHomePincode(homepincode);
	    	smp.saveHomeAdress();
	    	
	    }
	    
	    

	    @Then("^user should land on Upload bank statement/Complete KYC  acknowledgement screen$")
	    public void user_should_land_on_upload_bank_statementcomplete_kyc_acknowledgement_screen() throws Throwable {
	   Thread.sleep(3000);
	   try {
        smp.completeaKYCCTA();
	   }
	   catch(Exception e) {
		   smp.doitlaterbankstatement();
	   }
//         smp.tapOnwelcomebackCTAKYC();

	    }
}
