package com.mobile.es.hooks;

import org.openqa.selenium.TakesScreenshot;

import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.OutputType;

import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter;
import com.mobile.es.pages.BaseClass;

import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;


public class Hooks extends BaseClass {
	
	public Hooks() {
		 BaseClass.scenario=scenario;
	}
	 public String getBase64Screenshot()
	    {
	        return ((TakesScreenshot)appdriver).getScreenshotAs(OutputType.BASE64);
	    }
    
    @AfterStep(order =1)
    public void addScreenshot(Scenario scenario) {
//    	if (scenario.isFailed()) {
//    	    try {
//    	        String screenshotName = scenario.getName().replaceAll(" ", "_");
//    	        File screenshot = ((TakesScreenshot) appdriver).getScreenshotAs(OutputType.FILE);
//
//    	        // Resize the screenshot
//    	        BufferedImage image = ImageIO.read(screenshot);
//    	        int width = image.getWidth() / 2;
//    	        int height = image.getHeight() / 2;
//    	        Image resizedImage = image.getScaledInstance(width, height, Image.SCALE_FAST);
//
//    	        // Draw the resized image onto a new BufferedImage
//    	        BufferedImage bufferedImage = new BufferedImage(resizedImage.getWidth(null), resizedImage.getHeight(null), BufferedImage.TYPE_INT_RGB);
//    	        Graphics2D g2d = bufferedImage.createGraphics();
//    	        g2d.drawImage(resizedImage, 0, 0, null);
//    	        g2d.dispose();
//
//    	        // Compress the screenshot
//    	        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
//    	        ImageIO.write(bufferedImage, "png", outputStream);
//
//    	        byte[] screenshotBytes = outputStream.toByteArray();
//
//    	        // Attach the screenshot to the scenario
//    	        scenario.attach(screenshotBytes, "image/png", screenshotName);
//    	    } catch (IOException e) {
//    	        e.printStackTrace();
//    	    }
//    	}
    	if(scenario.isFailed())
        {		       
            ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL, MediaEntityBuilder.createScreenCaptureFromBase64String(getBase64Screenshot()).build());
            
        }
    	 
    }
}

   
    
    
    



