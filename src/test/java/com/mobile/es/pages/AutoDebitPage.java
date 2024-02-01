package com.mobile.es.pages;

import java.net.MalformedURLException;

import com.mobile.es.utils.GenericUtilsMobile;

public class AutoDebitPage extends BaseClass {
	
	
	
	
	
	
	
	public AutoDebitPage() throws MalformedURLException {
		
	}



	public LocatorsMobile  lm = new LocatorsMobile(appdriver);
	public GenericUtilsMobile gu =new GenericUtilsMobile();
	
	
	
	public void taponCTAinDashboard() {
		gu.ElementToClick(lm.setupautodebitCTA, wait);
		
	}
	
	public void welcomeBackCTA() {
		gu.ElementToClick(lm.getstartedautodebitwelcomescreenCTA, wait);
	}
	
	public void uploadofflineNACHform() {
		gu.ElementToClick(lm.setupautodebitonlinebutton, wait);
		gu.scrollupordown(lm.autoDebitPageSwipe, wait);
		gu.ElementToClick(lm.uploadofflineNACHFormlink, wait);
		gu.ElementToClick(lm.downloadandemailform, wait);
//		gu.ElementToClick(lm.alreadydownloadedNACH, wait);
		gu.ElementToClick(lm.clickNACHformphotooption, wait);
	}
	
	public void clickNACHphoto() {
		try {
		gu.ElementToClick(lm.clicknachformphotobutton, wait);
		gu.ElementToClick(lm.camera_bubble, wait);
		gu.explicitlyWaitForElement(lm.tryAgain);
		gu.ElementToClick(lm.tryAgain, wait);
		}
		catch(Exception e) {
			
		}
		try {
		gu.ElementToClick(lm.clickNACHformphotooption, wait);
		gu.ElementToClick(lm.clicknachformphotobutton, wait);
		gu.ElementToClick(lm.camera_bubble, wait);
		gu.explicitlyWaitForElement(lm.tryAgain);
		gu.ElementToClick(lm.tryAgain, wait);
		}
		catch(Exception e) {
			
		}
		gu.ElementToClick(lm.clickNACHformphotooption, wait);
		gu.ElementToClick(lm.clicknachformphotobutton, wait);
		gu.ElementToClick(lm.camera_bubble, wait);
		gu.explicitlyWaitForElement(lm.tryAgain);
		gu.ElementToClick(lm.tryAgain, wait);
		
		
	}
	
	public void submitNACH() {
		try {
		gu.ElementToClick(lm.submitNACH, wait);
	}
		catch(Exception e) {
			
		}
}
}
