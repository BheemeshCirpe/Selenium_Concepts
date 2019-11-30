package com.selenium.practise;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;



public class Recurly {
	@Test(dataProvider="codes_data",invocationCount=11)
	public static void billing_Cycles(String A_No) {
		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir") + "\\All_Jars\\Browser_drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.get("https://app.recurly.com/login");
		driver.findElement(By.id("user_email")).sendKeys("praveen.vijjeswarapu@nbcuni.com");
		driver.findElement(By.id("user_password")).sendKeys("Galaxy2020");
		driver.findElement(By.id("submit_button")).click();
		driver.findElement(By.linkText("Subscriptions")).click();

		driver.findElement(By.xpath("//input[@placeholder='Search Subscriptions']"))
				.sendKeys(A_No);
		driver.findElement(By.className("Search-button")).click();
		driver.findElement(By.xpath("//div[@class='Table']/div[2]")).click();

		driver.findElement(By.xpath("//a[@role='change-renewal']")).click();
		
		String date = new SimpleDateFormat("yyyy-MM-dd").format(new Date());
		driver.findElement(By.className("Field-input")).clear();
		driver.findElement(By.className("Field-input")).sendKeys(date);
		
		SimpleDateFormat time = new SimpleDateFormat("H");
		time.setTimeZone(TimeZone.getTimeZone("PST"));

		
		int a = Integer.parseInt(time.format(new Date())) + 1;

		String t=a+":00 PST";
		System.out.println(t);
		
		Select s = new Select(driver.findElement(By.name("next_renewal_hour")));
		s.selectByVisibleText(t);
		driver.findElement(By.name("commit")).click();
		

	}

@DataProvider(name= "codes_data")
	
	public Object[][] excel() throws IOException
	{
	

		File file = new File(System.getProperty("user.dir")+"\\Test data\\order_codes.xlsx");
		  String[][] a = new String[3][1];
		FileInputStream inputStream = new FileInputStream(file);
	
		XSSFWorkbook book1 = new XSSFWorkbook(inputStream);
		XSSFSheet sheet1 = book1.getSheet("Sheet1");
		
		
		
		for (int i = 0; i < 3; i++) {  

			XSSFRow row = sheet1.getRow(i + 1);  //Start from Row 2

			for (int j = 0; j <1; j++)  

				a[i][j] = row.getCell(0).getStringCellValue();

		}

		return a;
	}
	
	
}
