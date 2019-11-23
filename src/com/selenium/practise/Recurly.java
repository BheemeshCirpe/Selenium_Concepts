package com.selenium.practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Recurly {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir") + "\\All_Jars\\Browser_drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://app.recurly.com/login");
		
		driver.findElement(By.id("user_email")).sendKeys("praveen.vijjeswarapu@nbcuni.com");
		
		driver.findElement(By.id("user_password")).sendKeys("Galaxy2020");
		driver.findElement(By.id("submit_button")).click();
		

	}

}
