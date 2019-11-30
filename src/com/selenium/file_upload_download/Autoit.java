package com.selenium.file_upload_download;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autoit {

	public static void main(String[] args) throws IOException, InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir") + "\\All_Jars\\Browser_drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://www.tinyupload.com/");

		driver.findElement(By.name("uploaded_file")).click();

		Thread.sleep(3000);

		Runtime.getRuntime().exec(System.getProperty("user.dir") +"\\Autoit\\Upload.exe");
		
		Thread.sleep(3000);

		driver.findElement(By.xpath("//img[@src='images/button_upload.gif']")).click();
		//driver.close();
	}

}
