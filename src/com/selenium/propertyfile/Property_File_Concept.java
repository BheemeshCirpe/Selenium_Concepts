package com.selenium.propertyfile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Property_File_Concept {

	public static WebDriver driver; // declaring webdriver and properties object as static and with return types so
									// that it can be accessed from any where within the project
	public static Properties p;

	public static void main(String[] args) throws IOException {

		Properties p = new Properties(); // predefined class in java.util package to read any properties file in java

		FileInputStream file = new FileInputStream(
				System.getProperty("user.dir")+"\\src\\com\\selenium\\propertyfile\\application.properties");
		p.load(file);

		String browserName = p.getProperty("browser");

		if (browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir")+"\\All_Jars\\Browser_drivers\\chromedriver.exe");
			driver = new ChromeDriver();
		} else if (browserName.equals("IE")) {
			System.setProperty("webdriver.ie.driver",
					System.getProperty("user.dir")+"\\All_Jars\\Browser_drivers\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();

		}
		
		driver.get(p.getProperty("url"));

	}
}
