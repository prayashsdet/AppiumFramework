package com.mobile.es.pages;

import java.io.File;
import java.io.IOException;
import java.lang.System.Logger.Level;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.apache.logging.log4j.LogManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.logging.LogType;
import org.openqa.selenium.logging.LoggingPreferences;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aventstack.extentreports.App;
import com.web.es.javaUtils.ReadfromProperty;


import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import io.appium.java_client.service.local.flags.GeneralServerFlag;
import io.cucumber.java.Scenario;




public class BaseClass {
public static WebDriver driver;
	public  static AndroidDriver appdriver;
	public static  WebDriverWait wait;
	public static Scenario scenario;
org.apache.logging.log4j.Logger log = LogManager.getLogger(App.class.getName());

	public BaseClass()  {
		
		
		
		try{
			
			ReadfromProperty rfp = new ReadfromProperty();
			
			
		String app = rfp.readConfigFile("appType");
		String browser = rfp.readConfigFile("browser");
		String app_package = rfp.readConfigFile("appPackage");
		String app_activity = rfp.readConfigFile("appActivity");
		
		if (app != null && browser !=null && app_package!=null && app_activity!=null) {
			app.trim();
			browser.trim();
			app_package.trim();
			app_activity.trim();
		}
		
		
		//
		
		
		
		
//		
//		if (app.equalsIgnoreCase("Mobile") ){
		if (appdriver == null) {

			
//				ChromeOptions co = new ChromeOptions();
//				co.setHeadless(false);

				    DesiredCapabilities dc =new DesiredCapabilities();
				  	dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
				  	dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "12");
			  	    dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Appium");
				  	dc.setCapability("autoGrantPermissions", true);
				  	dc.setCapability("appPackage", app_package);
				  	dc.setCapability("appActivity", app_activity);
				  	dc.setCapability("appium:webStorageEnabled", true);
//				  	dc.setCapability("automationName","UiAutomator1");
				  	//dc.setCapability("unicodeKeyboard", true);
//				  	URL url =new URL("http://localhost:4723/wd/hub");
				  	LoggingPreferences logPrefs = new LoggingPreferences();
				  	logPrefs.enable(LogType.DRIVER, java.util.logging.Level.WARNING);
			       dc.setCapability(CapabilityType.LOGGING_PREFS, logPrefs);
				    AppiumServiceBuilder builder = new AppiumServiceBuilder();
				    builder.withIPAddress("0.0.0.0");
				    builder.usingAnyFreePort();
				   	  builder.withArgument(GeneralServerFlag.SESSION_OVERRIDE);
				   	  builder.withAppiumJS(new File("C:/Users/Prayash/AppData/Local/Programs/Appium Server GUI/resources/app/node_modules/appium/build/lib/main.js"));
				   	  builder.usingDriverExecutable(new File("C:/Program Files/nodejs/node.exe"));
				   	 
				   	  	AppiumDriverLocalService	appiumService = AppiumDriverLocalService.buildService(builder);
				   				appiumService.withBasePath("/wd/hub/");
				   			//	.withArgument(GeneralServerFlag.SESSION_OVERRIDE));
				   				//.withArgument(GeneralServerFlag.LOG_LEVEL, "error"));
				   		
				   		appiumService.start();
					URL url = appiumService.getUrl();
				    	 URL appiumServiceUrl = appiumService.getUrl();
					appdriver=new AndroidDriver(appiumServiceUrl,dc);
				    appdriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			        wait = new WebDriverWait(appdriver, Duration.ofSeconds(20));
			        this.scenario=scenario;
			      

			        
			} 
		}
		
//		}
//		
//		else if (app.equalsIgnoreCase("Web")) {
//		    if (browser.equalsIgnoreCase("chrome")) {
//		       driver = new ChromeDriver();
//		    } else if (browser.equalsIgnoreCase("firefox")) {
//		    driver = new FirefoxDriver();
//		    } else {
//		        System.out.println("Invalid browser type: " + browser);
//		    }
//		} else {
//		    System.out.println("Invalid application type: " + app);
//		}
//			
//}
//		
		catch(IOException io) {
			
		}
		
		}
//	public Scenario getScenario()
//    {
//        return scenario;
//    }
//    
//    public void setScenario(Scenario scenario)
//    {
//        BaseClass.scenario = scenario;
//   }
	}


//	public BaseClass(String kill) {
//		appdriver.quit();
//	}

