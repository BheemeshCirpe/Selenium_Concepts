package com.selenium.file_upload_download;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class Sikuli_1 {

	public static void main(String[] args) throws InterruptedException, FindFailed {

		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir") + "\\All_Jars\\Browser_drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.youtube.com/");
		driver.findElement(By.id("search")).sendKeys("Venky mama Teaser");
		driver.findElement(By.id("search-icon-legacy")).click();
		driver.findElement(By.xpath("//*[@href='/watch?v=5BIY39Ufkz0']")).click();
		Thread.sleep(2000);

		Screen s = new Screen();
		Pattern p = new Pattern(System.getProperty("user.dir")+"\\sikuli\\youtube_test\\pause.png");
		//s.wait(p,20);
		s.click();
		//s.click();

		System.out.println("Test");

	}

}
