package com.web.es.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GenericUtils {
	
	WebDriver driver;
	public GenericUtils(WebDriver driver){
		this.driver = driver;
	}
	
	public void ElementTosendKeys(By locator,String Data, WebDriverWait wait) {
		if(wait.until(ExpectedConditions.visibilityOfElementLocated(locator)).isDisplayed() && wait.until(ExpectedConditions.elementToBeClickable(locator)).isEnabled()) {
			driver.findElement(locator).sendKeys(Data);
		}else {
			System.out.println("Issue with locator: "+locator);
		}
	}
	
	public void ElementToClick(By locator, WebDriverWait wait) {
		if(wait.until(ExpectedConditions.visibilityOfElementLocated(locator)).isDisplayed() && wait.until(ExpectedConditions.elementToBeClickable(locator)).isEnabled()) {
			driver.findElement(locator).click();
		}else {
			System.out.println("Issue with locator: "+locator);
		}
	}

}
