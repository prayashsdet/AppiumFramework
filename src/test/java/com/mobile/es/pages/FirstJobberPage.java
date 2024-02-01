package com.mobile.es.pages;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.net.MalformedURLException;
import java.sql.SQLException;

import com.mobile.es.utils.GenericUtilsMobile;
import com.web.es.databaseCon.Dbconnection;

public class FirstJobberPage extends BaseClass {

	
	public FirstJobberPage() throws MalformedURLException {
		
	}
	public LocatorsMobile  lm = new LocatorsMobile(appdriver);
	public GenericUtilsMobile gu =new GenericUtilsMobile();
	
	Dbconnection db;
	
	public void dashboardandwelcomeforfirstjobber() {
		gu.ElementToClick(lm.firstJobberCTA, wait);
		gu.ElementToClick(lm.welcomebackfirstjobberCTA, wait);
	}
	
	public void uploadOfferLetter(String offerletter) {
		gu.ElementToClick(lm.uploadOfferLetter, wait);
		gu.ElementToClick(lm.uploadofferletterdialoguebox, wait);
		gu.scrollToElement(offerletter);
		gu.ElementToClick(lm.uploadofferCTA, wait);
		
	}
	
	public void verifyEmail(String workEmail) throws IOException, InterruptedException {
		gu.ElementToClick(lm.verifyEmailID, wait);
		gu.ElementTosendKeys(lm.workemailfield, workEmail , wait);
		gu.ElementToClick(lm.getOTPCTA, wait);
		
	}
	
	public void enterOTPforworkemail() throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException, ClassNotFoundException, SQLException, IOException, InterruptedException {
		Thread.sleep(3000);
		db = new Dbconnection();
		String OTP = db.getOTPfromDbforeditprofile();
	
		System.out.println(OTP);
		gu.ElementTosendKeys(lm.workmailOTPfield, OTP, wait);
		gu.hideKeyboard();
	}
	
	public void submitOTPandGoToDashboard() {
		gu.ElementToClick(lm.submitemailOTP, wait);
		gu.ElementToClick(lm.gotodashboard, wait);
	}
}



