package com.flipkart.testdata;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Configuration {
	
	public static String ApplicationUrl;
	public static String username;
	public static String password;
	public static String browser;
	public static boolean isHeadless;
	public static String DBUrl;
	public static String DBUsername;
	public static String DBPassword;
	public static String MySQLUrl;
	public static String MySQLUsername;
	public static String MySQLPassword;
	public static int maxWaitTimeOut;
	public static String screenSize;
	public static String exeMode;
	public static String gridURL;
	public static String extentReport;

	public Configuration() {
		initializeConfiguration();
	}
	private void initializeConfiguration() {
		Properties prop = new Properties();
		try {
			prop.load(new FileInputStream(new File("src/main/java/resources/environment.properties")));

			ApplicationUrl = prop.getProperty("ApplicationUrl");
			username = prop.getProperty("username");
			password = prop.getProperty("password");
			browser = prop.getProperty("browser");
			isHeadless = Boolean.parseBoolean((prop.getProperty("isHeadless")));
			DBUrl = prop.getProperty("DBUrl");
			DBUsername = prop.getProperty("DBUsername");
			DBPassword = prop.getProperty("DBPassword");
			MySQLUrl = prop.getProperty("MySQLUrl");
			MySQLUsername = prop.getProperty("MySQLUsername");
			MySQLPassword = prop.getProperty("MySQLPassword");
			maxWaitTimeOut = Integer.parseInt(prop.getProperty("maxWaitTimeOut"));
			screenSize = prop.getProperty("screenSize");
			exeMode = prop.getProperty("exeMode");
			gridURL = prop.getProperty("gridURL");
			extentReport = prop.getProperty("extentReport");
		} catch (IOException io) {
			io.printStackTrace();
		}
	}
}
