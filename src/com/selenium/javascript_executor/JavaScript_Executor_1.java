package com.selenium.javascript_executor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScript_Executor_1 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir") + "\\All_Jars\\Browser_drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		JavascriptExecutor js =  (JavascriptExecutor) driver; //
	
        driver.get("https://www.youtube.com/");		
        driver.manage().window().maximize();
        js.executeScript("document.getElementsByName('search_query')[0].value='JERSEY TELUGU MOVIE';");
        js.executeScript("document.getElementById('search-icon-legacy').click();");
        
		js.executeScript("alert('type something')");
		
	
        
		

	}

}
