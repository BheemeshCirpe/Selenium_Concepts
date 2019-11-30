package com.selenium.file_upload_download;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class Sikuli_2 {

	public static void main(String[] args) throws InterruptedException, FindFailed {

		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir") + "\\All_Jars\\Browser_drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://www.tinyupload.com/");
		driver.findElement(By.name("uploaded_file")).click();
		Thread.sleep(3000);

		Screen s = new Screen();
		Pattern File_path = new Pattern(System.getProperty("user.dir")+"\\sikuli\\File_name.png");
		
		
		s.wait(File_path, 5000);
		s.type(File_path,System.getProperty("user.dir")+ "\\Test data\\sample_upload.xlsx");

		Pattern Open = new Pattern(System.getProperty("user.dir")+"\\sikuli\\Open.png");

		s.click(Open);

		Thread.sleep(3000);

		driver.findElement(By.xpath("//img[@src='images/button_upload.gif']")).click();

	}

}
