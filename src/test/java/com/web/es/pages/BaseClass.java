package com.web.es.pages;

import java.time.Duration;

import org.apache.logging.log4j.LogManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aventstack.extentreports.App;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	static WebDriver driver;
	static WebDriverWait wait;
	org.apache.logging.log4j.Logger log = LogManager.getLogger(App.class.getName());

	public BaseClass() {
		if (this.driver == null) {

			try {
				ChromeOptions co = new ChromeOptions();
				co.setHeadless(false);

				this.driver = WebDriverManager.chromedriver().capabilities(co).create();
				this.driver.manage().window().maximize();
				this.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
				this.wait = new WebDriverWait(driver, Duration.ofSeconds(20));
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	public BaseClass(String kill) {
		driver.quit();
	}
}
