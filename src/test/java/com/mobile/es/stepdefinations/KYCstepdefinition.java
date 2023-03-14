package com.mobile.es.stepdefinations;

import java.io.IOException;
import java.net.MalformedURLException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.mobile.es.pages.FibeLoginActions;
import com.mobile.es.pages.KYCpage;

import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class KYCstepdefinition {
	
	  public FibeLoginActions fp;
		public  AndroidDriver appdriver;
		KYCpage ksp;
		
		
		
		
		public Logger log = LogManager.getLogger("FirstMilestoneMobileStepDefinition");
		 
		
		public KYCstepdefinition() throws MalformedURLException  {
			  ksp = new KYCpage();
		 
		}
	        
	@Given("^user is on KYC journey$")
    public void user_is_on_kyc_journey() throws Throwable {
		try {
    ksp.skipPermissions();
    
    }
		catch(Exception e) {
			e.printStackTrace();
		}
	}


    @When("^user tap on complete KYC CTA$")
    public void user_tap_on_complete_kyc_cta() throws Throwable {
//    	 ksp.completeaKYCCTA();
    }

    @Then("^welcome back screen is displayed$")
    public void welcome_back_screen_is_displayed() throws Throwable {
//    	Thread.sleep(16000);
//    	ksp.dismiss();
    	try {
    	 ksp.tapOnwelcomebackCTAKYC();
    	}
    	catch(Exception e) {
    		
    	}
    }

    @Then("^user uploads selfie$")
    public void user_uploads_selfie() throws Throwable {
    	try {
       ksp.uploadSelfie();
       
    }
    	catch(Exception e) {
    		e.printStackTrace();
    		System.out.println("selfie is uploaded");
    	}
    }


    @Then("^user clicks on  manual KYC  option$")
    public void user_clicks_on_manual_kyc_option() throws Throwable {
        try {
       ksp.selectmanualKYC();
        }
        catch(Exception e) {
        }
        }
    

    @Then("^user tap on aadhar chip$")
    public void user_tap_on_aadhar_chip() throws Throwable {
    	try {
    		
    	
        ksp.taponAadharchip();
    	}
    	catch(Exception e) {
    		
    	}
    }

    @Then("^user uploads front of aadhar$")
    public void user_uploads_front_of_aadhar() throws Throwable {
    	try {
       ksp.uploadfrontofaadhar();
    	}
    	catch(Exception e) {
    }
    }

    @Then("^user uploads back of aadhar$")
    public void user_uploads_back_of_aadhar() throws Throwable {
    	try {
       ksp.uploadbackofaadhaar();
    	}
    	catch(Exception e) {
    		
    	}
    }

    @Then("^user enters \"([^\"]*)\"$")
    public void user_enters_aadharnumber(String aadharnumber) throws Throwable {
    	try {
       ksp.enteraadharnumber(aadharnumber);
    	}
    	catch(Exception e) {
    		
    	}
    }

    @Then("^user will submit aadhar$")
    public void user_will_submit_aadhar() throws Throwable {
    	try {
    		
    	
        ksp.submitaadhar();
    	}
    	catch(Exception e) {
    		
    	}
    }

    @Then("^user has to enter  (.+)$")
    public void user_has_to_enter(String completeaddress) throws Throwable {
    	ksp.entercompleteaddress(completeaddress);
           }

    @Then("^user  will enter (.+)$")
    public void user_will_enter(String flatno) throws Throwable {
       ksp.enterflatno(flatno);
    }
    
    @Then("^user enter the (.+) field$")
    public void user_enter_the_field(String homelocality) throws Throwable {
     
       ksp.enterlocality(homelocality);
    }

    @Then("^after entering  \"([^\"]*)\"$")
    public void after_entering_something(String pincode) throws Throwable {
       ksp.enterpincode(pincode);
    }

    @Then("^city is auto-populated$")
    public void city_is_autopopulated() throws Throwable {
        
    }
    
    @And("^user taps on saveCTA$")
    public void user_taps_on_savecta() throws Throwable {
    ksp.saveaddress();
    }
        

    @Then("^will upload PAN$")
    public void will_upload_pan() throws Throwable {
      ksp.uploadPAN();
    }
    
    @Then("^after user  enter (.+)$")
    public void after_user_enter(String bankname) throws Throwable {
    	ksp.enterBankName(bankname);
    }
    

   
    
    @And("^user then  enter \"([^\"]*)\"$")
    public void user_then_enter_something(String accountnumber) throws Throwable {
        ksp.enteraccountnumber(accountnumber);
    }

    @And("^user will re-enter \"([^\"]*)\"$")
    public void user_will_reenter_something(String accountnumber) throws Throwable {
        ksp.confirmaccountnumber(accountnumber);
    }

    @Then("^user will tap on save bank details cta$")
    public void user_will_tap_on_save_bank_details_cta() throws Throwable {
       ksp.savebankdetails();
       
    }
    
    @Then("^user will enter \"([^\"]*)\"$")
    public void user_will_enter_something(String ifsccode) throws Throwable {
        ksp.IFSCcode(ifsccode);
    }

    @Then("^use has completed KYC$")
    public void use_has_completed_kyc() throws Throwable {
     ksp.pennydrop();
    }
    
    
    }
    
    

   
   


