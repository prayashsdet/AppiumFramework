package com.mobile.es.pages;

import java.net.MalformedURLException;

import com.mobile.es.utils.GenericUtilsMobile;

public class LoholdPage extends BaseClass {

	
	public LoholdPage() throws MalformedURLException {
		
	}
	
	public LocatorsMobile lm = new LocatorsMobile(appdriver);
	public GenericUtilsMobile gu = new GenericUtilsMobile();
	
	


public void clickOnDashboardCTA() {
	gu.ElementToClick(lm.dashboardCTAlohold, wait);
}


public void clickonwelcomeBackCTA() {
	gu.ElementToClick(lm.welcomebackCTAlohold, wait);
}

public void clickonCTA() {
	gu.ElementToClick(lm.loholdCTA, wait);
}

public void electricityBill() {
	gu.ElementToClick(lm.electricityBill, wait);
	gu.ElementToClick(lm.clickcurrentadressproofdocumentphoto, wait);
	gu.ElementToClick(lm.switchCamera, wait);
	gu.ElementToClick(lm.takePicture, wait);
	gu.ElementToClick(lm.okaybuttonlohold, wait);
	gu.ElementToClick(lm.submitphoto, wait);
}


public void passBook() {
	
	gu.ElementToClick(lm.uploadPassBook, wait);
	gu.ElementToClick(lm.takePicture, wait);
	gu.ElementToClick(lm.okaybuttonlohold, wait);
	gu.ElementToClick(lm.submitphoto, wait);
	
}



}

