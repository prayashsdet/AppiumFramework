package com.mobile.es.pages;

import java.net.MalformedURLException;

import com.mobile.es.utils.GenericUtilsMobile;

import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

public class LOStatementPage extends BaseClass {

	
	
	public LOStatementPage() throws MalformedURLException {
		
	}
	
	public LocatorsMobile  lm = new LocatorsMobile(appdriver);
	public GenericUtilsMobile gu =new GenericUtilsMobile();
	
	public void clickonloanStatementOption() {
		gu.ElementToClick(lm.moremenu, wait);
		gu.ElementToClick(lm.loanStatement, wait);
		
	}
	
	
	public void printLoandetails() {
		gu.getListText(lm.loanDetailsallcards, wait);
	}
	
	public void downloadandsendemail() {
		gu.ElementToClick(lm.downloadandsendtoemail, wait);
	}
	
	public void chipsverification() {
		gu.ElementToClick(lm.settingsLoanStatement, wait);
		gu.ElementToClick(lm.activeChip, wait);
		gu.ElementToClick(lm.applyFilter, wait);
		gu.ElementToClick(lm.settingsLoanStatement, wait);
		gu.ElementToClick(lm.activeChip, wait);
		gu.ElementToClick(lm.pendingChip, wait);
		gu.ElementToClick(lm.applyFilter, wait);
		gu.ElementToClick(lm.settingsLoanStatement, wait);
		gu.ElementToClick(lm.pendingChip, wait);
		gu.ElementToClick(lm.closedChip, wait);
		gu.ElementToClick(lm.applyFilter, wait);
		gu.ElementToClick(lm.settingsLoanStatement, wait);
		gu.ElementToClick(lm.clearAllfilter, wait);
		gu.ElementToClick(lm.applyFilter, wait);
	}
	
	public void openLoanCard() {
		gu.ElementToClick(lm.openLoanCard, wait);
		gu.getListText(lm.loanDetailssinglecard, wait);
	}
	
	public void tapOnMoreDetails() throws InterruptedException {
		gu.ElementToClick(lm.moredetailslink, wait);
		Thread.sleep(1000);
		appdriver.pressKey(new KeyEvent (AndroidKey.BACK));
		
	}
	
	public void loanCancellation() {
		gu.ElementToClick(lm.cancelLoan,wait);
	}
	public void forecloseLoan() throws InterruptedException {
		gu.ElementToClick(lm.forecloseLoan, wait);
		Thread.sleep(1000);
		appdriver.pressKey(new KeyEvent (AndroidKey.BACK));
	}
	
	public void cancelLoan() {
		gu.ElementToClick(lm.cancelLoanbutton, wait);
		gu.ElementToClick(lm.selectloancancellationReason, wait);
		gu.ElementToClick(lm.cancelLoan, wait);
		gu.ElementToClick(lm.continuetocancelloan, wait);
		gu.ElementToClick(lm.continuetocancelloan, wait);
		gu.ElementToClick(lm.continuetocancelloan, wait);
		gu.ElementToClick(lm.otptextfield, wait);
		gu.ElementToClick(lm.saveOTP, wait);
		
	}
}
	
