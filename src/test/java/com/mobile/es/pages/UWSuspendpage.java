package com.mobile.es.pages;

import java.io.IOException;
import java.net.MalformedURLException;
import java.util.List;

import com.mobile.es.utils.GenericUtilsMobile;

public class UWSuspendpage extends BaseClass {

	public UWSuspendpage() throws MalformedURLException {
		
	}
	
	public LocatorsMobile  lm = new LocatorsMobile(appdriver);
	public GenericUtilsMobile gu =new GenericUtilsMobile();
	
	
	
	
	
	public void tapOnCTAinDashboard() {
		gu.ElementToClick(lm.provideAdditionalDocument, wait);
		
	}
	
	public void taponcontinuetoprovideadditonaldocumentsCTA() {
		gu.ElementToClick(lm.continueUWsuspendjourneybuttonCTA, wait);
	}
	
	public void uploadorsubmitCTA() {
		gu.ElementToClick(lm.uwsuspendCTA, wait);
	}
	
	public void printlistofreasons() {
		gu.getListText(lm.reasonList, wait);
	}
	
	public void updatePANorPassword(String pan) throws IOException, InterruptedException {
		
			System.out.println("please wait entering PAN number");
			gu.ElementTosendKeys(lm.panumbertextfield,  pan, wait);
				gu.ElementToClick( lm.panConfirmButton,wait);
				
			
	}
	
	public void uploadSalarySlip(String month1, String month2,String month3) {
		gu.ElementToClick(lm.uwsuspenduploaddialoguebox1, wait);
		gu.scrollToElement(month1);
		gu.ElementToClick(lm.uwsuspenduploaddialoguebox2, wait);
		gu.scrollToElement(month2);
		gu.ElementToClick(lm.uwsuspenduploaddialoguebox3,wait);
		gu.scrollToElement(month3);
		
		
	}
	public void uploadAppointmentLetter(String letter) {
		gu.ElementToClick(lm.uwsuspenduploaddialoguebox1,wait);
		gu.scrollToElement(letter);
	}
	
	public void veriffirstreasonforsalarymissing() {
		gu.ElementToClick(lm.uwsuspendCTA,wait);
		gu.ElementToClick(lm.salaryReason1,wait);
		gu.ElementToClick(lm.uwsuspendCTA,wait);
		gu.ElementToClick(lm.submitsalaryreason2,wait);
		gu.ElementToClick(lm.informativetext, wait);
		gu.ElementToClick(lm.dismiss,wait);
		gu.ElementToClick(lm.changeanswer, wait);
		gu.ElementToClick(lm.provideAdditionalDocument, wait);
		
		
		
		
		
	}
	
	public void selectsecondreason() {
		gu.ElementToClick(lm.uwsuspendCTA, wait);
		gu.ElementToClick(lm.salaryReason2, wait);
		gu.ElementToClick(lm.uwsuspendCTA, wait);
		gu.ElementToClick(lm.submitsalaryreason2, wait);
		gu.ElementToClick(lm.uwsuspendCTA, wait);
		
	}
	
	public void uploadITR(String ITRdocument) {
		
//		gu.explicitlyWaitForElement(lm.uwsuspendCTA);
		gu.ElementToClick(lm.ITRcta, wait);
//		gu.explicitlyWaitForElement(lm.provideITR);
		gu.ElementToClick(lm.provideITR, wait);
		gu.ElementToClick(lm.uwsuspenduploaddialoguebox1, wait);
		gu.ElementToClick(lm.continueTouploadITR, wait);
		gu.scrollToElement(ITRdocument);
		gu.ElementToClick(lm.uwsuspendCTA,wait);
//		gu.explicitlyWaitForElement(lm.uwsuspendCTA);
//		gu.ElementToClick(lm.uwsuspendCTA,wait);
		try {
		gu.ElementToClick(lm.dismiss, wait);
		gu.ElementToClick(lm.changeanswer, wait);
		gu.ElementToClick(lm.provideAdditionalDocument, wait);
		gu.ElementToClick(lm.uwsuspendCTA, wait);
		}
		catch(Exception e) {
			
		}
		
	}
	
	
}
	
	 
