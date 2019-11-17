package com.selenium.handle_windows;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Window_Handle_2 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir") + "\\All_Jars\\Browser_drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.naukri.com/");

		String parent = driver.getWindowHandle();  // It will return the parent window unique identifier as a String
		Set<String> s1= driver.getWindowHandles();
		
		ArrayList<String> a1= new ArrayList<String>(s1);
		
		driver.switchTo().window(a1.get(2)); // to switch to specific window. here  index 2 means third window
		
		System.out.println(driver.getTitle());
		
		//driver.close();
	

		driver.switchTo().window(a1.get(1));
		
		System.out.println(driver.getTitle());
		
		//driver.close();
		
		driver.quit();
	}

}
