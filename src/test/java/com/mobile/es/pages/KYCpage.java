package com.mobile.es.pages;

import java.io.IOException;
import java.net.MalformedURLException;

import com.mobile.es.utils.GenericUtilsMobile;

public class KYCpage extends BaseClass {

	public KYCpage() throws MalformedURLException  {
		
	}
	
	public LocatorsMobile  lm = new LocatorsMobile(appdriver);
	public GenericUtilsMobile gu =new GenericUtilsMobile();
	
	
	
	
	
	public void uploadSelfie() {
		
		gu.ElementToClick(lm.selfieuploadbutton,wait);
		try {
			
		
		gu.ElementToClick(lm.selfiepermission,wait);
		}
		catch(Exception e) {
			System.out.println("selfie permission already granted");
	;
		}
		gu.ElementToClick(lm.cameraicon,wait);
		gu.ElementToClick(lm.retake,wait);
		gu.ElementToClick(lm.cameraicon, wait);
		gu.ElementToClick(lm.retake,wait);
		gu.ElementToClick(lm.cameraicon, wait);
		try {
			gu.ElementToClick(lm.retake,wait);
			gu.ElementToClick(lm.cameraicon, wait);
			gu.ElementToClick(lm.retake,wait);
			gu.ElementToClick(lm.cameraicon, wait);
			gu.ElementToClick(lm.submitselfie,wait);
			
		}
		catch(Exception e) {
		gu.ElementToClick(lm.submitselfie,wait);
	}
	}
	
	public void  selectmanualKYC() {
		gu.ElementToClick(lm.manualKYCoption,wait);
	}
	
	public void taponAadharchip() {
		gu.ElementToClick(lm.aadharchip,wait);
	}
	
	public void uploadfrontofaadhar() {
		gu.ElementToClick(lm.aadhardialogboxfrontside,wait);
		gu.ElementToClick(lm.camerabubble,wait);
		gu.ElementToClick(lm.retakedoc,wait);
		gu.ElementToClick(lm.camerabubble,wait);
		gu.ElementToClick(lm.retakedoc,wait);
		gu.ElementToClick(lm.camerabubble,wait);
		
		try {
		gu.ElementToClick(lm.retakedoc,wait);
		gu.ElementToClick(lm.camerabubble,wait);
		gu.ElementToClick(lm.retakedoc,wait);
		gu.ElementToClick(lm.camerabubble,wait);
		gu.ElementToClick(lm.submitdoc,wait);
		}
		catch(Exception e) {
			gu.ElementToClick(lm.submitdoc,wait);	
		}
		
	}
	
	public void uploadbackofaadhaar() {
		gu.ElementToClick(lm.aadhardialogboxbackside,wait);
		gu.ElementToClick(lm.camerabubble,wait);
		gu.ElementToClick(lm.retakedoc,wait);
		gu.ElementToClick(lm.camerabubble,wait);
		gu.ElementToClick(lm.retakedoc,wait);
		gu.ElementToClick(lm.camerabubble,wait);
		try {
			gu.ElementToClick(lm.retakedoc,wait);
			gu.ElementToClick(lm.camerabubble,wait);
			gu.ElementToClick(lm.retakedoc,wait);
			gu.ElementToClick(lm.camerabubble,wait);
			gu.ElementToClick(lm.submitdoc,wait);
			}
			catch(Exception e) {
				gu.ElementToClick(lm.submitdoc,wait);
			}
		
		
	}
	
	public void enteraadharnumber(String aadharnumber) throws IOException, InterruptedException {
		gu.ElementTosendKeys(lm.docnumber, aadharnumber, wait);
		gu.hideKeyboard();
	}
	
	public void submitaadhar() {
		gu.ElementToClick(lm.submitCTA,wait);
	}
	
	public void entercompleteaddress(String address1) throws IOException, InterruptedException {
		gu.ElementTosendKeys(lm.Addressline1,address1, wait);
		gu.hideKeyboard();
	}
	
	public void enterflatno(String address2) throws IOException, InterruptedException {
		gu.ElementTosendKeys(lm.Addressline2, address2, wait);
		gu.hideKeyboard();
	}
	
	public void enterlocality(String locality ) throws IOException, InterruptedException {
		try {
		gu.ElementTosendKeys(lm.OfficeLocality, locality, wait);
		gu.hideKeyboard();
		}
		catch(Exception e) {
			gu.ElementTosendKeys(lm.locality, locality, wait);
			gu.hideKeyboard();
		}
	}
	
