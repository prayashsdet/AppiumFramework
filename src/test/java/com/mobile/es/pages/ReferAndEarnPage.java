package com.mobile.es.pages;

import java.io.IOException;
import java.net.MalformedURLException;

import com.mobile.es.utils.GenericUtilsMobile;

public class ReferAndEarnPage extends BaseClass {

	
	public ReferAndEarnPage() throws MalformedURLException  {
		
	}
	
	public LocatorsMobile  lm = new LocatorsMobile(appdriver);
	public GenericUtilsMobile gu =new GenericUtilsMobile();
	
	
	
	public void applyreferralCode(String referralCode) throws IOException, InterruptedException {
		gu.ElementToClick(lm.referralCodeHyperlink, wait);
		gu.ElementTosendKeys(lm.referraltextfield, referralCode, wait);
		gu.ElementToClick(lm.applyCode, wait);
		gu.ElementToClick(lm.okaygotitreferral, wait);
		
	
	}
	
	public void applyReferralIndashboard(String referralcode) throws IOException, InterruptedException {
		gu.ElementToClick(lm.referralhyperlinkinwelcomescreen, wait);
		gu.ElementTosendKeys(lm.referraltextfield, referralcode, wait);
		gu.ElementToClick(lm.applyCode, wait);
		gu.ElementToClick(lm.okaygotitreferral, wait);
	}
	
	public void applyReferralFromSideMenu() {
		gu.ElementToClick(lm.moremenu, wait);
		gu.ElementToClick(lm.referandearnsidemenu, wait);
		gu.ElementToClick(lm.kn', wait);
	}
	
	
}
