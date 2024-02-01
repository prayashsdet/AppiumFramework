package com.mobile.es.pages;

import java.net.MalformedURLException;

import com.mobile.es.utils.GenericUtilsMobile;

public class LimitEnhancementPage extends BaseClass {

	
	public LimitEnhancementPage() throws MalformedURLException {
		
	}
	public LocatorsMobile  lm = new LocatorsMobile(appdriver);
	public GenericUtilsMobile gu =new GenericUtilsMobile();
	
	
	
	
	
	
	public void swipeFibecard() {
		gu.scrollleftoright(lm.fibeCard,wait);
	}
	
	public void taponDashboardCTA() {
		gu.ElementToClick(lm.limitEnhancementCTA, wait);
		gu.ElementToClick(lm.dismiss, wait);
		gu.ElementToClick(lm.changeanswer, wait);
	}
	
	public void checkthroughsidemenu() {
		gu.ElementToClick(lm.moremenu, wait);
		gu.ElementToClick(lm.limitenhancementbuttonsidemenu, wait);
		gu.ElementToClick(lm.submitBankstatementCTAlimitenhancement, wait);
	}
	
	public void uploadBankStatement(String bankstatement) {

    	gu.ElementToClick(lm.uploadbankstatementdialogbox, wait);
		gu.scrollToElement(bankstatement);
		gu.ElementToClick(lm.uploadBankstatement, wait);
	}
}