	public void enterpincode(String pincode) throws IOException, InterruptedException {
		gu.ElementTosendKeys(lm.pincode, pincode, wait);
		gu.hideKeyboard();
	}
	
	public void saveaddress() {
		
		try {
			gu.ElementToClick(lm.saveOTP, wait);
			 if(appdriver.findElement(lm.status).getText().equals("Entered same detail")||appdriver.findElement(lm.status).getText().equals("Not eligible to edit")) {
				 gu.ElementToClick(lm.editprofileokaygotit, wait);
				 gu.ElementToClick(lm.backButtoneditprofile, wait);
					  	}
				    else {
				     	 gu.ElementToClick(lm.editprofileokaygotit, wait);
					   	}
		}
		catch(Exception e) {
			gu.ElementToClick(lm.saveAddressCTA,wait);
		}
	}
	
	public void taponBackbutton() {
		gu.ElementToClick(lm.backButtoneditprofile, wait);
	}
	
	public void uploadPAN() {
		gu.ElementToClick(lm.pandialogbox,wait);
		gu.ElementToClick(lm.camerabubble,wait);
		gu.ElementToClick(lm.submitdoc,wait);
		gu.ElementToClick(lm.camerabubble,wait);
		gu.ElementToClick(lm.submitdoc,wait);
		gu.ElementToClick(lm.camerabubble,wait);
		
		try {
			gu.ElementToClick(lm.submitdoc,wait);
			gu.ElementToClick(lm.camerabubble,wait);
			gu.ElementToClick(lm.submitdoc,wait);
			gu.ElementToClick(lm.camerabubble,wait);
			gu.ElementToClick(lm.submitdoc,wait);	
		}
		catch(Exception e) {
			try {
				
			
			gu.ElementToClick(lm.submitdoc,wait);
			}
			catch(Exception e1) {
				
			}
		}
		
	}
	
	public void enterBankName(String bankname) throws InterruptedException {
		try {
		gu.ElementToClick(lm.bankname, wait);
		gu.ElementTosendKeys(lm.banknamesearchtextfield, bankname, wait);
		gu.ElementToClick(lm.selectbankname, wait);
		
		}
		catch(Exception e) {
			System.out.println("pre-fetched bank name is" +  gu.getText(lm.bankname, wait));
		}
		
		
	}
	
	public void enteraccountnumber(String accountnumber) throws IOException, InterruptedException {
		gu.ElementTosendKeys(lm.accountnumber, accountnumber, wait);
	}
	
	public void confirmaccountnumber(String accountnumber) throws IOException, InterruptedException {
		gu.ElementTosendKeys(lm.confirmaccountnumber, accountnumber, wait);
	}
	
	public void IFSCcode(String IFSC) throws IOException, InterruptedException {
		gu.ElementTosendKeys(lm.IFSCcode, IFSC, wait);
		gu.hideKeyboard();
	}
	
	public void savebankdetails() {
		gu.ElementToClick(lm.savebankdetailsCTA,wait);
		try {
		gu.ElementToClick(lm.savebankdetailsCTA,wait);
		gu.ElementToClick(lm.savebankdetailsCTA,wait);
		}
		catch(Exception e) {
			
		}
	}
	


	public void tapOnwelcomebackCTAKYC() throws InterruptedException {
		
		gu.ElementToClick(lm.completeKYCCTAinDashboard,wait);
		try {
		gu.ElementToClick(lm.completeKYCwelcomebackscreen,wait);
		}
		catch(Exception e) {
			
		}
		Thread.sleep(3000);
	}
	public void skipPermissions() {
		 try {
			 
		 
		 gu.ElementToClick(lm.permissionSkipButton,wait);
		 }
		 catch(Exception e) {
			 //("permiission already granted");
		 }
	 }
	public void pennydrop() {
		gu.ElementToClick(lm.chequeleaf, wait);
		gu.ElementToClick(lm.chequeleafdialoguebox, wait);
		gu.ElementToClick(lm.chequeleafcamerabutton, wait);
		gu.ElementToClick(lm.okaybutton, wait);
		gu.ElementToClick(lm.submitchequeleaf, wait);
	}
	
	public void dismiss() {
		gu.ElementToClick(lm.dismiss, wait);
	}
	
	
}
