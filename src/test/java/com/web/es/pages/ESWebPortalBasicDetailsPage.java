package com.web.es.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ESWebPortalBasicDetailsPage extends BaseClass{


	private By firstname= By.id("firstName");
	
	
	public void enterFirstName(String firstname) {
		driver.findElement(this.firstname).sendKeys(firstname);
		log.info("enter First Name");
	}

	public void enterLastName() {

	}

	public void selectGender() {

	}

	public void enterDOB() {

	}

	public void enterEmail() {

	}

	public void employmentType() {

	}

	public void enterSalary() {

	}

	public void enterOfficePinCode() {

	}

	public void enterResidentialPinCode() {

	}

	public void enterPancardNumber() {

	}

	public void clickOnIagree() {

	}

	public void clickOnSubmit() {

	}

}
