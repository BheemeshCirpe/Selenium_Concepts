package com.selenium.javascript_executor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScript_Executor_2 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir") + "\\All_Jars\\Browser_drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/V4/");
		
		
		/*
		 * driver.findElement(By.name("uid") ).sendKeys("rupa");
		 * driver.findElement(By.name("password") ).sendKeys("test");
		 * driver.findElement(By.name("btnLogin") ).click();
		 */
		
		WebElement usrname=driver.findElement(By.name("uid"));
		WebElement pwd=driver.findElement(By.name("password"));
		WebElement button=driver.findElement(By.name("btnLogin"));
		
		
		
		JavascriptExecutor js= (JavascriptExecutor) driver;
		Thread.sleep(5000);
		
		js.executeScript("arguments[0].value='Rupa';arguments[1].value='test';arguments[2].click()",usrname,pwd,button);
		
		
		
		

	}

}
