package com.selenium.handle_windows;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Window_Handle_1 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir") + "\\All_Jars\\Browser_drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.naukri.com/");

		String parent = driver.getWindowHandle();  // It will return the parent window unique identifier as a String
		Set<String> s1= driver.getWindowHandles(); 	// This will return the number of windows opened by Webdriver and will return Set of Strings
		
		Iterator<String> itr1 = s1.iterator();
		while(itr1.hasNext())
		{
			String child_window = (String) itr1.next();
			
			if (!parent.equals(child_window))
			{
				driver.switchTo().window(child_window);
				System.out.println(driver.getTitle());
				driver.close();
			}
		
			
		}
		driver.switchTo().window(parent);
		System.out.println(driver.getTitle());
		driver.close();
		
	}

}
