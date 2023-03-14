package com.mobile.es.utils;


import java.io.IOException;
import java.net.MalformedURLException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter;
import com.mobile.es.pages.BaseClass;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;


public class GenericUtilsMobile extends BaseClass {


public GenericUtilsMobile() throws MalformedURLException {
//		super();
		// TODO Auto-generated constructor stub
	}
//public static WebDriver eventDriver;


//public TestListener listner = new TestListener();
public void explicitlyWaitForElement(By element) {
	WebDriverWait wait = new WebDriverWait(appdriver,Duration.ofSeconds(80));
	wait.until(ExpectedConditions.elementToBeClickable(element));
}
public void ElementToClick(By locator,WebDriverWait wait) {
	if(wait.until(ExpectedConditions.visibilityOfElementLocated(locator)).isDisplayed() && wait.until(ExpectedConditions.elementToBeClickable(locator)).isEnabled()) 
	
		appdriver.findElement(locator).click();
	
}

public void ElementTosendKeys(By locator,String Data, WebDriverWait wait) throws IOException, InterruptedException {
	
		 
		
//		WebElement input = driver.findElement(Element);
//		while(input.getAttribute("value").length() > 0) {
//	        
//            input.sendKeys(Keys.BACK_SPACE);
//        }	
//	}
		  appdriver.findElement(locator).click();
		  appdriver.findElement(locator).clear();
		  
//		  Thread.sleep(2000);
//		  Runtime.getRuntime().exec("adb shell input keyevent 123");
//		
//		for(int i =0 ;i > appdriver.findElement(locator).getText().length();i++){
//			
//			appdriver.pressKey(new KeyEvent(AndroidKey.DEL));
//		    
//		}
//		
		 appdriver.findElement(locator).sendKeys(Data);
		
		
	
//		appdriver.findElement(locator).clear();
//		 appdriver.findElement(locator).sendKeys(Keys.DELETE);
		
//		appdriver.findElement(locator).sendKeys(Data);
//		 Actions a = new Actions(appdriver);
//		 a.moveToElement(appdriver.findElement(locator)).click().sendKeys(Data).build().perform();
		
		
	}

	
	//logger.log(LogStatus.INFO,Steps+": " +Element+" Element is Send Data is :"+data);
	//System.out.println(Steps+": " +Element+" Element is Send Data is :"+data);
	



//public void ElementTosendKeys(By locator,int data, WebDriverWait wait) {
//	if(wait.until(ExpectedConditions.visibilityOfElementLocated(locator)).isDisplayed() && wait.until(ExpectedConditions.elementToBeClickable(locator)).isEnabled()) {
//		appdriver.findElement(locator).sendKeys(data);
//	}else {
//		System.out.println("Issue with locator: "+locator);
//	}
	
	//logger.log(LogStatus.INFO,Steps+": " +Element+" Element is Send Data is :"+data);
	//System.out.println(Steps+": " +Element+" Element is Send Data is :"+data);
	

public  boolean isElementPresent(WebElement webElement,WebDriverWait wait) {
	try {
		if (webElement != null) // if it does not find the element throw NoSuchElementException, which calls
								// "catch(Exception)" and returns false;
			return true;
	} catch (NoSuchElementException e) {
		e.printStackTrace();
		return false;
	}
	return false;
}
public boolean scrollToElement( String elementToFindOnScroll) {

	try {
	appdriver.findElement(AppiumBy.androidUIAutomator(
				"new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\""
						+ elementToFindOnScroll + "\").instance(0))")).click();;
		return true;
	} catch (Exception e) {
		System.out.println("Could not Find an Element with this Text : " + elementToFindOnScroll);
		return false;
	}
		
	}
public boolean verifyAssertWithNode(String actual, String expected, String passMsg, String WarningMsg, String assertionName) {

	if (actual.equalsIgnoreCase(expected)) {
//		ExtentCucumberAdapter.getCurrentScenario().createNode(assertionName).pass(passMsg).info("Actual Text : " +actual).info("Expected Text : " +expected);
		
//added actual n expected result on 06-07-2021
	} else {
		ExtentCucumberAdapter.addTestStepLog(assertionName);
		
		
	}

	return true;

}
	
