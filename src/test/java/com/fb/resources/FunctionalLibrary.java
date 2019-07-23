package com.fb.resources;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FunctionalLibrary {
	
	public static WebDriver driver;
	
	public static WebDriver browserLaunch()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\Facebook\\src\\test\\resources\\lib\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		return driver;
	}

}
