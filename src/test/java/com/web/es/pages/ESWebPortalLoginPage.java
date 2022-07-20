package com.web.es.pages;

import java.sql.SQLException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.web.es.databaseCon.DashBoardTestsDB;
import com.web.es.utils.GenericUtils;

public class ESWebPortalLoginPage extends BaseClass{
	

	DashBoardTestsDB db;
	GenericUtils gen = new GenericUtils(driver);
	
	private By Mobile = By.id("Mobile");
	private By Submit = By.xpath("//button[@type='submit']");
	private By OTP = By.id("otp");

	public void launchApplication(String string) {
		new BaseClass();
		driver.get(string);
		log.info("Open URL: "+ string);
	}

	public void enterMobile(String string) {
		//driver.findElement(By.id("Mobile")).sendKeys(string);
		gen.ElementTosendKeys(Mobile,string, wait);
		log.info("enter Mobile number");
	}

	public void clickSubmitButton() {
		//driver.findElement(By.xpath("//button[@type='submit']")).click();
		gen.ElementToClick(Submit, wait);
		try {Thread.sleep(3000);} catch (InterruptedException e) {}
	}

	public void enterOTP(String string) throws SQLException {
		db = new DashBoardTestsDB();
		String otp = db.GetOTPFromDB(string);
		//driver.findElement(By.id("otp")).sendKeys(otp);
		gen.ElementTosendKeys(OTP,otp, wait);
		log.info("enter OTP: "+otp);
	}
	
	public void closeBrowser() {
		new BaseClass("kill");
	}
	
}
