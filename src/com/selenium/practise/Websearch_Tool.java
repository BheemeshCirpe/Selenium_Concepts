package com.selenium.practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Websearch_Tool {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir") + "\\All_Jars\\Browser_drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://webstoretoolqa.use.ucdp.net/WebstoreTool.aspx");
		
		driver.findElement(By.id("MainContent_btnSearchDemo")).click();
		driver.findElement(By.name("ctl00$MainContent$txtConfirmation")).sendKeys("20191104USHB61525085");
		
		driver.findElement(By.name("ctl00$MainContent$btnSearchForDemo")).click();
		
		driver.findElement(By.xpath("//*[@id='MainContent_gvResults']/tbody/tr[2]/td[1]/a")).click();
		
		driver.findElement(By.xpath("//*[@id='MainContent_EditOrderButton']")).click();
		
		String value =driver.findElement(By.className("ctl00$MainContent$txtExtStatus")).getText();
		
		if(value.equals("2"))
		{
			System.out.println("Order is already in complete status");
		}
		else
		{
		
		if(value.equals("112"))
		{
			driver.findElement(By.className("ctl00$MainContent$txtExtStatus")).sendKeys("110");
			//code for save link
			
			if(value.equals("2-Complete"))
			{
				System.out.println("order released from A certify");
			}
			else
			{
				System.out.println("unable to release from A certify");
			}
			
		}
		}
	}

}
