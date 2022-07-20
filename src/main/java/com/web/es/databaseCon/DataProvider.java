package com.web.es.databaseCon;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DataProvider {
	private static Connection con;
    private static File file;
    private static FileInputStream fileInput;
    private static Properties properties;

    public String desktopOS = System.getProperty("os.name").toUpperCase();

    public Connection getDbConnection() throws IOException, SQLException {
        try {
            // FileInputStream or_file=new
            // FileInputStream(System.getProperty("user.dir")+"\\Configurations\\DatabaseConfigration.properties");

            // logger.info(System.getProperty ("user.dir")+"/database.properties");
            // file = new File("or_file");

            if (desktopOS.contains("MAC")) {

                fileInput = new FileInputStream(
                        System.getProperty("user.dir") + "/Configurations/DatabaseConfigration.properties"); // MAC

            } else {

                fileInput = new FileInputStream(
                        System.getProperty("user.dir") + "/Configurations/DatabaseConfigration.properties"); // WINDOWS

            }

            properties = new Properties();

            properties.load(fileInput);
            String DBIpAddress = properties.getProperty("DBIpAddress");
            String DBNAME = properties.getProperty("DBNAME");
            String USERNAME = properties.getProperty("USERNAME");
            String PASSWORD = properties.getProperty("PASSWORD");

            // Class.forName("com.mysql.cj.jdbc.Driver").newInstance(); // mysql
            Class.forName("com.mysql.cj.jdbc.Driver").getDeclaredConstructor().newInstance(); 
            // Added by Swapnil on 06-03-2020 newInstance(); is deprecated
            
            // com.mysql.jdbc.Driver | com.microsoft.sqlserver.jdbc.SQLServerDriver
            con = DriverManager.getConnection(DBIpAddress.trim(), USERNAME.trim(), PASSWORD.trim());

            return con;
        } catch (Exception e) {
            System.out.println(e);
            e.printStackTrace();
            return null;
        } finally {
            fileInput.close();
        }

    }

}