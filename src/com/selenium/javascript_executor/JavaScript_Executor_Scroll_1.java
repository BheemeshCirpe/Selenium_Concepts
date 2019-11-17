package com.selenium.javascript_executor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScript_Executor_Scroll_1 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir") + "\\All_Jars\\Browser_drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://freecrm.com/");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		Thread.sleep(5000);
		
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		

	}

}
