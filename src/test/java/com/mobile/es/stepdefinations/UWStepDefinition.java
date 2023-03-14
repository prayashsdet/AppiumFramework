package com.mobile.es.stepdefinations;

import java.net.MalformedURLException;

import com.mobile.es.pages.UWSuspendpage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UWStepDefinition {
	UWSuspendpage uwsp ;
	public UWStepDefinition() throws MalformedURLException {
		uwsp= new UWSuspendpage();
	}

	
	
	@When("^user is on UW suspend dashboard and user clicks on CTA$")
    public void user_is_on_uw_suspend_dashboard_and_user_clicks_on_cta() throws Throwable {
		uwsp.tapOnCTAinDashboard();
       uwsp.taponcontinuetoprovideadditonaldocumentsCTA();
    }

    @Then("^user is redirected to reason list screen$")
    public void user_is_redirected_to_reason_list_screen() throws Throwable {
       uwsp.printlistofreasons();
    }

    @Then("^user has to provide (.+)$")
    public void user_has_to_provide(String appointmentletter)throws Throwable {
    	
       uwsp.uploadorsubmitCTA();
       uwsp.uploadAppointmentLetter(appointmentletter);
       uwsp.uploadorsubmitCTA();
       
    }

    @Then("^user will update \"([^\"]*)\"$")
    public void user_will_update_something(String pannumber) throws Throwable {
    	uwsp.uploadorsubmitCTA();
       uwsp.updatePANorPassword(pannumber);
          }
    
    @Then("^user will have to update (.+)$")
    public void user_will_have_to_update(String password) {
    	try {
    	uwsp.uploadorsubmitCTA();
    	   uwsp.updatePANorPassword(password);
    	}
    	catch(Exception e) {
    		
    	}
    }
    
    @Then("^user will  provide his salary slips (.+),(.+),(.+)$")
    public void user_will_provide_his_salary_slips_(String salaryslip1, String salaryslip2, String salaryslip3) {
    	uwsp.uploadorsubmitCTA();
    	uwsp.uploadSalarySlip(salaryslip1, salaryslip2, salaryslip3);
    	uwsp.uploadorsubmitCTA();
    
    	
    }

    @Then("^will provide salary missing reasons$")
    public void will_provide_salary_missing_reasons() throws Throwable {
    	uwsp.veriffirstreasonforsalarymissing();
    	uwsp.selectsecondreason();
       
    }

    @Then("^user or the customer  provide (.+)$")
    public void user_or_the_customer_provide(String itr) throws Throwable {
    	
    	uwsp.uploadITR(itr);
    	
    }


}
