package com.mobile.es.pages;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.net.MalformedURLException;
import java.sql.SQLException;

import com.mobile.es.utils.GenericUtilsMobile;
import com.web.es.databaseCon.DashBoardTestsDB;
import com.web.es.databaseCon.Dbconnection;

import io.appium.java_client.android.AndroidDriver;

public class FibeLoginActions extends BaseClass {
	public FibeLoginActions() throws IOException {

		super();
		// TODO Auto-generated constructor stub
	}

	public LocatorsMobile lm = new LocatorsMobile(appdriver);
	public GenericUtilsMobile gu = new GenericUtilsMobile();
	Dbconnection db;

	public void enterMobileNumber(String mobileNumber) throws IOException, InterruptedException {
//	try {
		try {
			gu.ElementToClick(lm.skipbutton, wait);
			
		} catch (Exception e) {

		}
//		gu.ElementToClick( lm.mobilenumbertextbox,wait);
//		 String mobileNum=mobileNumber;
//		    char[] num= mobileNum.toCharArray();
//		    for(int i=0;i<num.length;i++) {
//			Runtime.getRuntime().exec("adb shell input keyevent KEYCODE_NUMPAD_"+num[i]);
//		    Thread.sleep(200);
//		    appdriver.hideKeyboard();
//		
//	    
//	}
//	}
//	    catch(Exception e) {
		try {
			
			gu.ElementToClick(lm.closedialerpopup, wait);
			gu.ElementToClick(lm.mobilenumbertextbox, wait);
			String mobileNum = mobileNumber;
			char[] num = mobileNum.toCharArray();
			for (int i = 0; i < num.length; i++) {
				Runtime.getRuntime().exec("adb shell input keyevent KEYCODE_NUMPAD_" + num[i]);
//				Thread.sleep(200);
				appdriver.hideKeyboard();
			}
		} catch (Exception e) {
			gu.ElementToClick(lm.dialerpopup, wait);
		}
	}

//	    }

	public void tapOnCheckbox() throws InterruptedException {

		gu.ElementToClick(lm.checkbox3, wait);

	}

	public void scrollleft() throws InterruptedException {
//	gu.ElementToClick(lm.skipbutton );
		gu.scrollleftoright(lm.pageswipe, wait);

	}

	public void scrollright() throws InterruptedException {
//		gu.ElementToClick(lm.skipbutton );
		gu.scrollrighttoleft(lm.pageswipe, wait);

	}

	public void fetchandenterotp() {
		try {
			
			Thread.sleep(3000);
			db = new Dbconnection();
			String OTP = db.getOTPfromDb();
			System.out.println(OTP);
			gu.ElementTosendKeys(lm.otptextfield, OTP, wait);
			gu.hideKeyboard();
			
		} catch (Exception e) {
			e.printStackTrace();

		}
	}
	public void tapOnGetOtpButton1() throws InterruptedException {
		
		gu.ElementToClick(lm.getOtp, wait);
		Thread.sleep(3000);
		
	}

// public void enterOTP(String string) throws SQLException {
//		db = new DashBoardTestsDB();
//		String otp = db.GetOTPFromDB(string);
//		//driver.findElement(By.id("otp")).sendKeys(otp);
//		gu.ElementTosendKeys(OTP,otp, wait);
//		log.info("enter OTP: "+otp);
//	}
	public void tapOnLoginButton() throws InterruptedException {
//			throws InterruptedException, InstantiationException, IllegalAccessException, IllegalArgumentException,
//			InvocationTargetException, NoSuchMethodException, SecurityException, ClassNotFoundException, SQLException {

//	 db=new Dbconnection();
//	 String OTP  = db.getOTPfromDb();
//	 gu.ElementTosendKeys(lm.otptextfield, OTP, wait);
		
		gu.ElementToClick(lm.loginButton, wait);
//	 gu.ElementToClick(lm.loginButton,wait);
	}

	public void taponsocialLogin() {
		gu.ElementToClick(lm.sociallogin, wait);

	}

	public void selectEmail() {
		try {
			gu.ElementToClick(lm.email, wait);
		} catch (Exception e) {
			log.info("social login not required");
		}

	}

	public void skipPermissions() {
		try {

			gu.ElementToClick(lm.permissionSkipButton, wait);
		} catch (Exception e) {
			log.info("permiission already granted");
		}
	}
}
