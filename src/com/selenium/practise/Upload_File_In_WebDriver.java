package com.selenium.practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Upload_File_In_WebDriver {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir") + "\\All_Jars\\Browser_drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/upload/");
		WebElement upload = driver.findElement(By.name("uploadfile_0"));
		upload.sendKeys("E:\\interview\\Selenium\\test1.png");
		driver.findElement(By.xpath("//*[@id='terms']")).click();
		driver.findElement(By.name("send")).click();
		
		
	}

}
