package com.selenium.javascript_executor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScript_Executor_Scroll_2 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir") + "\\All_Jars\\Browser_drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://freecrm.com/");
		driver.manage().window().maximize();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		Thread.sleep(2000);
		
		WebElement service =driver.findElement(By.xpath("/html/body/div[1]/main/section[2]/div/div/div[2]/h5"));
		Thread.sleep(2000);
		
		js.executeScript("arguments[0].scrollIntoView(true);", service);
		
		
		
		
	}

}
