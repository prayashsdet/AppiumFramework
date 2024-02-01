package com.mobile.es.pages;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.net.MalformedURLException;
import java.sql.SQLException;
import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Pause;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;

import com.mobile.es.utils.GenericUtilsMobile;
import com.web.es.databaseCon.Dbconnection;

import io.appium.java_client.AppiumBy;


public class DisbursementPage extends BaseClass {

	
	
	public DisbursementPage()  throws MalformedURLException {
		
	}
	
	public LocatorsMobile lm = new LocatorsMobile(appdriver);
	public GenericUtilsMobile gu = new GenericUtilsMobile();
	Dbconnection db;
	
	
	
	public void tapOnCTAinDashboard() {
		gu.ElementToClick(lm.disbursementdashboardCTA, wait);
	}
	
	public void enterLoanAmount(String data) throws IOException, InterruptedException {
		gu.ElementTosendKeys(lm.loanAmountfield, data, wait);
		gu.hideKeyboard();
		gu.ElementToClick(lm.chooseTenureCTA, wait);
	}
	
	public void clickontenure1() {
		gu.ElementToClick(lm.tenurebox1, wait);
		
	}
	
	public void clickontenure2() {
		gu.ElementToClick(lm.tenurebox2, wait);
	}
	
	public void applyPromoCode() {
		gu.ElementToClick(lm.applypromocode, wait);
		gu.ElementToClick(lm.tenurebox1, wait);
		gu.ElementToClick(lm.tenurebox2, wait);
		gu.ElementToClick(lm.promocodeCTA, wait);
		
	}
	
	public void removePromoCode() {
		gu.ElementToClick(lm.applypromocode, wait);
	}
	
	public void chooseTenureCTA() {
		gu.ElementToClick(lm.chooseTenureCTA, wait);
	}
	
	public void taponviewdetails() {
		gu.ElementToClick(lm.viewdetails, wait);
	}
	
	public void taponinfobutton() {
		gu.ElementToClick(lm.infobutton, wait);
	}
	
	public void tapOnknowmore() {
	
		gu.scrollToElement("loan agreement");
		
		}
	
	public void taponcheckbox1() {
		gu.ElementToClick(lm.checkboxdisbursement1, wait);
	}
	
	public void taponcheckbox2() {
		gu.ElementToClick(lm.checkboxdisbursement2, wait);
	}
	
	public void confirm() {
		gu.ElementToClick(lm.confirmdisbursement, wait);
	}
	
	
	public void enterOTP() throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException, ClassNotFoundException, SQLException, IOException, InterruptedException {
		Thread.sleep(3000);
		db = new Dbconnection();
		String OTP = db.getOTPfromDbforeditprofile();
		System.out.println(OTP);
		gu.ElementTosendKeys(lm.disbursementOTP, OTP, wait);
		gu.scrollToElement("Verify OTP");
	}
		



		}
		




	
	
	
	
	
	
	
	
	
	

