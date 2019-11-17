package com.selenium.common_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Commonly_Used_Methods_1 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir") + "\\All_Jars\\Browser_drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://in.bookmyshow.com/hyderabad/movies");
		
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		System.out.println(driver.getClass());
		
		System.out.println("***************************************************");
		
		
		System.out.println(driver.findElement(By.id("coming-soon-btn")).getText());
		System.out.println(driver.findElement(By.id("coming-soon-btn")).getAttribute("href"));
		System.out.println(driver.findElement(By.id("coming-soon-btn")).getLocation());
		
		System.out.println("***************************************************");
		
		
		System.out.println(driver.findElement(By.id("coming-soon-btn")).isDisplayed());// to check if element is displayed or not
		System.out.println(driver.findElement(By.id("coming-soon-btn")).isEnabled()); // to check if the element is enabled r not
		System.out.println(driver.findElement(By.id("coming-soon-btn")).isSelected()); // to check if selected or not. e.x checkbox

	}

}
