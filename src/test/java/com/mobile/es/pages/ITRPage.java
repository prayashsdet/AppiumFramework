package com.mobile.es.pages;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.net.MalformedURLException;
import java.sql.SQLException;

import com.mobile.es.utils.GenericUtilsMobile;
import com.web.es.databaseCon.Dbconnection;

import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

public class ITRPage  extends BaseClass{
	Dbconnection db;
	public ITRPage ()throws MalformedURLException {
		db = new Dbconnection ();
	}
	public LocatorsMobile lm = new LocatorsMobile(appdriver);
	public GenericUtilsMobile gu = new GenericUtilsMobile();
	
	
	
	public void dashboardandwelcomebackCTA() {
		gu.ElementToClick(lm.ITRCTA, wait);
		gu.ElementToClick(lm.welcomebackITR, wait);
	}
	
	public void updatePAN() throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException, ClassNotFoundException, SQLException, IOException {
		db.updatePAN("HSSPS9761P","76031940");
	}
	
	public void uploadITR(String ITR) throws InterruptedException {
		gu.ElementToClick(lm.ITRcta, wait);
		gu.ElementToClick(lm.onlineMethodITR, wait);
		Thread.sleep(2000);
		appdriver.pressKey(new KeyEvent (AndroidKey.BACK));
		gu.ElementToClick(lm.offlineMethodITR, wait);
		gu.ElementToClick(lm.uploadIITRdialogbox, wait);
		gu.ElementToClick(lm.continueTouploadITR, wait);
		gu.scrollToElement(ITR);
		gu.ElementToClick(lm.submitITR, wait);
		
		
		
	}
	
}
