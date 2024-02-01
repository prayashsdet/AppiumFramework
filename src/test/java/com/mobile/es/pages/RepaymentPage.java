package com.mobile.es.pages;

import java.io.IOException;
import java.net.MalformedURLException;

import com.mobile.es.utils.GenericUtilsMobile;

import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

public class RepaymentPage extends BaseClass {
	
	public RepaymentPage() throws MalformedURLException{
		
	}
	
	
	
	
	public LocatorsMobile lm = new LocatorsMobile(appdriver);
	public GenericUtilsMobile gu = new GenericUtilsMobile();
	
	
	public void taponbothrepaybutton() {
		gu.ElementToClick(lm.repaynowbutton, wait);
		gu.ElementToClick(lm.backbuttonrepay, wait);
		gu.ElementToClick(lm.repaybutton2, wait);
	}
	
	public void printautodebitstatus() {
		gu.getText(lm.statusAutoDebit, wait);
		gu.getText(lm.nextdueamount, wait);
		gu.getText(lm.totaloutstandingamount, wait);
		gu.getText(lm.nextDueDate, wait);
	}
	
	public void autoDebitViewDetails() {
		gu.ElementToClick(lm.viewdetails, wait);
		gu.ElementToClick(lm.okaygotitforautodebitdrawer, wait);
	}
	
	public void payNow() {
		gu.ElementToClick(lm.paynowbutton, wait);
		
	}
	
	public void payEMIdueoption() {
		gu.ElementToClick(lm.payEMIdueradiobutton, wait);
		gu.ElementToClick(lm.paynowbuttonindrawer, wait);
		gu.ElementToClick(lm.backbuttonrepay, wait);
		gu.ElementToClick(lm.paynowbutton, wait);

		
		
	}
	
	public void closeloan() {
		gu.ElementToClick(lm.closeLoan, wait);
		gu.ElementToClick(lm.paynowbuttonindrawer, wait);
		gu.ElementToClick(lm.backbuttonrepay, wait);
		


	}
	
	public void payanotheramount(String data) throws IOException, InterruptedException {
		gu.ElementToClick(lm.paynowbutton, wait);
		gu.ElementToClick(lm.payanotheramount, wait);
		gu.ElementToClick(lm.payanotheramounttextfield, wait);
//		gu.ElementTosendKeys(lm.loanAmountfield, data, wait);
		String loanamount=data;
	    char[] num= loanamount.toCharArray();
	    for(int i=0;i<num.length;i++) {
		Runtime.getRuntime().exec("adb shell input keyevent KEYCODE_NUMPAD_"+num[i]);
	    }
//	    appdriver.hideKeyboard();
		gu.ElementToClick(lm.paynowbuttonindrawer, wait);
		

	    
		
	}
	
	public void savedUPIid() {
		gu.ElementToClick(lm.upiIDsaved, wait);
		gu.ElementToClick(lm.paysavedetails, wait);
		gu.ElementToClick(lm.backbuttonrepay, wait);
			}
	
	public void UPIapps() throws InterruptedException {
		gu.ElementToClick(lm.upiIApps, wait);
//	    gu.ElementToClick(lm.paysavedetails, wait);
		gu.ElementToClick(lm.googlePay, wait);
		Thread.sleep(6000);
		appdriver.pressKey(new KeyEvent(AndroidKey.BACK));
		appdriver.pressKey(new KeyEvent(AndroidKey.BACK));
		gu.ElementToClick(lm.phonePay, wait);
		Thread.sleep(6000);
		appdriver.pressKey(new KeyEvent(AndroidKey.BACK));
		appdriver.pressKey(new KeyEvent(AndroidKey.BACK));
		
		
	}
	
	public void UPIId() throws IOException, InterruptedException {
		gu.ElementToClick(lm.upiID, wait);
		gu.ElementTosendKeys(lm.upiIDtextfield, "abcwq@oksbi", wait);
		gu.hideKeyboard();
		gu.ElementToClick(lm.payviaUPI, wait);
	}
	
	public void internetBanking(String bankName) throws IOException, InterruptedException {
		gu.ElementToClick(lm.InternetBanking, wait);
		gu.scrollToElement("Pay Securely");
		gu.ElementToClick(lm.banksearchbar, wait);
		gu.ElementTosendKeys(lm.banksearchbar2, bankName, wait);
		gu.ElementToClick(lm.selectfromdropdown, wait);
		gu.ElementToClick(lm.paySecurely, wait);
	}
	
	public void success(){
		try {
		gu.ElementToClick(lm.successRazorpay, wait);
		}
		catch(Exception e) {
			
		}
		
	}

}
