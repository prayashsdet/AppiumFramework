package com.web.es.databaseCon;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.web.es.javaUtils.ReadfromProperty;



public class Dbconnection {
	public static Connection con =null;
	public static java.sql.Statement stat = null;
	public static ResultSet resultSet=null;
	public static String otp = null;
	
	public String getOTPfromDb() throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException, ClassNotFoundException, SQLException, IOException {
	
//load the MySQL jdbc driver

Class.forName("com.mysql.cj.jdbc.Driver").getDeclaredConstructor().newInstance(); 
//Db credentials
ReadfromProperty rfp = new ReadfromProperty();
String URL = rfp.readConfigFile("SOCIALWORTHURL").trim();
String username = rfp.readConfigFile("username").trim();
String password = rfp.readConfigFile("password").trim();
String query = rfp.readConfigFile("query");

//connect to database
con = DriverManager.getConnection(URL,username,password);
stat = con.createStatement();
resultSet =  stat.executeQuery(query);
while (resultSet.next()) {
	otp= resultSet.getString("otp_code");}
 
// closing DB Connection
con.close();
return otp;


}
	public String getOTPfromDbforeditprofile() throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException, ClassNotFoundException, SQLException, IOException {
		
		//load the MySQL jdbc driver

		Class.forName("com.mysql.cj.jdbc.Driver").getDeclaredConstructor().newInstance(); 
		//Db credentials
		ReadfromProperty rfp = new ReadfromProperty();
		String URL = rfp.readConfigFile("QAURL").trim();
		String username = rfp.readConfigFile("USERNAME").trim();
		String password = rfp.readConfigFile("PASSWORD").trim();

		//connect to database
		con = DriverManager.getConnection(URL,username,password);
		stat = con.createStatement();
		resultSet =  stat.executeQuery("select otp_code from earlysalary.otp_log_detail where mdn = '8858174430' and status = 'DELIVERED' order by id desc limit 1");
		while (resultSet.next()) {
			otp= resultSet.getString("otp_code");}
		 
		// closing DB Connection
		con.close();
		return otp;
}
}
