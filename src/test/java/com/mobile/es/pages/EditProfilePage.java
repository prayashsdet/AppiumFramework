package com.mobile.es.pages;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.net.MalformedURLException;
import java.sql.SQLException;

import org.openqa.selenium.By;

import com.mobile.es.utils.GenericUtilsMobile;
import com.web.es.databaseCon.Dbconnection;

public class EditProfilePage extends BaseClass	 {
	
	public EditProfilePage() throws MalformedURLException{
		
	}
	
	Dbconnection db;

	
	
	public LocatorsMobile lm = new LocatorsMobile(appdriver);
	public GenericUtilsMobile gu = new GenericUtilsMobile();
	
	
	
	public void editemailbutton() {
		gu.ElementToClick(lm.editemailaddress, wait);
	}
	
	public void editprofilebutton() {
		gu.ElementToClick(lm.editPofilebutton, wait);
	}
	
	public void edithomeAddressbutton() {
		gu.ElementToClick(lm.editprofilehomeaddress, wait);
	}
	
	public void editworkAddressbutton() {
		gu.ElementToClick(lm.editworkadresseditprofile, wait);
	}
	
	public void editbankdetails() {
		gu.scrollToElement("BankDetails");
	}
	
	
	public void enterOTP() throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException, ClassNotFoundException, SQLException, IOException, InterruptedException {
		Thread.sleep(3000);
		db = new Dbconnection();
		String OTP = db.getOTPfromDbforeditprofile();
		System.out.println(OTP);
		gu.ElementTosendKeys(lm.otpemailtextfield, OTP, wait);
		
	}
	
	public void hidekeyBoard() {
		gu.hideKeyboard();
	}
	
	public void tapOnCTA() {
		gu.ElementToClick(lm.saveOTP, wait);
	}
	
	public void tapOnokayGotitPopUp() {
		gu.ElementToClick(lm.editprofileokaygotit, wait);
	}
	
	public void enteremailaddress(String emaildadress) throws IOException, InterruptedException {
		
		gu.ElementTosendKeys(lm.emailIDTextField, emaildadress, wait);
		gu.hideKeyboard();
	}
	
	public void tapOnmoremenu() {
		gu.ElementToClick(lm.moremenu, wait);
		
	}
	public void tapOnBackButton() {
		gu.ElementToClick(lm.backButtoneditprofile, wait);
	}
	
	
}
