package com.web.es.databaseCon;

import java.io.IOException;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DashBoardTestsDB {
	
	int method = 1;
	boolean debugLines = true;

	public String GetOTPFromDB(String Query) throws SQLException {
		String GetOTP = null;
		Connection con = null;

		DataProvider dataProvider = new DataProvider();
		try {
			con = dataProvider.getDbConnection();
			// Create Statement object
			PreparedStatement ps = con.prepareStatement(Query);
			// ps.setString(1,accountOrPartnerId);
			ResultSet rs = ps.executeQuery();
			// Storing Data From Database
			while (rs.next()) {
				GetOTP = rs.getString("otp_code");
			}
		} catch (Exception e) {
			System.out.println("Connection not created." + e);
		}
		// closing DB Connection
		con.close();

		return GetOTP;
	}
}

//	public static void main (String args[]) throws SQLException
//	
//	{
//		DashBoardTestsDB obj = new DashBoardTestsDB();
//		obj.GetOTPFromDB("SELECT otp_code FROM earlysalary.otp_log_detail where mdn = 9403145744 and status = 'DELIVERED' order by id desc limit 1;");
//		
//	}
	
	
	
//	public String GetCustomerCodeFromDB(String mobileNumber) throws SQLException {
//		String Get_Customer_Code = null;
//		Connection con = null;
//
//		try {
//			con = dataProvider.getDbConnection();
//			// Create Statement object
//			PreparedStatement ps = con.prepareStatement("SELECT customer_code FROM earlysalary.tbl_subscribers WHERE mobile_number = '"+ mobileNumber + "' and active = 1;");
//			
//			ResultSet rs = ps.executeQuery();
//			// Storing Data From Database
//			while (rs.next()) {
//				Get_Customer_Code = rs.getString("customer_code");
//			}
//		} catch (Exception e) {
//			System.out.println("Connection not created." + e);
//		}
//		// closing DB Connection
//		con.close();
//
//		return Get_Customer_Code;
//	}
//
//	
//
//	public String underwritingProcedure(String mobileNumber) {
//
//		try {
//
//			String customerCode = "";
//			int verificationStatus = 0;
//			int subsID = 0;
//			int updateResult;
//
//			// if user is 113 --> still pending for bank statement upload
//			// if ser is 848 --> change to 801
//			DataProvider databaseProvider = new DataProvider();
//			Connection connection = databaseProvider.getDbConnection();
//
//			PreparedStatement preparedStatement = connection.prepareStatement(
//					"SELECT subs_id, customer_code, verification_status FROM earlysalary.tbl_subscribers WHERE mobile_number = '"
//							+ mobileNumber + "' AND active = 1 ORDER BY active desc LIMIT 1;");
//			ResultSet resultSet = preparedStatement.executeQuery();
//
//			while (resultSet.next()) {
//				if (debugLines)
//
//				customerCode = Long.toString(resultSet.getLong("customer_code"));
//				verificationStatus = resultSet.getInt("verification_status");
//				subsID = resultSet.getInt("subs_id");
//			}
//
//			if (verificationStatus == 113 || verificationStatus == 848 || verificationStatus == 850 || verificationStatus == 849 || verificationStatus == 948 || verificationStatus == 949) { // i.e. pending bank statement upload
//
//				preparedStatement = connection.prepareStatement(
//						"UPDATE earlysalary.tbl_subscribers SET verification_status = 801 WHERE mobile_number = '"+ mobileNumber + "' AND active = 1");
//				updateResult = preparedStatement.executeUpdate();
//
//				CallableStatement statement = connection
//						.prepareCall("call es_lms.sp_uw_approval(" + subsID + "," + customerCode + ")");
//
//				statement.execute();
//				statement.close();
//
////			} else if (verificationStatus == 848 || verificationStatus == 850) { 
////				// i.e. not pending bank statement upload
////
////				if (verificationStatus == 848)
////					System.out.println("Status --> " + verificationStatus + " | Bank Statement uploaded!");
////				else if (verificationStatus == 850)
////					System.out.println("Status --> " + verificationStatus
////							+ " | Bank Statement uploaded (pending some decisioning from Analytics)");
////
////				// code moved in if statement
//
//			} else {
//				System.out.println("Verification Status not defined for this method.");
//			}
//
//			Thread.sleep(8000);  // intentionally added by swapnil
//			
//
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//
//		return null;
//	}
//
//	// LO Process
//	public String loanOfficerProcedure(String mobileNumber) throws SQLException, IOException {
//
//		try {
//			String customerCode = "";
//			int verificationStatus = 0;
//			int subsID = 0;
//			int updateResult;
//
//
//			DataProvider databaseProvider = new DataProvider();
//			Connection connection = databaseProvider.getDbConnection();
//
//			PreparedStatement preparedStatement = connection.prepareStatement(
//					"SELECT subs_id, customer_code, verification_status FROM earlysalary.tbl_subscribers WHERE mobile_number = '"
//							+ mobileNumber + "' AND active = 1 ORDER BY active desc LIMIT 1;");
//			ResultSet resultSet = preparedStatement.executeQuery();
//
//			while (resultSet.next()) {
//				if (debugLines)
//					System.out.println("Code Line Number :: " + new Exception().getStackTrace()[0].getLineNumber());
//
//				customerCode = Long.toString(resultSet.getLong("customer_code"));
//				verificationStatus = resultSet.getInt("verification_status");
//				subsID = resultSet.getInt("subs_id");
//
//				CallableStatement statement = connection.prepareCall("call es_lms.sp_lo_approve(" + subsID + "," + customerCode + ")");
//				statement.execute();
//				
//				
//				// Added on 14-07-2020 for Smart Repay setup NACH
//				preparedStatement = connection.prepareStatement("UPDATE earlysalary.nach_details SET status = '3062' WHERE cust_id = '"+ customerCode +"';");
//				updateResult = preparedStatement.executeUpdate();
//				
//				statement.close();
//			}
//			
//			Thread.sleep(5000);
//
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//
//		return null;
//	}
//	
//	
//// For checksum logic on Bank Statement Test Case - Added on 11-03-2021
//	// in case of existing bank statement, app doesn't except same statement - clearing Updating checksum data.
//	
//	public String UpdateChecksumTableforBankStatement(String mobileNumber) throws SQLException {
//		String Get_Customer_Code = null;
//		Connection con = null;
//
//		try {
//			con = dataProvider.getDbConnection();
//			// Create Statement object
//			PreparedStatement ps = con.prepareStatement("UPDATE perfios_trans_history SET cksum ='2324828f62262fcff328e350dcd72212' WHERE customer_id in (SELECT customer_code FROM earlysalary.tbl_subscribers WHERE mobile_number = '"+ mobileNumber + "' and active =1);");
//			// Value for Checksum is hardcoded just to replace existing data in table
//			
//			ResultSet rs = ps.executeQuery();
//			// Storing Data From Database
//			while (rs.next()) {
//				Get_Customer_Code = rs.getString("customer_code");
//			}
//		} catch (Exception e) {
//			System.out.println("Connection not created." + e);
//		}
//		// closing DB Connection
//		con.close();
//
//		return Get_Customer_Code;
//	}
//
//	
//	
//	
///****** SIDE MENU *****/
//	
//	public String GetFirstNameFromDB(String Query) throws SQLException {
//		String GetFirstName = null;
//		Connection con = null;
//
//		try {
//			con = dataProvider.getDbConnection();
//			// Create Statement object
//			PreparedStatement ps = con.prepareStatement(Query);
//			// ps.setString(1,accountOrPartnerId);
//			ResultSet rs = ps.executeQuery();
//			// Storing Data From Database
//			while (rs.next()) {
//				GetFirstName = rs.getString("first_name");
//			}
//		} catch (Exception e) {
//			System.out.println("Connection not created." + e);
//		}
//		// closing DB Connection
//		con.close();
//
//		return GetFirstName;
//	}
//
//	
//	
//	
//	
//	public String GetLastNameFromDB(String Query) throws SQLException {
//		String GetLastName = null;
//		Connection con = null;
//
//		try {
//			con = dataProvider.getDbConnection();
//			// Create Statement object
//			PreparedStatement ps = con.prepareStatement(Query);
//			// ps.setString(1,accountOrPartnerId);
//			ResultSet rs = ps.executeQuery();
//			// Storing Data From Database
//			while (rs.next()) {
//				GetLastName = rs.getString("last_name");
//			}
//		} catch (Exception e) {
//			System.out.println("Connection not created." + e);
//		}
//		// closing DB Connection
//		con.close();
//
//		return GetLastName;
//	}
//	
//	/*
//	 * Added By:Nikhil Gayki
//	 * Added on: 13-12-2021
//	 * Purpose: As input this method will take query from Excel and return Verification_Status.
//	*/
//	public String GetrowValue(String Query,String ColumnName) throws SQLException {
//		String RowData = null;
//		Connection con = null;
//
//		try {
//			con = dataProvider.getDbConnection();
//			// Create Statement object
//			PreparedStatement ps = con.prepareStatement(Query);
//			// ps.setString(1,accountOrPartnerId);
//			ResultSet rs = ps.executeQuery();
//			// Storing Data From Database
//			while (rs.next()) {
//				RowData = rs.getString(ColumnName);
//			}
//		} catch (Exception e) {
//			System.out.println("Connection not created." + e);
//		}
//		// closing DB Connection
//		con.close();
//
//		return RowData;
//	}
//	
//	
//		}
//	
