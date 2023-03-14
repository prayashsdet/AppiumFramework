package com.mobile.es.stepdefinations;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.net.MalformedURLException;
import java.sql.SQLException;

import com.mobile.es.pages.BaseClass;
import com.mobile.es.pages.EditProfilePage;
import com.mobile.es.pages.KYCpage;
import com.mobile.es.pages.LocatorsMobile;

import io.cucumber.java.en.Then;

public class EditProfileStepDefinition extends BaseClass {
	
	 EditProfilePage epf;
	 KYCpage ksp;
	 LocatorsMobile lm ;
	
	
	
	
	 public EditProfileStepDefinition() throws MalformedURLException {
		epf = new EditProfilePage();
		 ksp = new KYCpage();
		 lm= new LocatorsMobile(appdriver);
	}

	@Then("^user taps on hamberger menu$")
	    public void user_taps_on_hamberger_menu() throws Throwable {
	        epf.tapOnmoremenu();
	    }

	    @Then("^user goes to edit profile$")
	    public void user_goes_to_edit_profile() throws Throwable {
	    	epf.editprofilebutton();
	        
	    }

	    @Then("^user changes the (.+)$")
	    public void user_changes_the(String emaildadress)throws Throwable {
	    	
	    	epf.editemailbutton();
	    	epf.enterOTP();
	    	epf.tapOnCTA();
	    	epf.enteremailaddress(emaildadress);
//	    	epf.hidekeyBoard();
	    	epf.tapOnCTA();
	    	
	    	epf.enterOTP();
	    	epf.tapOnCTA();
	    	  if(appdriver.findElement(lm.status).getText().equals("Entered same detail")||appdriver.findElement(lm.status).getText().equals("Not eligible to edit")) {
				    epf.tapOnokayGotitPopUp();
					epf.tapOnBackButton();
					  	}
				    else {
					epf.tapOnokayGotitPopUp();
				    }
	    }


	    @Then("^enter (.+)$")
	    public void enter(String newemailadress)  throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException, ClassNotFoundException, SQLException, IOException, InterruptedException  {
	    	    epf.editemailbutton();
		        epf.enterOTP();
		        epf.tapOnCTA();
		    	epf.enteremailaddress(newemailadress);
		    	epf.tapOnCTA();
		    	epf.enterOTP();
		    	epf.tapOnCTA();
		    	Thread.sleep(3000);
			    if(appdriver.findElement(lm.status).getText().equals("Entered same detail")||appdriver.findElement(lm.status).getText().equals("Not eligible to edit")) {
			    epf.tapOnokayGotitPopUp();
				epf.tapOnBackButton();
				  	}
			    else {
			    	
				epf.tapOnokayGotitPopUp();
				   	}

			    	}

			    	
		    	
	    

	    @Then("user tap on  edit home address")
	    public void user_tap_on_edit_home_address() throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException, ClassNotFoundException, SQLException, IOException, InterruptedException  {
	        epf.edithomeAddressbutton();
	        epf.enterOTP();
	        epf.tapOnCTA();
	        
	    }
	    

	   

	    @Then("^Again user  change home  details then user is not allowed$")
	    public void again_user_change_home_details_then_user_is_not_allowed() throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException, ClassNotFoundException, SQLException, IOException, InterruptedException  {
	    	
	    	epf.edithomeAddressbutton();
	        epf.enterOTP();
	        epf.tapOnCTA();
	        
	        	    }
	    	    @Then("^user tap the editworkaddressbutton$")

	    public void user_tap_the_editworkaddressbutton() throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException, ClassNotFoundException, SQLException, IOException, InterruptedException {
	    	epf.editworkAddressbutton();
	    	try {
	        epf.enterOTP();
	        epf.tapOnCTA();
	    	}
	    	catch(Exception e) {
	    		
	    	}
	    	
	    }

	    @Then("^user if changes the office  details then user is not allowed$")
	    public void user_if_changes_the_office_details_then_user_is_not_allowed() throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException, ClassNotFoundException, SQLException, IOException, InterruptedException  {
	    	
	    	epf.editworkAddressbutton();
	    	try {
	        epf.enterOTP();
	        epf.tapOnCTA();
	    	}
	    	catch(Exception e) {
	    		
	    	}
	       
	    }

	    @Then("^user if again try to change bank details again user should not be allowed$")
	    public void user_if_again_try_to_change_bank_details_again_user_should_not_be_allowed() throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException, ClassNotFoundException, SQLException, IOException, InterruptedException  {
	        epf.editbankdetails();
	        epf.enterOTP();
	        epf.tapOnCTA();
	    }
	    
	    @Then("^user has to then  change bank details $")
	    public void user_has_to_then_change_bank_details() throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException, ClassNotFoundException, SQLException, IOException, InterruptedException {
	    	  epf.editbankdetails();
		        epf.enterOTP();
		        epf.tapOnCTA();
	    }

	}

