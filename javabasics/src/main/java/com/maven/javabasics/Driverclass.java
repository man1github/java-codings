package com.maven.javabasics;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driverclass {

	public static WebDriver driver = null;

	public static void OpenDriver(String url) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\harichaser\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
	}

	public static void closeBrowser(WebDriver driver) {
		driver.quit();
	}

}
