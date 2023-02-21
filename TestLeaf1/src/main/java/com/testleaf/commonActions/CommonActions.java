package com.testleaf.commonActions;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class CommonActions {
	
	public static WebDriver driver = null;
	public static Properties properties = null;
	
	public Properties loadPropertyFile() throws IOException {
		
		FileInputStream fileinputstream = new FileInputStream("config.properties");
		properties = new Properties();
		properties.load(fileinputstream);
		return properties;
	}
		
	@BeforeSuite
	public void startBrowser() throws IOException {
		
		loadPropertyFile();
		String url = properties.getProperty("url");	
		String location = properties.getProperty("location");
		
		System.setProperty("webdriver.chrome.driver", location);		//incase if i use firefox use if condition after this line
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}	

	@AfterSuite
	public void closeBrowser() {
		//driver.quit();
		
	}	

}
	
	