	public void scrollleftoright(By locator,WebDriverWait wait) {
		
		WebElement ele01 = appdriver.findElement(locator);

		int centerY = ele01.getRect().y + (ele01.getSize().height/2);

		double startX = ele01.getRect().x + (ele01.getSize().width * 0.9);

		double endX = ele01.getRect().x + (ele01.getSize().width * 0.1);
		//Type of Pointer Input
		PointerInput finger = new PointerInput(PointerInput.Kind.TOUCH,"finger");
		//Creating Sequence object to add actions
		Sequence swipe = new Sequence(finger,1);
		//Move finger into starting position
		swipe.addAction(finger.createPointerMove(Duration.ofSeconds(0),PointerInput.Origin.viewport(),(int)startX,centerY));
		//Finger comes down into contact with screen
		swipe.addAction(finger.createPointerDown(0));
		//Finger moves to end position
		swipe.addAction(finger.createPointerMove(Duration.ofMillis(700),
		        PointerInput.Origin.viewport(), (int)endX,centerY));
		//Get up Finger from Srceen
		swipe.addAction(finger.createPointerUp(0));

		//Perform the actions
		appdriver.perform(Arrays.asList(swipe));
}
	public void scrollrighttoleft(By locator,WebDriverWait wait) {
		WebElement ele01 = appdriver.findElement(locator);

		int centerY = ele01.getRect().y + (ele01.getSize().height/2);

		double startX = ele01.getRect().x + (ele01.getSize().width * 0.1);

		double endX = ele01.getRect().x + (ele01.getSize().width * 0.9);
		//Type of Pointer Input
		PointerInput finger = new PointerInput(PointerInput.Kind.TOUCH,"finger");
		//Creating Sequence object to add actions
		Sequence swipe = new Sequence(finger,1);
		//Move finger into starting position
		swipe.addAction(finger.createPointerMove(Duration.ofSeconds(0),PointerInput.Origin.viewport(),(int)startX,centerY));
		//Finger comes down into contact with screen
		swipe.addAction(finger.createPointerDown(0));
		//Finger moves to end position
		swipe.addAction(finger.createPointerMove(Duration.ofMillis(700),
		        PointerInput.Origin.viewport(), (int)endX,centerY));
		//Get up Finger from Srceen
		swipe.addAction(finger.createPointerUp(0));

		//Perform the actions
		appdriver.perform(Arrays.asList(swipe));
		
	}
	
	
	public void scrollupordown(By locator,WebDriverWait wait) {
		WebElement ele01 = appdriver.findElement(locator);

		int centerX = ele01.getRect().x + (ele01.getSize().width/2);

		double startY = ele01.getRect().y + (ele01.getSize().height * 0.1);

		double endY = ele01.getRect().y + (ele01.getSize().height * 0.9);
		//Type of Pointer Input
		PointerInput finger = new PointerInput(PointerInput.Kind.TOUCH,"finger");
		//Creating Sequence object to add actions
		Sequence swipe = new Sequence(finger,1);
		//Move finger into starting position
		swipe.addAction(finger.createPointerMove(Duration.ofSeconds(0),PointerInput.Origin.viewport(),centerX,(int)startY));
		//Finger comes down into contact with screen
		swipe.addAction(finger.createPointerDown(0));
		//Finger moves to end position
		swipe.addAction(finger.createPointerMove(Duration.ofMillis(700),
		        PointerInput.Origin.viewport(),centerX, (int)endY));
		//Get up Finger from Srceen
		swipe.addAction(finger.createPointerUp(0));

		//Perform the actions
		appdriver.perform(Arrays.asList(swipe));
	}
	 public void softAssertionCheck(String actual, String expected, String failMsg, String PassMsg) {
	        SoftAssert softAssert = new SoftAssert();
	        if (actual.equals(expected)) {
	           scenario.log("[ACTUAL]: " + actual);
	           scenario.log("[EXPECTED]: " + expected);
	           scenario.log("[MESSAGE]: " + PassMsg);
	            softAssert.assertEquals(actual, expected);
	        } else {
	           scenario.log("[ACTUAL]: " + actual);
	           scenario.log("[EXPECTED]: " + expected);
	           scenario.log("[MESSAGE]: " + failMsg + " ");
	            softAssert.assertEquals(actual, expected);
	        }
	    }
	 
	 public void clearText(By locator) throws IOException {
		 while(appdriver.findElement(locator) != null && appdriver.findElement(locator).getText().length()>0 ) {
		 
		 Runtime.getRuntime().exec("adb shell input keyevent 67");
	 }
	 }
	 
	 public String getText(By locator,WebDriverWait wait) {
			
			
				 return	appdriver.findElement(locator).getText();
			
			
			
		}


	public void softAssertionbooleanCheck(Boolean actualresult, boolean expectedResult, String failMsg, String passMsg) {
		// TODO Auto-generated method stub
		  SoftAssert softAssert = new SoftAssert();
	        if (actualresult.equals(expectedResult)) {
	           scenario.log("[ACTUAL]: " + actualresult);
	           scenario.log("[EXPECTED]: " + expectedResult);
	           scenario.log("[MESSAGE]: " + passMsg);
	            softAssert.assertEquals(actualresult, expectedResult);
	        } else {
	           scenario.log("[ACTUAL]: " + actualresult);
	           scenario.log("[EXPECTED]: " + expectedResult);
	           scenario.log("[MESSAGE]: " + failMsg + " ");
	            softAssert.assertEquals(actualresult, expectedResult);
	}
	

	}
	 public List<String> getListText(By locator,WebDriverWait wait) {
			
		 List<WebElement> list = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(locator));
		    List<String> textList = new ArrayList<String>();
		    
		    for (WebElement rl : list) {
		        textList.add(rl.getText());
		    }
		    
		    return textList;

		 
		 
		 
		
		 
	
	
	
}
	 
	 public void hideKeyboard() {
		 appdriver.hideKeyboard();
	 }
}










