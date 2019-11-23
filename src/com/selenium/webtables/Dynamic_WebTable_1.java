package com.selenium.webtables;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamic_WebTable_1 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir") + "\\All_Jars\\Browser_drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://ui.cogmento.com/");

		driver.findElement(By.name("email")).sendKeys("rupagoud99@gmail.com");

		driver.findElement(By.name("password")).sendKeys("Selenium@123");

		driver.findElement(By.xpath("//div[text()='Login']")).click();

		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='Contacts']")).click();

		Thread.sleep(5000);
		/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		List rows = driver.findElements(By.xpath("//*[@id='ui']/div/div[2]/div[2]/div/div[2]/table/tbody/tr"));
		List columns = driver.findElements(By.xpath("//*[@id='ui']/div/div[2]/div[2]/div/div[2]/table/tbody/tr[1]/td"));
		int rowcount = rows.size();
		int columncount = columns.size();

		String xpath1 = "//*[@id='ui']/div/div[2]/div[2]/div/div[2]/table/tbody/tr[";
		String xpath2 = "]/td[2]";

		for (int i = 1; i <= rowcount; i++)

		{
			String actualxpath = xpath1 + i + xpath2;
			if (driver.findElement(By.xpath(actualxpath)).getText().equals("rupa roopa"))

			{
				driver.findElement(By.xpath(xpath1 + i + "]/td[1]")).click();
			}

		}
		/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		Thread.sleep(2000);

		driver.close();
	}

}
