package javademo.mavenproject2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driverclass {
	
	public static WebDriver driver = null;
	
	public static void openDriver(String url) {
		
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver_win32 (2)\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);	
		
	}
	
	public static void closeDriver(WebDriver driver) {
		driver.quit();	
	}

}
