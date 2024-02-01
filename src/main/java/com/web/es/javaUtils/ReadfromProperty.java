package com.web.es.javaUtils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadfromProperty {

	public String readConfigFile(String fileName) throws IOException {
		String property = null;
		// TODO Auto-generated method stub
		Properties p = new Properties();
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir") + "/Configurations/ApplicationConfig.properties");
		p.load(fis);
		 property = p.getProperty(fileName);
		 
		 return property;
		
		
		

	}

}
