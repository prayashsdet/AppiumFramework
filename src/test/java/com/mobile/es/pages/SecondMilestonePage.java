package com.mobile.es.pages;

import java.io.IOException;
import java.net.MalformedURLException;

import com.mobile.es.utils.GenericUtilsMobile;

public class SecondMilestonePage extends BaseClass {
	
public SecondMilestonePage () throws MalformedURLException {
		
		// TODO Auto-generated constructor stub
	}

	
	public LocatorsMobile  lm = new LocatorsMobile(appdriver);
	public GenericUtilsMobile gu =new GenericUtilsMobile();
	
	 
	 
	 
	 
public void selectRelationshipStatus() throws IOException, InterruptedException {
	try {
	 gu.ElementToClick(lm.okaygotit, wait); 
	}
	catch(Exception e) {
		
	}
gu.ElementToClick(lm.singleButton,wait);
	
	
}

public void entermonthlysalary(String text) throws IOException, InterruptedException {
	gu.ElementTosendKeys(lm.salarytextField,text, wait);
	
}

public void taponsalaryCTA() {
	gu.ElementToClick(lm.salarycta,wait);
}

public void tickfamilyIncomeConsentcheckBox() {
	gu.ElementToClick(lm.familyIncomeCheckBox,wait);
}
	
			

public void taponsalaryconfirmCTA() {
	gu.ElementToClick(lm.salaryconfirmcta,wait);
}
public void enterworkaddress(String text) {
	gu.ElementToClick(lm.workaddress,wait);
	try {
	gu.ElementTosendKeys(lm.googlesearch,text, wait);
	gu.ElementToClick(lm.earlysaltext,wait);
	}
	catch(Exception e) {
		gu.ElementToClick(lm.backbutton, wait);
	}
	gu.ElementToClick(lm.editButton,wait);
//	gu.ElementToClick(lm.saveaddressbutton,wait);
	
}

public void enterCompanyName(String companyName) throws IOException, InterruptedException {
	gu.ElementTosendKeys(lm.companyName, companyName, wait);
	gu.hideKeyboard();
}

public void enterOfficeAddress(String officeAddress) throws IOException, InterruptedException {
	gu.ElementTosendKeys(lm.completeaddress, officeAddress, wait);
	gu.hideKeyboard();
}

public void enterofficeLocality(String officeLocality) throws IOException, InterruptedException {
	gu.ElementTosendKeys(lm.locality, officeLocality, wait);
	gu.hideKeyboard();
}
public void enterofficePincode(String workpinCode) throws IOException, InterruptedException {
	gu.ElementTosendKeys(lm.WorkPincode, workpinCode, wait);
	gu.hideKeyboard();
}
public void saveCTA() {
	try {
	gu.ElementToClick(lm.saveaddressbutton,wait);
	}
	catch(Exception e) {
		gu.ElementToClick(lm.saveOTP, wait);
		 if(appdriver.findElement(lm.status).getText().equals("Entered same detail")||appdriver.findElement(lm.status).getText().equals("Not eligible to edit")) {
			 gu.ElementToClick(lm.editprofileokaygotit, wait);
			 gu.ElementToClick(lm.backButtoneditprofile, wait);
				  	}
			    else {
			     	 gu.ElementToClick(lm.editprofileokaygotit, wait);
				   	}
	}
	
	
}

public void enterhomeaddress(String text) throws InterruptedException, IOException {
	gu.ElementToClick(lm.homeaddress,wait);
	gu.ElementTosendKeys(lm.googlesearch,text, wait);
	try {
	gu.ElementToClick(lm.annastaytext,wait);
	gu.ElementToClick(lm.edithomeaddress,wait);
	}
	catch(Exception e) {
		gu.ElementToClick(lm.backbutton, wait);
	}
//	gu.ElementTosendKeys(lm.houseno,"101", wait);
//	gu.ElementToClick(lm.saveAddressCTA,wait);
	Thread.sleep(6000);
}

public void enterHomeLocality(String HomeLocality) throws IOException, InterruptedException {
	gu.ElementTosendKeys(lm.locality, HomeLocality, wait);
	gu.hideKeyboard();
}
public void enterHomePincode(String homePincode) throws IOException, InterruptedException {
	gu.ElementTosendKeys(lm.pincode, homePincode, wait);
	gu.hideKeyboard();
}
public void saveHomeAdress() {
	
	try {
		gu.ElementToClick(lm.saveOTP, wait);
		gu.ElementToClick(lm.editprofileokaygotit, wait);
		gu.ElementToClick(lm.backButtoneditprofile, wait);
		}
		catch(Exception e) {
			gu.ElementToClick(lm.saveAddressCTA,wait);
		}
}

public void completeapplication() {
	 gu.explicitlyWaitForElement(lm.completeapplication);
	gu.ElementToClick(lm.completeapplication,wait);
	
}

public void tapOnwelcomebackCTA() {
	 gu.explicitlyWaitForElement(lm.providepersonaldetailsCTA);
	gu.ElementToClick(lm.providepersonaldetailsCTA,wait);
}

public void completeaKYCCTA() {
	gu.ElementToClick(lm.dismiss,wait);
	
	
}

public void tapOnwelcomebackCTAKYC() {
	gu.ElementToClick(lm.completeKYCCTAinDashboard,wait);
	gu.ElementToClick(lm.completeKYCwelcomebackscreen,wait);
}
public void doitlaterbankstatement() {
	gu.ElementToClick(lm.illdoitlater, wait);
}
}
	


