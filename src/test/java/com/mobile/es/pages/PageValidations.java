package com.mobile.es.pages;

import java.io.IOException;
import java.net.MalformedURLException;

import org.openqa.selenium.By;

import com.mobile.es.utils.GenericUtilsMobile;
import com.web.es.javaUtils.ReadfromProperty;

public class PageValidations extends BaseClass {

	public PageValidations () throws MalformedURLException {
		
	}
	public LocatorsMobile  lm = new LocatorsMobile(appdriver);
	public GenericUtilsMobile gu =new GenericUtilsMobile();
	ReadfromProperty rfp = new ReadfromProperty();
	
	
	 
	public void validateblankMobileNumber() {
		String actualMessage = appdriver.findElement(lm.mobileNumberValidationMessage).getText();
		try {
			gu.softAssertionCheck(rfp.readConfigFile("mobilenumbervalidationmessage"),actualMessage, "blank mobile number validation successful", "blank mobile number validation failed");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
//	public void validateinvalidMobilenumber() {
//		String actualMessage = appdriver.findElement(lm.termsandconditionsValidationMessage).getText();
//		try {
//			gu.softAssertionCheck(rfp.readConfigFile("mobilenumbervalidationmessage"),actualMessage, "validation successful", "validation failed");
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		public void validatetermsandconditonsvalidationmessage() {
			String actualMessage = appdriver.findElement(lm.termsandconditionsValidationMessage).getText();
			try {
				gu.softAssertionCheck(rfp.readConfigFile("termsandconditionsValidationMessage"),actualMessage, "terms and conditons validation successful", "terms and conditons validation failed");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		public void validateblankotpvalidationmessage() {
			String actualMessage = appdriver.findElement(lm.otpblankvalidationmessage).getText();
			try {
				gu.softAssertionCheck(rfp.readConfigFile("otpValidationMessage"),actualMessage, "otp blank validation successful", "otp blank validation failed");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		public void validatefirstnamevalidationmessage() {
			String actualMessage = appdriver.findElement(lm.firstnameandlastnamevalidationmessage).getText();
			try {
				gu.softAssertionCheck(rfp.readConfigFile("firstnameandlastnamevalidationmessage"),actualMessage, "otp blank validation successful", "otp blank validation failed");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		public void validatedob() {
			String actualMessage = appdriver.findElement(lm.dobvalidationmessage).getText();
			try {
				gu.softAssertionCheck(rfp.readConfigFile("dobvalidationmessage"),actualMessage, "date of birth blank validation successful", "date of birth blank validation failed");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		public void validateemploymentType() {
			String actualMessage = appdriver.findElement(lm.employmentTypevalidation).getAttribute("color");
			System.out.println(actualMessage);
			try {
				gu.softAssertionCheck(rfp.readConfigFile("employmentTypevalidation"),actualMessage, "date of birth blank validation successful", "date of birth blank validation failed");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		public void validatePAN () {
			Boolean result = appdriver.findElement(lm.panConfirmButton).isEnabled();
			gu.softAssertionCheck(result ,true, "pan validation successful", "pan validation unsuccessful");
		}
			
		}
		
	
	
	

