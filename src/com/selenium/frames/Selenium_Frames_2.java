package com.selenium.frames;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_Frames_2 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir") + "\\All_Jars\\Browser_drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://demo.guru99.com/test/guru99home/");

		WebElement ele = driver.findElement(By.xpath("//*[@src='ads.html']"));
		driver.switchTo().frame(ele); 										// switching to frame using webelement
		// driver.switchTo().frame("a077aa5e"); 							//switching to frame using ID or name
		driver.findElement(By.xpath("html/body/a/img")).click();
		driver.switchTo().parentFrame();									// switching to parent frame
		// driver.switchTo().defaultContent();								 //switching to parent frame
		driver.findElement(By.id("philadelphia-field-email")).sendKeys("roopa@gmail.com");

	}

}
