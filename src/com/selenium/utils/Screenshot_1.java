package com.selenium.utils;

import java.io.File;
import java.io.IOException;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot_1 {

	public static void capture_Screenshots(WebDriver driver) {

		TakesScreenshot ts = (TakesScreenshot) driver;
		File f = ts.getScreenshotAs(OutputType.FILE); // getscreenshotas method returns object as a file

		
		
		String timestamp = new SimpleDateFormat("yyyy-MM-dd hh-mm-ss").format(new Date()); // To get current timestamp

		// Timestamp timestamp = new Timestamp(System.currentTimeMillis());

		File target = new File(System.getProperty("user.dir") + "\\Screenshots\\" + timestamp + ".png");
		
		try {
			FileHandler.copy(f, target);
			
			System.out.println("Screenshot taken successfully");
		} catch (IOException e) {
		
			
			e.printStackTrace();
			
			System.out.println("Screenshot Not captured");
		}
			
		

	
		}

	}


