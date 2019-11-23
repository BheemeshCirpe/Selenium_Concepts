package com.selenium.webtables;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamic_WebTable_3 {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir") + "\\All_Jars\\Browser_drivers\\chromedriver.exe");

		Properties p= new Properties();
		FileInputStream f= new FileInputStream(System.getProperty("user.dir") +"\\src\\com\\selenium\\webtables\\variables.properties");
		
		p.load(f);
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://ui.cogmento.com/");

		driver.findElement(By.name("email")).sendKeys("rupagoud99@gmail.com");

		driver.findElement(By.name("password")).sendKeys("Selenium@123");

		driver.findElement(By.xpath("//div[text()='Login']")).click();

		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='Contacts']")).click();

		
		
		Thread.sleep(5000);

		// td[contains(text(),'shilpa e')]//preceding-sibling::td

		/////////////////////////////////////////////////////////////
		String xpath1 = "//td[contains(text(),";
		String xpath2 = p.getProperty("username");
		String xpath3 = ")]//preceding-sibling::td";
		
		driver.findElement(By.xpath(xpath1 + xpath2 + xpath3)).click();
		//////////////////////////////////////////////////////////////

		Thread.sleep(4000);
		driver.close();
		
	}

}
