package com.mobile.es.pages;

import java.io.IOException;
import java.net.MalformedURLException;
import java.time.Duration;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.mobile.es.utils.GenericUtilsMobile;

public class BankStatementPage extends BaseClass{

	public  BankStatementPage() throws MalformedURLException {
		
	}
	

	public LocatorsMobile  lm = new LocatorsMobile(appdriver);
	public GenericUtilsMobile gu =new GenericUtilsMobile();
	
public void tapOnwelcomebackCTAincomeproof() throws InterruptedException {
		gu.explicitlyWaitForElement(lm.bankstatementdashboardCTA);
		gu.ElementToClick(lm.bankstatementdashboardCTA,wait);
		try {
		gu.ElementToClick(lm.welcomebankBankstatementCTA,wait);
		}
		catch(Exception e) {
			
		}
		
	}
public void taponinformativetextCTA() {
//	gu.explicitlyWaitForElement(lm.okaygotit);
	gu.ElementToClick(lm.okaygotit, wait);
	
}

public void selectbank(String bankName) throws IOException, InterruptedException {
	gu.explicitlyWaitForElement(lm.banksearchbar);
	gu.ElementToClick(lm.banksearchbar, wait);
	gu.ElementTosendKeys(lm.banksearchbar2, bankName, wait);
	gu.ElementToClick(lm.selectfromdropdown, wait);
	gu.explicitlyWaitForElement(lm.bankconfirmbutton);
	gu.ElementToClick(lm.bankconfirmbutton, wait);
	
}

public void selectofflinemethod() {
	gu.ElementToClick(lm.offlineupload, wait);
}

public void selectthreemonthbankstatementinonefile() {
	gu.ElementToClick(lm.threeinone, wait);
}
public void tapOndialoguebox() {
	gu.ElementToClick(lm.uploadbankstatementdialogbox, wait);
}

public void selectpdffromlist(String pdfName) {
	gu.scrollToElement(pdfName);
}

public void submitbankstatement() {
	gu.ElementToClick(lm.submitbankstatement, wait);
}
public void continueKYC() {
	 gu.explicitlyWaitForElement(lm.continueKYCCTA);
	gu.ElementToClick(lm.continueKYCCTA, wait);
}
public void dismiss() {
	gu.explicitlyWaitForElement(lm.dismiss);
	gu.ElementToClick(lm.dismiss, wait);
}

}
