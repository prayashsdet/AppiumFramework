package com.mobile.es.pages;

import java.io.IOException;
import java.net.MalformedURLException;

import com.mobile.es.utils.GenericUtilsMobile;

import io.appium.java_client.android.AndroidDriver;

public class FirstMileStonePage extends BaseClass {

	
	
	 
	

	
	

	
	
	
	public FirstMileStonePage() throws MalformedURLException{
		
		// TODO Auto-generated constructor stub
	}
	public LocatorsMobile  lm = new LocatorsMobile(appdriver);
	public GenericUtilsMobile gu =new GenericUtilsMobile();
	
	 
	 
	 
	 
public void enterFirstName(String firstName) throws IOException, InterruptedException {
	 gu.explicitlyWaitForElement(lm.firstName); 
gu.ElementTosendKeys( lm.firstName,firstName, wait);
	
	
}

public void clearFirstName(String lastName) {
	
	
}
public void enterLastName(String lastName) throws IOException, InterruptedException {
	 
gu.ElementTosendKeys( lm.lastName, lastName,wait);
	
	
}
public void tapOnNameCtaButton() throws InterruptedException {
	try {
	gu.ElementToClick(lm.ctaname,wait);
	}
	catch(Exception e) {
		gu.ElementToClick(lm.submitCTAtoggleview, wait);
	}
}

public void taponDOB() throws InterruptedException {
	try {
	gu.ElementToClick( lm.dob,wait);
	}
	catch(Exception ex) {
		
	}
}

public void enterDOB(String DOB) throws IOException, InterruptedException {
	try {
appdriver.findElement(lm.dobtextBox).clear();	
gu.ElementTosendKeys( lm.dobtextBox,DOB,wait);
	}
catch(Exception ex) {
	gu.ElementTosendKeys( lm.dobtoggleview,DOB,wait);
}

//List<WebElement> picker = appdriver.findElements(lm.DOBpicker);
//picker.get(0).sendKeys(date);
//picker.get(1).sendKeys(month);
//picker.get(2).sendKeys(year);


	
	
}
public void tapOnDOBCtaButton() throws InterruptedException {
	try {
	gu.ElementToClick(lm.dobcta,wait);
	}
	catch(Exception e) {
		
	}
}
public void selectEmploymentType() throws IOException, InterruptedException {
	
gu.ElementToClick( lm.salaried,wait);
	
	
}
public void enterPan(String pan) throws InterruptedException {
	try {
	if(appdriver.findElement(lm.showPrefetchPan).isDisplayed()) {
		gu.ElementToClick( lm.panConfirmButton,wait);
	}
	else
	{
		System.out.println("pan is not prefetched");
	}
}
	catch(Exception e) {
		try {
		System.out.println("please wait entering PAN number");
		gu.ElementTosendKeys(lm.panumbertextfield,  pan, wait);
		gu.ElementToClick(lm.enterPAN,wait);
		}
		catch(Exception ex) {
			gu.ElementToClick( lm.panConfirmButton,wait);
			
		}
		
	}


}
public void tapOnsetupAccount() throws InterruptedException {
	gu.ElementToClick( lm.setupAccount,wait);
}
public void tapOnInformativetextCTAButton() {
	try {
	gu.ElementToClick(lm.onScreenInstructions,wait);
}
	catch(Exception e) {
		//("instruction screen is not displayed as user is not fresh customer");
	}
}
	
	public void tapondoitlater() {
		gu.explicitlyWaitForElement(lm.doitlater);
		gu.ElementToClick(lm.doitlater,wait);
	}
	
	
	
	public void logout () {
		gu.ElementToClick(lm.moremenu,wait);
		gu.ElementToClick(lm.logouticon,wait);
		gu.ElementToClick(lm.logoutyesbutton,wait);
	}
	
	public void switchToToggleView() {
		gu.ElementToClick(lm.toggleswitchbutton, wait);
		gu.ElementToClick(lm.changetotoggleviewform, wait);
	}
	
	public void tapOnToggleviewCTAbutton() {
		gu.ElementToClick(lm.submitCTAtoggleview, wait);
	}
}

