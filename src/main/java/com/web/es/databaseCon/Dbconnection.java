package com.web.es.databaseCon;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.web.es.javaUtils.ReadfromProperty;



public class Dbconnection {
	public static Connection con =null;
	PreparedStatement stat = null;
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
PreparedStatement stat = con.prepareStatement(query);
resultSet =  stat.executeQuery();
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
		stat = con.prepareStatement("select otp_code from earlysalary.otp_log_detail where mdn = '7008405914' and status = 'DELIVERED' order by id desc limit 1");
		resultSet =  stat.executeQuery();
		while (resultSet.next()) {
			otp= resultSet.getString("otp_code");
			}
		 
		// closing DB Connection
		con.close();
		return otp;
}
	


	public void updatePAN(String idNumber, String subsProofId) throws SQLException, IOException, ClassNotFoundException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {
	    // Load the MySQL JDBC driver
	    Class.forName("com.mysql.cj.jdbc.Driver").getDeclaredConstructor().newInstance(); ;

	    // Get DB credentials
	    ReadfromProperty rfp = new ReadfromProperty();
	    String url = rfp.readConfigFile("QAURL").trim();
	    String username = rfp.readConfigFile("USERNAME").trim();
	    String password = rfp.readConfigFile("PASSWORD").trim();

	   Connection con = DriverManager.getConnection(url, username, password);
	        // Prepare the SQL statement
	        String sql = "UPDATE earlysalary.tbl_subs_idproof_details  SET Id_number = ? WHERE subs_proof_id = ?";
	        try (PreparedStatement stmt = con.prepareStatement(sql)) {
	            stmt.setString(1, idNumber);
	            stmt.setString(2, subsProofId);

	            // Execute the query
	            int rowsUpdated = stmt.executeUpdate();
	            if (rowsUpdated == 0) {
	                throw new SQLException("Update failed, no rows affected.");
	            }
	        }
	   
	}
}


