package com.selenium.javascript_executor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScript_Executor_3 {

	public static void main(String[] args) throws InterruptedException {
	
		
		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir") + "\\All_Jars\\Browser_drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://freecrm.com/");
		driver.manage().window().maximize();
		WebElement login=driver.findElement(By.xpath("/html/body/div[1]/header/div/nav/div[2]/div/div[2]/ul/a"));
		Thread.sleep(2000);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].style.border='3px solid green'", login);
		
	}

}
