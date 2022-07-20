package com.web.es.stepdefinations;

import com.web.es.pages.ESWebPortalBasicDetailsPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class ESWebPortalBasicDetailsSteps {
	
	private ESWebPortalBasicDetailsPage details;
	
	public ESWebPortalBasicDetailsSteps() {
		details= new ESWebPortalBasicDetailsPage();
	}
	
	@Given("^user enter first name (.+)$")
	public void user_enter_first_name(String firstname) throws Throwable {
		details.enterFirstName(firstname);
	}

	@Then("^user enter last name (.+)$")
	public void user_enter_last_name(String lastname) throws Throwable {
		details.enterLastName();
	}

	@Then("^user select gender (.+)$")
	public void user_select_gender(String gender) throws Throwable {
		details.selectGender();
	}

	@Then("^user enter Date of birth (.+)$")
	public void user_enter_date_of_birth(String dob) throws Throwable {
		details.enterDOB();
	}

	@Then("^user enter email address (.+)$")
	public void user_enter_email_address(String email) throws Throwable {
		details.enterEmail();
	}

	@Then("^user select employment type (.+)$")
	public void user_select_employment_type(String employmenttype) throws Throwable {
		details.employmentType();
	}

	@Then("^user monthly salary (.+)$")
	public void user_monthly_salary(String salary) throws Throwable {
		details.enterSalary();
	}

	@Then("^user enter office pincode (.+)$")
	public void user_enter_office_pincode(String officepincode) throws Throwable {
		details.enterOfficePinCode();

	}

	@Then("^user enter current residential pincode (.+)$")
	public void user_enter_current_residential_pincode(String pincode) throws Throwable {
		details.enterResidentialPinCode();
	}

	@Then("^user enter	Pancard number (.+)$")
	public void user_enterpancard_number(String pannumber) throws Throwable {
		details.enterPancardNumber();
	}

	@Then("^user click on I agree to  EarlySalary Terms & Conditions$")
	public void user_click_on_i_agree_to_earlysalary_terms_conditions() throws Throwable {
		details.clickOnIagree();
	}

	@Then("^user click on submit button$")
	public void user_click_on_submit_button() throws Throwable {
		details.clickOnSubmit();
	}

}
